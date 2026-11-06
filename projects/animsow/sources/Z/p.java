package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14051w;

    public p(Context context) {
        super(context);
        this.f14051w = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z5) {
        this.f14051w = z5;
    }

    public void setGuidelineBegin(int i6) {
        C1514e c1514e = (C1514e) getLayoutParams();
        if (this.f14051w && c1514e.f13882a == i6) {
            return;
        }
        c1514e.f13882a = i6;
        setLayoutParams(c1514e);
    }

    public void setGuidelineEnd(int i6) {
        C1514e c1514e = (C1514e) getLayoutParams();
        if (this.f14051w && c1514e.f13884b == i6) {
            return;
        }
        c1514e.f13884b = i6;
        setLayoutParams(c1514e);
    }

    public void setGuidelinePercent(float f6) {
        C1514e c1514e = (C1514e) getLayoutParams();
        if (this.f14051w && c1514e.f13886c == f6) {
            return;
        }
        c1514e.f13886c = f6;
        setLayoutParams(c1514e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
    }
}
