package J;

import android.os.Build;
import java.util.Locale;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static {
        int i6 = Build.VERSION.SDK_INT;
        a aVar = a.f1162a;
        if (i6 >= 30) {
            aVar.a(30);
        }
        if (i6 >= 30) {
            aVar.a(31);
        }
        if (i6 >= 30) {
            aVar.a(33);
        }
        if (i6 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 31) {
            if (i6 >= 30) {
                String str = Build.VERSION.CODENAME;
                AbstractC1305a.n(str, "CODENAME");
                if (!AbstractC1305a.c("REL", str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    AbstractC1305a.n(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "S".toUpperCase(locale);
                    AbstractC1305a.n(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
