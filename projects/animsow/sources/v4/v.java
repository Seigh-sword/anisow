package V4;

import f5.C0710g;
import f5.InterfaceC0711h;
import java.io.EOFException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v extends E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f3919e = t.a("multipart/mixed");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f3920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f3921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f3922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f3923i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5.j f3924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f3925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3927d = -1;

    static {
        t.a("multipart/alternative");
        t.a("multipart/digest");
        t.a("multipart/parallel");
        f3920f = t.a("multipart/form-data");
        f3921g = new byte[]{58, 32};
        f3922h = new byte[]{13, 10};
        f3923i = new byte[]{45, 45};
    }

    public v(f5.j jVar, t tVar, List list) {
        this.f3924a = jVar;
        this.f3925b = t.a(tVar + "; boundary=" + jVar.q());
        this.f3926c = W4.b.j(list);
    }

    @Override // V4.E
    public final long a() throws EOFException {
        long j6 = this.f3927d;
        if (j6 != -1) {
            return j6;
        }
        long jD = d(null, true);
        this.f3927d = jD;
        return jD;
    }

    @Override // V4.E
    public final t b() {
        return this.f3925b;
    }

    @Override // V4.E
    public final void c(InterfaceC0711h interfaceC0711h) throws EOFException {
        d(interfaceC0711h, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(InterfaceC0711h interfaceC0711h, boolean z5) throws EOFException {
        C0710g c0710g;
        InterfaceC0711h c0710g2;
        if (z5) {
            c0710g2 = new C0710g();
            c0710g = c0710g2;
        } else {
            c0710g = 0;
            c0710g2 = interfaceC0711h;
        }
        List list = this.f3926c;
        int size = list.size();
        long j6 = 0;
        int i6 = 0;
        while (true) {
            f5.j jVar = this.f3924a;
            byte[] bArr = f3923i;
            byte[] bArr2 = f3922h;
            if (i6 >= size) {
                c0710g2.e(bArr);
                c0710g2.t(jVar);
                c0710g2.e(bArr);
                c0710g2.e(bArr2);
                if (!z5) {
                    return j6;
                }
                long j7 = j6 + c0710g.f8461x;
                c0710g.k();
                return j7;
            }
            u uVar = (u) list.get(i6);
            p pVar = uVar.f3917a;
            c0710g2.e(bArr);
            c0710g2.t(jVar);
            c0710g2.e(bArr2);
            if (pVar != null) {
                int iG = pVar.g();
                for (int i7 = 0; i7 < iG; i7++) {
                    c0710g2.z(pVar.d(i7)).e(f3921g).z(pVar.h(i7)).e(bArr2);
                }
            }
            E e6 = uVar.f3918b;
            t tVarB = e6.b();
            if (tVarB != null) {
                c0710g2.z("Content-Type: ").z(tVarB.f3914a).e(bArr2);
            }
            long jA = e6.a();
            if (jA != -1) {
                c0710g2.z("Content-Length: ").B(jA).e(bArr2);
            } else if (z5) {
                c0710g.k();
                return -1L;
            }
            c0710g2.e(bArr2);
            if (z5) {
                j6 += jA;
            } else {
                e6.c(c0710g2);
            }
            c0710g2.e(bArr2);
            i6++;
        }
    }
}
