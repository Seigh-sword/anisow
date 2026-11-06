package h5;

import V4.C0180k;
import V4.InterfaceC0174e;
import a3.C0261b;
import b3.C0343c;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import f5.C0710g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0782i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC0790q f8991A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile boolean f8992B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public V4.A f8993C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Throwable f8994D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f8995E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final T f8996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f8997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object[] f8998y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC0174e f8999z;

    public D(T t5, Object obj, Object[] objArr, InterfaceC0174e interfaceC0174e, InterfaceC0790q interfaceC0790q) {
        this.f8996w = t5;
        this.f8997x = obj;
        this.f8998y = objArr;
        this.f8999z = interfaceC0174e;
        this.f8991A = interfaceC0790q;
    }

    public final V4.A a() {
        V4.q qVar;
        V4.r rVarA;
        T t5 = this.f8996w;
        t5.getClass();
        Object[] objArr = this.f8998y;
        int length = objArr.length;
        AbstractC0651b[] abstractC0651bArr = t5.f9082k;
        if (length != abstractC0651bArr.length) {
            throw new IllegalArgumentException(AbstractC0628i.l(H1.a.l("Argument count (", length, ") doesn't match expected count ("), abstractC0651bArr.length, ")"));
        }
        Q q5 = new Q(t5.f9075d, t5.f9074c, t5.f9076e, t5.f9077f, t5.f9078g, t5.f9079h, t5.f9080i, t5.f9081j);
        if (t5.f9083l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(objArr[i6]);
            abstractC0651bArr[i6].a(q5, objArr[i6]);
        }
        V4.q qVar2 = q5.f9038d;
        if (qVar2 != null) {
            rVarA = qVar2.a();
        } else {
            String str = q5.f9037c;
            V4.r rVar = q5.f9036b;
            rVar.getClass();
            try {
                qVar = new V4.q();
                qVar.b(rVar, str);
            } catch (IllegalArgumentException unused) {
                qVar = null;
            }
            rVarA = qVar != null ? qVar.a() : null;
            if (rVarA == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + rVar + ", Relative: " + q5.f9037c);
            }
        }
        V4.E c6 = q5.f9045k;
        if (c6 == null) {
            C0343c c0343c = q5.f9044j;
            if (c0343c != null) {
                c6 = new V4.n((List) c0343c.f5930w, (List) c0343c.f5931x);
            } else {
                C0343c c0343c2 = q5.f9043i;
                if (c0343c2 != null) {
                    if (((List) c0343c2.f5932y).isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    c6 = new V4.v((f5.j) c0343c2.f5930w, (V4.t) c0343c2.f5931x, (List) c0343c2.f5932y);
                } else if (q5.f9042h) {
                    byte[] bArr = new byte[0];
                    long j6 = 0;
                    byte[] bArr2 = W4.b.f4484a;
                    if ((j6 | j6) < 0 || j6 > j6 || j6 - j6 < j6) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    c6 = new V4.D(0, bArr);
                }
            }
        }
        V4.t tVar = q5.f9041g;
        C1486b c1486b = q5.f9040f;
        if (tVar != null) {
            if (c6 != null) {
                c6 = new V4.C(c6, tVar);
            } else {
                c1486b.a("Content-Type", tVar.f3914a);
            }
        }
        p.b bVar = q5.f9039e;
        bVar.f12205a = rVarA;
        c1486b.getClass();
        ArrayList arrayList2 = c1486b.f13667a;
        String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
        C1486b c1486b2 = new C1486b(2);
        Collections.addAll(c1486b2.f13667a, strArr);
        bVar.f12207c = c1486b2;
        bVar.c(q5.f9035a, c6);
        bVar.f(C0795w.class, new C0795w(t5.f9072a, this.f8997x, t5.f9073b, arrayList));
        V4.B bA = bVar.a();
        V4.x xVar = (V4.x) this.f8999z;
        xVar.getClass();
        V4.A a6 = new V4.A(xVar, bA, false);
        a6.f3748x = new Y4.i(xVar, a6);
        return a6;
    }

    @Override // h5.InterfaceC0782i
    /* JADX INFO: renamed from: b */
    public final InterfaceC0782i clone() {
        return new D(this.f8996w, this.f8997x, this.f8998y, this.f8999z, this.f8991A);
    }

    @Override // h5.InterfaceC0782i
    public final void c(InterfaceC0785l interfaceC0785l) {
        V4.A a6;
        Throwable th;
        V4.z zVarA;
        synchronized (this) {
            try {
            } catch (Throwable th2) {
                th = th2;
                d0.n(th);
                this.f8994D = th;
            } finally {
            }
            if (this.f8995E) {
                throw new IllegalStateException("Already executed.");
            }
            this.f8995E = true;
            a6 = this.f8993C;
            th = this.f8994D;
            if (a6 == null && th == null) {
                V4.A a7 = a();
                this.f8993C = a7;
                a6 = a7;
            }
        }
        if (th != null) {
            interfaceC0785l.b(this, th);
            return;
        }
        if (this.f8992B) {
            a6.f3748x.a();
        }
        C0261b c0261b = new C0261b(this, 16, interfaceC0785l);
        synchronized (a6) {
            if (a6.f3746A) {
                throw new IllegalStateException("Already Executed");
            }
            a6.f3746A = true;
        }
        Y4.i iVar = a6.f3748x;
        iVar.getClass();
        iVar.f4892f = c5.i.f6262a.k();
        iVar.f4890d.getClass();
        C0180k c0180k = a6.f3747w.f3973w;
        V4.z zVar = new V4.z(a6, c0261b);
        synchronized (c0180k) {
            try {
                c0180k.f3880b.add(zVar);
                if (!a6.f3750z && (zVarA = c0180k.a(a6.f3749y.f3751a.f3906d)) != null) {
                    zVar.f3987z = zVarA.f3987z;
                }
            } finally {
            }
        }
        c0180k.c();
    }

    @Override // h5.InterfaceC0782i
    public final void cancel() {
        V4.A a6;
        this.f8992B = true;
        synchronized (this) {
            a6 = this.f8993C;
        }
        if (a6 != null) {
            a6.f3748x.a();
        }
    }

    public final Object clone() {
        return new D(this.f8996w, this.f8997x, this.f8998y, this.f8999z, this.f8991A);
    }

    public final V4.A d() throws IOException {
        V4.A a6 = this.f8993C;
        if (a6 != null) {
            return a6;
        }
        Throwable th = this.f8994D;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            V4.A a7 = a();
            this.f8993C = a7;
            return a7;
        } catch (IOException | Error | RuntimeException e6) {
            d0.n(e6);
            this.f8994D = e6;
            throw e6;
        }
    }

    public final U e(V4.G g4) throws IOException {
        V4.F fG = g4.g();
        V4.J j6 = g4.f3779C;
        fG.f3770g = new C(j6.c(), j6.b());
        V4.G gA = fG.a();
        int i6 = gA.f3788y;
        if (i6 < 200 || i6 >= 300) {
            try {
                j6.g().s(new C0710g());
                j6.c();
                j6.b();
                if (gA.c()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new U(gA, null);
            } finally {
                j6.close();
            }
        }
        if (i6 == 204 || i6 == 205) {
            j6.close();
            if (gA.c()) {
                return new U(gA, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        B b6 = new B(j6);
        try {
            Object objK = this.f8991A.k(b6);
            if (gA.c()) {
                return new U(gA, objK);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e6) {
            IOException iOException = b6.f8988z;
            if (iOException == null) {
                throw e6;
            }
            throw iOException;
        }
    }

    @Override // h5.InterfaceC0782i
    public final synchronized V4.B g() {
        try {
        } catch (IOException e6) {
            throw new RuntimeException("Unable to create request.", e6);
        }
        return d().f3749y;
    }

    @Override // h5.InterfaceC0782i
    public final boolean h() {
        boolean z5 = true;
        if (this.f8992B) {
            return true;
        }
        synchronized (this) {
            V4.A a6 = this.f8993C;
            if (a6 == null || !a6.f3748x.d()) {
                z5 = false;
            }
        }
        return z5;
    }
}
