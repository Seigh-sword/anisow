package U1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f3607e;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f3607e = bArr;
    }

    @Override // U1.n
    public final byte[] s() {
        return this.f3607e;
    }
}
