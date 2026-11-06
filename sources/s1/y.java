package s1;

import androidx.datastore.preferences.protobuf.C0290o;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import m1.C1010h;

/* JADX INFO: loaded from: classes.dex */
public final class y extends FilterInputStream {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12609A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1010h f12610B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile byte[] f12611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12613y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12614z;

    public y(InputStream inputStream, C1010h c1010h) {
        super(inputStream);
        this.f12614z = -1;
        this.f12610B = c1010h;
        this.f12611w = (byte[]) c1010h.c(65536, byte[].class);
    }

    public static void g() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f12611w == null || inputStream == null) {
            g();
            throw null;
        }
        return (this.f12612x - this.f12609A) + inputStream.available();
    }

    public final int b(InputStream inputStream, byte[] bArr) throws IOException {
        int i6 = this.f12614z;
        if (i6 != -1) {
            int i7 = this.f12609A - i6;
            int i8 = this.f12613y;
            if (i7 < i8) {
                if (i6 == 0 && i8 > bArr.length && this.f12612x == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i8) {
                        i8 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f12610B.c(i8, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f12611w = bArr2;
                    this.f12610B.g(bArr);
                    bArr = bArr2;
                } else if (i6 > 0) {
                    System.arraycopy(bArr, i6, bArr, 0, bArr.length - i6);
                }
                int i9 = this.f12609A - this.f12614z;
                this.f12609A = i9;
                this.f12614z = 0;
                this.f12612x = 0;
                int i10 = inputStream.read(bArr, i9, bArr.length - i9);
                int i11 = this.f12609A;
                if (i10 > 0) {
                    i11 += i10;
                }
                this.f12612x = i11;
                return i10;
            }
        }
        int i12 = inputStream.read(bArr);
        if (i12 > 0) {
            this.f12614z = -1;
            this.f12609A = 0;
            this.f12612x = i12;
        }
        return i12;
    }

    public final synchronized void c() {
        if (this.f12611w != null) {
            this.f12610B.g(this.f12611w);
            this.f12611w = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f12611w != null) {
            this.f12610B.g(this.f12611w);
            this.f12611w = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        this.f12613y = Math.max(this.f12613y, i6);
        this.f12614z = this.f12609A;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f12611w;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            g();
            throw null;
        }
        if (this.f12609A >= this.f12612x && b(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f12611w && (bArr = this.f12611w) == null) {
            g();
            throw null;
        }
        int i6 = this.f12612x;
        int i7 = this.f12609A;
        if (i6 - i7 <= 0) {
            return -1;
        }
        this.f12609A = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f12611w == null) {
            throw new IOException("Stream is closed");
        }
        int i6 = this.f12614z;
        if (-1 == i6) {
            throw new C0290o("Mark has been invalidated, pos: " + this.f12609A + " markLimit: " + this.f12613y);
        }
        this.f12609A = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0L;
        }
        byte[] bArr = this.f12611w;
        if (bArr == null) {
            g();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            g();
            throw null;
        }
        int i6 = this.f12612x;
        int i7 = this.f12609A;
        if (i6 - i7 >= j6) {
            this.f12609A = (int) (((long) i7) + j6);
            return j6;
        }
        long j7 = ((long) i6) - ((long) i7);
        this.f12609A = i6;
        if (this.f12614z == -1 || j6 > this.f12613y) {
            long jSkip = inputStream.skip(j6 - j7);
            if (jSkip > 0) {
                this.f12614z = -1;
            }
            return j7 + jSkip;
        }
        if (b(inputStream, bArr) == -1) {
            return j7;
        }
        int i8 = this.f12612x;
        int i9 = this.f12609A;
        if (i8 - i9 >= j6 - j7) {
            this.f12609A = (int) ((((long) i9) + j6) - j7);
            return j6;
        }
        long j8 = (j7 + ((long) i8)) - ((long) i9);
        this.f12609A = i8;
        return j8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        byte[] bArr2 = this.f12611w;
        if (bArr2 == null) {
            g();
            throw null;
        }
        if (i7 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            g();
            throw null;
        }
        int i10 = this.f12609A;
        int i11 = this.f12612x;
        if (i10 < i11) {
            int i12 = i11 - i10;
            if (i12 >= i7) {
                i12 = i7;
            }
            System.arraycopy(bArr2, i10, bArr, i6, i12);
            this.f12609A += i12;
            if (i12 == i7 || inputStream.available() == 0) {
                return i12;
            }
            i6 += i12;
            i8 = i7 - i12;
        } else {
            i8 = i7;
        }
        while (true) {
            if (this.f12614z == -1 && i8 >= bArr2.length) {
                i9 = inputStream.read(bArr, i6, i8);
                if (i9 == -1) {
                    return i8 != i7 ? i7 - i8 : -1;
                }
            } else {
                if (b(inputStream, bArr2) == -1) {
                    return i8 != i7 ? i7 - i8 : -1;
                }
                if (bArr2 != this.f12611w && (bArr2 = this.f12611w) == null) {
                    g();
                    throw null;
                }
                int i13 = this.f12612x;
                int i14 = this.f12609A;
                i9 = i13 - i14;
                if (i9 >= i8) {
                    i9 = i8;
                }
                System.arraycopy(bArr2, i14, bArr, i6, i9);
                this.f12609A += i9;
            }
            i8 -= i9;
            if (i8 == 0) {
                return i7;
            }
            if (inputStream.available() == 0) {
                return i7 - i8;
            }
            i6 += i9;
        }
    }
}
