package R4;

import M4.B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3025w = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3026x = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3027y = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((R4.r) r6).f3038a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final R4.k f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = R4.k.f3026x
            java.lang.Object r1 = r0.get(r9)
            R4.k r1 = (R4.k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = R4.k.f3025w
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof R4.q
            if (r7 == 0) goto L38
            R4.q r6 = (R4.q) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof R4.r
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            R4.r r6 = (R4.r) r6
            R4.k r6 = r6.f3038a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            R4.k r3 = (R4.k) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            s4.AbstractC1305a.m(r6, r4)
            r4 = r6
            R4.k r4 = (R4.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.k.f():R4.k");
    }

    public final void g(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3026x;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (h() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (j()) {
                kVar.f();
                return;
            }
            return;
        }
    }

    public final Object h() {
        while (true) {
            Object obj = f3025w.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k i() {
        k kVar;
        Object objH = h();
        r rVar = objH instanceof r ? (r) objH : null;
        if (rVar != null && (kVar = rVar.f3038a) != null) {
            return kVar;
        }
        AbstractC1305a.m(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) objH;
    }

    public boolean j() {
        return h() instanceof r;
    }

    public String toString() {
        return new j(this, B.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + B.d(this);
    }
}
