package Q4;

import M4.InterfaceC0080z;
import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import java.util.ArrayList;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1432j f2843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2844x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final O4.a f2845y;

    public g(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        this.f2843w = interfaceC1432j;
        this.f2844x = i6;
        this.f2845y = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // Q4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final P4.InterfaceC0146g b(v4.InterfaceC1432j r5, int r6, O4.a r7) {
        /*
            r4 = this;
            v4.j r0 = r4.f2843w
            v4.j r5 = r5.k(r0)
            O4.a r1 = O4.a.f2342w
            O4.a r2 = r4.f2845y
            int r3 = r4.f2844x
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = s4.AbstractC1305a.c(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            Q4.g r5 = r4.g(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.g.b(v4.j, int, O4.a):P4.g");
    }

    @Override // P4.InterfaceC0146g
    public Object d(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        Object objL = S3.a.l(new e(null, interfaceC0147h, this), interfaceC1427e);
        return objL == EnumC1481a.f13592w ? objL : C1316l.f12640a;
    }

    public String e() {
        return null;
    }

    public abstract Object f(O4.p pVar, InterfaceC1427e interfaceC1427e);

    public abstract g g(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar);

    public InterfaceC0146g h() {
        return null;
    }

    public O4.q i(InterfaceC0080z interfaceC0080z) {
        int i6 = this.f2844x;
        if (i6 == -3) {
            i6 = -2;
        }
        M4.A a6 = M4.A.f1834y;
        C4.p fVar = new f(this, null);
        O4.o oVar = new O4.o(AbstractC1305a.O(interfaceC0080z, this.f2843w), S3.a.a(i6, this.f2845y, 4));
        oVar.f0(a6, oVar, fVar);
        return oVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        C1433k c1433k = C1433k.f13309w;
        InterfaceC1432j interfaceC1432j = this.f2843w;
        if (interfaceC1432j != c1433k) {
            arrayList.add("context=" + interfaceC1432j);
        }
        int i6 = this.f2844x;
        if (i6 != -3) {
            arrayList.add("capacity=" + i6);
        }
        O4.a aVar = O4.a.f2342w;
        O4.a aVar2 = this.f2845y;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + t4.n.f0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
