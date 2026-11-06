package B3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f89b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f88a = str;
        this.f89b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f88a.equals(aVar.f88a) && this.f89b.equals(aVar.f89b);
    }

    public final int hashCode() {
        return ((this.f88a.hashCode() ^ 1000003) * 1000003) ^ this.f89b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f88a + ", usedDates=" + this.f89b + "}";
    }
}
