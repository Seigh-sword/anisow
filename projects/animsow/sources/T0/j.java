package t0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import t.C1328k;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1328k f12713a = new C1328k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f12714b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static P2.e f12715c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? AbstractC1336h.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    public static P2.e b() {
        P2.e eVar = new P2.e();
        f12715c = eVar;
        f12713a.i(eVar);
        return f12715c;
    }

    public static void c(Context context, boolean z5) {
        C1337i c1337iA;
        int i6;
        if (z5 || f12715c == null) {
            synchronized (f12714b) {
                if (!z5) {
                    try {
                        if (f12715c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28 && i7 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i8 = 0;
                    boolean z6 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z7 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                c1337iA = C1337i.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            c1337iA = null;
                        }
                        if (c1337iA != null && c1337iA.f12711c == jA && (i6 = c1337iA.f12710b) != 2) {
                            i8 = i6;
                        } else if (z6) {
                            i8 = 1;
                        } else if (z7) {
                            i8 = 2;
                        }
                        if (z5 && z7 && i8 != 1) {
                            i8 = 2;
                        }
                        C1337i c1337i = new C1337i(1, (c1337iA == null || c1337iA.f12710b != 2 || i8 != 1 || length >= c1337iA.f12712d) ? i8 : 3, jA, length2);
                        if (c1337iA == null || !c1337iA.equals(c1337i)) {
                            try {
                                c1337i.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
