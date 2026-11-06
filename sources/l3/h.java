package l3;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class h extends InputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f10048y;

    public h(j jVar, g gVar) {
        this.f10048y = jVar;
        this.f10046w = jVar.K(gVar.f10044a + 4);
        this.f10047x = gVar.f10045b;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f10047x == 0) {
            return -1;
        }
        j jVar = this.f10048y;
        jVar.f10052w.seek(this.f10046w);
        int i6 = jVar.f10052w.read();
        this.f10046w = jVar.K(this.f10046w + 1);
        this.f10047x--;
        return i6;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        if (bArr != null) {
            if ((i6 | i7) < 0 || i7 > bArr.length - i6) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i8 = this.f10047x;
            if (i8 <= 0) {
                return -1;
            }
            if (i7 > i8) {
                i7 = i8;
            }
            int i9 = this.f10046w;
            j jVar = this.f10048y;
            jVar.n(i9, i6, i7, bArr);
            this.f10046w = jVar.K(this.f10046w + i7);
            this.f10047x -= i7;
            return i7;
        }
        throw new NullPointerException("buffer");
    }
}
