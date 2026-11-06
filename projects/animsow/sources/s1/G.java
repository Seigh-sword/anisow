package s1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class G extends MediaDataSource {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f12549w;

    public G(ByteBuffer byteBuffer) {
        this.f12549w = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f12549w.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j6, byte[] bArr, int i6, int i7) {
        ByteBuffer byteBuffer = this.f12549w;
        if (j6 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j6);
        int iMin = Math.min(i7, byteBuffer.remaining());
        byteBuffer.get(bArr, i6, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
