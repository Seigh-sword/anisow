package m2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1026c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f10857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f10858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f10859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f10860f;

    public static Boolean a(long j6, com.google.android.gms.internal.measurement.J0 j02) {
        try {
            return d(new BigDecimal(j6), j02, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean b(Boolean bool, boolean z5) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z5);
    }

    public static Boolean c(String str, com.google.android.gms.internal.measurement.M0 m02, N n5) {
        List listU;
        boolean zStartsWith;
        AbstractC1332d.m(m02);
        if (str == null || !m02.y() || m02.q() == 1) {
            return null;
        }
        if (m02.q() == 7) {
            if (m02.p() == 0) {
                return null;
            }
        } else if (!m02.x()) {
            return null;
        }
        int iQ = m02.q();
        boolean zV = m02.v();
        String strT = (zV || iQ == 2 || iQ == 7) ? m02.t() : m02.t().toUpperCase(Locale.ENGLISH);
        if (m02.p() == 0) {
            listU = null;
        } else {
            listU = m02.u();
            if (!zV) {
                ArrayList arrayList = new ArrayList(listU.size());
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listU = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = iQ == 2 ? strT : null;
        if (iQ == 7) {
            if (listU == null || listU.isEmpty()) {
                return null;
            }
        } else if (strT == null) {
            return null;
        }
        if (!zV && iQ != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (N1.f10733a[u.h.b(iQ)]) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, zV ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    n5.f10718E.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                zStartsWith = str.startsWith(strT);
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                zStartsWith = str.endsWith(strT);
                break;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                zStartsWith = str.contains(strT);
                break;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                zStartsWith = str.equals(strT);
                break;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (listU == null) {
                    return null;
                }
                zStartsWith = listU.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    public static Boolean d(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.J0 j02, double d6) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC1332d.m(j02);
        if (j02.w()) {
            if (j02.p() != 1) {
                if (j02.p() == 5) {
                    if (!j02.A() || !j02.z()) {
                        return null;
                    }
                } else if (!j02.x()) {
                    return null;
                }
                int iP = j02.p();
                if (j02.p() == 5) {
                    if (H1.a0(j02.u()) && H1.a0(j02.t())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(j02.u());
                            bigDecimal4 = new BigDecimal(j02.t());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!H1.a0(j02.s())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(j02.s());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iP == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 != null) {
                }
                int i6 = N1.f10734b[u.h.b(iP)];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4 && bigDecimal3 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                            }
                            return null;
                        }
                        if (bigDecimal2 != null) {
                            if (d6 != 0.0d) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d6).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d6).multiply(new BigDecimal(2)))) < 0);
                            }
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                    } else if (bigDecimal2 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
            }
        }
        return null;
    }
}
