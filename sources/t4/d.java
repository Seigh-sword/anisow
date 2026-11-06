package T4;

import M4.B;
import M4.C0063h;
import j3.C0848A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3550h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z5) {
        super(z5 ? 1 : 0);
        this.owner$volatile = z5 ? null : e.f3551a;
    }

    public final boolean c() {
        return Math.max(h.f3558g.get(this), 0) == 0;
    }

    public final Object d(InterfaceC1427e interfaceC1427e) {
        boolean zE = e(null);
        C1316l c1316l = C1316l.f12640a;
        if (zE) {
            return c1316l;
        }
        C0063h c0063hV = S3.a.v(AbstractC1305a.H(interfaceC1427e));
        try {
            a(new c(this, c0063hV));
            Object objU = c0063hV.u();
            EnumC1481a enumC1481a = EnumC1481a.f13592w;
            if (objU != enumC1481a) {
                objU = c1316l;
            }
            return objU == enumC1481a ? objU : c1316l;
        } catch (Throwable th) {
            c0063hV.C();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.Object r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = T4.h.f3558g
            int r1 = r0.get(r7)
            int r2 = r7.f3559a
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            r2 = 1
            r3 = 2
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = T4.d.f3550h
            if (r1 > 0) goto L3e
            if (r8 != 0) goto L22
        L20:
            r0 = r2
            goto L4a
        L22:
            boolean r0 = r7.c()
            if (r0 != 0) goto L2a
            r0 = r4
            goto L37
        L2a:
            java.lang.Object r0 = r5.get(r7)
            j3.A r1 = T4.e.f3551a
            if (r0 == r1) goto L22
            if (r0 != r8) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            if (r0 == r2) goto L3c
            if (r0 == r3) goto L20
            goto L0
        L3c:
            r0 = r3
            goto L4a
        L3e:
            int r6 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r6)
            if (r0 == 0) goto L0
            r5.set(r7, r8)
            r0 = r4
        L4a:
            if (r0 == 0) goto L75
            if (r0 == r2) goto L74
            if (r0 == r3) goto L5c
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L74:
            r2 = r4
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.d.e(java.lang.Object):boolean");
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3550h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0848A c0848a = e.f3551a;
            if (obj2 != c0848a) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0848a)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + B.d(this) + "[isLocked=" + c() + ",owner=" + f3550h.get(this) + ']';
    }
}
