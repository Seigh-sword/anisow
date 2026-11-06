package N3;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: N3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0130p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2260a;

    public C0130p(String str) {
        this.f2260a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0130p) && AbstractC1305a.c(this.f2260a, ((C0130p) obj).f2260a);
    }

    public final int hashCode() {
        String str = this.f2260a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f2260a + ')';
    }
}
