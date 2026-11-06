package N;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B3.e f1958a;

    public I0(Window window, View view) {
        B3.e f02;
        S0.f fVar = new S0.f(view);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            H0 h02 = new H0(window.getInsetsController(), fVar);
            h02.f1957z = window;
            f02 = h02;
        } else {
            f02 = i6 >= 26 ? new F0(window, fVar) : new E0(window, fVar);
        }
        this.f1958a = f02;
    }

    public I0(WindowInsetsController windowInsetsController) {
        this.f1958a = new H0(windowInsetsController, new S0.f(windowInsetsController));
    }
}
