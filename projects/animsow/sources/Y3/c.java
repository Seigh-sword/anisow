package y3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import w3.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements w3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f13822a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f13822a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // w3.InterfaceC1477a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).a(f13822a.format((Date) obj));
    }
}
