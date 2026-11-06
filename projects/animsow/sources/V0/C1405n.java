package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: v0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1405n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f13171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f13173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f13175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f13176f;

    public C1405n(r rVar, u0 u0Var, int i6, View view, int i7, ViewPropertyAnimator viewPropertyAnimator) {
        this.f13176f = rVar;
        this.f13171a = u0Var;
        this.f13172b = i6;
        this.f13173c = view;
        this.f13174d = i7;
        this.f13175e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i6 = this.f13172b;
        View view = this.f13173c;
        if (i6 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f13174d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f13175e.setListener(null);
        r rVar = this.f13176f;
        u0 u0Var = this.f13171a;
        rVar.c(u0Var);
        rVar.f13211p.remove(u0Var);
        rVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f13176f.getClass();
    }
}
