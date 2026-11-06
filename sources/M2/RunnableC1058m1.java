package m2;

import b2.C0337b;
import p1.C1243i;
import u1.C1358b;

/* JADX INFO: renamed from: m2.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1058m1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f11031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C1052k1 f11032y;

    public /* synthetic */ RunnableC1058m1(C1052k1 c1052k1, long j6, int i6) {
        this.f11030w = i6;
        this.f11031x = j6;
        this.f11032y = c1052k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f11030w;
        C1052k1 c1052k1 = this.f11032y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c1052k1.r();
                c1052k1.B();
                N nF = c1052k1.f();
                long j6 = this.f11031x;
                nF.f10723J.c(Long.valueOf(j6), "Activity paused, time");
                C1358b c1358b = c1052k1.f11015C;
                ((C0337b) ((C1052k1) c1358b.f12823y).h()).getClass();
                RunnableC1061n1 runnableC1061n1 = new RunnableC1061n1(c1358b, System.currentTimeMillis(), j6);
                c1358b.f12822x = runnableC1061n1;
                ((C1052k1) c1358b.f12823y).f11016y.postDelayed(runnableC1061n1, 2000L);
                if (c1052k1.n().F()) {
                    c1052k1.f11014B.f11051c.a();
                }
                break;
            default:
                c1052k1.r();
                c1052k1.B();
                N nF2 = c1052k1.f();
                long j7 = this.f11031x;
                nF2.f10723J.c(Long.valueOf(j7), "Activity resumed, time");
                boolean zD = c1052k1.n().D(null, AbstractC1078w.f11147N0);
                C1064o1 c1064o1 = c1052k1.f11014B;
                if (!zD ? c1052k1.n().F() || c1052k1.p().f10816P.b() : c1052k1.n().F() || c1052k1.f11017z) {
                    c1064o1.f11052d.r();
                    c1064o1.f11051c.a();
                    c1064o1.f11049a = j7;
                    c1064o1.f11050b = j7;
                }
                c1052k1.f11015C.o();
                C1243i c1243i = c1052k1.f11013A;
                ((C1052k1) c1243i.f12254x).r();
                if (((C1051k0) ((C1052k1) c1243i.f12254x).f1668w).j()) {
                    ((C0337b) ((C1052k1) c1243i.f12254x).h()).getClass();
                    c1243i.B(false, System.currentTimeMillis());
                }
                break;
        }
    }
}
