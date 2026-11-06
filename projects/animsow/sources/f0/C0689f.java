package f0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: f0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0689f extends C0685b {
    public C0689f(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f8327w.mark(Integer.MAX_VALUE);
    }

    public final void c(long j6) throws IOException {
        int i6 = this.f8329y;
        if (i6 > j6) {
            this.f8329y = 0;
            this.f8327w.reset();
        } else {
            j6 -= (long) i6;
        }
        b((int) j6);
    }

    public C0689f(byte[] bArr) {
        super(bArr);
        this.f8327w.mark(Integer.MAX_VALUE);
    }
}
