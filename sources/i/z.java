package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static J.i b(Configuration configuration) {
        return J.i.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(J.i iVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(((J.k) iVar.f1166a).f1167a.toLanguageTags()));
    }

    public static void d(Configuration configuration, J.i iVar) {
        configuration.setLocales(LocaleList.forLanguageTags(((J.k) iVar.f1166a).f1167a.toLanguageTags()));
    }
}
