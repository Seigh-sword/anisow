package J;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale[] f1164a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f1164a;
        int length = localeArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String strC = L.c.c(L.c.a(L.c.b(locale)));
                if (!strC.isEmpty()) {
                    return strC.equals(L.c.c(L.c.a(L.c.b(locale2))));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            if (localeArr[i6].equals(locale)) {
                break;
            }
            i6++;
        }
        return false;
    }
}
