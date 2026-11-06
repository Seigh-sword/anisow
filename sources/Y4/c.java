package Y4;

import V4.A;
import V4.C0170a;
import V4.K;
import V4.m;
import V4.q;
import V4.r;
import b5.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import n3.C1154a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f4851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0170a f4852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f4854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l3.m f4855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f4856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f4857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K f4859i;

    public c(i iVar, e eVar, C0170a c0170a, A a6, m mVar) {
        this.f4851a = iVar;
        this.f4853c = eVar;
        this.f4852b = c0170a;
        this.f4854d = mVar;
        this.f4856f = new q(c0170a, eVar.f4881e, a6, mVar);
    }

    public final d a(boolean z5, int i6, int i7, int i8, int i9) throws SocketException, UnknownHostException {
        d dVar;
        Socket socket;
        Socket socketG;
        d dVar2;
        int i10;
        boolean z6;
        K k5;
        boolean z7;
        ArrayList arrayList;
        l3.m mVar;
        String hostName;
        int port;
        boolean zContains;
        synchronized (this.f4853c) {
            try {
                if (this.f4851a.d()) {
                    throw new IOException("Canceled");
                }
                this.f4858h = false;
                i iVar = this.f4851a;
                dVar = iVar.f4895i;
                socket = null;
                socketG = (dVar == null || !dVar.f4869k) ? null : iVar.g();
                i iVar2 = this.f4851a;
                dVar2 = iVar2.f4895i;
                if (dVar2 != null) {
                    dVar = null;
                } else {
                    dVar2 = null;
                }
                i10 = 1;
                if (dVar2 != null) {
                    z6 = false;
                    k5 = null;
                } else if (this.f4853c.c(this.f4852b, iVar2, null, false)) {
                    dVar2 = this.f4851a.f4895i;
                    k5 = null;
                    z6 = true;
                } else {
                    k5 = this.f4859i;
                    if (k5 != null) {
                        this.f4859i = null;
                    } else {
                        if (d()) {
                            k5 = this.f4851a.f4895i.f4861c;
                        }
                        z6 = false;
                        k5 = null;
                    }
                    z6 = false;
                }
            } finally {
            }
        }
        W4.b.d(socketG);
        if (dVar != null) {
            this.f4854d.getClass();
        }
        if (z6) {
            this.f4854d.getClass();
        }
        if (dVar2 != null) {
            return dVar2;
        }
        if (k5 != null || ((mVar = this.f4855e) != null && mVar.f10062b < mVar.f10061a.size())) {
            z7 = false;
        } else {
            q qVar = this.f4856f;
            if (qVar.f3895c >= qVar.f3894b.size() && ((List) qVar.f3901i).isEmpty()) {
                throw new NoSuchElementException();
            }
            ArrayList arrayList2 = new ArrayList();
            while (qVar.f3895c < qVar.f3894b.size()) {
                if ((qVar.f3895c < qVar.f3894b.size() ? i10 : 0) == 0) {
                    throw new SocketException("No route to " + ((C0170a) qVar.f3897e).f3809a.f3906d + "; exhausted proxy configurations: " + qVar.f3894b);
                }
                List list = qVar.f3894b;
                int i11 = qVar.f3895c;
                qVar.f3895c = i11 + 1;
                Proxy proxy = (Proxy) list.get(i11);
                qVar.f3896d = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    r rVar = ((C0170a) qVar.f3897e).f3809a;
                    hostName = rVar.f3906d;
                    port = rVar.f3907e;
                } else {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (!(socketAddressAddress instanceof InetSocketAddress)) {
                        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    InetAddress address = inetSocketAddress.getAddress();
                    hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                    port = inetSocketAddress.getPort();
                }
                if (port < i10 || port > 65535) {
                    throw new SocketException("No route to " + hostName + ":" + port + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    qVar.f3896d.add(InetSocketAddress.createUnresolved(hostName, port));
                } else {
                    ((m) qVar.f3900h).getClass();
                    ((C1154a) ((C0170a) qVar.f3897e).f3810b).getClass();
                    if (hostName == null) {
                        throw new UnknownHostException("hostname == null");
                    }
                    try {
                        List listAsList = Arrays.asList(InetAddress.getAllByName(hostName));
                        if (listAsList.isEmpty()) {
                            throw new UnknownHostException(((C0170a) qVar.f3897e).f3810b + " returned no addresses for " + hostName);
                        }
                        ((m) qVar.f3900h).getClass();
                        int size = listAsList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            qVar.f3896d.add(new InetSocketAddress((InetAddress) listAsList.get(i12), port));
                        }
                    } catch (NullPointerException e6) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                        unknownHostException.initCause(e6);
                        throw unknownHostException;
                    }
                }
                int size2 = qVar.f3896d.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    K k6 = new K((C0170a) qVar.f3897e, proxy, (InetSocketAddress) qVar.f3896d.get(i13));
                    K1.b bVar = (K1.b) qVar.f3898f;
                    synchronized (bVar) {
                        zContains = ((Set) bVar.f1515x).contains(k6);
                    }
                    if (zContains) {
                        ((List) qVar.f3901i).add(k6);
                    } else {
                        arrayList2.add(k6);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    break;
                }
                i10 = 1;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.addAll((List) qVar.f3901i);
                ((List) qVar.f3901i).clear();
            }
            this.f4855e = new l3.m(arrayList2);
            z7 = true;
        }
        synchronized (this.f4853c) {
            try {
                if (this.f4851a.d()) {
                    throw new IOException("Canceled");
                }
                if (z7) {
                    l3.m mVar2 = this.f4855e;
                    mVar2.getClass();
                    arrayList = new ArrayList(mVar2.f10061a);
                    if (this.f4853c.c(this.f4852b, this.f4851a, arrayList, false)) {
                        dVar2 = this.f4851a.f4895i;
                        z6 = true;
                    }
                } else {
                    arrayList = null;
                }
                if (!z6) {
                    if (k5 == null) {
                        l3.m mVar3 = this.f4855e;
                        if (mVar3.f10062b >= mVar3.f10061a.size()) {
                            throw new NoSuchElementException();
                        }
                        int i14 = mVar3.f10062b;
                        mVar3.f10062b = i14 + 1;
                        k5 = (K) mVar3.f10061a.get(i14);
                    }
                    dVar2 = new d(this.f4853c, k5);
                    this.f4857g = dVar2;
                }
            } finally {
            }
        }
        m mVar4 = this.f4854d;
        if (z6) {
            mVar4.getClass();
            return dVar2;
        }
        dVar2.c(i6, i7, i8, i9, z5, mVar4);
        this.f4853c.f4881e.b(dVar2.f4861c);
        synchronized (this.f4853c) {
            try {
                this.f4857g = null;
                if (this.f4853c.c(this.f4852b, this.f4851a, arrayList, true)) {
                    dVar2.f4869k = true;
                    socket = dVar2.f4863e;
                    dVar2 = this.f4851a.f4895i;
                    this.f4859i = k5;
                } else {
                    e eVar = this.f4853c;
                    if (!eVar.f4882f) {
                        eVar.f4882f = true;
                        e.f4876g.execute(eVar.f4879c);
                    }
                    eVar.f4880d.add(dVar2);
                    i iVar3 = this.f4851a;
                    if (iVar3.f4895i != null) {
                        throw new IllegalStateException();
                    }
                    iVar3.f4895i = dVar2;
                    dVar2.f4874p.add(new h(iVar3, iVar3.f4892f));
                }
            } finally {
            }
        }
        W4.b.d(socket);
        this.f4854d.getClass();
        return dVar2;
    }

    public final d b(int i6, int i7, int i8, int i9, boolean z5, boolean z6) throws SocketException, UnknownHostException {
        d dVarA;
        while (true) {
            dVarA = a(z5, i6, i7, i8, i9);
            synchronized (this.f4853c) {
                try {
                    if (dVarA.f4871m == 0 && dVarA.f4866h == null) {
                        return dVarA;
                    }
                    if (!dVarA.f4863e.isClosed() && !dVarA.f4863e.isInputShutdown() && !dVarA.f4863e.isOutputShutdown()) {
                        s sVar = dVarA.f4866h;
                        if (sVar == null) {
                            if (!z6) {
                                break;
                            }
                            try {
                                int soTimeout = dVarA.f4863e.getSoTimeout();
                                try {
                                    dVarA.f4863e.setSoTimeout(1);
                                    if (!dVarA.f4867i.E()) {
                                        dVarA.f4863e.setSoTimeout(soTimeout);
                                        break;
                                    }
                                    dVarA.f4863e.setSoTimeout(soTimeout);
                                } catch (Throwable th) {
                                    dVarA.f4863e.setSoTimeout(soTimeout);
                                    throw th;
                                }
                            } catch (SocketTimeoutException unused) {
                            } catch (IOException unused2) {
                                continue;
                            }
                        } else {
                            long jNanoTime = System.nanoTime();
                            synchronized (sVar) {
                                if (!sVar.f6023C && (sVar.f6030J >= sVar.f6029I || jNanoTime < sVar.f6031K)) {
                                    break;
                                }
                            }
                        }
                    }
                    dVarA.h();
                } finally {
                }
            }
        }
        return dVarA;
    }

    public final boolean c() {
        synchronized (this.f4853c) {
            try {
                boolean z5 = true;
                if (this.f4859i != null) {
                    return true;
                }
                if (d()) {
                    this.f4859i = this.f4851a.f4895i.f4861c;
                    return true;
                }
                l3.m mVar = this.f4855e;
                if (mVar == null || mVar.f10062b >= mVar.f10061a.size()) {
                    q qVar = this.f4856f;
                    if (qVar.f3895c >= qVar.f3894b.size() && ((List) qVar.f3901i).isEmpty()) {
                        z5 = false;
                    }
                }
                return z5;
            } finally {
            }
        }
    }

    public final boolean d() {
        d dVar = this.f4851a.f4895i;
        return dVar != null && dVar.f4870l == 0 && W4.b.o(dVar.f4861c.f3799a.f3809a, this.f4852b.f3809a);
    }
}
