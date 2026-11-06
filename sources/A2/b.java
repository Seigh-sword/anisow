package A2;

import S2.j;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8b;

    public /* synthetic */ b(int i6, Object obj) {
        this.f7a = i6;
        this.f8b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i6 = this.f7a;
        Object obj = this.f8b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                d dVar = (d) obj;
                dVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar.f20j.setAlpha((int) (255.0f * fFloatValue));
                dVar.f34x = fFloatValue;
                break;
            default:
                j jVar = (j) obj;
                jVar.getClass();
                jVar.f3172d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
