package G3;

import b3.C0343c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f875c;

    public b(String str, long j6, f fVar) {
        this.f873a = str;
        this.f874b = j6;
        this.f875c = fVar;
    }

    public static C0343c a() {
        C0343c c0343c = new C0343c(8);
        c0343c.f5931x = 0L;
        return c0343c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f873a;
        if (str != null ? str.equals(bVar.f873a) : bVar.f873a == null) {
            if (this.f874b == bVar.f874b) {
                f fVar = bVar.f875c;
                f fVar2 = this.f875c;
                if (fVar2 == null) {
                    if (fVar == null) {
                        return true;
                    }
                } else if (fVar2.equals(fVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f873a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j6 = this.f874b;
        int i6 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
        f fVar = this.f875c;
        return (fVar != null ? fVar.hashCode() : 0) ^ i6;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f873a + ", tokenExpirationTimestamp=" + this.f874b + ", responseCode=" + this.f875c + "}";
    }
}
