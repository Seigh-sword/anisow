package N;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class w0 extends v0 {
    public w0(C0 c02, WindowInsets windowInsets) {
        super(c02, windowInsets);
    }

    @Override // N.A0
    public C0 a() {
        return C0.g(null, this.f2052c.consumeDisplayCutout());
    }

    @Override // N.A0
    public C0100k e() {
        DisplayCutout displayCutout = this.f2052c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0100k(displayCutout);
    }

    @Override // N.u0, N.A0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Objects.equals(this.f2052c, w0Var.f2052c) && Objects.equals(this.f2056g, w0Var.f2056g);
    }

    @Override // N.A0
    public int hashCode() {
        return this.f2052c.hashCode();
    }
}
