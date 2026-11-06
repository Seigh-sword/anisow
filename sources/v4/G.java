package V4;

import java.io.Closeable;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final o f3777A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p f3778B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final J f3779C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final G f3780D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final G f3781E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final G f3782F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f3783G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final long f3784H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final J3.x f3785I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final B f3786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f3787x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3788y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f3789z;

    public G(F f6) {
        this.f3786w = f6.f3764a;
        this.f3787x = f6.f3765b;
        this.f3788y = f6.f3766c;
        this.f3789z = f6.f3767d;
        this.f3777A = f6.f3768e;
        C1486b c1486b = f6.f3769f;
        c1486b.getClass();
        this.f3778B = new p(c1486b);
        this.f3779C = f6.f3770g;
        this.f3780D = f6.f3771h;
        this.f3781E = f6.f3772i;
        this.f3782F = f6.f3773j;
        this.f3783G = f6.f3774k;
        this.f3784H = f6.f3775l;
        this.f3785I = f6.f3776m;
    }

    public final String b(String str) {
        String strC = this.f3778B.c(str);
        if (strC != null) {
            return strC;
        }
        return null;
    }

    public final boolean c() {
        int i6 = this.f3788y;
        return i6 >= 200 && i6 < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        J j6 = this.f3779C;
        if (j6 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        j6.close();
    }

    public final F g() {
        F f6 = new F();
        f6.f3764a = this.f3786w;
        f6.f3765b = this.f3787x;
        f6.f3766c = this.f3788y;
        f6.f3767d = this.f3789z;
        f6.f3768e = this.f3777A;
        f6.f3769f = this.f3778B.e();
        f6.f3770g = this.f3779C;
        f6.f3771h = this.f3780D;
        f6.f3772i = this.f3781E;
        f6.f3773j = this.f3782F;
        f6.f3774k = this.f3783G;
        f6.f3775l = this.f3784H;
        f6.f3776m = this.f3785I;
        return f6;
    }

    public final String toString() {
        return "Response{protocol=" + this.f3787x + ", code=" + this.f3788y + ", message=" + this.f3789z + ", url=" + this.f3786w.f3751a + '}';
    }
}
