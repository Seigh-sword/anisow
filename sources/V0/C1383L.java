package v0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: v0.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1383L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13040a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f13041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1397f0 f13042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f13045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p0 f13046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f13048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f13049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f13050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f13051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f13053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13055p;

    public C1383L(Context context) {
        p0 p0Var = new p0();
        p0Var.f13192d = -1;
        p0Var.f13194f = false;
        p0Var.f13195g = 0;
        p0Var.f13189a = 0;
        p0Var.f13190b = 0;
        p0Var.f13191c = Integer.MIN_VALUE;
        p0Var.f13193e = null;
        this.f13046g = p0Var;
        this.f13048i = new LinearInterpolator();
        this.f13049j = new DecelerateInterpolator();
        this.f13052m = false;
        this.f13054o = 0;
        this.f13055p = 0;
        this.f13051l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i6, int i7, int i8, int i9, int i10) {
        if (i10 == -1) {
            return i8 - i6;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return i9 - i7;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i11 = i8 - i6;
        if (i11 > 0) {
            return i11;
        }
        int i12 = i9 - i7;
        if (i12 < 0) {
            return i12;
        }
        return 0;
    }

    public int b(View view, int i6) {
        AbstractC1397f0 abstractC1397f0 = this.f13042c;
        if (abstractC1397f0 == null || !abstractC1397f0.d()) {
            return 0;
        }
        g0 g0Var = (g0) view.getLayoutParams();
        return a((view.getLeft() - ((g0) view.getLayoutParams()).f13126b.left) - ((ViewGroup.MarginLayoutParams) g0Var).leftMargin, view.getRight() + ((g0) view.getLayoutParams()).f13126b.right + ((ViewGroup.MarginLayoutParams) g0Var).rightMargin, abstractC1397f0.E(), abstractC1397f0.f13122n - abstractC1397f0.F(), i6);
    }

    public int c(View view, int i6) {
        AbstractC1397f0 abstractC1397f0 = this.f13042c;
        if (abstractC1397f0 == null || !abstractC1397f0.e()) {
            return 0;
        }
        g0 g0Var = (g0) view.getLayoutParams();
        return a((view.getTop() - ((g0) view.getLayoutParams()).f13126b.top) - ((ViewGroup.MarginLayoutParams) g0Var).topMargin, view.getBottom() + ((g0) view.getLayoutParams()).f13126b.bottom + ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin, abstractC1397f0.G(), abstractC1397f0.f13123o - abstractC1397f0.D(), i6);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i6) {
        float fAbs = Math.abs(i6);
        if (!this.f13052m) {
            this.f13053n = d(this.f13051l);
            this.f13052m = true;
        }
        return (int) Math.ceil(fAbs * this.f13053n);
    }

    public PointF f(int i6) {
        Object obj = this.f13042c;
        if (obj instanceof q0) {
            return ((q0) obj).a(i6);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + q0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1383L.g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r6, v0.r0 r7, v0.p0 r8) {
        /*
            r5 = this;
            android.graphics.PointF r7 = r5.f13050k
            r0 = 1
            r1 = 0
            r2 = -1
            r3 = 0
            if (r7 == 0) goto L15
            float r7 = r7.x
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto Lf
            goto L15
        Lf:
            if (r7 <= 0) goto L13
            r7 = r0
            goto L16
        L13:
            r7 = r2
            goto L16
        L15:
            r7 = r1
        L16:
            int r7 = r5.b(r6, r7)
            android.graphics.PointF r4 = r5.f13050k
            if (r4 == 0) goto L2a
            float r4 = r4.y
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L25
            goto L2a
        L25:
            if (r3 <= 0) goto L29
            r1 = r0
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r6 = r5.c(r6, r1)
            int r1 = r7 * r7
            int r2 = r6 * r6
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r5.e(r1)
            double r1 = (double) r1
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r3
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r7 = -r7
            int r6 = -r6
            android.view.animation.DecelerateInterpolator r2 = r5.f13049j
            r8.f13189a = r7
            r8.f13190b = r6
            r8.f13191c = r1
            r8.f13193e = r2
            r8.f13194f = r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1383L.h(android.view.View, v0.r0, v0.p0):void");
    }

    public final void i() {
        if (this.f13044e) {
            this.f13044e = false;
            this.f13055p = 0;
            this.f13054o = 0;
            this.f13050k = null;
            this.f13041b.f5692B0.f13214a = -1;
            this.f13045f = null;
            this.f13040a = -1;
            this.f13043d = false;
            AbstractC1397f0 abstractC1397f0 = this.f13042c;
            if (abstractC1397f0.f13113e == this) {
                abstractC1397f0.f13113e = null;
            }
            this.f13042c = null;
            this.f13041b = null;
        }
    }
}
