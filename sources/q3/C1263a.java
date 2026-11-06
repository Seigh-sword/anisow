package q3;

import n3.C1154a;
import n3.C1156c;

/* JADX INFO: renamed from: q3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1263a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1156c f12380b = new C1156c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f12381c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f12382d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1154a f12383e = new C1154a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1265c f12384a;

    public C1263a(C1265c c1265c) {
        this.f12384a = c1265c;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i6 = 0; i6 < str.length(); i6++) {
            sb.append(str.charAt(i6));
            if (str2.length() > i6) {
                sb.append(str2.charAt(i6));
            }
        }
        return sb.toString();
    }
}
