package F;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f451b;

    public m(Resources resources, Resources.Theme theme) {
        this.f450a = resources;
        this.f451b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f450a.equals(mVar.f450a) && Objects.equals(this.f451b, mVar.f451b);
    }

    public final int hashCode() {
        return Objects.hash(this.f450a, this.f451b);
    }
}
