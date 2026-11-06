package G1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f838b;

    public r(byte[] bArr, byte[] bArr2) {
        this.f837a = bArr;
        this.f838b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d6 = (D) obj;
        boolean z5 = d6 instanceof r;
        if (Arrays.equals(this.f837a, z5 ? ((r) d6).f837a : ((r) d6).f837a)) {
            if (Arrays.equals(this.f838b, z5 ? ((r) d6).f838b : ((r) d6).f838b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f837a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f838b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f837a) + ", encryptedBlob=" + Arrays.toString(this.f838b) + "}";
    }
}
