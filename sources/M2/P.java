package m2;

import V4.C0176g;
import V4.C0177h;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10747d;

    public P(List list) {
        this.f10744a = 0;
        this.f10747d = list;
    }

    public final C0177h a(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z5;
        C0177h c0177h;
        int i6 = this.f10744a;
        List list = (List) this.f10747d;
        int size = list.size();
        while (true) {
            z5 = true;
            if (i6 >= size) {
                c0177h = null;
                break;
            }
            c0177h = (C0177h) list.get(i6);
            if (c0177h.a(sSLSocket)) {
                this.f10744a = i6 + 1;
                break;
            }
            i6++;
        }
        if (c0177h == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f10746c + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i7 = this.f10744a;
        while (true) {
            if (i7 >= list.size()) {
                z5 = false;
                break;
            }
            if (((C0177h) list.get(i7)).a(sSLSocket)) {
                break;
            }
            i7++;
        }
        this.f10745b = z5;
        C1017B c1017b = C1017B.f10489z;
        boolean z6 = this.f10746c;
        c1017b.getClass();
        String[] strArr = c0177h.f3863c;
        String[] strArrL = strArr != null ? W4.b.l(C0176g.f3840b, sSLSocket.getEnabledCipherSuites(), strArr) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = c0177h.f3864d;
        String[] strArrL2 = strArr2 != null ? W4.b.l(W4.b.f4492i, sSLSocket.getEnabledProtocols(), strArr2) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        K.b bVar = C0176g.f3840b;
        byte[] bArr = W4.b.f4484a;
        int length = supportedCipherSuites.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            if (bVar.compare(supportedCipherSuites[i8], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i8++;
        }
        if (z6 && i8 != -1) {
            String str = supportedCipherSuites[i8];
            int length2 = strArrL.length;
            String[] strArr3 = new String[length2 + 1];
            System.arraycopy(strArrL, 0, strArr3, 0, strArrL.length);
            strArr3[length2] = str;
            strArrL = strArr3;
        }
        m.Z0 z02 = new m.Z0();
        z02.f10235a = c0177h.f3861a;
        z02.f10237c = strArr;
        z02.f10238d = strArr2;
        z02.f10236b = c0177h.f3862b;
        z02.c(strArrL);
        z02.i(strArrL2);
        C0177h c0177h2 = new C0177h(z02);
        String[] strArr4 = c0177h2.f3864d;
        if (strArr4 != null) {
            sSLSocket.setEnabledProtocols(strArr4);
        }
        String[] strArr5 = c0177h2.f3863c;
        if (strArr5 != null) {
            sSLSocket.setEnabledCipherSuites(strArr5);
        }
        return c0177h;
    }

    public final void b(Object obj, Object obj2, String str) {
        ((N) this.f10747d).y(this.f10744a, this.f10745b, this.f10746c, str, obj, obj2, null);
    }

    public final void c(Object obj, String str) {
        ((N) this.f10747d).y(this.f10744a, this.f10745b, this.f10746c, str, obj, null, null);
    }

    public final void d(String str) {
        ((N) this.f10747d).y(this.f10744a, this.f10745b, this.f10746c, str, null, null, null);
    }

    public final void e(String str, Object obj, Object obj2, Object obj3) {
        ((N) this.f10747d).y(this.f10744a, this.f10745b, this.f10746c, str, obj, obj2, obj3);
    }

    public P(N n5, int i6, boolean z5, boolean z6) {
        this.f10747d = n5;
        this.f10744a = i6;
        this.f10745b = z5;
        this.f10746c = z6;
    }
}
