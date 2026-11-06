package F1;

import H1.l;
import f2.h;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f603f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f605b;

    static {
        String strA = h.A("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f600c = strA;
        String strA2 = h.A("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strA3 = h.A("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f601d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new E1.c("proto"), new E1.c("json"))));
        f602e = new a(strA, null);
        f603f = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f604a = str;
        this.f605b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
