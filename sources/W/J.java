package W;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class J extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f4027A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4028B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ boolean f4029C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ W f4030D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f4031E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(W w5, int i6, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4030D = w5;
        this.f4031E = i6;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((J) l(bool, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        J j6 = new J(this.f4030D, this.f4031E, interfaceC1427e);
        j6.f4029C = ((Boolean) obj).booleanValue();
        return j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            w4.a r0 = w4.EnumC1481a.f13592w
            int r1 = r6.f4028B
            W.W r2 = r6.f4030D
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.f4027A
            S3.a.O(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.f4029C
            S3.a.O(r7)
            goto L32
        L22:
            S3.a.O(r7)
            boolean r1 = r6.f4029C
            r6.f4029C = r1
            r6.f4028B = r4
            java.lang.Object r7 = r2.h(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4c
            W.i0 r1 = r2.f()
            r6.f4027A = r7
            r6.f4028B = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L43
            return r0
        L43:
            r0 = r7
            r7 = r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L51
        L4c:
            int r0 = r6.f4031E
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            W.d r1 = new W.d
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r1.<init>(r2, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W.J.n(java.lang.Object):java.lang.Object");
    }
}
