package Y4;

import V4.C0170a;
import V4.K;
import d.AbstractC0628i;
import d.RunnableC0632m;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f4876g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC0632m f4879c = new RunnableC0632m(23, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f4880d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K1.b f4881e = new K1.b(25);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4882f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = W4.b.f4484a;
        f4876g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new W4.a("OkHttp ConnectionPool", true));
    }

    public e(int i6, long j6, TimeUnit timeUnit) {
        this.f4877a = i6;
        this.f4878b = timeUnit.toNanos(j6);
        if (j6 <= 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("keepAliveDuration <= 0: ", j6));
        }
    }

    public final void a(K k5, IOException iOException) {
        if (k5.f3800b.type() != Proxy.Type.DIRECT) {
            C0170a c0170a = k5.f3799a;
            c0170a.f3815g.connectFailed(c0170a.f3809a.l(), k5.f3800b.address(), iOException);
        }
        K1.b bVar = this.f4881e;
        synchronized (bVar) {
            ((Set) bVar.f1515x).add(k5);
        }
    }

    public final int b(d dVar, long j6) {
        ArrayList arrayList = dVar.f4874p;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i6);
            if (reference.get() != null) {
                i6++;
            } else {
                c5.i.f6262a.n(((h) reference).f4886a, "A connection to " + dVar.f4861c.f3799a.f3809a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i6);
                dVar.f4869k = true;
                if (arrayList.isEmpty()) {
                    dVar.f4875q = j6 - this.f4878b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0006, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(V4.C0170a r10, Y4.i r11, java.util.ArrayList r12, boolean r13) {
        /*
            r9 = this;
            java.util.ArrayDeque r0 = r9.f4880d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            Y4.d r1 = (Y4.d) r1
            if (r13 == 0) goto L19
            b5.s r3 = r1.f4866h
            if (r3 == 0) goto L6
        L19:
            java.util.ArrayList r3 = r1.f4874p
            int r3 = r3.size()
            int r4 = r1.f4873o
            if (r3 >= r4) goto L6
            boolean r3 = r1.f4869k
            if (r3 == 0) goto L28
            goto L6
        L28:
            m2.B r3 = m2.C1017B.f10489z
            V4.K r4 = r1.f4861c
            V4.a r5 = r4.f3799a
            r3.getClass()
            boolean r3 = r5.a(r10)
            if (r3 != 0) goto L38
            goto L6
        L38:
            V4.r r3 = r10.f3809a
            java.lang.String r5 = r3.f3906d
            V4.a r6 = r4.f3799a
            V4.r r6 = r6.f3809a
            java.lang.String r6 = r6.f3906d
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L49
            goto L91
        L49:
            b5.s r5 = r1.f4866h
            if (r5 != 0) goto L4e
            goto L6
        L4e:
            if (r12 == 0) goto L6
            int r5 = r12.size()
        L54:
            if (r2 >= r5) goto L6
            java.lang.Object r6 = r12.get(r2)
            V4.K r6 = (V4.K) r6
            java.net.Proxy r7 = r6.f3800b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto Lab
            java.net.Proxy r7 = r4.f3800b
            java.net.Proxy$Type r7 = r7.type()
            if (r7 != r8) goto Lab
            java.net.InetSocketAddress r6 = r6.f3801c
            java.net.InetSocketAddress r7 = r4.f3801c
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Lab
            e5.c r2 = e5.c.f8299a
            javax.net.ssl.HostnameVerifier r4 = r10.f3818j
            if (r4 == r2) goto L7f
            goto L6
        L7f:
            boolean r2 = r1.j(r3)
            if (r2 != 0) goto L86
            goto L6
        L86:
            V4.f r2 = r10.f3819k     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            java.lang.String r3 = r3.f3906d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            V4.o r4 = r1.f4864f     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            java.util.List r4 = r4.f3890c     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            r2.a(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
        L91:
            Y4.d r10 = r11.f4895i
            if (r10 != 0) goto La5
            r11.f4895i = r1
            java.util.ArrayList r10 = r1.f4874p
            Y4.h r12 = new Y4.h
            java.lang.Object r13 = r11.f4892f
            r12.<init>(r11, r13)
            r10.add(r12)
            r10 = 1
            return r10
        La5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        Lab:
            int r2 = r2 + 1
            goto L54
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.e.c(V4.a, Y4.i, java.util.ArrayList, boolean):boolean");
    }
}
