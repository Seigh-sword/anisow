package y2;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1499a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13788b;

    public /* synthetic */ C1499a(int i6, Object obj) {
        this.f13787a = i6;
        this.f13788b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i6 = this.f13787a;
        Object obj = this.f13788b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                P2.g gVar = ((BottomSheetBehavior) obj).f7091i;
                if (gVar != null) {
                    gVar.o(fFloatValue);
                }
                break;
            default:
                ((TextInputLayout) obj).f7336R0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
