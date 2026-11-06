package I0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l.class == obj.getClass();
    }

    public final int hashCode() {
        return l.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
