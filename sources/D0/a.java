package D0;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ImageView {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Animation.AnimationListener f246w;

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f246w;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f246w;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i6) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i6);
        }
    }
}
