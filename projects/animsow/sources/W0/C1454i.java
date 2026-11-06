package w0;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import j.RunnableC0835a;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C1164g;

/* JADX INFO: renamed from: w0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1454i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f13504j = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f13506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f13507c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile B0.g f13510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1452g f13511g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13508d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f13509e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1164g f13512h = new C1164g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RunnableC0835a f13513i = new RunnableC0835a(10, this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13505a = new HashMap();

    public C1454i(p pVar, HashMap map, HashMap map2, String... strArr) {
        this.f13507c = pVar;
        this.f13511g = new C1452g(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f13506b = new String[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str = strArr[i6];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f13505a.put(lowerCase, Integer.valueOf(i6));
            String str2 = (String) map.get(strArr[i6]);
            if (str2 != null) {
                this.f13506b[i6] = str2.toLowerCase(locale);
            } else {
                this.f13506b[i6] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f13505a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f13505a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        A0.a aVar = this.f13507c.f13531a;
        if (!(aVar != null && ((B0.b) aVar).f62w.isOpen())) {
            return false;
        }
        if (!this.f13509e) {
            this.f13507c.f13533c.C();
        }
        if (this.f13509e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(A0.a aVar, int i6) {
        B0.b bVar = (B0.b) aVar;
        bVar.g(H1.a.j("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i6, ", 0)"));
        String str = this.f13506b[i6];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f13504j;
        for (int i7 = 0; i7 < 3; i7++) {
            String str2 = strArr[i7];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i6);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.g(sb.toString());
        }
    }

    public final void c(A0.a aVar) {
        if (((B0.b) aVar).f62w.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f13507c.f13538h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.f13511g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    B0.b bVar = (B0.b) aVar;
                    bVar.b();
                    for (int i6 = 0; i6 < length; i6++) {
                        try {
                            int i7 = iArrA[i6];
                            if (i7 == 1) {
                                b(aVar, i6);
                            } else if (i7 == 2) {
                                String str = this.f13506b[i6];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f13504j;
                                for (int i8 = 0; i8 < 3; i8++) {
                                    String str2 = strArr[i8];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    ((B0.b) aVar).g(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            bVar.c();
                            throw th;
                        }
                    }
                    bVar.l();
                    bVar.c();
                    C1452g c1452g = this.f13511g;
                    synchronized (c1452g) {
                        c1452g.f13500c = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e6) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
                return;
            }
        }
    }
}
