package V4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import m.Z0;

/* JADX INFO: renamed from: V4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0177h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0177h f3859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0177h f3860f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f3863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f3864d;

    static {
        C0176g c0176g = C0176g.f3855q;
        C0176g c0176g2 = C0176g.f3856r;
        C0176g c0176g3 = C0176g.f3857s;
        C0176g c0176g4 = C0176g.f3849k;
        C0176g c0176g5 = C0176g.f3851m;
        C0176g c0176g6 = C0176g.f3850l;
        C0176g c0176g7 = C0176g.f3852n;
        C0176g c0176g8 = C0176g.f3854p;
        C0176g c0176g9 = C0176g.f3853o;
        C0176g[] c0176gArr = {c0176g, c0176g2, c0176g3, c0176g4, c0176g5, c0176g6, c0176g7, c0176g8, c0176g9, C0176g.f3847i, C0176g.f3848j, C0176g.f3845g, C0176g.f3846h, C0176g.f3843e, C0176g.f3844f, C0176g.f3842d};
        Z0 z02 = new Z0(true);
        z02.b(c0176g, c0176g2, c0176g3, c0176g4, c0176g5, c0176g6, c0176g7, c0176g8, c0176g9);
        L l5 = L.f3805x;
        L l6 = L.f3806y;
        z02.h(l5, l6);
        if (!z02.f10235a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        z02.f10236b = true;
        new C0177h(z02);
        Z0 z03 = new Z0(true);
        z03.b(c0176gArr);
        z03.h(l5, l6);
        if (!z03.f10235a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        z03.f10236b = true;
        f3859e = new C0177h(z03);
        Z0 z04 = new Z0(true);
        z04.b(c0176gArr);
        z04.h(l5, l6, L.f3807z, L.f3802A);
        if (!z04.f10235a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        z04.f10236b = true;
        new C0177h(z04);
        f3860f = new C0177h(new Z0(false));
    }

    public C0177h(Z0 z02) {
        this.f3861a = z02.f10235a;
        this.f3863c = (String[]) z02.f10237c;
        this.f3864d = (String[]) z02.f10238d;
        this.f3862b = z02.f10236b;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f3861a) {
            return false;
        }
        String[] strArr = this.f3864d;
        if (strArr != null && !W4.b.n(W4.b.f4492i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f3863c;
        return strArr2 == null || W4.b.n(C0176g.f3840b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0177h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0177h c0177h = (C0177h) obj;
        boolean z5 = c0177h.f3861a;
        boolean z6 = this.f3861a;
        if (z6 != z5) {
            return false;
        }
        return !z6 || (Arrays.equals(this.f3863c, c0177h.f3863c) && Arrays.equals(this.f3864d, c0177h.f3864d) && this.f3862b == c0177h.f3862b);
    }

    public final int hashCode() {
        if (this.f3861a) {
            return ((((527 + Arrays.hashCode(this.f3863c)) * 31) + Arrays.hashCode(this.f3864d)) * 31) + (!this.f3862b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        if (!this.f3861a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        List listUnmodifiableList2 = null;
        String[] strArr = this.f3863c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C0176g.a(str));
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        } else {
            listUnmodifiableList = null;
        }
        sb.append(Objects.toString(listUnmodifiableList, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.f3864d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(L.a(str2));
            }
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        }
        sb.append(Objects.toString(listUnmodifiableList2, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f3862b);
        sb.append(")");
        return sb.toString();
    }
}
