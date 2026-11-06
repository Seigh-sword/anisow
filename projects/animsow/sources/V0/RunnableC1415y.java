package v0;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: v0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1415y implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f13282x;

    public /* synthetic */ RunnableC1415y(int i6, Object obj) {
        this.f13281w = i6;
        this.f13282x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f13281w;
        Object obj = this.f13282x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C1374C c1374c = (C1374C) obj;
                int i7 = c1374c.f12951A;
                ValueAnimator valueAnimator = c1374c.f12978z;
                if (i7 == 1) {
                    valueAnimator.cancel();
                } else if (i7 != 2) {
                }
                c1374c.f12951A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).C0();
                break;
        }
    }
}
