package W;

import P4.C0150k;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T4.d f4130a = T4.e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L3.c f4131b = new L3.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0150k f4132c = new C0150k(new h0(2, null));

    public i0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f4131b.f1734x).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(C4.l r8, v4.InterfaceC1427e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof W.f0
            if (r0 == 0) goto L13
            r0 = r9
            W.f0 r0 = (W.f0) r0
            int r1 = r0.f4115D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4115D = r1
            goto L18
        L13:
            W.f0 r0 = new W.f0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f4113B
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f4115D
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f4116z
            T4.a r8 = (T4.a) r8
            S3.a.O(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            T4.d r8 = r0.f4112A
            java.lang.Object r2 = r0.f4116z
            C4.l r2 = (C4.l) r2
            S3.a.O(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            S3.a.O(r9)
            r0.f4116z = r8
            T4.d r9 = r7.f4130a
            r0.f4112A = r9
            r0.f4115D = r4
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r0.f4116z = r9     // Catch: java.lang.Throwable -> L6d
            r0.f4112A = r5     // Catch: java.lang.Throwable -> L6d
            r0.f4115D = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.j(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            T4.d r8 = (T4.d) r8
            r8.f(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            T4.d r8 = (T4.d) r8
            r8.f(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: W.i0.b(C4.l, v4.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(C4.p r7, v4.InterfaceC1427e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof W.g0
            if (r0 == 0) goto L13
            r0 = r8
            W.g0 r0 = (W.g0) r0
            int r1 = r0.f4121D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4121D = r1
            goto L18
        L13:
            W.g0 r0 = new W.g0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f4119B
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f4121D
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f4118A
            T4.d r0 = r0.f4122z
            S3.a.O(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            S3.a.O(r8)
            T4.d r8 = r6.f4130a
            boolean r2 = r8.e(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f4122z = r8     // Catch: java.lang.Throwable -> L59
            r0.f4118A = r2     // Catch: java.lang.Throwable -> L59
            r0.f4121D = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.h(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.f(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.f(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: W.i0.c(C4.p, v4.e):java.lang.Object");
    }
}
