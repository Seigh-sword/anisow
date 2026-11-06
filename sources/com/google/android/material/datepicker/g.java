package com.google.android.material.datepicker;

import N.C0083b;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
public final class g extends C0083b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7186e;

    public /* synthetic */ g(int i6, Object obj) {
        this.f7185d = i6;
        this.f7186e = obj;
    }

    @Override // N.C0083b
    public final void d(View view, O.i iVar) {
        int i6 = this.f7185d;
        View.AccessibilityDelegate accessibilityDelegate = this.f1973a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setScrollable(false);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                k kVar = (k) this.f7186e;
                iVar.i(kVar.p(kVar.E0.getVisibility() == 0 ? R.string.mtrl_picker_toggle_to_year_selection : R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
        }
    }
}
