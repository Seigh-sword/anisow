package F0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.onesignal.n2;
import s.C1280b;

/* JADX INFO: renamed from: F0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0029p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f545c;

    public /* synthetic */ C0029p(Object obj, int i6, Object obj2) {
        this.f543a = i6;
        this.f545c = obj;
        this.f544b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i6 = this.f543a;
        Object obj = this.f544b;
        Object obj2 = this.f545c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C1280b) obj).remove(animator);
                ((w) obj2).f578J.remove(animator);
                break;
            default:
                com.onesignal.F.a((com.onesignal.F) obj2);
                n2 n2Var = (n2) obj;
                if (n2Var != null) {
                    n2Var.b();
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f543a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((w) this.f545c).f578J.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
