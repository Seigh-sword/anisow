package a5;

import d.AbstractC0628i;
import f5.C0710g;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5043z;

    @Override // a5.a, f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6));
        }
        if (this.f5029x) {
            throw new IllegalStateException("closed");
        }
        if (this.f5043z) {
            return -1L;
        }
        long jG = super.G(c0710g, j6);
        if (jG != -1) {
            return jG;
        }
        this.f5043z = true;
        b();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5029x) {
            return;
        }
        if (!this.f5043z) {
            b();
        }
        this.f5029x = true;
    }
}
