package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import m1.C1010h;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final OutputStream f6369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f6370x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1010h f6371y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6372z;

    public c(FileOutputStream fileOutputStream, C1010h c1010h) {
        this.f6369w = fileOutputStream;
        this.f6371y = c1010h;
        this.f6370x = (byte[]) c1010h.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f6369w;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f6370x;
            if (bArr != null) {
                this.f6371y.g(bArr);
                this.f6370x = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i6 = this.f6372z;
        OutputStream outputStream = this.f6369w;
        if (i6 > 0) {
            outputStream.write(this.f6370x, 0, i6);
            this.f6372z = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i6) throws IOException {
        byte[] bArr = this.f6370x;
        int i7 = this.f6372z;
        int i8 = i7 + 1;
        this.f6372z = i8;
        bArr[i7] = (byte) i6;
        if (i8 != bArr.length || i8 <= 0) {
            return;
        }
        this.f6369w.write(bArr, 0, i8);
        this.f6372z = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = 0;
        do {
            int i9 = i7 - i8;
            int i10 = i6 + i8;
            int i11 = this.f6372z;
            OutputStream outputStream = this.f6369w;
            if (i11 == 0 && i9 >= this.f6370x.length) {
                outputStream.write(bArr, i10, i9);
                return;
            }
            int iMin = Math.min(i9, this.f6370x.length - i11);
            System.arraycopy(bArr, i10, this.f6370x, this.f6372z, iMin);
            int i12 = this.f6372z + iMin;
            this.f6372z = i12;
            i8 += iMin;
            byte[] bArr2 = this.f6370x;
            if (i12 == bArr2.length && i12 > 0) {
                outputStream.write(bArr2, 0, i12);
                this.f6372z = 0;
            }
        } while (i8 < i7);
    }
}
