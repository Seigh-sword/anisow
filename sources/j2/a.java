package J2;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1248b;

    public a(c cVar, float f6) {
        this.f1248b = cVar;
        this.f1247a = f6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1248b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f1247a);
    }
}
