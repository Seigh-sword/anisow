package V4;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class J implements Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public I f3798w;

    public abstract long b();

    public abstract t c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        W4.b.c(g());
    }

    public abstract f5.i g();
}
