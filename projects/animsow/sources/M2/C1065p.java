package m2;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: m2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1065p extends AbstractC1081x0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11053y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f11054z;

    @Override // m2.AbstractC1081x0
    public final boolean u() {
        Calendar calendar = Calendar.getInstance();
        this.f11053y = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f11054z = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }
}
