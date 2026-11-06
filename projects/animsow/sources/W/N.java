package W;

import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class N extends x4.h implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f4043A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4044B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ W f4045C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1432j f4046D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C4.p f4047E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(W w5, InterfaceC1432j interfaceC1432j, C4.p pVar, InterfaceC1427e interfaceC1427e) {
        super(1, interfaceC1427e);
        this.f4045C = w5;
        this.f4046D = interfaceC1432j;
        this.f4047E = pVar;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        return new N(this.f4045C, this.f4046D, this.f4047E, (InterfaceC1427e) obj).n(C1316l.f12640a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            w4.a r0 = w4.EnumC1481a.f13592w
            int r1 = r8.f4044B
            W.W r2 = r8.f4045C
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r0 = r8.f4043A
            S3.a.O(r9)
            goto L71
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f4043A
            W.d r1 = (W.C0185d) r1
            S3.a.O(r9)
            goto L4f
        L27:
            S3.a.O(r9)
            goto L37
        L2b:
            S3.a.O(r9)
            r8.f4044B = r5
            java.lang.Object r9 = W.W.e(r2, r5, r8)
            if (r9 != r0) goto L37
            return r0
        L37:
            r1 = r9
            W.d r1 = (W.C0185d) r1
            W.M r9 = new W.M
            C4.p r6 = r8.f4047E
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.f4043A = r1
            r8.f4044B = r4
            v4.j r4 = r8.f4046D
            java.lang.Object r9 = S3.a.U(r8, r4, r9)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            java.lang.Object r4 = r1.f4095b
            if (r4 == 0) goto L58
            int r4 = r4.hashCode()
            goto L59
        L58:
            r4 = 0
        L59:
            int r6 = r1.f4096c
            if (r4 != r6) goto L73
            java.lang.Object r1 = r1.f4095b
            boolean r1 = s4.AbstractC1305a.c(r1, r9)
            if (r1 != 0) goto L72
            r8.f4043A = r9
            r8.f4044B = r3
            java.lang.Object r1 = r2.i(r9, r5, r8)
            if (r1 != r0) goto L70
            return r0
        L70:
            r0 = r9
        L71:
            r9 = r0
        L72:
            return r9
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: W.N.n(java.lang.Object):java.lang.Object");
    }
}
