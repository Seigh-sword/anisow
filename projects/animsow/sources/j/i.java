package J;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f1165b = new i(new k(h.a(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1166a;

    public i(k kVar) {
        this.f1166a = kVar;
    }

    public static i a(String str) {
        if (str == null || str.isEmpty()) {
            return f1165b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i6 = 0; i6 < length; i6++) {
            localeArr[i6] = g.a(strArrSplit[i6]);
        }
        return new i(new k(h.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (this.f1166a.equals(((i) obj).f1166a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1166a.hashCode();
    }

    public final String toString() {
        return this.f1166a.toString();
    }
}
