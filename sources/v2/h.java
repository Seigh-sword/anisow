package V2;

import java.io.Serializable;
import java.util.Arrays;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements e, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f3740w;

    public h(Object obj) {
        this.f3740w = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return C0.d(this.f3740w, ((h) obj).f3740w);
        }
        return false;
    }

    @Override // V2.e
    public final Object get() {
        return this.f3740w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3740w});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3740w);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
