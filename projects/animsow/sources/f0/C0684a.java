package f0;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684a extends MediaDataSource {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f8323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0689f f8324x;

    public C0684a(C0689f c0689f) {
        this.f8324x = c0689f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j7 = this.f8323w;
            C0689f c0689f = this.f8324x;
            if (j7 != j6) {
                if (j7 >= 0 && j6 >= j7 + ((long) c0689f.f8327w.available())) {
                    return -1;
                }
                c0689f.c(j6);
                this.f8323w = j6;
            }
            if (i7 > c0689f.f8327w.available()) {
                i7 = c0689f.f8327w.available();
            }
            int i8 = c0689f.read(bArr, i6, i7);
            if (i8 >= 0) {
                this.f8323w += (long) i8;
                return i8;
            }
        } catch (IOException unused) {
        }
        this.f8323w = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
