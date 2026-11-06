package m2;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.Q4;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends u1 {
    public static String v(F f6) {
        Uri.Builder builder = new Uri.Builder();
        String strJ = f6.j();
        if (TextUtils.isEmpty(strJ)) {
            strJ = f6.d();
        }
        builder.scheme((String) AbstractC1078w.f11186f.a(null)).encodedAuthority((String) AbstractC1078w.f11189g.a(null)).path("config/app/" + strJ).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
    }

    public final y1 w(String str) {
        F fQ0;
        Q4.a();
        y1 y1Var = null;
        if (n().D(null, AbstractC1078w.f11227w0)) {
            q();
            if (K1.u0(str)) {
                f().f10723J.d("sgtm feature flag enabled.");
                F fQ02 = t().q0(str);
                if (fQ02 == null) {
                    return new y1(x(str), 1);
                }
                String strG = fQ02.g();
                com.google.android.gms.internal.measurement.X0 x0I = u().I(str);
                if (x0I == null || (fQ0 = t().q0(str)) == null || ((!x0I.H() || x0I.y().p() != 100) && !q().s0(str, fQ0.l()) && (!n().D(null, AbstractC1078w.f11231y0) ? !(TextUtils.isEmpty(strG) || strG.hashCode() % 100 >= x0I.y().p()) : !(TextUtils.isEmpty(strG) || Math.abs(strG.hashCode() % 100) >= x0I.y().p())))) {
                    return new y1(x(str), 1);
                }
                if (fQ02.o()) {
                    f().f10723J.d("sgtm upload enabled in manifest.");
                    com.google.android.gms.internal.measurement.X0 x0I2 = u().I(fQ02.f());
                    if (x0I2 != null && x0I2.H()) {
                        String strT = x0I2.y().t();
                        if (!TextUtils.isEmpty(strT)) {
                            String strS = x0I2.y().s();
                            f().f10723J.b(strT, TextUtils.isEmpty(strS) ? "Y" : "N", "sgtm configured with upload_url, server_info");
                            if (TextUtils.isEmpty(strS)) {
                                y1Var = new y1(strT, 3);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strS);
                                if (!TextUtils.isEmpty(fQ02.l())) {
                                    map.put("x-gtm-server-preview", fQ02.l());
                                }
                                y1Var = new y1(strT, map, 3);
                            }
                        }
                    }
                }
                if (y1Var != null) {
                    return y1Var;
                }
            }
        }
        return new y1(x(str), 1);
    }

    public final String x(String str) {
        String strM = u().M(str);
        if (TextUtils.isEmpty(strM)) {
            return (String) AbstractC1078w.f11216r.a(null);
        }
        Uri uri = Uri.parse((String) AbstractC1078w.f11216r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strM + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
