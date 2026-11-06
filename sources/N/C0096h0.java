package N;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: N.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0096h0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f1990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0 f1991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0 f1992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1994e;

    public C0096h0(o0 o0Var, C0 c02, C0 c03, int i6, View view) {
        this.f1990a = o0Var;
        this.f1991b = c02;
        this.f1992c = c03;
        this.f1993d = i6;
        this.f1994e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        G.c cVarE;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        o0 o0Var = this.f1990a;
        o0Var.f2031a.d(animatedFraction);
        float fB = o0Var.f2031a.b();
        PathInterpolator pathInterpolator = k0.f2014e;
        int i6 = Build.VERSION.SDK_INT;
        C0 c02 = this.f1991b;
        t0 s0Var = i6 >= 30 ? new s0(c02) : i6 >= 29 ? new r0(c02) : new q0(c02);
        for (int i7 = 1; i7 <= 256; i7 <<= 1) {
            if ((this.f1993d & i7) == 0) {
                cVarE = c02.f1943a.f(i7);
            } else {
                G.c cVarF = c02.f1943a.f(i7);
                G.c cVarF2 = this.f1992c.f1943a.f(i7);
                float f6 = 1.0f - fB;
                cVarE = C0.e(cVarF, (int) (((double) ((cVarF.f641a - cVarF2.f641a) * f6)) + 0.5d), (int) (((double) ((cVarF.f642b - cVarF2.f642b) * f6)) + 0.5d), (int) (((double) ((cVarF.f643c - cVarF2.f643c) * f6)) + 0.5d), (int) (((double) ((cVarF.f644d - cVarF2.f644d) * f6)) + 0.5d));
            }
            s0Var.c(i7, cVarE);
        }
        k0.g(this.f1994e, s0Var.b(), Collections.singletonList(o0Var));
    }
}
