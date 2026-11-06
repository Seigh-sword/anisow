package O3;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2341a;

    public e(String str) {
        AbstractC1305a.o(str, "sessionId");
        this.f2341a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC1305a.c(this.f2341a, ((e) obj).f2341a);
    }

    public final int hashCode() {
        return this.f2341a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f2341a + ')';
    }
}
