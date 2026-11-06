package O4;

import R4.u;
import j3.C0848A;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f2385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2386f;

    public k(long j6, k kVar, c cVar, int i6) {
        super(j6, kVar, i6);
        this.f2385e = cVar;
        this.f2386f = new AtomicReferenceArray(e.f2362b * 2);
    }

    @Override // R4.u
    public final int f() {
        return e.f2362b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        s4.AbstractC1305a.l(r5);
        r7 = r5.f2359x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        r7 = s4.AbstractC1305a.i(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
    
        S3.a.x(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return;
     */
    @Override // R4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r7, v4.InterfaceC1432j r8) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            int r0 = O4.e.f2362b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f2386f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof M4.y0
            r4 = 0
            O4.c r5 = r6.f2385e
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof O4.s
            if (r3 == 0) goto L22
            goto L71
        L22:
            j3.A r3 = O4.e.f2370j
            if (r2 == r3) goto L5b
            j3.A r3 = O4.e.f2371k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            j3.A r3 = O4.e.f2367g
            if (r2 == r3) goto L12
            j3.A r3 = O4.e.f2366f
            if (r2 != r3) goto L34
            goto L12
        L34:
            j3.A r7 = O4.e.f2369i
            if (r2 == r7) goto L5a
            j3.A r7 = O4.e.f2364d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            j3.A r7 = O4.e.f2372l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r4)
            if (r1 == 0) goto L70
            s4.AbstractC1305a.l(r5)
            C4.l r7 = r5.f2359x
            if (r7 == 0) goto L70
            h0.A r7 = s4.AbstractC1305a.i(r7, r0, r4)
            if (r7 == 0) goto L70
            S3.a.x(r8, r7)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            j3.A r3 = O4.e.f2370j
            goto L78
        L76:
            j3.A r3 = O4.e.f2371k
        L78:
            boolean r2 = r6.j(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r4)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            s4.AbstractC1305a.l(r5)
            C4.l r7 = r5.f2359x
            if (r7 == 0) goto L98
            h0.A r7 = s4.AbstractC1305a.i(r7, r0, r4)
            if (r7 == 0) goto L98
            S3.a.x(r8, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.k.g(int, v4.j):void");
    }

    public final boolean j(Object obj, int i6, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f2386f;
        int i7 = (i6 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i7, obj, obj2)) {
            if (atomicReferenceArray.get(i7) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i6) {
        return this.f2386f.get((i6 * 2) + 1);
    }

    public final void l(int i6, boolean z5) {
        if (z5) {
            c cVar = this.f2385e;
            AbstractC1305a.l(cVar);
            cVar.F((this.f3041c * ((long) e.f2362b)) + ((long) i6));
        }
        h();
    }

    public final void m(int i6, Object obj) {
        this.f2386f.set(i6 * 2, obj);
    }

    public final void n(int i6, C0848A c0848a) {
        this.f2386f.set((i6 * 2) + 1, c0848a);
    }
}
