package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import i.v;
import m.InterfaceC0997y0;

/* JADX INFO: loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InterfaceC0997y0 f5214w;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        InterfaceC0997y0 interfaceC0997y0 = this.f5214w;
        if (interfaceC0997y0 != null) {
            rect.top = ((v) interfaceC0997y0).f9344w.I(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC0997y0 interfaceC0997y0) {
        this.f5214w = interfaceC0997y0;
    }
}
