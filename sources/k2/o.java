package K2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1597b;

    public /* synthetic */ o(p pVar, int i6) {
        this.f1596a = i6;
        this.f1597b = pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1596a) {
            case 1:
                super.onAnimationEnd(animator);
                p pVar = this.f1597b;
                pVar.a();
                G0.c cVar = pVar.f1606F;
                if (cVar != null) {
                    cVar.a((l) pVar.f9145w);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f1596a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                super.onAnimationRepeat(animator);
                p pVar = this.f1597b;
                pVar.f1603C = (pVar.f1603C + 1) % pVar.f1602B.f1553c.length;
                pVar.f1604D = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
