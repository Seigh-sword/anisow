package u;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class e implements M.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12791w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object[] f12792x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12793y;

    public e(int i6, int i7) {
        this.f12791w = i7;
        if (i7 != 1) {
            if (i6 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f12792x = new Object[i6];
        } else {
            if (i6 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.f12792x = new Object[i6];
        }
    }

    @Override // M.b
    public boolean d(Object obj) {
        boolean z5;
        int i6 = this.f12791w;
        Object[] objArr = this.f12792x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int i7 = this.f12793y;
                if (i7 >= objArr.length) {
                    return false;
                }
                objArr[i7] = obj;
                this.f12793y = i7 + 1;
                return true;
            default:
                AbstractC1305a.o(obj, "instance");
                int i8 = this.f12793y;
                int i9 = 0;
                while (true) {
                    if (i9 >= i8) {
                        z5 = false;
                    } else if (objArr[i9] == obj) {
                        z5 = true;
                    } else {
                        i9++;
                    }
                }
                if (!(!z5)) {
                    throw new IllegalStateException("Already in the pool!".toString());
                }
                int i10 = this.f12793y;
                if (i10 >= objArr.length) {
                    return false;
                }
                objArr[i10] = obj;
                this.f12793y = i10 + 1;
                return true;
        }
    }

    @Override // M.b
    public Object h() {
        int i6 = this.f12791w;
        Object[] objArr = this.f12792x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int i7 = this.f12793y;
                if (i7 <= 0) {
                    return null;
                }
                int i8 = i7 - 1;
                Object obj = objArr[i8];
                objArr[i8] = null;
                this.f12793y = i8;
                return obj;
            default:
                int i9 = this.f12793y;
                if (i9 <= 0) {
                    return null;
                }
                int i10 = i9 - 1;
                Object obj2 = objArr[i10];
                AbstractC1305a.m(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i10] = null;
                this.f12793y--;
                return obj2;
        }
    }
}
