package E2;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Dialog f389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f391y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f392z;

    public a(Dialog dialog, Rect rect) {
        this.f389w = dialog;
        this.f390x = rect.left;
        this.f391y = rect.top;
        this.f392z = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f390x;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f391y, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i6 = this.f392z;
            motionEventObtain.setLocation((-i6) - 1, (-i6) - 1);
        }
        view.performClick();
        return this.f389w.onTouchEvent(motionEventObtain);
    }
}
