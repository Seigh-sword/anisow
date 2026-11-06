package T3;

import Q3.A;
import Q3.B;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: loaded from: classes.dex */
public final class u implements B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Class f3512x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Class f3513y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ A f3514z;

    public /* synthetic */ u(Class cls, Class cls2, A a6, int i6) {
        this.f3511w = i6;
        this.f3512x = cls;
        this.f3513y = cls2;
        this.f3514z = a6;
    }

    @Override // Q3.B
    public final A a(Q3.n nVar, TypeToken typeToken) {
        int i6 = this.f3511w;
        A a6 = this.f3514z;
        Class cls = this.f3513y;
        Class cls2 = this.f3512x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Class cls3 = typeToken.f7456a;
                if (cls3 != cls2 && cls3 != cls) {
                    break;
                }
                break;
            default:
                Class cls4 = typeToken.f7456a;
                if (cls4 != cls2 && cls4 != cls) {
                    break;
                }
                break;
        }
        return null;
    }

    public final String toString() {
        int i6 = this.f3511w;
        A a6 = this.f3514z;
        Class cls = this.f3513y;
        Class cls2 = this.f3512x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + a6 + "]";
            default:
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + a6 + "]";
        }
    }
}
