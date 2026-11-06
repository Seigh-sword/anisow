package o0;

import M4.InterfaceC0080z;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public O4.b f12038A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12039B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f12040C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0147h f12041D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C4.p f12042E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(InterfaceC0147h interfaceC0147h, C4.p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12041D = interfaceC0147h;
        this.f12042E = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((n1) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        n1 n1Var = new n1(this.f12041D, this.f12042E, interfaceC1427e);
        n1Var.f12040C = obj;
        return n1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0072 -> B:7:0x0016). Please report as a decompilation issue!!! */
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            w4.a r0 = w4.EnumC1481a.f13592w
            int r1 = r8.f12039B
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            O4.b r1 = r8.f12038A
            java.lang.Object r5 = r8.f12040C
            M4.b0 r5 = (M4.b0) r5
            S3.a.O(r9)
        L16:
            r9 = r5
            r5 = r1
            goto L49
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            O4.b r1 = r8.f12038A
            java.lang.Object r5 = r8.f12040C
            M4.b0 r5 = (M4.b0) r5
            S3.a.O(r9)
            goto L5a
        L2b:
            S3.a.O(r9)
            java.lang.Object r9 = r8.f12040C
            M4.z r9 = (M4.InterfaceC0080z) r9
            r1 = 0
            r5 = 6
            O4.c r1 = S3.a.a(r1, r2, r5)
            o0.m1 r5 = new o0.m1
            C4.p r6 = r8.f12042E
            r5.<init>(r1, r6, r2)
            r6 = 3
            M4.r0 r9 = S3.a.B(r9, r2, r2, r5, r6)
            O4.b r5 = new O4.b
            r5.<init>(r1)
        L49:
            r8.f12040C = r9
            r8.f12038A = r5
            r8.f12039B = r4
            java.lang.Object r1 = r5.b(r8)
            if (r1 != r0) goto L56
            return r0
        L56:
            r7 = r5
            r5 = r9
            r9 = r1
            r1 = r7
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L75
            java.lang.Object r9 = r1.c()
            r8.f12040C = r5
            r8.f12038A = r1
            r8.f12039B = r3
            P4.h r6 = r8.f12041D
            java.lang.Object r9 = r6.k(r9, r8)
            if (r9 != r0) goto L16
            return r0
        L75:
            r5.b(r2)
            s4.l r9 = s4.C1316l.f12640a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.n1.n(java.lang.Object):java.lang.Object");
    }
}
