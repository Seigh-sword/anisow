package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AnimatorListenerAdapter implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f494c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f497f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f495d = true;

    public Q(View view, int i6) {
        this.f492a = view;
        this.f493b = i6;
        this.f494c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // F0.u
    public final void a(w wVar) {
        wVar.F(this);
    }

    @Override // F0.u
    public final void c() {
        g(false);
        if (this.f497f) {
            return;
        }
        H.b(this.f492a, this.f493b);
    }

    @Override // F0.u
    public final void e() {
        g(true);
        if (this.f497f) {
            return;
        }
        H.b(this.f492a, 0);
    }

    public final void g(boolean z5) {
        ViewGroup viewGroup;
        if (!this.f495d || this.f496e == z5 || (viewGroup = this.f494c) == null) {
            return;
        }
        this.f496e = z5;
        com.bumptech.glide.c.P(viewGroup, z5);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f497f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f497f) {
            H.b(this.f492a, this.f493b);
            ViewGroup viewGroup = this.f494c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        if (z5) {
            return;
        }
        if (!this.f497f) {
            H.b(this.f492a, this.f493b);
            ViewGroup viewGroup = this.f494c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z5) {
        if (z5) {
            H.b(this.f492a, 0);
            ViewGroup viewGroup = this.f494c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // F0.u
    public final void b(w wVar) {
    }

    @Override // F0.u
    public final void d(w wVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
