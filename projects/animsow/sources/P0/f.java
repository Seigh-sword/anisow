package P0;

import I0.o;
import android.content.Context;
import android.net.ConnectivityManager;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f2402i = o.y("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f2403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f2404h;

    public f(Context context, C0803c c0803c) {
        super(context, c0803c);
        this.f2403g = (ConnectivityManager) this.f2396b.getSystemService("connectivity");
        this.f2404h = new e(0, this);
    }

    @Override // P0.d
    public final Object a() {
        return f();
    }

    @Override // P0.d
    public final void d() {
        String str = f2402i;
        try {
            o.w().u(str, "Registering network callback", new Throwable[0]);
            this.f2403g.registerDefaultNetworkCallback(this.f2404h);
        } catch (IllegalArgumentException | SecurityException e6) {
            o.w().v(str, "Received exception while registering network callback", e6);
        }
    }

    @Override // P0.d
    public final void e() {
        String str = f2402i;
        try {
            o.w().u(str, "Unregistering network callback", new Throwable[0]);
            this.f2403g.unregisterNetworkCallback(this.f2404h);
        } catch (IllegalArgumentException | SecurityException e6) {
            o.w().v(str, "Received exception while unregistering network callback", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final N0.a f() {
        /*
            r9 = this;
            android.net.ConnectivityManager r0 = r9.f2403g
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r2
        L13:
            android.net.Network r5 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L27
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L37
            r6 = 16
            boolean r5 = r5.hasCapability(r6)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L37
            r5 = r3
            goto L38
        L27:
            r5 = move-exception
            I0.o r6 = I0.o.w()
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r7[r2] = r5
            java.lang.String r5 = P0.f.f2402i
            java.lang.String r8 = "Unable to validate active network"
            r6.v(r5, r8, r7)
        L37:
            r5 = r2
        L38:
            boolean r0 = r0.isActiveNetworkMetered()
            if (r1 == 0) goto L45
            boolean r1 = r1.isRoaming()
            if (r1 != 0) goto L45
            r2 = r3
        L45:
            N0.a r1 = new N0.a
            r1.<init>()
            r1.f2068a = r4
            r1.f2069b = r5
            r1.f2070c = r0
            r1.f2071d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.f.f():N0.a");
    }
}
