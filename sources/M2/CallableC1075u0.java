package m2;

import java.util.concurrent.Callable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1075u0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11111c;

    public /* synthetic */ CallableC1075u0(Object obj, int i6, Object obj2) {
        this.f11109a = i6;
        this.f11111c = obj2;
        this.f11110b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6 = this.f11109a;
        Object obj = this.f11111c;
        Object obj2 = this.f11110b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                BinderC1066p0 binderC1066p0 = (BinderC1066p0) obj2;
                binderC1066p0.f11055c.b0();
                return new C1038g(binderC1066p0.f11055c.d(((B1) obj).f10525w));
            case 1:
                BinderC1066p0 binderC1066p02 = (BinderC1066p0) obj2;
                binderC1066p02.f11055c.b0();
                C1044i c1044i = binderC1066p02.f11055c.f11272y;
                x1.x(c1044i);
                return c1044i.x0((String) obj);
            default:
                x1 x1Var = (x1) obj2;
                B1 b1 = (B1) obj;
                String str = b1.f10525w;
                AbstractC1332d.m(str);
                C1085z0 c1085z0H = x1Var.H(str);
                EnumC1083y0 enumC1083y0 = EnumC1083y0.f11278y;
                if (c1085z0H.i(enumC1083y0) && C1085z0.d(100, b1.f10514R).i(enumC1083y0)) {
                    return x1Var.l(b1).g();
                }
                x1Var.f().f10723J.d("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
