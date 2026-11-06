package N;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: N.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0088d0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1980d;

    public /* synthetic */ C0088d0(Object obj, Object obj2, Object obj3, int i6) {
        this.f1977a = i6;
        this.f1980d = obj;
        this.f1979c = obj2;
        this.f1978b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f1977a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((InterfaceC0092f0) this.f1979c).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6 = this.f1977a;
        Object obj = this.f1979c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((InterfaceC0092f0) obj).c();
                break;
            default:
                ((o0) obj).f2031a.d(1.0f);
                k0.e((View) this.f1978b);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1977a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((InterfaceC0092f0) this.f1979c).f();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
