package f2;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8420a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f8420a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return 0L;
            case 1:
                return Boolean.TRUE;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(W4.b.f4491h);
                return simpleDateFormat;
        }
    }
}
