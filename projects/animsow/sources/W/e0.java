package W;

import M4.InterfaceC0080z;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C4.p f4104A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4105B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ P0.h f4106C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(P0.h hVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4106C = hVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((e0) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new e0(this.f4106C, interfaceC1427e);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:18:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            w4.a r0 = w4.EnumC1481a.f13592w
            int r1 = r6.f4105B
            r2 = 2
            r3 = 1
            P0.h r4 = r6.f4106C
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            S3.a.O(r7)
            goto L5c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            C4.p r1 = r6.f4104A
            S3.a.O(r7)
            goto L50
        L20:
            S3.a.O(r7)
            java.lang.Object r7 = r4.f2410d
            L3.c r7 = (L3.c) r7
            java.lang.Object r7 = r7.f1734x
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6d
        L31:
            java.lang.Object r7 = r4.f2407a
            M4.z r7 = (M4.InterfaceC0080z) r7
            v4.j r7 = r7.u()
            S3.a.o(r7)
            java.lang.Object r7 = r4.f2408b
            r1 = r7
            C4.p r1 = (C4.p) r1
            java.lang.Object r7 = r4.f2409c
            O4.g r7 = (O4.g) r7
            r6.f4104A = r1
            r6.f4105B = r3
            java.lang.Object r7 = r7.p(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = 0
            r6.f4104A = r5
            r6.f4105B = r2
            java.lang.Object r7 = r1.h(r7, r6)
            if (r7 != r0) goto L5c
            return r0
        L5c:
            java.lang.Object r7 = r4.f2410d
            L3.c r7 = (L3.c) r7
            java.lang.Object r7 = r7.f1734x
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L31
            s4.l r7 = s4.C1316l.f12640a
            return r7
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W.e0.n(java.lang.Object):java.lang.Object");
    }
}
