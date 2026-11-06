package j1;

import X1.C0245m;
import android.text.TextUtils;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0245m f9437e = new C0245m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f9439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f9441d;

    public l(String str, Object obj, k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f9440c = str;
        this.f9438a = obj;
        this.f9439b = kVar;
    }

    public static l a(Object obj, String str) {
        return new l(str, obj, f9437e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f9440c.equals(((l) obj).f9440c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9440c.hashCode();
    }

    public final String toString() {
        return AbstractC0628i.m(new StringBuilder("Option{key='"), this.f9440c, "'}");
    }
}
