package e5;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f8299a = new c();

    public static ArrayList a(X509Certificate x509Certificate) {
        List listB = b(x509Certificate, 7);
        List listB2 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listB2.size() + listB.size());
        arrayList.addAll(listB);
        arrayList.addAll(listB2);
        return arrayList;
    }

    public static List b(X509Certificate x509Certificate, int i6) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i6 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static boolean c(String str, X509Certificate x509Certificate) {
        int length;
        if (W4.b.f4494k.matcher(str).matches()) {
            List listB = b(x509Certificate, 7);
            int size = listB.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (str.equalsIgnoreCase((String) listB.get(i6))) {
                    return true;
                }
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            for (String strConcat : b(x509Certificate, 2)) {
                if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && strConcat != null && strConcat.length() != 0 && !strConcat.startsWith(".") && !strConcat.endsWith("..")) {
                    String strConcat2 = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                    if (!strConcat.endsWith(".")) {
                        strConcat = strConcat.concat(".");
                    }
                    String lowerCase2 = strConcat.toLowerCase(Locale.US);
                    if (!lowerCase2.contains("*")) {
                        if (strConcat2.equals(lowerCase2)) {
                            return true;
                        }
                    } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && strConcat2.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                        String strSubstring = lowerCase2.substring(1);
                        if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || strConcat2.lastIndexOf(46, length - 1) == -1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
