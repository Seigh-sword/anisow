package V4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public enum y {
    f3981x("http/1.0"),
    f3982y("http/1.1"),
    f3983z("spdy/3.1"),
    f3977A("h2"),
    f3978B("h2_prior_knowledge"),
    f3979C("quic");


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3984w;

    y(String str) {
        this.f3984w = str;
    }

    public static y a(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return f3981x;
        }
        if (str.equals("http/1.1")) {
            return f3982y;
        }
        if (str.equals("h2_prior_knowledge")) {
            return f3978B;
        }
        if (str.equals("h2")) {
            return f3977A;
        }
        if (str.equals("spdy/3.1")) {
            return f3983z;
        }
        if (str.equals("quic")) {
            return f3979C;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3984w;
    }
}
