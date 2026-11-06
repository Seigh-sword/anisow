package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements View.OnTouchListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f7424w;

    public k(GestureDetector gestureDetector) {
        this.f7424w = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f7424w.onTouchEvent(motionEvent);
        }
        return false;
    }
}
