package com.google.android.material.timepicker;

import N.C0083b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0083b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f7412d;

    public c(ClockFaceView clockFaceView) {
        this.f7412d = clockFaceView;
    }

    @Override // N.C0083b
    public final void d(View view, O.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1973a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f7412d.f7384V.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        iVar.b(O.d.f2289e);
    }

    @Override // N.C0083b
    public final boolean g(View view, int i6, Bundle bundle) {
        if (i6 != 16) {
            return super.g(view, i6, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f7412d;
        view.getHitRect(clockFaceView.f7381S);
        float fCenterX = clockFaceView.f7381S.centerX();
        float fCenterY = clockFaceView.f7381S.centerY();
        clockFaceView.f7380R.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f7380R.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
