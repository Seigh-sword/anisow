package N;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 extends B3.e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Window f1945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final S0.f f1946y;

    public D0(Window window, S0.f fVar) {
        this.f1945x = window;
        this.f1946y = fVar;
    }

    @Override // B3.e
    public final void D() {
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((8 & i6) != 0) {
                if (i6 == 1) {
                    E(4);
                    this.f1945x.clearFlags(1024);
                } else if (i6 == 2) {
                    E(2);
                } else if (i6 == 8) {
                    ((P2.e) this.f1946y.f3073x).o();
                }
            }
        }
    }

    public final void E(int i6) {
        View decorView = this.f1945x.getDecorView();
        decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
    }
}
