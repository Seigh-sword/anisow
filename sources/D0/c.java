package D0;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f251b;

    public c(e eVar, d dVar) {
        this.f251b = eVar;
        this.f250a = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f251b;
        d dVar = this.f250a;
        eVar.a(1.0f, dVar, true);
        dVar.f262k = dVar.f256e;
        dVar.f263l = dVar.f257f;
        dVar.f264m = dVar.f258g;
        dVar.a((dVar.f261j + 1) % dVar.f260i.length);
        if (!eVar.f277B) {
            eVar.f276A += 1.0f;
            return;
        }
        eVar.f277B = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f265n) {
            dVar.f265n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f251b.f276A = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
