package m2;

import b2.C0337b;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1069r0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11070w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BinderC1066p0 f11071x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ B1 f11072y;

    public /* synthetic */ RunnableC1069r0(BinderC1066p0 binderC1066p0, B1 b1, int i6) {
        this.f11070w = i6;
        this.f11071x = binderC1066p0;
        this.f11072y = b1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B1 b1 = this.f11072y;
        BinderC1066p0 binderC1066p0 = this.f11071x;
        switch (this.f11070w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                x1 x1Var = binderC1066p0.f11055c;
                x1Var.b0();
                x1Var.V(b1);
                break;
            case 1:
                x1 x1Var2 = binderC1066p0.f11055c;
                x1Var2.b0();
                x1Var2.U(b1);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                binderC1066p0.f11055c.b0();
                binderC1066p0.f11055c.P(b1);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                binderC1066p0.f11055c.b0();
                x1 x1Var3 = binderC1066p0.f11055c;
                x1Var3.g().r();
                x1Var3.c0();
                AbstractC1332d.g(b1.f10525w);
                x1Var3.l(b1);
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                binderC1066p0.f11055c.b0();
                x1 x1Var4 = binderC1066p0.f11055c;
                x1Var4.g().r();
                x1Var4.c0();
                AbstractC1332d.m(b1);
                String str = b1.f10525w;
                AbstractC1332d.g(str);
                if (x1Var4.Q().D(null, AbstractC1078w.b1)) {
                    int i6 = 0;
                    if (x1Var4.Q().D(null, AbstractC1078w.f11199j0)) {
                        ((C0337b) x1Var4.h()).getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int iX = x1Var4.Q().x(null, AbstractC1078w.f11160U);
                        x1Var4.Q();
                        long jLongValue = jCurrentTimeMillis - ((Long) AbstractC1078w.f11183e.a(null)).longValue();
                        while (i6 < iX && x1Var4.B(null, jLongValue)) {
                            i6++;
                        }
                    } else {
                        x1Var4.Q();
                        long jIntValue = ((Integer) AbstractC1078w.f11204l.a(null)).intValue();
                        while (i6 < jIntValue && x1Var4.B(str, 0L)) {
                            i6++;
                        }
                    }
                    if (x1Var4.Q().D(null, AbstractC1078w.f11202k0)) {
                        x1Var4.E();
                    }
                    break;
                }
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                binderC1066p0.f11055c.b0();
                x1 x1Var5 = binderC1066p0.f11055c;
                x1Var5.g().r();
                x1Var5.c0();
                AbstractC1332d.g(b1.f10525w);
                x1Var5.V(b1);
                x1Var5.U(b1);
                break;
            default:
                binderC1066p0.f11055c.b0();
                binderC1066p0.f11055c.S(b1);
                break;
        }
    }
}
