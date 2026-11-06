package K4;

import java.nio.charset.Charset;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f1637a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC1305a.n(charsetForName, "forName(...)");
        f1637a = charsetForName;
        AbstractC1305a.n(Charset.forName("UTF-16"), "forName(...)");
        AbstractC1305a.n(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC1305a.n(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC1305a.n(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC1305a.n(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
