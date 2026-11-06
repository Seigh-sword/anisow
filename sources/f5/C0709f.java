package f5;

import java.io.IOException;
import java.io.OutputStream;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0709f extends OutputStream {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0711h f8459x;

    public /* synthetic */ C0709f(InterfaceC0711h interfaceC0711h, int i6) {
        this.f8458w = i6;
        this.f8459x = interfaceC0711h;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8458w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                ((x) this.f8459x).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f8458w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                x xVar = (x) this.f8459x;
                if (!xVar.f8496y) {
                    xVar.flush();
                }
                break;
        }
    }

    public final String toString() {
        int i6 = this.f8458w;
        InterfaceC0711h interfaceC0711h = this.f8459x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C0710g) interfaceC0711h) + ".outputStream()";
            default:
                return ((x) interfaceC0711h) + ".outputStream()";
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i6) throws IOException {
        int i7 = this.f8458w;
        InterfaceC0711h interfaceC0711h = this.f8459x;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0710g) interfaceC0711h).X(i6);
                return;
            default:
                x xVar = (x) interfaceC0711h;
                if (xVar.f8496y) {
                    throw new IOException("closed");
                }
                xVar.f8495x.X((byte) i6);
                xVar.b();
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i7) throws IOException {
        int i8 = this.f8458w;
        InterfaceC0711h interfaceC0711h = this.f8459x;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1305a.o(bArr, "data");
                ((C0710g) interfaceC0711h).V(bArr, i6, i7);
                return;
            default:
                AbstractC1305a.o(bArr, "data");
                x xVar = (x) interfaceC0711h;
                if (xVar.f8496y) {
                    throw new IOException("closed");
                }
                xVar.f8495x.V(bArr, i6, i7);
                xVar.b();
                return;
        }
    }
}
