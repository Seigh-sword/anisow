package W;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class V extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public D4.p f4064A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4065B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f4066C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ D4.p f4067D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ W f4068E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ Object f4069F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ boolean f4070G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(D4.p pVar, W w5, Object obj, boolean z5, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4067D = pVar;
        this.f4068E = w5;
        this.f4069F = obj;
        this.f4070G = z5;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((V) l((Y.k) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        V v5 = new V(this.f4067D, this.f4068E, this.f4069F, this.f4070G, interfaceC1427e);
        v5.f4066C = obj;
        return v5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            w4.a r0 = w4.EnumC1481a.f13592w
            int r1 = r8.f4065B
            java.lang.Object r2 = r8.f4069F
            W.W r3 = r8.f4068E
            D4.p r4 = r8.f4067D
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            S3.a.O(r9)
            goto L65
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            D4.p r1 = r8.f4064A
            java.lang.Object r6 = r8.f4066C
            Y.k r6 = (Y.k) r6
            S3.a.O(r9)
            goto L4f
        L28:
            S3.a.O(r9)
            java.lang.Object r9 = r8.f4066C
            Y.k r9 = (Y.k) r9
            W.i0 r1 = r3.f()
            r8.f4066C = r9
            r8.f4064A = r4
            r8.f4065B = r6
            L3.c r1 = r1.f4131b
            java.lang.Object r1 = r1.f1734x
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r1 = r4
            r7 = r6
            r6 = r9
            r9 = r7
        L4f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f375w = r9
            r9 = 0
            r8.f4066C = r9
            r8.f4064A = r9
            r8.f4065B = r5
            java.lang.Object r9 = r6.b(r2, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            boolean r9 = r8.f4070G
            if (r9 == 0) goto L7d
            S0.f r9 = r3.f4077g
            W.d r0 = new W.d
            if (r2 == 0) goto L74
            int r1 = r2.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r3 = r4.f375w
            r0.<init>(r1, r3, r2)
            r9.H(r0)
        L7d:
            s4.l r9 = s4.C1316l.f12640a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: W.V.n(java.lang.Object):java.lang.Object");
    }
}
