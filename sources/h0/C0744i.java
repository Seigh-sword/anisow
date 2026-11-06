package h0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.C0396c2;
import d.C0621b;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: h0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0744i extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0742g f8827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f8828d;

    public C0744i(C0742g c0742g) {
        this.f8827c = c0742g;
    }

    @Override // h0.q0
    public final void b(ViewGroup viewGroup) {
        AbstractC1305a.o(viewGroup, "container");
        AnimatorSet animatorSet = this.f8828d;
        C0742g c0742g = this.f8827c;
        if (animatorSet == null) {
            ((s0) c0742g.f1668w).c(this);
            return;
        }
        s0 s0Var = (s0) c0742g.f1668w;
        if (!s0Var.f8892g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0746k.f8831a.a(animatorSet);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(s0Var);
            sb.append(" has been canceled");
            sb.append(s0Var.f8892g ? " with seeking." : ".");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // h0.q0
    public final void c(ViewGroup viewGroup) {
        AbstractC1305a.o(viewGroup, "container");
        Object obj = this.f8827c.f1668w;
        s0 s0Var = (s0) obj;
        AnimatorSet animatorSet = this.f8828d;
        if (animatorSet == null) {
            ((s0) obj).c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + s0Var + " has started.");
        }
    }

    @Override // h0.q0
    public final void d(C0621b c0621b, ViewGroup viewGroup) {
        AbstractC1305a.o(c0621b, "backEvent");
        AbstractC1305a.o(viewGroup, "container");
        Object obj = this.f8827c.f1668w;
        s0 s0Var = (s0) obj;
        AnimatorSet animatorSet = this.f8828d;
        if (animatorSet == null) {
            ((s0) obj).c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !s0Var.f8888c.f8598I) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + s0Var);
        }
        long jA = C0745j.f8830a.a(animatorSet);
        long j6 = (long) (c0621b.f8093c * jA);
        if (j6 == 0) {
            j6 = 1;
        }
        if (j6 == jA) {
            j6 = jA - 1;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j6 + " for Animator " + animatorSet + " on operation " + s0Var);
        }
        C0746k.f8831a.b(animatorSet, j6);
    }

    @Override // h0.q0
    public final void e(ViewGroup viewGroup) {
        C0742g c0742g = this.f8827c;
        if (c0742g.k()) {
            return;
        }
        Context context = viewGroup.getContext();
        AbstractC1305a.n(context, "context");
        C0396c2 c0396c2S = c0742g.s(context);
        this.f8828d = c0396c2S != null ? (AnimatorSet) c0396c2S.f6776y : null;
        s0 s0Var = (s0) c0742g.f1668w;
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = s0Var.f8888c;
        boolean z5 = s0Var.f8886a == 3;
        View view = abstractComponentCallbacksC0734B.f8618c0;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.f8828d;
        if (animatorSet != null) {
            animatorSet.addListener(new C0743h(viewGroup, view, z5, s0Var, this));
        }
        AnimatorSet animatorSet2 = this.f8828d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
