package m3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class I extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11342b;

    public I(String str, byte[] bArr) {
        this.f11341a = str;
        this.f11342b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f11341a.equals(((I) t0Var).f11341a)) {
            if (Arrays.equals(this.f11342b, (t0Var instanceof I ? (I) t0Var : (I) t0Var).f11342b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f11341a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11342b);
    }

    public final String toString() {
        return "File{filename=" + this.f11341a + ", contents=" + Arrays.toString(this.f11342b) + "}";
    }
}
