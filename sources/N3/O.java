package N3;

import java.util.Locale;
import java.util.UUID;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f2166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.a f2167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G f2170e;

    public O() {
        Z z5 = Z.f2194a;
        N n5 = N.f2165E;
        this.f2166a = z5;
        this.f2167b = n5;
        this.f2168c = a();
        this.f2169d = -1;
    }

    public final String a() {
        String string = ((UUID) this.f2167b.b()).toString();
        AbstractC1305a.n(string, "uuidGenerator().toString()");
        String lowerCase = K4.h.i0(string, "-", "").toLowerCase(Locale.ROOT);
        AbstractC1305a.n(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final G b() {
        G g4 = this.f2170e;
        if (g4 != null) {
            return g4;
        }
        AbstractC1305a.W("currentSession");
        throw null;
    }
}
