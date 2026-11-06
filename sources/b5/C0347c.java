package b5;

import java.util.Locale;

/* JADX INFO: renamed from: b5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0347c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f5.j f5956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f5.j f5957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f5.j f5958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f5.j f5959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f5.j f5960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f5.j f5961i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5.j f5962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5.j f5963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5964c;

    static {
        f5.j jVar = f5.j.f8462z;
        f5956d = P2.e.g(":");
        f5957e = P2.e.g(":status");
        f5958f = P2.e.g(":method");
        f5959g = P2.e.g(":path");
        f5960h = P2.e.g(":scheme");
        f5961i = P2.e.g(":authority");
    }

    public C0347c(f5.j jVar, f5.j jVar2) {
        this.f5962a = jVar;
        this.f5963b = jVar2;
        this.f5964c = jVar2.d() + jVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0347c)) {
            return false;
        }
        C0347c c0347c = (C0347c) obj;
        return this.f5962a.equals(c0347c.f5962a) && this.f5963b.equals(c0347c.f5963b);
    }

    public final int hashCode() {
        return this.f5963b.hashCode() + ((this.f5962a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strQ = this.f5962a.q();
        String strQ2 = this.f5963b.q();
        byte[] bArr = W4.b.f4484a;
        Locale locale = Locale.US;
        return strQ + ": " + strQ2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0347c(f5.j jVar, String str) {
        this(jVar, P2.e.g(str));
        f5.j jVar2 = f5.j.f8462z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0347c(String str, String str2) {
        this(P2.e.g(str), P2.e.g(str2));
        f5.j jVar = f5.j.f8462z;
    }
}
