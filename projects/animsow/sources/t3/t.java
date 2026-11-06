package T3;

import Q3.A;
import Q3.B;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class t implements B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Class f3509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ A f3510y;

    public /* synthetic */ t(Class cls, A a6, int i6) {
        this.f3508w = i6;
        this.f3509x = cls;
        this.f3510y = a6;
    }

    @Override // Q3.B
    public final A a(Q3.n nVar, TypeToken typeToken) {
        int i6 = this.f3508w;
        Class cls = this.f3509x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (typeToken.f7456a == cls) {
                    return this.f3510y;
                }
                return null;
            default:
                Class<?> cls2 = typeToken.f7456a;
                if (cls.isAssignableFrom(cls2)) {
                    return new c(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        int i6 = this.f3508w;
        A a6 = this.f3510y;
        Class cls = this.f3509x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "Factory[type=" + cls.getName() + ",adapter=" + a6 + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + a6 + "]";
        }
    }
}
