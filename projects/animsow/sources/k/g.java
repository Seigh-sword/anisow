package K;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.C0986t;
import s.C1284f;
import s.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1284f f1483a = new C1284f(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f1486d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1484b = threadPoolExecutor;
        f1485c = new Object();
        f1486d = new k();
    }

    public static f a(String str, Context context, C0986t c0986t, int i6) throws Throwable {
        C1284f c1284f = f1483a;
        Typeface typeface = (Typeface) c1284f.b(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            T1.j jVarA = c.a(context, c0986t);
            int i7 = jVarA.f3424w;
            int i8 = 1;
            if (i7 != 0) {
                i8 = i7 != 1 ? -3 : -2;
            } else {
                h[] hVarArr = (h[]) jVarA.f3425x;
                if (hVarArr != null && hVarArr.length != 0) {
                    int length = hVarArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            i8 = 0;
                            break;
                        }
                        int i10 = hVarArr[i9].f1491e;
                        if (i10 == 0) {
                            i9++;
                        } else if (i10 >= 0) {
                            i8 = i10;
                        }
                    }
                }
            }
            if (i8 != 0) {
                return new f(i8);
            }
            Typeface typefaceV = G.g.f648a.v(context, (h[]) jVarA.f3425x, i6);
            if (typefaceV == null) {
                return new f(-3);
            }
            c1284f.c(str, typefaceV);
            return new f(typefaceV);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
