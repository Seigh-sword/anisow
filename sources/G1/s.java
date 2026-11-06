package G1;

/* JADX INFO: loaded from: classes.dex */
public final class s extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f839a;

    public s(Integer num) {
        this.f839a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e6 = (E) obj;
        Integer num = this.f839a;
        return num == null ? ((s) e6).f839a == null : num.equals(((s) e6).f839a);
    }

    public final int hashCode() {
        Integer num = this.f839a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f839a + "}";
    }
}
