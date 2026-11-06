package f5;

import d2.AbstractC0651b;
import java.io.IOException;
import java.io.InputStream;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0708e extends InputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8456w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f8457x;

    public /* synthetic */ C0708e(i iVar, int i6) {
        this.f8456w = i6;
        this.f8457x = iVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i6 = this.f8456w;
        i iVar = this.f8457x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (int) Math.min(((C0710g) iVar).f8461x, Integer.MAX_VALUE);
            default:
                y yVar = (y) iVar;
                if (yVar.f8499y) {
                    throw new IOException("closed");
                }
                return (int) Math.min(yVar.f8498x.f8461x, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8456w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                ((y) this.f8457x).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i6 = this.f8456w;
        i iVar = this.f8457x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0710g c0710g = (C0710g) iVar;
                if (c0710g.f8461x > 0) {
                    return c0710g.readByte() & 255;
                }
                return -1;
            default:
                y yVar = (y) iVar;
                if (yVar.f8499y) {
                    throw new IOException("closed");
                }
                C0710g c0710g2 = yVar.f8498x;
                if (c0710g2.f8461x == 0 && yVar.f8497w.G(c0710g2, 8192L) == -1) {
                    return -1;
                }
                return c0710g2.readByte() & 255;
        }
    }

    public final String toString() {
        int i6 = this.f8456w;
        i iVar = this.f8457x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C0710g) iVar) + ".inputStream()";
            default:
                return ((y) iVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = this.f8456w;
        i iVar = this.f8457x;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(bArr, "sink");
                return ((C0710g) iVar).N(bArr, i6, i7);
            default:
                AbstractC1305a.o(bArr, "data");
                y yVar = (y) iVar;
                if (yVar.f8499y) {
                    throw new IOException("closed");
                }
                AbstractC0651b.g(bArr.length, i6, i7);
                C0710g c0710g = yVar.f8498x;
                if (c0710g.f8461x == 0 && yVar.f8497w.G(c0710g, 8192L) == -1) {
                    return -1;
                }
                return c0710g.N(bArr, i6, i7);
        }
    }
}
