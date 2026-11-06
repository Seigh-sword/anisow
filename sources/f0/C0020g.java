package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.xo.anilab.R;

/* JADX INFO: renamed from: F0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0020g extends AnimatorListenerAdapter implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f526b = false;

    public C0020g(View view) {
        this.f525a = view;
    }

    @Override // F0.u
    public final void c() {
        View view = this.f525a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? H.f486a.p(view) : 0.0f));
    }

    @Override // F0.u
    public final void e() {
        this.f525a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        H.f486a.x(this.f525a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f525a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f526b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        boolean z6 = this.f526b;
        View view = this.f525a;
        if (z6) {
            view.setLayerType(0, null);
        }
        if (z5) {
            return;
        }
        O o3 = H.f486a;
        o3.x(view, 1.0f);
        o3.getClass();
    }

    @Override // F0.u
    public final void a(w wVar) {
    }

    @Override // F0.u
    public final void b(w wVar) {
    }

    @Override // F0.u
    public final void d(w wVar) {
    }

    @Override // F0.u
    public final void f(w wVar) {
    }
}
