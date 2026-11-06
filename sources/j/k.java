package J;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f1167a;

    public k(Object obj) {
        this.f1167a = (LocaleList) obj;
    }

    public final boolean equals(Object obj) {
        return this.f1167a.equals(((k) ((j) obj)).f1167a);
    }

    public final int hashCode() {
        return this.f1167a.hashCode();
    }

    public final String toString() {
        return this.f1167a.toString();
    }
}
