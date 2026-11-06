package N;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends B3.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final WindowInsetsController f1955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final S0.f f1956y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Window f1957z;

    public H0(WindowInsetsController windowInsetsController, S0.f fVar) {
        this.f1955x = windowInsetsController;
        this.f1956y = fVar;
    }

    @Override // B3.e
    public final void A(boolean z5) {
        Window window = this.f1957z;
        WindowInsetsController windowInsetsController = this.f1955x;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // B3.e
    public final void D() {
        ((P2.e) this.f1956y.f3073x).o();
        this.f1955x.show(0);
    }

    @Override // B3.e
    public final boolean w() {
        WindowInsetsController windowInsetsController = this.f1955x;
        windowInsetsController.setSystemBarsAppearance(0, 0);
        return (windowInsetsController.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // B3.e
    public final void z(boolean z5) {
        Window window = this.f1957z;
        WindowInsetsController windowInsetsController = this.f1955x;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }
}
