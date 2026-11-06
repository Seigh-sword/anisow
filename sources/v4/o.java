package V4;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f3888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0176g f3889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3891d;

    public o(L l5, C0176g c0176g, List list, List list2) {
        this.f3888a = l5;
        this.f3889b = c0176g;
        this.f3890c = list;
        this.f3891d = list2;
    }

    public static o a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C0176g c0176gA = C0176g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        L lA = L.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listK = peerCertificates != null ? W4.b.k(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new o(lA, c0176gA, listK, localCertificates != null ? W4.b.k(localCertificates) : Collections.emptyList());
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f3888a.equals(oVar.f3888a) && this.f3889b.equals(oVar.f3889b) && this.f3890c.equals(oVar.f3890c) && this.f3891d.equals(oVar.f3891d);
    }

    public final int hashCode() {
        return this.f3891d.hashCode() + ((this.f3890c.hashCode() + ((this.f3889b.hashCode() + ((this.f3888a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.f3888a + " cipherSuite=" + this.f3889b + " peerCertificates=" + b(this.f3890c) + " localCertificates=" + b(this.f3891d) + '}';
    }
}
