package o0;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1213u0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public B0 f12121A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public T4.d f12122B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f12123C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public /* synthetic */ Object f12124D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ A0 f12125E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213u0(A0 a02, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12125E = a02;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1213u0) l((p1) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1213u0 c1213u0 = new C1213u0(this.f12125E, interfaceC1427e);
        c1213u0.f12124D = obj;
        return c1213u0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            w4.a r0 = w4.EnumC1481a.f13592w
            int r1 = r8.f12123C
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            o0.A0 r6 = r8.f12125E
            if (r1 == 0) goto L47
            if (r1 == r5) goto L30
            if (r1 == r4) goto L27
            if (r1 != r2) goto L1f
            T4.d r0 = r8.f12122B
            o0.B0 r1 = r8.f12121A
            java.lang.Object r2 = r8.f12124D
            o0.p1 r2 = (o0.p1) r2
            S3.a.O(r9)
            goto L98
        L1f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L27:
            java.lang.Object r1 = r8.f12124D
            o0.p1 r1 = (o0.p1) r1
            S3.a.O(r9)
            r9 = r1
            goto L83
        L30:
            T4.d r0 = r8.f12122B
            o0.B0 r0 = (o0.B0) r0
            o0.B0 r1 = r8.f12121A
            d.AbstractC0628i.p(r1)
            java.lang.Object r1 = r8.f12124D
            o0.p1 r1 = (o0.p1) r1
            S3.a.O(r9)
            o0.F0 r9 = r0.f11737b     // Catch: java.lang.Throwable -> L46
            r9.a(r3)     // Catch: java.lang.Throwable -> L46
            throw r3
        L46:
            throw r3
        L47:
            S3.a.O(r9)
            java.lang.Object r9 = r8.f12124D
            o0.p1 r9 = (o0.p1) r9
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f11727g
            r7 = 0
            boolean r1 = r1.compareAndSet(r7, r5)
            if (r1 == 0) goto Lb4
            o0.o0 r1 = new o0.o0
            r1.<init>(r6, r9, r3)
            S3.a.B(r9, r3, r3, r1, r2)
            r1 = 6
            O4.c r1 = S3.a.a(r7, r3, r1)
            o0.p0 r5 = new o0.p0
            r5.<init>(r6, r3, r1)
            S3.a.B(r9, r3, r3, r5, r2)
            o0.t0 r5 = new o0.t0
            r5.<init>(r6, r3, r1)
            S3.a.B(r9, r3, r3, r5, r2)
            r8.f12124D = r9
            r8.f12121A = r3
            r8.f12122B = r3
            r8.f12123C = r4
            java.lang.Object r1 = r6.f(r8)
            if (r1 != r0) goto L83
            return r0
        L83:
            o0.B0 r1 = r6.f11729i
            T4.d r4 = r1.f11736a
            r8.f12124D = r9
            r8.f12121A = r1
            r8.f12122B = r4
            r8.f12123C = r2
            java.lang.Object r2 = r4.d(r8)
            if (r2 != r0) goto L96
            return r0
        L96:
            r2 = r9
            r0 = r4
        L98:
            o0.F0 r9 = r1.f11737b     // Catch: java.lang.Throwable -> Laf
            i.c r9 = r9.f11760l     // Catch: java.lang.Throwable -> Laf
            o0.I r1 = o0.I.f11772w     // Catch: java.lang.Throwable -> Laf
            o0.G r9 = r9.q(r1)     // Catch: java.lang.Throwable -> Laf
            r0.f(r3)
            boolean r9 = r9 instanceof o0.C1168D
            if (r9 != 0) goto Lac
            o0.A0.d(r6, r2)
        Lac:
            s4.l r9 = s4.C1316l.f12640a
            return r9
        Laf:
            r9 = move-exception
            r0.f(r3)
            throw r9
        Lb4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C1213u0.n(java.lang.Object):java.lang.Object");
    }
}
