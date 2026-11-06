package Q4;

import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC0146g f2849z;

    public i(int i6, InterfaceC1432j interfaceC1432j, O4.a aVar, InterfaceC0146g interfaceC0146g) {
        super(interfaceC1432j, i6, aVar);
        this.f2849z = interfaceC0146g;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    @Override // Q4.g, P4.InterfaceC0146g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(P4.InterfaceC0147h r7, v4.InterfaceC1427e r8) {
        /*
            r6 = this;
            s4.l r0 = s4.C1316l.f12640a
            int r1 = r6.f2844x
            r2 = -3
            w4.a r3 = w4.EnumC1481a.f13592w
            if (r1 != r2) goto L6c
            v4.j r1 = r8.i()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            M4.t r4 = M4.C0074t.f1920z
            v4.j r5 = r6.f2843w
            java.lang.Object r2 = r5.g(r2, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L24
            v4.j r2 = r1.k(r5)
            goto L29
        L24:
            r2 = 0
            v4.j r2 = s4.AbstractC1305a.B(r1, r5, r2)
        L29:
            boolean r4 = s4.AbstractC1305a.c(r2, r1)
            if (r4 == 0) goto L37
            java.lang.Object r7 = r6.j(r7, r8)
            if (r7 != r3) goto L73
        L35:
            r0 = r7
            goto L73
        L37:
            v4.f r4 = v4.C1428f.f13308w
            v4.h r5 = r2.n(r4)
            v4.h r1 = r1.n(r4)
            boolean r1 = s4.AbstractC1305a.c(r5, r1)
            if (r1 == 0) goto L6c
            v4.j r1 = r8.i()
            boolean r4 = r7 instanceof Q4.z
            if (r4 == 0) goto L50
            goto L5b
        L50:
            boolean r4 = r7 instanceof Q4.u
            if (r4 == 0) goto L55
            goto L5b
        L55:
            P4.e r4 = new P4.e
            r4.<init>(r7, r1)
            r7 = r4
        L5b:
            Q4.h r1 = new Q4.h
            r4 = 0
            r1.<init>(r6, r4)
            java.lang.Object r4 = R4.a.e(r2)
            java.lang.Object r7 = s4.AbstractC1305a.Z(r2, r7, r4, r1, r8)
            if (r7 != r3) goto L73
            goto L35
        L6c:
            java.lang.Object r7 = super.d(r7, r8)
            if (r7 != r3) goto L73
            goto L35
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.i.d(P4.h, v4.e):java.lang.Object");
    }

    @Override // Q4.g
    public final Object f(O4.p pVar, InterfaceC1427e interfaceC1427e) {
        Object objJ = j(new z(pVar), interfaceC1427e);
        return objJ == EnumC1481a.f13592w ? objJ : C1316l.f12640a;
    }

    public abstract Object j(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e);

    @Override // Q4.g
    public final String toString() {
        return this.f2849z + " -> " + super.toString();
    }
}
