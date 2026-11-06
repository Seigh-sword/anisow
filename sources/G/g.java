package G;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import s.C1284f;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S0.f f648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1284f f649b;

    static {
        S0.f iVar;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            iVar = new l(7);
        } else if (i6 >= 28) {
            iVar = new k();
        } else if (i6 >= 26) {
            iVar = new j();
        } else {
            Method method = i.f655A;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            iVar = method != null ? new i(7) : new h();
        }
        f648a = iVar;
        f649b = new C1284f(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r15, F.f r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, com.bumptech.glide.d r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.g.a(android.content.Context, F.f, android.content.res.Resources, int, java.lang.String, int, int, com.bumptech.glide.d, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i6, String str, int i7, int i8) {
        return resources.getResourcePackageName(i6) + '-' + str + '-' + i7 + '-' + i6 + '-' + i8;
    }
}
