package G3;

import E3.j;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f884d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f885e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f886a = j.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f888c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f888c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            E3.j r0 = r4.f886a     // Catch: java.lang.Throwable -> L19
            m2.B r0 = r0.f420a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f887b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.e.a():boolean");
    }

    public final synchronized void b(int i6) {
        long jMin;
        if ((i6 >= 200 && i6 < 300) || i6 == 401 || i6 == 404) {
            synchronized (this) {
                this.f888c = 0;
            }
            return;
        }
        this.f888c++;
        synchronized (this) {
            if (i6 == 429 || (i6 >= 500 && i6 < 600)) {
                double dPow = Math.pow(2.0d, this.f888c);
                this.f886a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f885e);
            } else {
                jMin = f884d;
            }
            this.f886a.f420a.getClass();
            this.f887b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
