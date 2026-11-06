package P4;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends x4.h implements C4.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2714A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ InterfaceC0147h f2715B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ int f2716C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ n0 f2717D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, InterfaceC1427e interfaceC1427e) {
        super(3, interfaceC1427e);
        this.f2717D = n0Var;
    }

    @Override // C4.q
    public final Object g(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        l0 l0Var = new l0(this.f2717D, (InterfaceC1427e) obj3);
        l0Var.f2715B = (InterfaceC0147h) obj;
        l0Var.f2716C = iIntValue;
        return l0Var.n(C1316l.f12640a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            w4.a r0 = w4.EnumC1481a.f13592w
            int r1 = r10.f2714A
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            P4.n0 r7 = r10.f2717D
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            P4.h r1 = r10.f2715B
            S3.a.O(r11)
            goto L79
        L26:
            P4.h r1 = r10.f2715B
            S3.a.O(r11)
            goto L6c
        L2c:
            P4.h r1 = r10.f2715B
            S3.a.O(r11)
            goto L57
        L32:
            S3.a.O(r11)
            goto L87
        L36:
            S3.a.O(r11)
            P4.h r1 = r10.f2715B
            int r11 = r10.f2716C
            if (r11 <= 0) goto L4a
            P4.f0 r11 = P4.f0.f2685w
            r10.f2714A = r6
            java.lang.Object r11 = r1.k(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L4a:
            long r8 = r7.f2721a
            r10.f2715B = r1
            r10.f2714A = r5
            java.lang.Object r11 = s4.AbstractC1305a.v(r8, r10)
            if (r11 != r0) goto L57
            return r0
        L57:
            long r5 = r7.f2722b
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L79
            P4.f0 r11 = P4.f0.f2686x
            r10.f2715B = r1
            r10.f2714A = r4
            java.lang.Object r11 = r1.k(r11, r10)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            long r4 = r7.f2722b
            r10.f2715B = r1
            r10.f2714A = r3
            java.lang.Object r11 = s4.AbstractC1305a.v(r4, r10)
            if (r11 != r0) goto L79
            return r0
        L79:
            P4.f0 r11 = P4.f0.f2687y
            r3 = 0
            r10.f2715B = r3
            r10.f2714A = r2
            java.lang.Object r11 = r1.k(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L87:
            s4.l r11 = s4.C1316l.f12640a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.l0.n(java.lang.Object):java.lang.Object");
    }
}
