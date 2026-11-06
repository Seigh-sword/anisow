package E3;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m2.C1017B;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f417b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f418c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f419d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1017B f420a;

    public j(C1017B c1017b) {
        this.f420a = c1017b;
    }

    public static j a() {
        if (C1017B.f10487x == null) {
            C1017B.f10487x = new C1017B(6, (Object) null);
        }
        C1017B c1017b = C1017B.f10487x;
        if (f419d == null) {
            f419d = new j(c1017b);
        }
        return f419d;
    }

    public final boolean b(F3.a aVar) {
        if (TextUtils.isEmpty(aVar.f622c)) {
            return true;
        }
        long j6 = aVar.f625f + aVar.f624e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f420a.getClass();
        return j6 < timeUnit.toSeconds(System.currentTimeMillis()) + f417b;
    }
}
