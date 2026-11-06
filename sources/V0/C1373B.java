package v0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: v0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1373B implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1374C f12938a;

    public C1373B(C1374C c1374c) {
        this.f12938a = c1374c;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C1374C c1374c = this.f12938a;
        c1374c.f12955c.setAlpha(iFloatValue);
        c1374c.f12956d.setAlpha(iFloatValue);
        c1374c.f12971s.invalidate();
    }
}
