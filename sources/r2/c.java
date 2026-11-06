package R2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2947b;

    public /* synthetic */ c(j jVar, int i6) {
        this.f2946a = i6;
        this.f2947b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6 = this.f2946a;
        j jVar = this.f2947b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                jVar.c();
                break;
            default:
                jVar.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2946a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                j jVar = this.f2947b;
                k kVar = jVar.f2980j;
                int i6 = jVar.f2973c;
                int i7 = jVar.f2971a;
                int i8 = i6 - i7;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) kVar;
                snackbarContentLayout.f7295w.setAlpha(0.0f);
                long j6 = i7;
                ViewPropertyAnimator duration = snackbarContentLayout.f7295w.animate().alpha(1.0f).setDuration(j6);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f7297y;
                long j7 = i8;
                duration.setInterpolator(timeInterpolator).setStartDelay(j7).start();
                if (snackbarContentLayout.f7296x.getVisibility() == 0) {
                    snackbarContentLayout.f7296x.setAlpha(0.0f);
                    snackbarContentLayout.f7296x.animate().alpha(1.0f).setDuration(j6).setInterpolator(timeInterpolator).setStartDelay(j7).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
