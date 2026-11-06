package i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import d2.AbstractC0651b;
import k.C0882e;

/* JADX INFO: loaded from: classes.dex */
public final class F extends ContentFrameLayout {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ H f9147E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(H h4, C0882e c0882e) {
        super(c0882e, null);
        this.f9147E = h4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f9147E.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (x5 < -5 || y5 < -5 || x5 > getWidth() + 5 || y5 > getHeight() + 5) {
                H h4 = this.f9147E;
                h4.r(h4.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i6) {
        setBackgroundDrawable(AbstractC0651b.p(getContext(), i6));
    }
}
