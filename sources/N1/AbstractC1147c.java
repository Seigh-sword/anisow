package n1;

import android.content.Context;
import com.google.android.gms.internal.measurement.C0396c2;
import h1.C0764d;
import java.io.File;

/* JADX INFO: renamed from: n1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1147c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11687a = 262144000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0396c2 f11688b;

    public AbstractC1147c(C0396c2 c0396c2) {
        this.f11688b = c0396c2;
    }

    public final C0764d a() {
        C0396c2 c0396c2 = this.f11688b;
        File cacheDir = ((Context) c0396c2.f6775x).getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else if (((String) c0396c2.f6776y) != null) {
            cacheDir = new File(cacheDir, (String) c0396c2.f6776y);
        }
        if (cacheDir == null) {
            return null;
        }
        if (!cacheDir.isDirectory() && !cacheDir.mkdirs()) {
            return null;
        }
        C0764d c0764d = new C0764d();
        c0764d.f8949A = new C0396c2(23);
        c0764d.f8953z = cacheDir;
        c0764d.f8950w = this.f11687a;
        c0764d.f8952y = new C0396c2(25);
        return c0764d;
    }
}
