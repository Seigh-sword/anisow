package I2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.xo.anilab.R;
import j0.C0840b;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1150h;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1149g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f1150h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f1138b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i6), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C0840b());
        return animatorSet;
    }

    public final void b(float f6) {
        float interpolation = this.f1137a.getInterpolation(f6);
        View view = this.f1138b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f7 = this.f1149g / width;
        float f8 = this.f1150h / height;
        float fA = 1.0f - AbstractC1301a.a(0.0f, f7, interpolation);
        float fA2 = 1.0f - AbstractC1301a.a(0.0f, f8, interpolation);
        view.setScaleX(fA);
        view.setPivotY(height);
        view.setScaleY(fA2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                View childAt = viewGroup.getChildAt(i6);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA2 != 0.0f ? fA / fA2 : 1.0f);
            }
        }
    }
}
