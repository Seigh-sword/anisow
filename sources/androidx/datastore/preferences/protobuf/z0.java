package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Unsafe unsafe, int i6) {
        super(unsafe);
        this.f5537b = i6;
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final boolean c(long j6, Object obj) {
        switch (this.f5537b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (C0.f5367g) {
                    if (C0.h(j6, obj) == 0) {
                    }
                } else if (C0.i(j6, obj) == 0) {
                }
                break;
            default:
                if (C0.f5367g) {
                    if (C0.h(j6, obj) == 0) {
                    }
                } else if (C0.i(j6, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final byte d(long j6, Object obj) {
        switch (this.f5537b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!C0.f5367g) {
                }
                break;
            default:
                if (!C0.f5367g) {
                }
                break;
        }
        return C0.i(j6, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final double e(long j6, Object obj) {
        switch (this.f5537b) {
        }
        return Double.longBitsToDouble(h(j6, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final float f(long j6, Object obj) {
        switch (this.f5537b) {
        }
        return Float.intBitsToFloat(g(j6, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final void k(Object obj, long j6, boolean z5) {
        switch (this.f5537b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!C0.f5367g) {
                    C0.p(obj, j6, z5 ? (byte) 1 : (byte) 0);
                } else {
                    C0.o(obj, j6, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!C0.f5367g) {
                    C0.p(obj, j6, z5 ? (byte) 1 : (byte) 0);
                } else {
                    C0.o(obj, j6, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final void l(Object obj, long j6, byte b6) {
        switch (this.f5537b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!C0.f5367g) {
                    C0.p(obj, j6, b6);
                } else {
                    C0.o(obj, j6, b6);
                }
                break;
            default:
                if (!C0.f5367g) {
                    C0.p(obj, j6, b6);
                } else {
                    C0.o(obj, j6, b6);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final void m(Object obj, long j6, double d6) {
        switch (this.f5537b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                p(obj, j6, Double.doubleToLongBits(d6));
                break;
            default:
                p(obj, j6, Double.doubleToLongBits(d6));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final void n(Object obj, long j6, float f6) {
        switch (this.f5537b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                o(Float.floatToIntBits(f6), j6, obj);
                break;
            default:
                o(Float.floatToIntBits(f6), j6, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final boolean s() {
        return false;
    }
}
