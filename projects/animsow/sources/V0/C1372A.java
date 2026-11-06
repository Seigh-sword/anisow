package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: v0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1372A extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12932a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1374C f12933b;

    public C1372A(C1374C c1374c) {
        this.f12933b = c1374c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12932a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f12932a) {
            this.f12932a = false;
            return;
        }
        C1374C c1374c = this.f12933b;
        if (((Float) c1374c.f12978z.getAnimatedValue()).floatValue() == 0.0f) {
            c1374c.f12951A = 0;
            c1374c.f(0);
        } else {
            c1374c.f12951A = 2;
            c1374c.f12971s.invalidate();
        }
    }
}
