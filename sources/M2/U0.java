package m2;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import b2.C0337b;
import java.util.concurrent.ConcurrentHashMap;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends X {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public V0 f10771A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ConcurrentHashMap f10772B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Activity f10773C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f10774D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile V0 f10775E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public V0 f10776F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f10777G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Object f10778H;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile V0 f10779y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile V0 f10780z;

    public U0(C1051k0 c1051k0) {
        super(c1051k0);
        this.f10778H = new Object();
        this.f10772B = new ConcurrentHashMap();
    }

    @Override // m2.X
    public final boolean A() {
        return false;
    }

    public final String B(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str.length() > n().t(null, false) ? str.substring(0, n().t(null, false)) : str;
    }

    public final V0 C(boolean z5) {
        y();
        r();
        if (!z5) {
            return this.f10771A;
        }
        V0 v02 = this.f10771A;
        return v02 != null ? v02 : this.f10776F;
    }

    public final void D(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!n().F() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f10772B.put(Integer.valueOf(activity.hashCode()), new V0(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void E(Activity activity, V0 v02, boolean z5) {
        V0 v03;
        V0 v04 = this.f10779y == null ? this.f10780z : this.f10779y;
        if (v02.f10785b == null) {
            v03 = new V0(v02.f10784a, activity != null ? B(activity.getClass()) : null, v02.f10786c, v02.f10788e, v02.f10789f);
        } else {
            v03 = v02;
        }
        this.f10780z = this.f10779y;
        this.f10779y = v03;
        ((C0337b) h()).getClass();
        g().A(new P0(this, v03, v04, SystemClock.elapsedRealtime(), z5));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(m2.V0 r18, m2.V0 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.U0.F(m2.V0, m2.V0, long, boolean, android.os.Bundle):void");
    }

    public final void G(V0 v02, boolean z5, long j6) {
        C1067q c1067qM = ((C1051k0) this.f1668w).m();
        ((C0337b) h()).getClass();
        c1067qM.y(SystemClock.elapsedRealtime());
        if (!x().f11014B.a(v02 != null && v02.f10787d, z5, j6) || v02 == null) {
            return;
        }
        v02.f10787d = false;
    }

    public final V0 H(Activity activity) {
        AbstractC1332d.m(activity);
        V0 v02 = (V0) this.f10772B.get(Integer.valueOf(activity.hashCode()));
        if (v02 == null) {
            V0 v03 = new V0(q().B0(), null, B(activity.getClass()));
            this.f10772B.put(Integer.valueOf(activity.hashCode()), v03);
            v02 = v03;
        }
        return this.f10775E != null ? this.f10775E : v02;
    }
}
