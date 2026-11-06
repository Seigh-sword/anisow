package v0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: v0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1374C extends AbstractC1393d0 implements i0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f12949C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f12950D = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12951A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RunnableC1415y f12952B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f12955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f12956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f12959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f12960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f12965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f12968p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f12971s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f12978z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12969q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12970r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12972t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12973u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12974v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12975w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f12976x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f12977y = new int[2];

    public C1374C(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i6, int i7, int i8) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12978z = valueAnimatorOfFloat;
        this.f12951A = 0;
        RunnableC1415y runnableC1415y = new RunnableC1415y(0, this);
        this.f12952B = runnableC1415y;
        C1416z c1416z = new C1416z(this);
        this.f12955c = stateListDrawable;
        this.f12956d = drawable;
        this.f12959g = stateListDrawable2;
        this.f12960h = drawable2;
        this.f12957e = Math.max(i6, stateListDrawable.getIntrinsicWidth());
        this.f12958f = Math.max(i6, drawable.getIntrinsicWidth());
        this.f12961i = Math.max(i6, stateListDrawable2.getIntrinsicWidth());
        this.f12962j = Math.max(i6, drawable2.getIntrinsicWidth());
        this.f12953a = i7;
        this.f12954b = i8;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C1372A(this));
        valueAnimatorOfFloat.addUpdateListener(new C1373B(this));
        RecyclerView recyclerView2 = this.f12971s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC1397f0 abstractC1397f0 = recyclerView2.f5704I;
            if (abstractC1397f0 != null) {
                abstractC1397f0.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f5708K;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f12971s;
            recyclerView3.f5710L.remove(this);
            if (recyclerView3.f5712M == this) {
                recyclerView3.f5712M = null;
            }
            ArrayList arrayList2 = this.f12971s.f5696D0;
            if (arrayList2 != null) {
                arrayList2.remove(c1416z);
            }
            this.f12971s.removeCallbacks(runnableC1415y);
        }
        this.f12971s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f12971s.f5710L.add(this);
            this.f12971s.h(c1416z);
        }
    }

    public static int e(float f6, float f7, int[] iArr, int i6, int i7, int i8) {
        int i9 = iArr[1] - iArr[0];
        if (i9 == 0) {
            return 0;
        }
        int i10 = i6 - i8;
        int i11 = (int) (((f7 - f6) / i9) * i10);
        int i12 = i7 + i11;
        if (i12 >= i10 || i12 < 0) {
            return 0;
        }
        return i11;
    }

    @Override // v0.AbstractC1393d0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i6;
        if (this.f12969q != this.f12971s.getWidth() || this.f12970r != this.f12971s.getHeight()) {
            this.f12969q = this.f12971s.getWidth();
            this.f12970r = this.f12971s.getHeight();
            f(0);
            return;
        }
        if (this.f12951A != 0) {
            if (this.f12972t) {
                int i7 = this.f12969q;
                int i8 = this.f12957e;
                int i9 = i7 - i8;
                int i10 = this.f12964l;
                int i11 = this.f12963k;
                int i12 = i10 - (i11 / 2);
                StateListDrawable stateListDrawable = this.f12955c;
                stateListDrawable.setBounds(0, 0, i8, i11);
                int i13 = this.f12970r;
                int i14 = this.f12958f;
                Drawable drawable = this.f12956d;
                drawable.setBounds(0, 0, i14, i13);
                RecyclerView recyclerView2 = this.f12971s;
                WeakHashMap weakHashMap = N.V.f1964a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i8, i12);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    i6 = -i8;
                } else {
                    canvas.translate(i9, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i12);
                    stateListDrawable.draw(canvas);
                    i6 = -i9;
                }
                canvas.translate(i6, -i12);
            }
            if (this.f12973u) {
                int i15 = this.f12970r;
                int i16 = this.f12961i;
                int i17 = i15 - i16;
                int i18 = this.f12967o;
                int i19 = this.f12966n;
                int i20 = i18 - (i19 / 2);
                StateListDrawable stateListDrawable2 = this.f12959g;
                stateListDrawable2.setBounds(0, 0, i19, i16);
                int i21 = this.f12969q;
                int i22 = this.f12962j;
                Drawable drawable2 = this.f12960h;
                drawable2.setBounds(0, 0, i21, i22);
                canvas.translate(0.0f, i17);
                drawable2.draw(canvas);
                canvas.translate(i20, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i20, -i17);
            }
        }
    }

    public final boolean c(float f6, float f7) {
        if (f7 >= this.f12970r - this.f12961i) {
            int i6 = this.f12967o;
            int i7 = this.f12966n;
            if (f6 >= i6 - (i7 / 2) && f6 <= (i7 / 2) + i6) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f6, float f7) {
        RecyclerView recyclerView = this.f12971s;
        WeakHashMap weakHashMap = N.V.f1964a;
        boolean z5 = recyclerView.getLayoutDirection() == 1;
        int i6 = this.f12957e;
        if (z5) {
            if (f6 > i6) {
                return false;
            }
        } else if (f6 < this.f12969q - i6) {
            return false;
        }
        int i7 = this.f12964l;
        int i8 = this.f12963k / 2;
        return f7 >= ((float) (i7 - i8)) && f7 <= ((float) (i8 + i7));
    }

    public final void f(int i6) {
        RecyclerView recyclerView;
        int i7;
        RunnableC1415y runnableC1415y = this.f12952B;
        StateListDrawable stateListDrawable = this.f12955c;
        if (i6 == 2 && this.f12974v != 2) {
            stateListDrawable.setState(f12949C);
            this.f12971s.removeCallbacks(runnableC1415y);
        }
        if (i6 == 0) {
            this.f12971s.invalidate();
        } else {
            g();
        }
        if (this.f12974v != 2 || i6 == 2) {
            if (i6 == 1) {
                this.f12971s.removeCallbacks(runnableC1415y);
                recyclerView = this.f12971s;
                i7 = 1500;
            }
            this.f12974v = i6;
        }
        stateListDrawable.setState(f12950D);
        this.f12971s.removeCallbacks(runnableC1415y);
        recyclerView = this.f12971s;
        i7 = 1200;
        recyclerView.postDelayed(runnableC1415y, i7);
        this.f12974v = i6;
    }

    public final void g() {
        int i6 = this.f12951A;
        ValueAnimator valueAnimator = this.f12978z;
        if (i6 != 0) {
            if (i6 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f12951A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
