package y0;

import d.AbstractC0628i;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1494a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f13690e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f13691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f13692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f13694d;

    public C1494a(String str, File file, boolean z5) {
        Lock reentrantLock;
        File file2 = new File(file, AbstractC0628i.i(str, ".lck"));
        this.f13691a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap map = f13690e;
        synchronized (map) {
            try {
                reentrantLock = (Lock) map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13692b = reentrantLock;
        this.f13693c = z5;
    }

    public final void a() {
        FileChannel fileChannel = this.f13694d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f13692b.unlock();
    }
}
