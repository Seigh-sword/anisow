package f5;

import java.io.IOException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements E {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final E f8473w;

    public n(E e6) {
        AbstractC1305a.o(e6, "delegate");
        this.f8473w = e6;
    }

    @Override // f5.E
    public long G(C0710g c0710g, long j6) {
        AbstractC1305a.o(c0710g, "sink");
        return this.f8473w.G(c0710g, j6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8473w.close();
    }

    @Override // f5.E
    public final G d() {
        return this.f8473w.d();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f8473w + ')';
    }
}
