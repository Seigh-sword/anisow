package D0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Animation {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f288y;

    public h(SwipeRefreshLayout swipeRefreshLayout, int i6, int i7) {
        this.f288y = swipeRefreshLayout;
        this.f286w = i6;
        this.f287x = i7;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f6, Transformation transformation) {
        this.f288y.f5808U.setAlpha((int) (((this.f287x - r0) * f6) + this.f286w));
    }
}
