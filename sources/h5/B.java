package h5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class B extends V4.J {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final V4.J f8986x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f5.y f8987y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public IOException f8988z;

    public B(V4.J j6) {
        this.f8986x = j6;
        this.f8987y = f2.h.d(new A(this, j6.g()));
    }

    @Override // V4.J
    public final long b() {
        return this.f8986x.b();
    }

    @Override // V4.J
    public final V4.t c() {
        return this.f8986x.c();
    }

    @Override // V4.J, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8986x.close();
    }

    @Override // V4.J
    public final f5.i g() {
        return this.f8987y;
    }
}
