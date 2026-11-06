package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: v0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1406o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1407p f13178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f13179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f13180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f13181e;

    public /* synthetic */ C1406o(r rVar, C1407p c1407p, ViewPropertyAnimator viewPropertyAnimator, View view, int i6) {
        this.f13177a = i6;
        this.f13181e = rVar;
        this.f13178b = c1407p;
        this.f13179c = viewPropertyAnimator;
        this.f13180d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6 = this.f13177a;
        r rVar = this.f13181e;
        C1407p c1407p = this.f13178b;
        View view = this.f13180d;
        ViewPropertyAnimator viewPropertyAnimator = this.f13179c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                rVar.c(c1407p.f13183a);
                rVar.f13213r.remove(c1407p.f13183a);
                rVar.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                rVar.c(c1407p.f13184b);
                rVar.f13213r.remove(c1407p.f13184b);
                rVar.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i6 = this.f13177a;
        r rVar = this.f13181e;
        C1407p c1407p = this.f13178b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                u0 u0Var = c1407p.f13183a;
                rVar.getClass();
                break;
            default:
                u0 u0Var2 = c1407p.f13184b;
                rVar.getClass();
                break;
        }
    }
}
