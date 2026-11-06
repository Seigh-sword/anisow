package V4;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class I extends Reader {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f5.i f3794w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Charset f3795x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3796y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InputStreamReader f3797z;

    public I(f5.i iVar, Charset charset) {
        this.f3794w = iVar;
        this.f3795x = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3796y = true;
        InputStreamReader inputStreamReader = this.f3797z;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f3794w.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i6, int i7) throws IOException {
        Charset charset;
        if (this.f3796y) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f3797z;
        if (inputStreamReader == null) {
            f5.v vVar = W4.b.f4488e;
            f5.i iVar = this.f3794w;
            int iV = iVar.v(vVar);
            if (iV == -1) {
                charset = this.f3795x;
            } else if (iV == 0) {
                charset = StandardCharsets.UTF_8;
            } else if (iV == 1) {
                charset = StandardCharsets.UTF_16BE;
            } else if (iV == 2) {
                charset = StandardCharsets.UTF_16LE;
            } else if (iV == 3) {
                charset = W4.b.f4489f;
            } else {
                if (iV != 4) {
                    throw new AssertionError();
                }
                charset = W4.b.f4490g;
            }
            InputStreamReader inputStreamReader2 = new InputStreamReader(iVar.I(), charset);
            this.f3797z = inputStreamReader2;
            inputStreamReader = inputStreamReader2;
        }
        return inputStreamReader.read(cArr, i6, i7);
    }
}
