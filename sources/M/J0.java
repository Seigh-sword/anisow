package m;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f10133x;

    public /* synthetic */ J0(int i6, Object obj) {
        this.f10132w = i6;
        this.f10133x = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        K0 k02;
        H h4;
        switch (this.f10132w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                int action = motionEvent.getAction();
                int x5 = (int) motionEvent.getX();
                int y5 = (int) motionEvent.getY();
                Object obj = this.f10133x;
                if (action == 0 && (h4 = (k02 = (K0) obj).f10158V) != null && h4.isShowing() && x5 >= 0 && x5 < k02.f10158V.getWidth() && y5 >= 0 && y5 < k02.f10158V.getHeight()) {
                    k02.f10154R.postDelayed(k02.f10150N, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                K0 k03 = (K0) obj;
                k03.f10154R.removeCallbacks(k03.f10150N);
                return false;
            default:
                return true;
        }
    }
}
