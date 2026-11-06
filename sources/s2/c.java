package S2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3115b;

    public /* synthetic */ c(d dVar, int i6) {
        this.f3114a = i6;
        this.f3115b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3114a) {
            case 1:
                this.f3115b.f3170b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3114a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                this.f3115b.f3170b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
