package Y;

import W.a0;
import f5.m;
import f5.w;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class b implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f4706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f4707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f4708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L3.c f4709d;

    public b(m mVar, w wVar, c cVar) {
        AbstractC1305a.o(mVar, "fileSystem");
        AbstractC1305a.o(wVar, "path");
        AbstractC1305a.o(cVar, "serializer");
        this.f4706a = mVar;
        this.f4707b = wVar;
        this.f4708c = cVar;
        this.f4709d = new L3.c(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a A[Catch: FileNotFoundException -> 0x008e, TRY_ENTER, TryCatch #0 {FileNotFoundException -> 0x008e, blocks: (B:43:0x008a, B:46:0x0092, B:20:0x0046), top: B:54:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[Catch: FileNotFoundException -> 0x008e, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x008e, blocks: (B:43:0x008a, B:46:0x0092, B:20:0x0046), top: B:54:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(Y.b r6, v4.InterfaceC1427e r7) {
        /*
            boolean r0 = r7 instanceof Y.a
            if (r0 == 0) goto L13
            r0 = r7
            Y.a r0 = (Y.a) r0
            int r1 = r0.f4704D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4704D = r1
            goto L18
        L13:
            Y.a r0 = new Y.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f4702B
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f4704D
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            f5.y r6 = r0.f4701A
            Y.b r0 = r0.f4705z
            S3.a.O(r7)     // Catch: java.lang.Throwable -> L2c
            goto L67
        L2c:
            r7 = move-exception
            goto L77
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            S3.a.O(r7)
            L3.c r7 = r6.f4709d
            java.lang.Object r7 = r7.f1734x
            java.util.concurrent.atomic.AtomicBoolean r7 = (java.util.concurrent.atomic.AtomicBoolean) r7
            boolean r7 = r7.get()
            r7 = r7 ^ r3
            if (r7 == 0) goto Lab
            f5.m r7 = r6.f4706a     // Catch: java.io.FileNotFoundException -> L8e
            f5.w r2 = r6.f4707b     // Catch: java.io.FileNotFoundException -> L8e
            f5.E r7 = r7.h(r2)     // Catch: java.io.FileNotFoundException -> L8e
            f5.y r7 = f2.h.d(r7)     // Catch: java.io.FileNotFoundException -> L8e
            Y.c r2 = r6.f4708c     // Catch: java.lang.Throwable -> L75
            r0.f4705z = r6     // Catch: java.lang.Throwable -> L75
            r0.f4701A = r7     // Catch: java.lang.Throwable -> L75
            r0.f4704D = r3     // Catch: java.lang.Throwable -> L75
            a0.k r2 = (a0.k) r2     // Catch: java.lang.Throwable -> L75
            a0.b r0 = r2.a(r7)     // Catch: java.lang.Throwable -> L75
            if (r0 != r1) goto L63
            return r1
        L63:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L67:
            if (r6 == 0) goto L6e
            r6.close()     // Catch: java.lang.Throwable -> L6d
            goto L6e
        L6d:
            r4 = move-exception
        L6e:
            r6 = r0
            goto L88
        L70:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L77
        L75:
            r0 = move-exception
            goto L70
        L77:
            if (r6 == 0) goto L84
            r6.close()     // Catch: java.lang.Throwable -> L7d
            goto L84
        L7d:
            r6 = move-exception
            s4.AbstractC1305a.b(r7, r6)     // Catch: java.io.FileNotFoundException -> L82
            goto L84
        L82:
            r6 = move-exception
            goto L93
        L84:
            r6 = r0
            r5 = r4
            r4 = r7
            r7 = r5
        L88:
            if (r4 != 0) goto L92
            s4.AbstractC1305a.l(r7)     // Catch: java.io.FileNotFoundException -> L8e
            goto La9
        L8e:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L93
        L92:
            throw r4     // Catch: java.io.FileNotFoundException -> L8e
        L93:
            f5.m r7 = r0.f4706a
            f5.w r1 = r0.f4707b
            boolean r7 = r7.d(r1)
            if (r7 != 0) goto Laa
            Y.c r6 = r0.f4708c
            a0.k r6 = (a0.k) r6
            r6.getClass()
            a0.b r7 = new a0.b
            r7.<init>(r3)
        La9:
            return r7
        Laa:
            throw r6
        Lab:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This scope has already been closed."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.b.a(Y.b, v4.e):java.lang.Object");
    }

    @Override // W.InterfaceC0182a
    public final void close() {
        ((AtomicBoolean) this.f4709d.f1734x).set(true);
    }
}
