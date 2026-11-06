package androidx.appcompat.widget;

import N.C0090e0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import i.C0820u;
import i.H;
import l.o;
import m.C0965i;
import m.C0977o;
import m.InterfaceC0978o0;
import m.InterfaceC0980p0;
import m.i1;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TypedValue f5205A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TypedValue f5206B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f5207C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC0978o0 f5208D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TypedValue f5209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TypedValue f5210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TypedValue f5211y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TypedValue f5212z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5207C = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f5205A == null) {
            this.f5205A = new TypedValue();
        }
        return this.f5205A;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f5206B == null) {
            this.f5206B = new TypedValue();
        }
        return this.f5206B;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f5211y == null) {
            this.f5211y = new TypedValue();
        }
        return this.f5211y;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f5212z == null) {
            this.f5212z = new TypedValue();
        }
        return this.f5212z;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f5209w == null) {
            this.f5209w = new TypedValue();
        }
        return this.f5209w;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f5210x == null) {
            this.f5210x = new TypedValue();
        }
        return this.f5210x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0978o0 interfaceC0978o0 = this.f5208D;
        if (interfaceC0978o0 != null) {
            interfaceC0978o0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0977o c0977o;
        super.onDetachedFromWindow();
        InterfaceC0978o0 interfaceC0978o0 = this.f5208D;
        if (interfaceC0978o0 != null) {
            H h4 = ((C0820u) interfaceC0978o0).f9343w;
            InterfaceC0980p0 interfaceC0980p0 = h4.f9178N;
            if (interfaceC0980p0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0980p0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.f5161A).f10283a.f5257w;
                if (actionMenuView != null && (c0977o = actionMenuView.f5193P) != null) {
                    c0977o.f();
                    C0965i c0965i = c0977o.f10354Q;
                    if (c0965i != null && c0965i.b()) {
                        c0965i.f9831j.dismiss();
                    }
                }
            }
            if (h4.f9183S != null) {
                h4.f9172H.getDecorView().removeCallbacks(h4.f9184T);
                if (h4.f9183S.isShowing()) {
                    try {
                        h4.f9183S.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                h4.f9183S = null;
            }
            C0090e0 c0090e0 = h4.f9185U;
            if (c0090e0 != null) {
                c0090e0.b();
            }
            o oVar = h4.y(0).f9155h;
            if (oVar != null) {
                oVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0978o0 interfaceC0978o0) {
        this.f5208D = interfaceC0978o0;
    }
}
