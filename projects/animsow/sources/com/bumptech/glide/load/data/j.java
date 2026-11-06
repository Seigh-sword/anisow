package com.bumptech.glide.load.data;

import d.AbstractC0628i;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f6376y = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f6377z = 31;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte f6378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6379x;

    public j(InputStream inputStream, int i6) {
        super(inputStream);
        if (i6 < -1 || i6 > 8) {
            throw new IllegalArgumentException(AbstractC0628i.f("Cannot add invalid orientation: ", i6));
        }
        this.f6378w = (byte) i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i6;
        int i7 = this.f6379x;
        int i8 = (i7 < 2 || i7 > (i6 = f6377z)) ? super.read() : i7 == i6 ? this.f6378w : f6376y[i7 - 2] & 255;
        if (i8 != -1) {
            this.f6379x++;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long jSkip = super.skip(j6);
        if (jSkip > 0) {
            this.f6379x = (int) (((long) this.f6379x) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        int i8;
        int i9 = this.f6379x;
        int i10 = f6377z;
        if (i9 > i10) {
            i8 = super.read(bArr, i6, i7);
        } else if (i9 == i10) {
            bArr[i6] = this.f6378w;
            i8 = 1;
        } else if (i9 < 2) {
            i8 = super.read(bArr, i6, 2 - i9);
        } else {
            int iMin = Math.min(i10 - i9, i7);
            System.arraycopy(f6376y, this.f6379x - 2, bArr, i6, iMin);
            i8 = iMin;
        }
        if (i8 > 0) {
            this.f6379x += i8;
        }
        return i8;
    }
}
