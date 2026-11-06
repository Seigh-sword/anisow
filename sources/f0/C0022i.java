package F0;

import N.C0095h;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import d.RunnableC0632m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.InterfaceC1258a;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: F0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0022i implements O1.b, N1.j, InterfaceC1258a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f532z;

    public /* synthetic */ C0022i(RunnableC0632m runnableC0632m, w wVar, Runnable runnable) {
        this.f529w = 0;
        this.f530x = runnableC0632m;
        this.f532z = wVar;
        this.f531y = runnable;
    }

    @Override // N1.j
    public final Object apply(Object obj) {
        long jInsert;
        H1.m mVar;
        K1.d dVar;
        K1.d dVar2 = K1.d.CACHE_FULL;
        int i6 = this.f529w;
        int i7 = 5;
        int i8 = 4;
        int i9 = 3;
        int i10 = 2;
        Object obj2 = this.f532z;
        Object obj3 = this.f531y;
        int i11 = 1;
        N1.l lVar = (N1.l) this.f530x;
        switch (i6) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                E1.c cVar = N1.l.f2100B;
                lVar.getClass();
                sQLiteDatabase.compileStatement((String) obj3).execute();
                N1.l.n(sQLiteDatabase.rawQuery((String) obj2, null), new N1.h(lVar, i10));
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                H1.i iVar = (H1.i) obj3;
                H1.j jVar = (H1.j) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                E1.c cVar2 = N1.l.f2100B;
                long jSimpleQueryForLong = lVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * lVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                N1.a aVar = lVar.f2105z;
                if (jSimpleQueryForLong >= aVar.f2077a) {
                    lVar.g(new M1.i(1L, iVar.f924a, dVar2));
                    return -1L;
                }
                Long lC = N1.l.c(sQLiteDatabase2, jVar);
                if (lC != null) {
                    jInsert = lC.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.f934a);
                    contentValues.put("priority", Integer.valueOf(Q1.a.a(jVar.f936c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar.f935b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                byte[] bArr2 = iVar.f926c.f944b;
                int length = bArr2.length;
                int i12 = aVar.f2081e;
                boolean z5 = length <= i12;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", iVar.f924a);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f927d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.f928e));
                contentValues2.put("payload_encoding", iVar.f926c.f943a.f384a);
                contentValues2.put("code", iVar.f925b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z5));
                contentValues2.put("payload", z5 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", iVar.f930g);
                contentValues2.put("pseudonymous_id", iVar.f931h);
                contentValues2.put("experiment_ids_clear_blob", iVar.f932i);
                contentValues2.put("experiment_ids_encrypted_blob", iVar.f933j);
                long jInsert2 = sQLiteDatabase2.insert("events", null, contentValues2);
                if (!z5) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i12));
                    for (int i13 = 1; i13 <= iCeil; i13++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i13 - 1) * i12, Math.min(i13 * i12, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i13));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase2.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f929f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase2.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                List list = (List) obj3;
                H1.j jVar2 = (H1.j) obj2;
                Cursor cursor = (Cursor) obj;
                E1.c cVar3 = N1.l.f2100B;
                lVar.getClass();
                while (cursor.moveToNext()) {
                    long j6 = cursor.getLong(0);
                    int i14 = cursor.getInt(7) != 0 ? i11 : 0;
                    R0.k kVar = new R0.k();
                    kVar.f2924f = new HashMap();
                    String string = cursor.getString(i11);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    kVar.f2919a = string;
                    kVar.f2922d = Long.valueOf(cursor.getLong(2));
                    kVar.f2923e = Long.valueOf(cursor.getLong(3));
                    if (i14 != 0) {
                        String string2 = cursor.getString(4);
                        mVar = new H1.m(string2 == null ? N1.l.f2100B : new E1.c(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        mVar = new H1.m(string3 == null ? N1.l.f2100B : new E1.c(string3), (byte[]) N1.l.n(lVar.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num"), new C0095h(17)));
                    }
                    kVar.q(mVar);
                    if (!cursor.isNull(6)) {
                        kVar.f2920b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        kVar.f2925g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        kVar.f2926h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        kVar.f2927i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        kVar.f2928j = cursor.getBlob(11);
                    }
                    list.add(new N1.b(j6, jVar2, kVar.b()));
                    i11 = 1;
                }
                return null;
            default:
                Map map = (Map) obj3;
                P0.h hVar = (P0.h) obj2;
                Cursor cursor2 = (Cursor) obj;
                E1.c cVar4 = N1.l.f2100B;
                lVar.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i15 = cursor2.getInt(1);
                    K1.d dVar3 = K1.d.REASON_UNKNOWN;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            dVar3 = K1.d.MESSAGE_TOO_OLD;
                        } else if (i15 == 2) {
                            dVar = dVar2;
                        } else if (i15 == i9) {
                            dVar3 = K1.d.PAYLOAD_TOO_BIG;
                        } else if (i15 == i8) {
                            dVar3 = K1.d.MAX_RETRIES_REACHED;
                        } else if (i15 == i7) {
                            dVar3 = K1.d.INVALID_PAYLOD;
                        } else if (i15 == 6) {
                            dVar3 = K1.d.SERVER_ERROR;
                        } else {
                            AbstractC1332d.z("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                        }
                        dVar = dVar3;
                    } else {
                        dVar = dVar3;
                    }
                    long j7 = cursor2.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new K1.e(j7, dVar));
                    i7 = 5;
                    i8 = 4;
                    i9 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i16 = K1.f.f1528c;
                    new ArrayList();
                    ((List) hVar.f2408b).add(new K1.f((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jA = ((P1.c) lVar.f2103x).a();
                SQLiteDatabase sQLiteDatabaseB = lVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    K1.h hVar2 = (K1.h) N1.l.n(sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new N1.i(i11, jA));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    hVar.f2407a = hVar2;
                    hVar.f2409c = new K1.c(new K1.g(lVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * lVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), N1.a.f2076f.f2077a));
                    hVar.f2410d = (String) lVar.f2101A.get();
                    return new K1.a((K1.h) hVar.f2407a, Collections.unmodifiableList((List) hVar.f2408b), (K1.c) hVar.f2409c, (String) hVar.f2410d);
                } catch (Throwable th) {
                    sQLiteDatabaseB.endTransaction();
                    throw th;
                }
        }
    }

    @Override // q2.InterfaceC1258a
    public final Object b(q2.i iVar) throws InterruptedException {
        q2.j jVar = (q2.j) this.f530x;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f531y;
        q2.l lVar = (q2.l) this.f532z;
        if (!iVar.f()) {
            if (iVar.c() == null) {
                if (atomicBoolean.getAndSet(true)) {
                    q2.l lVar2 = (q2.l) lVar.f12355x;
                    int i6 = lVar2.f12354w;
                    Object obj = lVar2.f12355x;
                    switch (i6) {
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            ((CountDownLatch) obj).await();
                            break;
                        default:
                            ((q2.s) obj).n(null);
                            break;
                    }
                }
            } else {
                jVar.b(iVar.c());
            }
        } else {
            jVar.c(iVar.d());
        }
        return f2.h.l(null);
    }

    @Override // O1.b
    public final Object d() {
        L1.b bVar = (L1.b) this.f530x;
        H1.j jVar = (H1.j) this.f531y;
        H1.i iVar = (H1.i) this.f532z;
        N1.l lVar = (N1.l) bVar.f1716d;
        lVar.getClass();
        E1.d dVar = jVar.f936c;
        String str = iVar.f924a;
        String strJ = AbstractC1332d.J("SQLiteEventStore");
        int i6 = 3;
        if (Log.isLoggable(strJ, 3)) {
            Log.d(strJ, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + jVar.f934a);
        }
        ((Long) lVar.g(new C0022i(lVar, iVar, jVar, i6))).getClass();
        ((M1.d) bVar.f1713a).a(jVar, 1, false);
        return null;
    }

    public /* synthetic */ C0022i(Object obj, Object obj2, Object obj3, int i6) {
        this.f529w = i6;
        this.f530x = obj;
        this.f531y = obj2;
        this.f532z = obj3;
    }
}
