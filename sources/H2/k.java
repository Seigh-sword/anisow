package H2;

import F0.F;
import F0.w;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k extends w {
    @Override // F0.w
    public final void f(F f6) {
        View view = f6.f484b;
        if (view instanceof TextView) {
            f6.f483a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // F0.w
    public final void k(F f6) {
        View view = f6.f484b;
        if (view instanceof TextView) {
            f6.f483a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // F0.w
    public final Animator o(ViewGroup viewGroup, F f6, F f7) {
        if (f6 != null && f7 != null && (f6.f484b instanceof TextView)) {
            View view = f7.f484b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                HashMap map = f6.f483a;
                HashMap map2 = f7.f483a;
                float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
                float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
                if (fFloatValue == fFloatValue2) {
                    return null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
                valueAnimatorOfFloat.addUpdateListener(new D0.b(this, 1, textView));
                return valueAnimatorOfFloat;
            }
        }
        return null;
    }
}
