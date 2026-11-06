package com.onesignal;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.onesignal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0572m extends RelativeLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f7883A = AbstractC0565j1.b(28);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f7884B = AbstractC0565j1.b(64);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C f7885w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public V.e f7886x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7887y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0569l f7888z;

    public final void a(C0569l c0569l) {
        int i6;
        this.f7888z = c0569l;
        c0569l.f7871i = ((Resources.getSystem().getDisplayMetrics().heightPixels - c0569l.f7867e) - c0569l.f7863a) + c0569l.f7867e + c0569l.f7863a + f7884B;
        int iB = AbstractC0565j1.b(3000);
        c0569l.f7870h = iB;
        if (c0569l.f7868f == 0) {
            int i7 = (-c0569l.f7867e) - f7883A;
            c0569l.f7871i = i7;
            c0569l.f7870h = -iB;
            i6 = i7 / 3;
        } else {
            i6 = (c0569l.f7864b * 2) + (c0569l.f7867e / 3);
        }
        c0569l.f7872j = i6;
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f7886x.f()) {
            WeakHashMap weakHashMap = N.V.f1964a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C c6;
        if (this.f7887y) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (c6 = this.f7885w) != null) {
            ((F) c6.f7497b).f7535m = false;
        }
        this.f7886x.j(motionEvent);
        return false;
    }
}
