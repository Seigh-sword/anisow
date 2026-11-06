package l;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class x implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f9821w;

    public x(y yVar) {
        this.f9821w = yVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9821w.c();
    }
}
