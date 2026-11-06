package D0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f285x;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i6) {
        this.f284w = i6;
        this.f285x = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f6, Transformation transformation) {
        int i6 = this.f284w;
        SwipeRefreshLayout swipeRefreshLayout = this.f285x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                swipeRefreshLayout.setAnimationProgress(f6);
                break;
            case 1:
                swipeRefreshLayout.setAnimationProgress(1.0f - f6);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                swipeRefreshLayout.getClass();
                int iAbs = swipeRefreshLayout.f5806S - Math.abs(swipeRefreshLayout.f5805R);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f5804Q + ((int) ((iAbs - r5) * f6))) - swipeRefreshLayout.f5802O.getTop());
                e eVar = swipeRefreshLayout.f5808U;
                float f7 = 1.0f - f6;
                d dVar = eVar.f278w;
                if (f7 != dVar.f267p) {
                    dVar.f267p = f7;
                }
                eVar.invalidateSelf();
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                swipeRefreshLayout.e(f6);
                break;
            default:
                swipeRefreshLayout.getClass();
                swipeRefreshLayout.setAnimationProgress(((-0.0f) * f6) + 0.0f);
                swipeRefreshLayout.e(f6);
                break;
        }
    }
}
