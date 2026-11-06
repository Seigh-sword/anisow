package h0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: h0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0740e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f8801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f8803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0741f f8804d;

    public AnimationAnimationListenerC0740e(s0 s0Var, ViewGroup viewGroup, View view, C0741f c0741f) {
        this.f8801a = s0Var;
        this.f8802b = viewGroup;
        this.f8803c = view;
        this.f8804d = c0741f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC1305a.o(animation, "animation");
        ViewGroup viewGroup = this.f8802b;
        viewGroup.post(new c0.n(viewGroup, this.f8803c, this.f8804d, 1));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f8801a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC1305a.o(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC1305a.o(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f8801a + " has reached onAnimationStart.");
        }
    }
}
