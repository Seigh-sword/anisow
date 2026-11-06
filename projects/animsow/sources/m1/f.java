package M1;

import J3.G;
import N.C0095h;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f1771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ H1.j f1772x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f1773y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Runnable f1774z;

    public /* synthetic */ f(j jVar, H1.j jVar2, int i6, Runnable runnable) {
        this.f1771w = jVar;
        this.f1772x = jVar2;
        this.f1773y = i6;
        this.f1774z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        H1.j jVar = this.f1772x;
        int i6 = this.f1773y;
        Runnable runnable = this.f1774z;
        j jVar2 = this.f1771w;
        m mVar = jVar2.f1789d;
        O1.c cVar = jVar2.f1791f;
        try {
            try {
                N1.d dVar = jVar2.f1788c;
                Objects.requireNonNull(dVar);
                ((N1.l) cVar).k(new G(10, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar2.f1786a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    N1.l lVar = (N1.l) cVar;
                    SQLiteDatabase sQLiteDatabaseB = lVar.b();
                    C0095h c0095h = new C0095h(9);
                    P1.c cVar2 = (P1.c) lVar.f2104y;
                    long jA = cVar2.a();
                    while (true) {
                        try {
                            sQLiteDatabaseB.beginTransaction();
                            sQLiteDatabase = sQLiteDatabaseB;
                            break;
                        } catch (SQLiteDatabaseLockedException e6) {
                            sQLiteDatabase = sQLiteDatabaseB;
                            if (cVar2.a() >= ((long) lVar.f2105z.f2079c) + jA) {
                                c0095h.apply(e6);
                                break;
                            } else {
                                SystemClock.sleep(50L);
                                sQLiteDatabaseB = sQLiteDatabase;
                            }
                        }
                    }
                    try {
                        ((d) mVar).a(jVar, i6 + 1, false);
                        sQLiteDatabase.setTransactionSuccessful();
                    } finally {
                        sQLiteDatabase.endTransaction();
                    }
                } else {
                    jVar2.a(jVar, i6);
                }
            } catch (O1.a unused) {
                ((d) mVar).a(jVar, i6 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
