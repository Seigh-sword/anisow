package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AnimatorListenerAdapter implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f501d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0021h f502e;

    public S(C0021h c0021h, ViewGroup viewGroup, View view, View view2) {
        this.f502e = c0021h;
        this.f498a = viewGroup;
        this.f499b = view;
        this.f500c = view2;
    }

    @Override // F0.u
    public final void a(w wVar) {
        wVar.F(this);
    }

    @Override // F0.u
    public final void b(w wVar) {
        if (this.f501d) {
            g();
        }
    }

    public final void g() {
        this.f500c.setTag(R.id.save_overlay_view, null);
        this.f498a.getOverlay().remove(this.f499b);
        this.f501d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f498a.getOverlay().remove(this.f499b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f499b;
        if (view.getParent() == null) {
            this.f498a.getOverlay().add(view);
        } else {
            this.f502e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z5) {
        if (z5) {
            View view = this.f500c;
            View view2 = this.f499b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f498a.getOverlay().add(view2);
            this.f501d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        if (z5) {
            return;
        }
        g();
    }

    @Override // F0.u
    public final void c() {
    }

    @Override // F0.u
    public final void e() {
    }

    @Override // F0.u
    public final void d(w wVar) {
    }
}
