package N;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: N.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0100k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2013a;

    public C0100k(DisplayCutout displayCutout) {
        this.f2013a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0100k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2013a, ((C0100k) obj).f2013a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f2013a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2013a + "}";
    }
}
