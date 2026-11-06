package W;

import M4.C0070o;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T4.d f4093a = T4.e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0070o f4094b = S3.a.b();

    public abstract Object a(InterfaceC1427e interfaceC1427e);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(v4.InterfaceC1427e r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof W.b0
            if (r0 == 0) goto L13
            r0 = r9
            W.b0 r0 = (W.b0) r0
            int r1 = r0.f4091D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4091D = r1
            goto L18
        L13:
            W.b0 r0 = new W.b0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f4089B
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f4091D
            s4.l r3 = s4.C1316l.f12640a
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r5) goto L33
            T4.a r1 = r0.f4088A
            W.c0 r0 = r0.f4092z
            S3.a.O(r9)     // Catch: java.lang.Throwable -> L31
            goto L83
        L31:
            r9 = move-exception
            goto L91
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            T4.a r2 = r0.f4088A
            W.c0 r7 = r0.f4092z
            S3.a.O(r9)
            r9 = r2
            goto L63
        L44:
            S3.a.O(r9)
            M4.o r9 = r8.f4094b
            java.lang.Object r9 = r9.K()
            boolean r9 = r9 instanceof M4.V
            r9 = r9 ^ r4
            if (r9 == 0) goto L53
            return r3
        L53:
            r0.f4092z = r8
            T4.d r9 = r8.f4093a
            r0.f4088A = r9
            r0.f4091D = r4
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L62
            return r1
        L62:
            r7 = r8
        L63:
            M4.o r2 = r7.f4094b     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = r2.K()     // Catch: java.lang.Throwable -> L8e
            boolean r2 = r2 instanceof M4.V     // Catch: java.lang.Throwable -> L8e
            r2 = r2 ^ r4
            if (r2 == 0) goto L74
            T4.d r9 = (T4.d) r9
            r9.f(r6)
            return r3
        L74:
            r0.f4092z = r7     // Catch: java.lang.Throwable -> L8e
            r0.f4088A = r9     // Catch: java.lang.Throwable -> L8e
            r0.f4091D = r5     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r7.a(r0)     // Catch: java.lang.Throwable -> L8e
            if (r0 != r1) goto L81
            return r1
        L81:
            r1 = r9
            r0 = r7
        L83:
            M4.o r9 = r0.f4094b     // Catch: java.lang.Throwable -> L31
            r9.S(r3)     // Catch: java.lang.Throwable -> L31
            T4.d r1 = (T4.d) r1
            r1.f(r6)
            return r3
        L8e:
            r0 = move-exception
            r1 = r9
            r9 = r0
        L91:
            T4.d r1 = (T4.d) r1
            r1.f(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: W.c0.b(v4.e):java.lang.Object");
    }
}
