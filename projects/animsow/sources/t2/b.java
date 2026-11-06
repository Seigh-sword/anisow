package t2;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public VelocityTracker f12734g;

    @Override // B.b
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f12733f < 0) {
            this.f12733f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f12730c) {
            int i6 = this.f12731d;
            if (i6 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                return false;
            }
            int y5 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y5 - this.f12732e) > this.f12733f) {
                this.f12732e = y5;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f12734g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f12731d = -1;
        motionEvent.getX();
        motionEvent.getY();
        H1.a.q(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    @Override // B.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r8.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == r2) goto L41
            r5 = 2
            if (r0 == r5) goto L2d
            r7 = 3
            if (r0 == r7) goto L45
            r7 = 6
            if (r0 == r7) goto L14
            goto L52
        L14:
            int r7 = r8.getActionIndex()
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r4
        L1c:
            int r7 = r8.getPointerId(r2)
            r6.f12731d = r7
            float r7 = r8.getY(r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r7 = (int) r7
            r6.f12732e = r7
            goto L52
        L2d:
            int r0 = r6.f12731d
            int r0 = r8.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r4
        L36:
            float r8 = r8.getY(r0)
            int r8 = (int) r8
            r6.f12732e = r8
            d.AbstractC0628i.p(r7)
            throw r3
        L41:
            android.view.VelocityTracker r0 = r6.f12734g
            if (r0 != 0) goto L5c
        L45:
            r6.f12730c = r4
            r6.f12731d = r1
            android.view.VelocityTracker r7 = r6.f12734g
            if (r7 == 0) goto L52
            r7.recycle()
            r6.f12734g = r3
        L52:
            android.view.VelocityTracker r7 = r6.f12734g
            if (r7 == 0) goto L59
            r7.addMovement(r8)
        L59:
            boolean r7 = r6.f12730c
            return r7
        L5c:
            r0.addMovement(r8)
            android.view.VelocityTracker r8 = r6.f12734g
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.computeCurrentVelocity(r0)
            android.view.VelocityTracker r8 = r6.f12734g
            int r0 = r6.f12731d
            r8.getYVelocity(r0)
            d.AbstractC0628i.p(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.b.u(android.view.View, android.view.MotionEvent):boolean");
    }
}
