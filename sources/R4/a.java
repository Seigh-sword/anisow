package R4;

import M4.t0;
import d.AbstractC0628i;
import j3.C0848A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0848A f3001a = new C0848A(2, "NO_DECISION");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0848A f3002b = new C0848A(2, "CLOSED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0848A f3003c = new C0848A(2, "UNDEFINED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0848A f3004d = new C0848A(2, "REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0848A f3005e = new C0848A(2, "CONDITION_FALSE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0848A f3006f = new C0848A(2, "NO_THREAD_ELEMENTS");

    public static final Object a(u uVar, long j6, C4.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f3041c >= j6 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f3009a.get(uVar);
            C0848A c0848a = f3002b;
            if (obj == c0848a) {
                return c0848a;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.h(Long.valueOf(uVar.f3041c + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f3009a;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final void b(InterfaceC1432j interfaceC1432j, Object obj) {
        if (obj == f3006f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object objG = interfaceC1432j.g(null, x.f3046z);
            AbstractC1305a.m(objG, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0628i.p(objG);
            throw null;
        }
        z zVar = (z) obj;
        t0[] t0VarArr = zVar.f3051b;
        int length = t0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        t0 t0Var = t0VarArr[length];
        AbstractC1305a.l(null);
        Object obj2 = zVar.f3050a[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: all -> 0x0074, DONT_GENERATE, TryCatch #2 {all -> 0x0074, blocks: (B:17:0x004f, B:19:0x005d, B:21:0x0063, B:34:0x0098, B:24:0x0076, B:26:0x0084, B:31:0x008f, B:33:0x0095, B:39:0x00a5, B:42:0x00ae, B:41:0x00ab, B:29:0x008a), top: B:54:0x004f, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(v4.InterfaceC1427e r6, java.lang.Object r7, C4.l r8) {
        /*
            boolean r0 = r6 instanceof R4.h
            if (r0 == 0) goto Lb8
            R4.h r6 = (R4.h) r6
            java.lang.Throwable r0 = s4.AbstractC1313i.a(r7)
            if (r0 != 0) goto L16
            if (r8 == 0) goto L14
            M4.s r0 = new M4.s
            r0.<init>(r7, r8)
            goto L1d
        L14:
            r0 = r7
            goto L1d
        L16:
            M4.r r8 = new M4.r
            r1 = 0
            r8.<init>(r0, r1)
            r0 = r8
        L1d:
            v4.e r8 = r6.f3015A
            r8.i()
            M4.w r1 = r6.f3018z
            boolean r2 = r1.L()
            r3 = 1
            if (r2 == 0) goto L38
            r6.f3016B = r0
            r6.f1850y = r3
            v4.j r7 = r8.i()
            r1.J(r7, r6)
            goto Lbb
        L38:
            M4.Q r1 = M4.u0.a()
            boolean r2 = r1.Q()
            if (r2 == 0) goto L4b
            r6.f3016B = r0
            r6.f1850y = r3
            r1.N(r6)
            goto Lbb
        L4b:
            r1.P(r3)
            r2 = 0
            v4.j r4 = r8.i()     // Catch: java.lang.Throwable -> L74
            M4.x r5 = M4.C0078x.f1930x     // Catch: java.lang.Throwable -> L74
            v4.h r4 = r4.n(r5)     // Catch: java.lang.Throwable -> L74
            M4.b0 r4 = (M4.b0) r4     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L76
            boolean r5 = r4.c()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto L76
            M4.k0 r4 = (M4.k0) r4     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.CancellationException r7 = r4.F()     // Catch: java.lang.Throwable -> L74
            r6.b(r0, r7)     // Catch: java.lang.Throwable -> L74
            s4.h r7 = S3.a.m(r7)     // Catch: java.lang.Throwable -> L74
            r6.o(r7)     // Catch: java.lang.Throwable -> L74
            goto L98
        L74:
            r7 = move-exception
            goto Laf
        L76:
            java.lang.Object r0 = r6.f3017C     // Catch: java.lang.Throwable -> L74
            v4.j r4 = r8.i()     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = f(r4, r0)     // Catch: java.lang.Throwable -> L74
            j3.A r5 = R4.a.f3006f     // Catch: java.lang.Throwable -> L74
            if (r0 == r5) goto L89
            M4.w0 r5 = s4.AbstractC1305a.Y(r8, r4, r0)     // Catch: java.lang.Throwable -> L74
            goto L8a
        L89:
            r5 = r2
        L8a:
            r8.o(r7)     // Catch: java.lang.Throwable -> La2
            if (r5 == 0) goto L95
            boolean r7 = r5.g0()     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L98
        L95:
            b(r4, r0)     // Catch: java.lang.Throwable -> L74
        L98:
            boolean r7 = r1.S()     // Catch: java.lang.Throwable -> L74
            if (r7 != 0) goto L98
        L9e:
            r1.M(r3)
            goto Lbb
        La2:
            r7 = move-exception
            if (r5 == 0) goto Lab
            boolean r8 = r5.g0()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto Lae
        Lab:
            b(r4, r0)     // Catch: java.lang.Throwable -> L74
        Lae:
            throw r7     // Catch: java.lang.Throwable -> L74
        Laf:
            r6.h(r7, r2)     // Catch: java.lang.Throwable -> Lb3
            goto L9e
        Lb3:
            r6 = move-exception
            r1.M(r3)
            throw r6
        Lb8:
            r6.o(r7)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.a.c(v4.e, java.lang.Object, C4.l):void");
    }

    public static final Object e(InterfaceC1432j interfaceC1432j) {
        Object objG = interfaceC1432j.g(0, x.f3045y);
        AbstractC1305a.l(objG);
        return objG;
    }

    public static final Object f(InterfaceC1432j interfaceC1432j, Object obj) {
        if (obj == null) {
            obj = e(interfaceC1432j);
        }
        if (obj == 0) {
            return f3006f;
        }
        if (obj instanceof Integer) {
            return interfaceC1432j.g(new z(interfaceC1432j, ((Number) obj).intValue()), x.f3044A);
        }
        AbstractC0628i.p(obj);
        throw null;
    }
}
