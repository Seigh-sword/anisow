package V;

import N.V;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import j.RunnableC0835a;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f3658v = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3660b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f3662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f3663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f3664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f3665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f3666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f3667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f3668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f3670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f3671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f3672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OverScroller f3674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.bumptech.glide.c f3675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f3676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewGroup f3678t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3661c = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RunnableC0835a f3679u = new RunnableC0835a(5, this);

    public e(Context context, ViewGroup viewGroup, com.bumptech.glide.c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3678t = viewGroup;
        this.f3675q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3673o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3660b = viewConfiguration.getScaledTouchSlop();
        this.f3671m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3672n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3674p = new OverScroller(context, f3658v);
    }

    public final void a() {
        this.f3661c = -1;
        float[] fArr = this.f3662d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3663e, 0.0f);
            Arrays.fill(this.f3664f, 0.0f);
            Arrays.fill(this.f3665g, 0.0f);
            Arrays.fill(this.f3666h, 0);
            Arrays.fill(this.f3667i, 0);
            Arrays.fill(this.f3668j, 0);
            this.f3669k = 0;
        }
        VelocityTracker velocityTracker = this.f3670l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3670l = null;
        }
    }

    public final void b(View view, int i6) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f3678t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f3676r = view;
        this.f3661c = i6;
        this.f3675q.F(view, i6);
        n(1);
    }

    public final boolean c(View view, float f6, float f7) {
        if (view == null) {
            return false;
        }
        com.bumptech.glide.c cVar = this.f3675q;
        boolean z5 = cVar.u(view) > 0;
        boolean z6 = cVar.v() > 0;
        if (!z5 || !z6) {
            return z5 ? Math.abs(f6) > ((float) this.f3660b) : z6 && Math.abs(f7) > ((float) this.f3660b);
        }
        float f8 = (f7 * f7) + (f6 * f6);
        int i6 = this.f3660b;
        return f8 > ((float) (i6 * i6));
    }

    public final void d(int i6) {
        float[] fArr = this.f3662d;
        if (fArr != null) {
            int i7 = this.f3669k;
            int i8 = 1 << i6;
            if ((i7 & i8) != 0) {
                fArr[i6] = 0.0f;
                this.f3663e[i6] = 0.0f;
                this.f3664f[i6] = 0.0f;
                this.f3665g[i6] = 0.0f;
                this.f3666h[i6] = 0;
                this.f3667i[i6] = 0;
                this.f3668j[i6] = 0;
                this.f3669k = (~i8) & i7;
            }
        }
    }

    public final int e(int i6, int i7, int i8) {
        if (i6 == 0) {
            return 0;
        }
        float width = this.f3678t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i6) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i7);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / i8) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f3659a == 2) {
            OverScroller overScroller = this.f3674p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3676r.getLeft();
            int top = currY - this.f3676r.getTop();
            if (left != 0) {
                View view = this.f3676r;
                WeakHashMap weakHashMap = V.f1964a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3676r;
                WeakHashMap weakHashMap2 = V.f1964a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3675q.H(this.f3676r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
            } else if (!zComputeScrollOffset) {
            }
            this.f3678t.post(this.f3679u);
        }
        return this.f3659a == 2;
    }

    public final View g(int i6, int i7) {
        ViewGroup viewGroup = this.f3678t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3675q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && i7 >= childAt.getTop() && i7 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i6, int i7, int i8, int i9) {
        float f6;
        float f7;
        float f8;
        float f9;
        int left = this.f3676r.getLeft();
        int top = this.f3676r.getTop();
        int i10 = i6 - left;
        int i11 = i7 - top;
        OverScroller overScroller = this.f3674p;
        int i12 = 0;
        if (i10 == 0 && i11 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f3676r;
        int i13 = (int) this.f3672n;
        int i14 = (int) this.f3671m;
        int iAbs = Math.abs(i8);
        if (iAbs < i13) {
            i8 = 0;
        } else if (iAbs > i14) {
            i8 = i8 > 0 ? i14 : -i14;
        }
        int iAbs2 = Math.abs(i9);
        if (iAbs2 < i13) {
            i9 = i12;
        } else if (iAbs2 > i14) {
            if (i9 > 0) {
                i9 = i14;
            } else {
                i12 = -i14;
                i9 = i12;
            }
        }
        int iAbs3 = Math.abs(i10);
        int iAbs4 = Math.abs(i11);
        int iAbs5 = Math.abs(i8);
        int iAbs6 = Math.abs(i9);
        int i15 = iAbs5 + iAbs6;
        int i16 = iAbs3 + iAbs4;
        if (i8 != 0) {
            f6 = iAbs5;
            f7 = i15;
        } else {
            f6 = iAbs3;
            f7 = i16;
        }
        float f10 = f6 / f7;
        if (i9 != 0) {
            f8 = iAbs6;
            f9 = i15;
        } else {
            f8 = iAbs4;
            f9 = i16;
        }
        float f11 = f8 / f9;
        com.bumptech.glide.c cVar = this.f3675q;
        overScroller.startScroll(left, top, i10, i11, (int) ((e(i11, i9, cVar.v()) * f11) + (e(i10, i8, cVar.u(view)) * f10)));
        n(2);
        return true;
    }

    public final boolean i(int i6) {
        if ((this.f3669k & (1 << i6)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i6 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3670l == null) {
            this.f3670l = VelocityTracker.obtain();
        }
        this.f3670l.addMovement(motionEvent);
        int i6 = 0;
        if (actionMasked == 0) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x5, (int) y5);
            l(x5, y5, pointerId);
            r(viewG, pointerId);
            int i7 = this.f3666h[pointerId];
            return;
        }
        if (actionMasked != 1) {
            com.bumptech.glide.c cVar = this.f3675q;
            if (actionMasked == 2) {
                if (this.f3659a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i6 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i6);
                        if (i(pointerId2)) {
                            float x6 = motionEvent.getX(i6);
                            float y6 = motionEvent.getY(i6);
                            float f6 = x6 - this.f3662d[pointerId2];
                            float f7 = y6 - this.f3663e[pointerId2];
                            Math.abs(f6);
                            Math.abs(f7);
                            int i8 = this.f3666h[pointerId2];
                            Math.abs(f7);
                            Math.abs(f6);
                            int i9 = this.f3666h[pointerId2];
                            Math.abs(f6);
                            Math.abs(f7);
                            int i10 = this.f3666h[pointerId2];
                            Math.abs(f7);
                            Math.abs(f6);
                            int i11 = this.f3666h[pointerId2];
                            if (this.f3659a != 1) {
                                View viewG2 = g((int) x6, (int) y6);
                                if (c(viewG2, f6, f7) && r(viewG2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i6++;
                    }
                } else {
                    if (!i(this.f3661c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f3661c);
                    float x7 = motionEvent.getX(iFindPointerIndex);
                    float y7 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f3664f;
                    int i12 = this.f3661c;
                    int i13 = (int) (x7 - fArr[i12]);
                    int i14 = (int) (y7 - this.f3665g[i12]);
                    int left = this.f3676r.getLeft() + i13;
                    int top = this.f3676r.getTop() + i14;
                    int left2 = this.f3676r.getLeft();
                    int top2 = this.f3676r.getTop();
                    if (i13 != 0) {
                        left = cVar.p(this.f3676r, left);
                        WeakHashMap weakHashMap = V.f1964a;
                        this.f3676r.offsetLeftAndRight(left - left2);
                    }
                    if (i14 != 0) {
                        top = cVar.q(this.f3676r, top);
                        WeakHashMap weakHashMap2 = V.f1964a;
                        this.f3676r.offsetTopAndBottom(top - top2);
                    }
                    if (i13 != 0 || i14 != 0) {
                        cVar.H(this.f3676r, left, top);
                    }
                }
                m(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x8 = motionEvent.getX(actionIndex);
                    float y8 = motionEvent.getY(actionIndex);
                    l(x8, y8, pointerId3);
                    if (this.f3659a == 0) {
                        r(g((int) x8, (int) y8), pointerId3);
                        int i15 = this.f3666h[pointerId3];
                        return;
                    }
                    int i16 = (int) x8;
                    int i17 = (int) y8;
                    View view = this.f3676r;
                    if (view != null && i16 >= view.getLeft() && i16 < view.getRight() && i17 >= view.getTop() && i17 < view.getBottom()) {
                        r(this.f3676r, pointerId3);
                        return;
                    }
                    return;
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f3659a == 1 && pointerId4 == this.f3661c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i6 >= pointerCount2) {
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i6);
                        if (pointerId5 != this.f3661c) {
                            View viewG3 = g((int) motionEvent.getX(i6), (int) motionEvent.getY(i6));
                            View view2 = this.f3676r;
                            if (viewG3 == view2 && r(view2, pointerId5)) {
                                if (this.f3661c == -1) {
                                    break;
                                }
                            }
                        }
                        i6++;
                    }
                    k();
                }
                d(pointerId4);
                return;
            }
            if (this.f3659a == 1) {
                this.f3677s = true;
                cVar.I(this.f3676r, 0.0f, 0.0f);
                this.f3677s = false;
                if (this.f3659a == 1) {
                    n(0);
                }
            }
        } else if (this.f3659a == 1) {
            k();
        }
        a();
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f3670l;
        float f6 = this.f3671m;
        velocityTracker.computeCurrentVelocity(1000, f6);
        float xVelocity = this.f3670l.getXVelocity(this.f3661c);
        float f7 = this.f3672n;
        float fAbs = Math.abs(xVelocity);
        float f8 = 0.0f;
        if (fAbs < f7) {
            xVelocity = 0.0f;
        } else if (fAbs > f6) {
            xVelocity = xVelocity > 0.0f ? f6 : -f6;
        }
        float yVelocity = this.f3670l.getYVelocity(this.f3661c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f7) {
            if (fAbs2 > f6) {
                if (yVelocity <= 0.0f) {
                    f6 = -f6;
                }
                f8 = f6;
            } else {
                f8 = yVelocity;
            }
        }
        this.f3677s = true;
        this.f3675q.I(this.f3676r, xVelocity, f8);
        this.f3677s = false;
        if (this.f3659a == 1) {
            n(0);
        }
    }

    public final void l(float f6, float f7, int i6) {
        float[] fArr = this.f3662d;
        if (fArr == null || fArr.length <= i6) {
            int i7 = i6 + 1;
            float[] fArr2 = new float[i7];
            float[] fArr3 = new float[i7];
            float[] fArr4 = new float[i7];
            float[] fArr5 = new float[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3663e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3664f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3665g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3666h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3667i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3668j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3662d = fArr2;
            this.f3663e = fArr3;
            this.f3664f = fArr4;
            this.f3665g = fArr5;
            this.f3666h = iArr;
            this.f3667i = iArr2;
            this.f3668j = iArr3;
        }
        float[] fArr9 = this.f3662d;
        this.f3664f[i6] = f6;
        fArr9[i6] = f6;
        float[] fArr10 = this.f3663e;
        this.f3665g[i6] = f7;
        fArr10[i6] = f7;
        int[] iArr7 = this.f3666h;
        int i8 = (int) f6;
        int i9 = (int) f7;
        ViewGroup viewGroup = this.f3678t;
        int left = viewGroup.getLeft();
        int i10 = this.f3673o;
        int i11 = i8 < left + i10 ? 1 : 0;
        if (i9 < viewGroup.getTop() + i10) {
            i11 |= 4;
        }
        if (i8 > viewGroup.getRight() - i10) {
            i11 |= 2;
        }
        if (i9 > viewGroup.getBottom() - i10) {
            i11 |= 8;
        }
        iArr7[i6] = i11;
        this.f3669k |= 1 << i6;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            int pointerId = motionEvent.getPointerId(i6);
            if (i(pointerId)) {
                float x5 = motionEvent.getX(i6);
                float y5 = motionEvent.getY(i6);
                this.f3664f[pointerId] = x5;
                this.f3665g[pointerId] = y5;
            }
        }
    }

    public final void n(int i6) {
        this.f3678t.removeCallbacks(this.f3679u);
        if (this.f3659a != i6) {
            this.f3659a = i6;
            this.f3675q.G(i6);
            if (this.f3659a == 0) {
                this.f3676r = null;
            }
        }
    }

    public final boolean o(int i6, int i7) {
        if (this.f3677s) {
            return h(i6, i7, (int) this.f3670l.getXVelocity(this.f3661c), (int) this.f3670l.getYVelocity(this.f3661c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i6, int i7) {
        this.f3676r = view;
        this.f3661c = -1;
        boolean zH = h(i6, i7, 0, 0);
        if (!zH && this.f3659a == 0 && this.f3676r != null) {
            this.f3676r = null;
        }
        return zH;
    }

    public final boolean r(View view, int i6) {
        if (view == this.f3676r && this.f3661c == i6) {
            return true;
        }
        if (view == null || !this.f3675q.Q(view, i6)) {
            return false;
        }
        this.f3661c = i6;
        b(view, i6);
        return true;
    }
}
