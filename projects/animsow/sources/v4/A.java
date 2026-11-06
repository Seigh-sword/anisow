package V4;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f3746A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f3747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Y4.i f3748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B f3749y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f3750z;

    public A(x xVar, B b6, boolean z5) {
        this.f3747w = xVar;
        this.f3749y = b6;
        this.f3750z = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V4.G a() throws java.lang.Throwable {
        /*
            r15 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            V4.x r0 = r15.f3747w
            java.util.List r2 = r0.f3976z
            r1.addAll(r2)
            Z4.a r2 = new Z4.a
            r10 = 1
            r2.<init>(r10, r0)
            r1.add(r2)
            Z4.a r2 = new Z4.a
            r11 = 0
            V4.j r3 = r0.f3955D
            r2.<init>(r11, r3)
            r1.add(r2)
            X4.a r2 = new X4.a
            r12 = 0
            r2.<init>(r11, r12)
            r1.add(r2)
            X4.a r2 = new X4.a
            r2.<init>(r10, r0)
            r1.add(r2)
            boolean r2 = r15.f3750z
            if (r2 != 0) goto L3a
            java.util.List r3 = r0.f3952A
            r1.addAll(r3)
        L3a:
            Z4.b r3 = new Z4.b
            r3.<init>(r2)
            r1.add(r3)
            Z4.f r13 = new Z4.f
            Y4.i r2 = r15.f3748x
            r3 = 0
            r4 = 0
            V4.B r14 = r15.f3749y
            int r7 = r0.f3969R
            int r8 = r0.f3970S
            int r9 = r0.f3971T
            r0 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            V4.G r0 = r13.a(r14)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            Y4.i r1 = r15.f3748x     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            if (r1 != 0) goto L68
            Y4.i r1 = r15.f3748x
            r1.f(r12)
            return r0
        L68:
            W4.b.c(r0)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
            throw r0     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L76
        L73:
            r0 = move-exception
            r10 = r11
            goto L7f
        L76:
            r0 = move-exception
            Y4.i r1 = r15.f3748x     // Catch: java.lang.Throwable -> L7e
            java.io.IOException r0 = r1.f(r0)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
        L7f:
            if (r10 != 0) goto L86
            Y4.i r1 = r15.f3748x
            r1.f(r12)
        L86:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.A.a():V4.G");
    }

    public final Object clone() {
        x xVar = this.f3747w;
        A a6 = new A(xVar, this.f3749y, this.f3750z);
        a6.f3748x = new Y4.i(xVar, a6);
        return a6;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3748x.d() ? "canceled " : "");
        sb.append(this.f3750z ? "web socket" : "call");
        sb.append(" to ");
        sb.append(this.f3749y.f3751a.k());
        return sb.toString();
    }
}
