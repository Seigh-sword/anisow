package l3;

import m2.C1017B;
import p3.C1251c;

/* JADX INFO: renamed from: l3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0942e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1017B f10038c = new C1017B((Object) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1251c f10039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0940c f10040b;

    public C0942e(C1251c c1251c) {
        this.f10039a = c1251c;
        this.f10040b = f10038c;
    }

    public C0942e(C1251c c1251c, String str) {
        this(c1251c);
        C1017B c1017b = f10038c;
        c1017b.b();
        this.f10040b = c1017b;
        if (str == null) {
            return;
        }
        this.f10040b = new k(c1251c.n(str, "userlog"));
    }
}
