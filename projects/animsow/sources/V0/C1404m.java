package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: v0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1404m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13158a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f13159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f13160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f13161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f13162e;

    public C1404m(r rVar, u0 u0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f13162e = rVar;
        this.f13159b = u0Var;
        this.f13160c = view;
        this.f13161d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f13158a) {
            case 1:
                this.f13160c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6 = this.f13158a;
        u0 u0Var = this.f13159b;
        r rVar = this.f13162e;
        ViewPropertyAnimator viewPropertyAnimator = this.f13161d;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                viewPropertyAnimator.setListener(null);
                this.f13160c.setAlpha(1.0f);
                rVar.c(u0Var);
                rVar.f13212q.remove(u0Var);
                rVar.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                rVar.c(u0Var);
                rVar.f13210o.remove(u0Var);
                rVar.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i6 = this.f13158a;
        r rVar = this.f13162e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                rVar.getClass();
                break;
            default:
                rVar.getClass();
                break;
        }
    }

    public C1404m(r rVar, u0 u0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f13162e = rVar;
        this.f13159b = u0Var;
        this.f13161d = viewPropertyAnimator;
        this.f13160c = view;
    }
}
