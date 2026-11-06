package l3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Logger f10049C = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public g f10050A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final byte[] f10051B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RandomAccessFile f10052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10054y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g f10055z;

    public j(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f10051B = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i6 = 0;
                for (int i7 = 0; i7 < 4; i7++) {
                    M(bArr2, i6, iArr[i7]);
                    i6 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f10052w = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iK = k(0, bArr);
        this.f10053x = iK;
        if (iK > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f10053x + ", Actual length: " + randomAccessFile2.length());
        }
        this.f10054y = k(4, bArr);
        int iK2 = k(8, bArr);
        int iK3 = k(12, bArr);
        this.f10055z = h(iK2);
        this.f10050A = h(iK3);
    }

    public static void M(byte[] bArr, int i6, int i7) {
        bArr[i6] = (byte) (i7 >> 24);
        bArr[i6 + 1] = (byte) (i7 >> 16);
        bArr[i6 + 2] = (byte) (i7 >> 8);
        bArr[i6 + 3] = (byte) i7;
    }

    public static int k(int i6, byte[] bArr) {
        return ((bArr[i6] & 255) << 24) + ((bArr[i6 + 1] & 255) << 16) + ((bArr[i6 + 2] & 255) << 8) + (bArr[i6 + 3] & 255);
    }

    public final int J() {
        if (this.f10054y == 0) {
            return 16;
        }
        g gVar = this.f10050A;
        int i6 = gVar.f10044a;
        int i7 = this.f10055z.f10044a;
        return i6 >= i7 ? (i6 - i7) + 4 + gVar.f10045b + 16 : (((i6 + 4) + gVar.f10045b) + this.f10053x) - i7;
    }

    public final int K(int i6) {
        int i7 = this.f10053x;
        return i6 < i7 ? i6 : (i6 + 16) - i7;
    }

    public final void L(int i6, int i7, int i8, int i9) throws IOException {
        int[] iArr = {i6, i7, i8, i9};
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f10051B;
            if (i10 >= 4) {
                RandomAccessFile randomAccessFile = this.f10052w;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                M(bArr, i11, iArr[i10]);
                i11 += 4;
                i10++;
            }
        }
    }

    public final void b(byte[] bArr) {
        boolean z5;
        int iK;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    synchronized (this) {
                        z5 = this.f10054y == 0;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        if (z5) {
            iK = 16;
        } else {
            g gVar = this.f10050A;
            iK = K(gVar.f10044a + 4 + gVar.f10045b);
        }
        g gVar2 = new g(iK, length);
        M(this.f10051B, 0, length);
        u(iK, 4, this.f10051B);
        u(iK + 4, length, bArr);
        L(this.f10053x, this.f10054y + 1, z5 ? iK : this.f10055z.f10044a, iK);
        this.f10050A = gVar2;
        this.f10054y++;
        if (z5) {
            this.f10055z = gVar2;
        }
    }

    public final void c(int i6) throws IOException {
        int i7 = i6 + 4;
        int iJ = this.f10053x - J();
        if (iJ >= i7) {
            return;
        }
        int i8 = this.f10053x;
        do {
            iJ += i8;
            i8 <<= 1;
        } while (iJ < i7);
        RandomAccessFile randomAccessFile = this.f10052w;
        randomAccessFile.setLength(i8);
        randomAccessFile.getChannel().force(true);
        g gVar = this.f10050A;
        int iK = K(gVar.f10044a + 4 + gVar.f10045b);
        if (iK < this.f10055z.f10044a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f10053x);
            long j6 = iK - 4;
            if (channel.transferTo(16L, j6, channel) != j6) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i9 = this.f10050A.f10044a;
        int i10 = this.f10055z.f10044a;
        if (i9 < i10) {
            int i11 = (this.f10053x + i9) - 16;
            L(i8, this.f10054y, i10, i11);
            this.f10050A = new g(i11, this.f10050A.f10045b);
        } else {
            L(i8, this.f10054y, i10, i9);
        }
        this.f10053x = i8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f10052w.close();
    }

    public final synchronized void g(i iVar) {
        int iK = this.f10055z.f10044a;
        for (int i6 = 0; i6 < this.f10054y; i6++) {
            g gVarH = h(iK);
            iVar.c(new h(this, gVarH), gVarH.f10045b);
            iK = K(gVarH.f10044a + 4 + gVarH.f10045b);
        }
    }

    public final g h(int i6) throws IOException {
        if (i6 == 0) {
            return g.f10043c;
        }
        RandomAccessFile randomAccessFile = this.f10052w;
        randomAccessFile.seek(i6);
        return new g(i6, randomAccessFile.readInt());
    }

    public final synchronized void l() {
        int i6;
        synchronized (this) {
            i6 = this.f10054y;
        }
        if (i6 == 0) {
            throw new NoSuchElementException();
        }
        if (i6 == 1) {
            synchronized (this) {
                L(4096, 0, 0, 0);
                this.f10054y = 0;
                g gVar = g.f10043c;
                this.f10055z = gVar;
                this.f10050A = gVar;
                if (this.f10053x > 4096) {
                    RandomAccessFile randomAccessFile = this.f10052w;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f10053x = 4096;
            }
        } else {
            g gVar2 = this.f10055z;
            int iK = K(gVar2.f10044a + 4 + gVar2.f10045b);
            n(iK, 0, 4, this.f10051B);
            int iK2 = k(0, this.f10051B);
            L(this.f10053x, this.f10054y - 1, iK, this.f10050A.f10044a);
            this.f10054y--;
            this.f10055z = new g(iK, iK2);
        }
    }

    public final void n(int i6, int i7, int i8, byte[] bArr) throws IOException {
        int iK = K(i6);
        int i9 = iK + i8;
        int i10 = this.f10053x;
        RandomAccessFile randomAccessFile = this.f10052w;
        if (i9 <= i10) {
            randomAccessFile.seek(iK);
        } else {
            int i11 = i10 - iK;
            randomAccessFile.seek(iK);
            randomAccessFile.readFully(bArr, i7, i11);
            randomAccessFile.seek(16L);
            i7 += i11;
            i8 -= i11;
        }
        randomAccessFile.readFully(bArr, i7, i8);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(j.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f10053x);
        sb.append(", size=");
        sb.append(this.f10054y);
        sb.append(", first=");
        sb.append(this.f10055z);
        sb.append(", last=");
        sb.append(this.f10050A);
        sb.append(", element lengths=[");
        try {
            g(new C1474r(this, sb));
        } catch (IOException e6) {
            f10049C.log(Level.WARNING, "read error", (Throwable) e6);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void u(int i6, int i7, byte[] bArr) throws IOException {
        int iK = K(i6);
        int i8 = iK + i7;
        int i9 = this.f10053x;
        RandomAccessFile randomAccessFile = this.f10052w;
        if (i8 <= i9) {
            randomAccessFile.seek(iK);
            randomAccessFile.write(bArr, 0, i7);
            return;
        }
        int i10 = i9 - iK;
        randomAccessFile.seek(iK);
        randomAccessFile.write(bArr, 0, i10);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i10, i7 - i10);
    }
}
