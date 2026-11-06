package h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: h0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0743h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f8816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f8818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0744i f8819e;

    public C0743h(ViewGroup viewGroup, View view, boolean z5, s0 s0Var, C0744i c0744i) {
        this.f8815a = viewGroup;
        this.f8816b = view;
        this.f8817c = z5;
        this.f8818d = s0Var;
        this.f8819e = c0744i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC1305a.o(animator, "anim");
        ViewGroup viewGroup = this.f8815a;
        View view = this.f8816b;
        viewGroup.endViewTransition(view);
        boolean z5 = this.f8817c;
        s0 s0Var = this.f8818d;
        if (z5) {
            int i6 = s0Var.f8886a;
            AbstractC1305a.n(view, "viewToAnimate");
            AbstractC0628i.a(i6, view, viewGroup);
        }
        C0744i c0744i = this.f8819e;
        ((s0) c0744i.f8827c.f1668w).c(c0744i);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + s0Var + " has ended.");
        }
    }
}
