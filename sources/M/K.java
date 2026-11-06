package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public final class K extends RatingBar {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final I f10134w;

    public K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        X0.a(getContext(), this);
        I i6 = new I(this);
        this.f10134w = i6;
        i6.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        Bitmap bitmap = this.f10134w.f10126b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i6, 0), getMeasuredHeight());
        }
    }
}
