package B0;

import android.content.Context;
import java.io.File;
import m.E;

/* JADX INFO: loaded from: classes.dex */
public final class e implements A0.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f68A = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public d f69B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f70C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f71w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f72x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final E f73y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f74z;

    public e(Context context, String str, E e6, boolean z5) {
        this.f71w = context;
        this.f72x = str;
        this.f73y = e6;
        this.f74z = z5;
    }

    @Override // A0.d
    public final A0.a C() {
        return b().c();
    }

    public final d b() {
        d dVar;
        synchronized (this.f68A) {
            try {
                if (this.f69B == null) {
                    b[] bVarArr = new b[1];
                    if (this.f72x == null || !this.f74z) {
                        this.f69B = new d(this.f71w, this.f72x, bVarArr, this.f73y);
                    } else {
                        this.f69B = new d(this.f71w, new File(this.f71w.getNoBackupFilesDir(), this.f72x).getAbsolutePath(), bVarArr, this.f73y);
                    }
                    this.f69B.setWriteAheadLoggingEnabled(this.f70C);
                }
                dVar = this.f69B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }

    @Override // A0.d
    public final String getDatabaseName() {
        return this.f72x;
    }

    @Override // A0.d
    public final void setWriteAheadLoggingEnabled(boolean z5) {
        synchronized (this.f68A) {
            try {
                d dVar = this.f69B;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z5);
                }
                this.f70C = z5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
