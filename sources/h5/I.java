package h5;

import d2.AbstractC0651b;
import java.lang.reflect.Method;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0651b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f9014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9015j;

    public /* synthetic */ I(Method method, int i6, int i7) {
        this.f9013h = i7;
        this.f9014i = method;
        this.f9015j = i6;
    }

    @Override // d2.AbstractC0651b
    public final void a(Q q5, Object obj) {
        int i6 = this.f9013h;
        int i7 = this.f9015j;
        Method method = this.f9014i;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                V4.p pVar = (V4.p) obj;
                if (pVar == null) {
                    throw d0.k(method, i7, "Headers parameter must not be null.", new Object[0]);
                }
                C1486b c1486b = q5.f9040f;
                c1486b.getClass();
                int iG = pVar.g();
                for (int i8 = 0; i8 < iG; i8++) {
                    c1486b.b(pVar.d(i8), pVar.h(i8));
                }
                return;
            default:
                if (obj == null) {
                    throw d0.k(method, i7, "@Url parameter is null.", new Object[0]);
                }
                q5.f9037c = obj.toString();
                return;
        }
    }
}
