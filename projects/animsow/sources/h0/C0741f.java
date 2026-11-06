package h0;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.gms.internal.measurement.C0396c2;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: h0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0741f extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0742g f8807c;

    public C0741f(C0742g c0742g) {
        this.f8807c = c0742g;
    }

    @Override // h0.q0
    public final void b(ViewGroup viewGroup) {
        AbstractC1305a.o(viewGroup, "container");
        C0742g c0742g = this.f8807c;
        s0 s0Var = (s0) c0742g.f1668w;
        View view = s0Var.f8888c.f8618c0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((s0) c0742g.f1668w).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + s0Var + " has been cancelled.");
        }
    }

    @Override // h0.q0
    public final void c(ViewGroup viewGroup) {
        AbstractC1305a.o(viewGroup, "container");
        C0742g c0742g = this.f8807c;
        boolean zK = c0742g.k();
        Object obj = c0742g.f1668w;
        if (zK) {
            ((s0) obj).c(this);
            return;
        }
        Context context = viewGroup.getContext();
        s0 s0Var = (s0) obj;
        View view = s0Var.f8888c.f8618c0;
        AbstractC1305a.n(context, "context");
        C0396c2 c0396c2S = c0742g.s(context);
        if (c0396c2S == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Animation animation = (Animation) c0396c2S.f6775x;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (s0Var.f8886a != 1) {
            view.startAnimation(animation);
            ((s0) obj).c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        F f6 = new F(animation, viewGroup, view);
        f6.setAnimationListener(new AnimationAnimationListenerC0740e(s0Var, viewGroup, view, this));
        view.startAnimation(f6);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + s0Var + " has started.");
        }
    }
}
