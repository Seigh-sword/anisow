package s1;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f12601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f12602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final File f12603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile x f12604h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12607c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12608d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12605a = 20000;

    static {
        int i6 = Build.VERSION.SDK_INT;
        f12601e = i6 < 29;
        f12602f = i6 >= 28;
        f12603g = new File("/proc/self/fd");
    }

    public static x a() {
        if (f12604h == null) {
            synchronized (x.class) {
                try {
                    if (f12604h == null) {
                        f12604h = new x();
                    }
                } finally {
                }
            }
        }
        return f12604h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f12605a;
    }

    public final boolean c(int i6, int i7, boolean z5, boolean z6) {
        boolean z7;
        if (!z5) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f12602f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f12601e && !this.f12608d.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z6) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i6 < 0 || i7 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        synchronized (this) {
            try {
                int i8 = this.f12606b + 1;
                this.f12606b = i8;
                if (i8 >= 50) {
                    this.f12606b = 0;
                    int length = f12603g.list().length;
                    long jB = b();
                    boolean z8 = ((long) length) < jB;
                    this.f12607c = z8;
                    if (!z8 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jB);
                    }
                }
                z7 = this.f12607c;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
