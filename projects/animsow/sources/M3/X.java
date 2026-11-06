package m3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11433c;

    public X(String str, int i6, List list) {
        this.f11431a = str;
        this.f11432b = i6;
        this.f11433c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (this.f11431a.equals(((X) c02).f11431a)) {
            X x5 = (X) c02;
            if (this.f11432b == x5.f11432b && this.f11433c.equals(x5.f11433c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11431a.hashCode() ^ 1000003) * 1000003) ^ this.f11432b) * 1000003) ^ this.f11433c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f11431a + ", importance=" + this.f11432b + ", frames=" + this.f11433c + "}";
    }
}
