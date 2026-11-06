package G1;

/* JADX INFO: loaded from: classes.dex */
public final class t extends F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f840a;

    public t(E e6) {
        this.f840a = e6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        E e6 = this.f840a;
        return e6 == null ? ((t) f6).f840a == null : e6.equals(((t) f6).f840a);
    }

    public final int hashCode() {
        E e6 = this.f840a;
        return (e6 == null ? 0 : e6.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f840a + "}";
    }
}
