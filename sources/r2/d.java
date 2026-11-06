package R2;

import android.animation.ValueAnimator;
import j0.C0840b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f2948a;

    public d(j jVar, int i6) {
        this.f2948a = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C0840b c0840b = j.f2965u;
        this.f2948a.f2979i.setTranslationY(iIntValue);
    }
}
