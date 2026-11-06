package D0;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f249c;

    public /* synthetic */ b(Object obj, int i6, Object obj2) {
        this.f247a = i6;
        this.f249c = obj;
        this.f248b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i6 = this.f247a;
        Object obj = this.f248b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e eVar = (e) this.f249c;
                d dVar = (d) obj;
                eVar.getClass();
                e.d(fFloatValue, dVar);
                eVar.a(fFloatValue, dVar, false);
                eVar.invalidateSelf();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
        }
    }
}
