package N1;

import F0.C0022i;
import N.C0095h;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import q4.InterfaceC1266a;

/* JADX INFO: loaded from: classes.dex */
public final class l implements d, O1.c, c {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final E1.c f2100B = new E1.c("proto");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC1266a f2101A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f2102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final P1.a f2103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final P1.a f2104y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f2105z;

    public l(P1.a aVar, P1.a aVar2, a aVar3, o oVar, InterfaceC1266a interfaceC1266a) {
        this.f2102w = oVar;
        this.f2103x = aVar;
        this.f2104y = aVar2;
        this.f2105z = aVar3;
        this.f2101A = interfaceC1266a;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, H1.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f934a, String.valueOf(Q1.a.a(jVar.f936c))));
        byte[] bArr = jVar.f935b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) n(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new C0095h(15));
    }

    public static String l(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f2082a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object n(Cursor cursor, j jVar) {
        try {
            return jVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        Object objApply;
        o oVar = this.f2102w;
        Objects.requireNonNull(oVar);
        C0095h c0095h = new C0095h(10);
        P1.c cVar = (P1.c) this.f2104y;
        long jA = cVar.a();
        while (true) {
            try {
                objApply = oVar.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e6) {
                if (cVar.a() >= ((long) this.f2105z.f2079c) + jA) {
                    objApply = c0095h.apply(e6);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        return (SQLiteDatabase) objApply;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2102w.close();
    }

    public final Object g(j jVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = jVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, H1.j jVar, int i6) {
        ArrayList arrayList = new ArrayList();
        Long lC = c(sQLiteDatabase, jVar);
        if (lC == null) {
            return arrayList;
        }
        n(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lC.toString()}, null, null, null, String.valueOf(i6)), new C0022i(this, arrayList, jVar, 4));
        return arrayList;
    }

    public final Object k(O1.b bVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        C0095h c0095h = new C0095h(9);
        P1.c cVar = (P1.c) this.f2104y;
        long jA = cVar.a();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
            } catch (SQLiteDatabaseLockedException e6) {
                if (cVar.a() >= ((long) this.f2105z.f2079c) + jA) {
                    c0095h.apply(e6);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            Object objD = bVar.d();
            sQLiteDatabaseB.setTransactionSuccessful();
            return objD;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }
}
