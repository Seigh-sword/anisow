package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f7411w;

    public b(ClockFaceView clockFaceView) {
        this.f7411w = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f7411w;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f7380R.f7407z) - clockFaceView.f7388c0;
        if (height != clockFaceView.f7415P) {
            clockFaceView.f7415P = height;
            clockFaceView.m();
            int i6 = clockFaceView.f7415P;
            ClockHandView clockHandView = clockFaceView.f7380R;
            clockHandView.f7402H = i6;
            clockHandView.invalidate();
        }
        return true;
    }
}
