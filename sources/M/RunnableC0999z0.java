package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: m.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0999z0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10430w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ A0 f10431x;

    public /* synthetic */ RunnableC0999z0(A0 a02, int i6) {
        this.f10430w = i6;
        this.f10431x = a02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10430w;
        A0 a02 = this.f10431x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ViewParent parent = a02.f10081z.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                a02.a();
                View view = a02.f10081z;
                if (view.isEnabled() && !view.isLongClickable() && a02.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    a02.f10075C = true;
                    break;
                }
                break;
        }
    }
}
