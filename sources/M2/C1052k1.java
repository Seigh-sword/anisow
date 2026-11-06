package m2;

import android.os.Looper;
import p1.C1243i;
import u1.C1358b;

/* JADX INFO: renamed from: m2.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1052k1 extends X {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1243i f11013A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1064o1 f11014B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1358b f11015C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.X f11016y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11017z;

    public C1052k1(C1051k0 c1051k0) {
        super(c1051k0);
        this.f11017z = true;
        this.f11013A = new C1243i(11, this);
        this.f11014B = new C1064o1(this);
        this.f11015C = new C1358b(this);
    }

    @Override // m2.X
    public final boolean A() {
        return false;
    }

    public final void B() {
        r();
        if (this.f11016y == null) {
            this.f11016y = new com.google.android.gms.internal.measurement.X(Looper.getMainLooper());
        }
    }
}
