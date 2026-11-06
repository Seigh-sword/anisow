package m2;

import d2.C0652c;
import p1.C1244j;

/* JADX INFO: renamed from: m2.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1021a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1051k0 f10841a;

    public C1021a0(x1 x1Var) {
        this.f10841a = x1Var.f11248H;
    }

    public final boolean a() {
        C1051k0 c1051k0 = this.f10841a;
        try {
            C1244j c1244jA = C0652c.a(c1051k0.f11009w);
            if (c1244jA != null) {
                return c1244jA.g(128, "com.android.vending").versionCode >= 80837300;
            }
            N n5 = c1051k0.f10983E;
            C1051k0.i(n5);
            n5.f10723J.d("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e6) {
            N n6 = c1051k0.f10983E;
            C1051k0.i(n6);
            n6.f10723J.c(e6, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
