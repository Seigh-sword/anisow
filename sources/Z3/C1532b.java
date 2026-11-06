package z3;

import java.io.OutputStream;

/* JADX INFO: renamed from: z3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1532b extends OutputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f14110w;

    @Override // java.io.OutputStream
    public final void write(int i6) {
        this.f14110w++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f14110w += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i7) {
        int i8;
        if (i6 < 0 || i6 > bArr.length || i7 < 0 || (i8 = i6 + i7) > bArr.length || i8 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f14110w += (long) i7;
    }
}
