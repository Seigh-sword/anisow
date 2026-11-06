package R2;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2945b;

    public /* synthetic */ b(j jVar, int i6) {
        this.f2944a = i6;
        this.f2945b = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i6 = this.f2944a;
        j jVar = this.f2945b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                jVar.f2979i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar.f2979i.setScaleX(fFloatValue);
                jVar.f2979i.setScaleY(fFloatValue);
                break;
        }
    }
}
