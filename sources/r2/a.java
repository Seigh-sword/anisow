package R2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2943b;

    public /* synthetic */ a(j jVar, int i6, int i7) {
        this.f2942a = i7;
        this.f2943b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6 = this.f2942a;
        j jVar = this.f2943b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                jVar.b();
                break;
            default:
                jVar.b();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2942a) {
            case 1:
                j jVar = this.f2943b;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) jVar.f2980j;
                snackbarContentLayout.f7295w.setAlpha(1.0f);
                ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.f7295w.animate().alpha(0.0f);
                long j6 = jVar.f2972b;
                ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j6);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f7297y;
                long j7 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j7).start();
                if (snackbarContentLayout.f7296x.getVisibility() == 0) {
                    snackbarContentLayout.f7296x.setAlpha(1.0f);
                    snackbarContentLayout.f7296x.animate().alpha(0.0f).setDuration(j6).setInterpolator(timeInterpolator).setStartDelay(j7).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
