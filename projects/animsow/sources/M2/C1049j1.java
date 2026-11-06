package m2;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import b2.C0337b;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: m2.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1049j1 extends t1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Z f10964A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Z f10965B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Z f10966C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Z f10967D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Z f10968E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Z f10969F;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashMap f10970z;

    public C1049j1(x1 x1Var) {
        super(x1Var);
        this.f10970z = new HashMap();
        this.f10964A = new Z(p(), "last_delete_stale", 0L);
        this.f10965B = new Z(p(), "last_delete_stale_batch", 0L);
        this.f10966C = new Z(p(), "backoff", 0L);
        this.f10967D = new Z(p(), "last_upload", 0L);
        this.f10968E = new Z(p(), "last_upload_attempt", 0L);
        this.f10969F = new Z(p(), "midnight_offset", 0L);
    }

    @Override // m2.t1
    public final boolean x() {
        return false;
    }

    public final String y(String str, boolean z5) {
        r();
        String str2 = z5 ? (String) z(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestE0 = K1.E0();
        if (messageDigestE0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestE0.digest(str2.getBytes())));
    }

    public final Pair z(String str) {
        C1046i1 c1046i1;
        w0.q qVarA;
        r();
        ((C0337b) h()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f10970z;
        C1046i1 c1046i12 = (C1046i1) map.get(str);
        if (c1046i12 != null && jElapsedRealtime < c1046i12.f10957c) {
            return new Pair(c1046i12.f10955a, Boolean.valueOf(c1046i12.f10956b));
        }
        C1032e c1032eN = n();
        c1032eN.getClass();
        long jY = c1032eN.y(str, AbstractC1078w.f11175b) + jElapsedRealtime;
        try {
            try {
                qVarA = R1.a.a(a());
            } catch (PackageManager.NameNotFoundException unused) {
                if (c1046i12 != null && jElapsedRealtime < c1046i12.f10957c + n().y(str, AbstractC1078w.f11177c)) {
                    return new Pair(c1046i12.f10955a, Boolean.valueOf(c1046i12.f10956b));
                }
                qVarA = null;
            }
        } catch (Exception e6) {
            f().f10722I.c(e6, "Unable to get advertising id");
            c1046i1 = new C1046i1(jY, "", false);
        }
        if (qVarA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = qVarA.f13541b;
        boolean z5 = qVarA.f13542c;
        c1046i1 = str2 != null ? new C1046i1(jY, str2, z5) : new C1046i1(jY, "", z5);
        map.put(str, c1046i1);
        return new Pair(c1046i1.f10955a, Boolean.valueOf(c1046i1.f10956b));
    }
}
