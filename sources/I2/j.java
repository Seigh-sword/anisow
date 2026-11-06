package I2;

import N.V;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.xo.anilab.R;
import java.util.WeakHashMap;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1156i;

    public j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f1154g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f1155h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f1156i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f6, int i6, boolean z5) {
        float interpolation = this.f1137a.getInterpolation(f6);
        WeakHashMap weakHashMap = V.f1964a;
        View view = this.f1138b;
        boolean z6 = (Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 3) == 3;
        boolean z7 = z5 == z6;
        int width = view.getWidth();
        int height = view.getHeight();
        float f7 = width;
        if (f7 > 0.0f) {
            float f8 = height;
            if (f8 <= 0.0f) {
                return;
            }
            float f9 = this.f1154g / f7;
            float f10 = this.f1155h / f7;
            float f11 = this.f1156i / f8;
            if (z6) {
                f7 = 0.0f;
            }
            view.setPivotX(f7);
            if (!z7) {
                f10 = -f9;
            }
            float fA = AbstractC1301a.a(0.0f, f10, interpolation);
            float f12 = fA + 1.0f;
            view.setScaleX(f12);
            float fA2 = 1.0f - AbstractC1301a.a(0.0f, f11, interpolation);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    childAt.setPivotX(z6 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f13 = z7 ? 1.0f - fA : 1.0f;
                    float f14 = fA2 != 0.0f ? (f12 / fA2) * f13 : 1.0f;
                    childAt.setScaleX(f13);
                    childAt.setScaleY(f14);
                }
            }
        }
    }
}
