package N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: N.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0113y extends C0112x {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f2062x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WindowInsetsController f2063y;

    @Override // N.C0112x, P2.e
    public final void o() {
        View view = this.f2062x;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f2063y;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.o();
    }
}
