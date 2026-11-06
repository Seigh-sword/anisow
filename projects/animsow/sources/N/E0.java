package N;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class E0 extends D0 {
    @Override // B3.e
    public final void A(boolean z5) {
        if (!z5) {
            E(8192);
            return;
        }
        Window window = this.f1945x;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    @Override // B3.e
    public final boolean w() {
        return (this.f1945x.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
