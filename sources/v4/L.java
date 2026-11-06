package V4;

/* JADX INFO: loaded from: classes.dex */
public enum L {
    f3805x("TLSv1.3"),
    f3806y("TLSv1.2"),
    f3807z("TLSv1.1"),
    f3802A("TLSv1"),
    f3803B("SSLv3");


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3808w;

    L(String str) {
        this.f3808w = str;
    }

    public static L a(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return f3807z;
            case "TLSv1.2":
                return f3806y;
            case "TLSv1.3":
                return f3805x;
            case "SSLv3":
                return f3803B;
            case "TLSv1":
                return f3802A;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }
}
