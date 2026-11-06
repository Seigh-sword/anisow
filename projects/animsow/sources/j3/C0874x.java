package j3;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: j3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0874x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9555b;

    public C0874x(String str, String str2) {
        this.f9554a = str;
        this.f9555b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0874x)) {
            return false;
        }
        C0874x c0874x = (C0874x) obj;
        return AbstractC1305a.c(this.f9554a, c0874x.f9554a) && AbstractC1305a.c(this.f9555b, c0874x.f9555b);
    }

    public final int hashCode() {
        String str = this.f9554a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9555b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f9554a + ", authToken=" + this.f9555b + ')';
    }
}
