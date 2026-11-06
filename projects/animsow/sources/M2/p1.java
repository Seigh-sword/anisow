package m2;

import android.os.SystemClock;
import b2.C0337b;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends AbstractC1059n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Object obj, C1051k0 c1051k0, int i6) {
        super(c1051k0);
        this.f11058e = i6;
        this.f11059f = obj;
    }

    @Override // m2.AbstractC1059n
    public final void c() throws Throwable {
        int i6 = this.f11058e;
        Object obj = this.f11059f;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C1064o1 c1064o1 = (C1064o1) obj;
                c1064o1.f11052d.r();
                C1052k1 c1052k1 = c1064o1.f11052d;
                ((C0337b) c1052k1.h()).getClass();
                c1064o1.a(false, false, SystemClock.elapsedRealtime());
                C1067q c1067qM = ((C1051k0) c1052k1.f1668w).m();
                ((C0337b) c1052k1.h()).getClass();
                c1067qM.y(SystemClock.elapsedRealtime());
                break;
            default:
                s1 s1Var = (s1) obj;
                s1Var.y();
                s1Var.f().f10723J.d("Starting upload from DelayedRunnable");
                s1Var.f11112x.d0();
                break;
        }
    }
}
