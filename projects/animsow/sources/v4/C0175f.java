package V4;

import d.AbstractC0628i;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: V4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0175f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0175f f3837c = new C0175f(new LinkedHashSet(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f3838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.c f3839b;

    public C0175f(Set set, com.bumptech.glide.c cVar) {
        this.f3838a = set;
        this.f3839b = cVar;
    }

    public static String b(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        if (!(x509Certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb = new StringBuilder("sha256/");
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        f5.j jVar = f5.j.f8462z;
        AbstractC1305a.o(encoded, "data");
        byte[] bArrCopyOf = Arrays.copyOf(encoded, encoded.length);
        AbstractC1305a.n(bArrCopyOf, "copyOf(this, size)");
        f5.j jVar2 = new f5.j(bArrCopyOf);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(jVar2.f8463w, 0, jVar2.d());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC1305a.n(bArrDigest, "digestBytes");
        sb.append(new f5.j(bArrDigest).a());
        return sb.toString();
    }

    public final void a(String str, List list) throws SSLPeerUnverifiedException {
        List listEmptyList = Collections.emptyList();
        Iterator it = this.f3838a.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        com.bumptech.glide.c cVar = this.f3839b;
        if (cVar != null) {
            list = cVar.r(str, list);
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (listEmptyList.size() > 0) {
                AbstractC0628i.p(listEmptyList.get(0));
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i7);
            sb.append("\n    ");
            sb.append(b(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size3 = listEmptyList.size();
        for (int i8 = 0; i8 < size3; i8++) {
            AbstractC0628i.p(listEmptyList.get(i8));
            sb.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0175f) {
            C0175f c0175f = (C0175f) obj;
            if (Objects.equals(this.f3839b, c0175f.f3839b) && this.f3838a.equals(c0175f.f3838a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3838a.hashCode() + (Objects.hashCode(this.f3839b) * 31);
    }
}
