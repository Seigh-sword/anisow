package B0;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class f implements Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SQLiteProgram f75w;

    public f(SQLiteProgram sQLiteProgram) {
        this.f75w = sQLiteProgram;
    }

    public final void b(int i6, byte[] bArr) {
        this.f75w.bindBlob(i6, bArr);
    }

    public final void c(int i6, double d6) {
        this.f75w.bindDouble(i6, d6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f75w.close();
    }

    public final void g(int i6, long j6) {
        this.f75w.bindLong(i6, j6);
    }

    public final void h(int i6) {
        this.f75w.bindNull(i6);
    }

    public final void k(int i6, String str) {
        this.f75w.bindString(i6, str);
    }
}
