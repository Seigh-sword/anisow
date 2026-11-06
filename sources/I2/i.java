package I2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f1153c;

    public i(j jVar, boolean z5, int i6) {
        this.f1153c = jVar;
        this.f1151a = z5;
        this.f1152b = i6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j jVar = this.f1153c;
        jVar.f1138b.setTranslationX(0.0f);
        jVar.a(0.0f, this.f1152b, this.f1151a);
    }
}
