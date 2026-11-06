package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public final class M extends SeekBar {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final N f10163w;

    public M(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        X0.a(getContext(), this);
        N n5 = new N(this);
        this.f10163w = n5;
        n5.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        N n5 = this.f10163w;
        Drawable drawable = n5.f10165e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = n5.f10164d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10163w.f10165e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f10163w.d(canvas);
    }
}
