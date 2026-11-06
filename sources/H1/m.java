package H1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E1.c f943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f944b;

    public m(E1.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f943a = cVar;
        this.f944b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f943a.equals(mVar.f943a)) {
            return Arrays.equals(this.f944b, mVar.f944b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f943a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f944b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f943a + ", bytes=[...]}";
    }
}
