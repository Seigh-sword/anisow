package f5;

import java.nio.ByteBuffer;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC0711h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C f8494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0710g f8495x = new C0710g();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8496y;

    public x(C c6) {
        this.f8494w = c6;
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h B(long j6) {
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.Y(j6);
        b();
        return this;
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h F(int i6) {
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.X(i6);
        b();
        return this;
    }

    public final InterfaceC0711h b() {
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        C0710g c0710g = this.f8495x;
        long jL = c0710g.l();
        if (jL > 0) {
            this.f8494w.q(c0710g, jL);
        }
        return this;
    }

    public final C0709f c() {
        return new C0709f(this, 1);
    }

    @Override // f5.C, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C c6 = this.f8494w;
        if (this.f8496y) {
            return;
        }
        try {
            C0710g c0710g = this.f8495x;
            long j6 = c0710g.f8461x;
            if (j6 > 0) {
                c6.q(c0710g, j6);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            c6.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f8496y = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // f5.C
    public final G d() {
        return this.f8494w.d();
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h e(byte[] bArr) {
        AbstractC1305a.o(bArr, "source");
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        C0710g c0710g = this.f8495x;
        c0710g.getClass();
        c0710g.V(bArr, 0, bArr.length);
        b();
        return this;
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h f(byte[] bArr, int i6, int i7) {
        AbstractC1305a.o(bArr, "source");
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.V(bArr, i6, i7);
        b();
        return this;
    }

    @Override // f5.InterfaceC0711h, f5.C, java.io.Flushable
    public final void flush() {
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        C0710g c0710g = this.f8495x;
        long j6 = c0710g.f8461x;
        C c6 = this.f8494w;
        if (j6 > 0) {
            c6.q(c0710g, j6);
        }
        c6.flush();
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h i(long j6) {
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.Z(j6);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f8496y;
    }

    @Override // f5.InterfaceC0711h
    public final C0710g j() {
        return this.f8495x;
    }

    @Override // f5.C
    public final void q(C0710g c0710g, long j6) {
        AbstractC1305a.o(c0710g, "source");
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.q(c0710g, j6);
        b();
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h r(int i6) {
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.b0(i6);
        b();
        return this;
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h t(j jVar) {
        AbstractC1305a.o(jVar, "byteString");
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.U(jVar);
        b();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f8494w + ')';
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h w(int i6) {
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.a0(i6);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1305a.o(byteBuffer, "source");
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f8495x.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h z(String str) {
        AbstractC1305a.o(str, "string");
        if (!(!this.f8496y)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f8495x.c0(str);
        b();
        return this;
    }
}
