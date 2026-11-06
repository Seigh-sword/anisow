package N;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends E0 {
    @Override // B3.e
    public final void z(boolean z5) {
        if (!z5) {
            E(16);
            return;
        }
        Window window = this.f1945x;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
