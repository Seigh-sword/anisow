package com.onesignal;

import F0.C0029p;
import N.RunnableC0098i0;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f7520v = Color.parseColor("#00000000");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f7521w = Color.parseColor("#BB000000");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f7522x = AbstractC0565j1.b(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PopupWindow f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f7524b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f7532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7533k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0552f0 f7537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o2 f7538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WebView f7539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RelativeLayout f7540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0572m f7541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j2 f7542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Runnable f7543u;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f7525c = new Handler();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7534l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7535m = false;

    public F(C0568k1 c0568k1, C0552f0 c0552f0, boolean z5) {
        this.f7528f = AbstractC0565j1.b(24);
        this.f7529g = AbstractC0565j1.b(24);
        this.f7530h = AbstractC0565j1.b(24);
        this.f7531i = AbstractC0565j1.b(24);
        this.f7536n = false;
        this.f7539q = c0568k1;
        o2 o2Var = c0552f0.f7806e;
        this.f7538p = o2Var;
        this.f7527e = c0552f0.f7808g;
        this.f7526d = -1;
        Double d6 = c0552f0.f7807f;
        this.f7532j = d6 == null ? 0.0d : d6.doubleValue();
        int iOrdinal = o2Var.ordinal();
        this.f7533k = !(iOrdinal == 0 || iOrdinal == 1);
        this.f7536n = z5;
        this.f7537o = c0552f0;
        boolean z6 = c0552f0.f7803b;
        this.f7530h = z6 ? AbstractC0565j1.b(24) : 0;
        this.f7531i = z6 ? AbstractC0565j1.b(24) : 0;
        boolean z7 = c0552f0.f7804c;
        this.f7528f = z7 ? AbstractC0565j1.b(24) : 0;
        this.f7529g = z7 ? AbstractC0565j1.b(24) : 0;
    }

    public static void a(F f6) {
        f6.g();
        j2 j2Var = f6.f7542t;
        if (j2Var != null) {
            C0579o0 c0579o0Q = AbstractC0603w1.q();
            p2 p2Var = j2Var.f7856a;
            c0579o0Q.l0(p2Var.f7942e, false);
            if (C0554g.f7812x != null) {
                C0548e.f7785d.remove("com.onesignal.p2" + p2Var.f7942e.f7951a);
            }
        }
    }

    public static ValueAnimator b(RelativeLayout relativeLayout, int i6, int i7, C0029p c0029p) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400);
        valueAnimator.setIntValues(i6, i7);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new C0606x1(relativeLayout));
        if (c0029p != null) {
            valueAnimator.addListener(c0029p);
        }
        return valueAnimator;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.onesignal.C0569l c(int r6, com.onesignal.o2 r7, boolean r8) {
        /*
            r5 = this;
            com.onesignal.l r0 = new com.onesignal.l
            r0.<init>()
            int r1 = r5.f7529g
            r0.f7866d = r1
            int r1 = r5.f7530h
            r0.f7864b = r1
            r0.f7869g = r8
            r0.f7867e = r6
            android.app.Activity r8 = r5.f7524b
            com.onesignal.AbstractC0565j1.d(r8)
            int r8 = r7.ordinal()
            r1 = 1
            int r2 = com.onesignal.F.f7522x
            if (r8 == 0) goto L56
            if (r8 == r1) goto L47
            r3 = 2
            if (r8 == r3) goto L36
            r6 = 3
            if (r8 == r6) goto L28
            goto L5a
        L28:
            android.app.Activity r6 = r5.f7524b
            int r6 = com.onesignal.AbstractC0565j1.d(r6)
            int r8 = r5.f7531i
            int r4 = r5.f7530h
            int r8 = r8 + r4
            int r6 = r6 - r8
            r0.f7867e = r6
        L36:
            android.app.Activity r8 = r5.f7524b
            int r8 = com.onesignal.AbstractC0565j1.d(r8)
            int r8 = r8 / r3
            int r6 = r6 / r3
            int r8 = r8 - r6
            int r2 = r2 + r8
            r0.f7865c = r2
            r0.f7864b = r8
            r0.f7863a = r8
            goto L5a
        L47:
            android.app.Activity r8 = r5.f7524b
            int r8 = com.onesignal.AbstractC0565j1.d(r8)
            int r8 = r8 - r6
            r0.f7863a = r8
            int r6 = r5.f7531i
            int r6 = r6 + r2
        L53:
            r0.f7865c = r6
            goto L5a
        L56:
            int r6 = r5.f7530h
            int r6 = r6 - r2
            goto L53
        L5a:
            com.onesignal.o2 r6 = com.onesignal.o2.f7925w
            if (r7 != r6) goto L5f
            r1 = 0
        L5f:
            r0.f7868f = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.F.c(int, com.onesignal.o2, boolean):com.onesignal.l");
    }

    public final void d(Activity activity) {
        RelativeLayout.LayoutParams layoutParams;
        int i6;
        int i7 = 3;
        if (!AbstractC0565j1.e(activity) || this.f7540r != null) {
            new Handler().postDelayed(new RunnableC0570l0(this, i7, activity), 200L);
            return;
        }
        this.f7524b = activity;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f7527e);
        layoutParams2.addRule(13);
        boolean z5 = this.f7533k;
        o2 o2Var = this.f7538p;
        if (z5) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f7526d, -1);
            int iOrdinal = o2Var.ordinal();
            if (iOrdinal == 0) {
                i6 = 10;
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2 || iOrdinal == 3) {
                    layoutParams3.addRule(13);
                }
                layoutParams = layoutParams3;
            } else {
                i6 = 12;
            }
            layoutParams3.addRule(i6);
            layoutParams3.addRule(14);
            layoutParams = layoutParams3;
        } else {
            layoutParams = null;
        }
        OSUtils.u(new RunnableC0098i0(this, layoutParams2, layoutParams, c(this.f7527e, o2Var, this.f7536n), o2Var, 2));
    }

    public final void e(X1 x12) {
        C0572m c0572m = this.f7541s;
        if (c0572m != null) {
            c0572m.f7887y = true;
            c0572m.f7886x.q(c0572m, c0572m.getLeft(), c0572m.f7888z.f7871i);
            WeakHashMap weakHashMap = N.V.f1964a;
            c0572m.postInvalidateOnAnimation();
            f(x12);
            return;
        }
        AbstractC0603w1.b(EnumC0600v1.f7997y, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
        this.f7540r = null;
        this.f7541s = null;
        this.f7539q = null;
        if (x12 != null) {
            x12.b();
        }
    }

    public final void f(X1 x12) {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0570l0(this, 4, x12), 600);
    }

    public final void g() {
        AbstractC0603w1.b(EnumC0600v1.f7992B, "InAppMessageView removing views", null);
        Runnable runnable = this.f7543u;
        if (runnable != null) {
            this.f7525c.removeCallbacks(runnable);
            this.f7543u = null;
        }
        C0572m c0572m = this.f7541s;
        if (c0572m != null) {
            c0572m.removeAllViews();
        }
        PopupWindow popupWindow = this.f7523a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f7540r = null;
        this.f7541s = null;
        this.f7539q = null;
    }

    public final String toString() {
        return "InAppMessageView{currentActivity=" + this.f7524b + ", pageWidth=" + this.f7526d + ", pageHeight=" + this.f7527e + ", displayDuration=" + this.f7532j + ", hasBackground=" + this.f7533k + ", shouldDismissWhenActive=" + this.f7534l + ", isDragging=" + this.f7535m + ", disableDragDismiss=" + this.f7536n + ", displayLocation=" + this.f7538p + ", webView=" + this.f7539q + '}';
    }
}
