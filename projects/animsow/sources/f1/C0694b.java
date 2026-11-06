package f1;

import o0.C1175b1;
import o0.e1;
import o0.f1;

/* JADX INFO: renamed from: f1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0694b extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8385b;

    public C0694b(int i6) {
        this.f8385b = i6;
    }

    @Override // o0.e1
    public final Integer a(f1 f1Var) {
        Integer num;
        int iIntValue;
        Integer num2;
        Integer num3 = f1Var.f11934b;
        if (num3 == null) {
            return null;
        }
        int iIntValue2 = num3.intValue();
        C1175b1 c1175b1A = f1Var.a(iIntValue2);
        if (c1175b1A == null || (num2 = (Integer) c1175b1A.f11898x) == null) {
            C1175b1 c1175b1A2 = f1Var.a(iIntValue2);
            if (c1175b1A2 == null || (num = (Integer) c1175b1A2.f11899y) == null) {
                return null;
            }
            iIntValue = num.intValue() - 1;
        } else {
            iIntValue = num2.intValue() + 1;
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(o0.Z0 r11, v4.InterfaceC1427e r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof f1.C0693a
            if (r0 == 0) goto L13
            r0 = r12
            f1.a r0 = (f1.C0693a) r0
            int r1 = r0.f8383C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8383C = r1
            goto L18
        L13:
            f1.a r0 = new f1.a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f8381A
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f8383C
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r11 = r0.f8384z
            S3.a.O(r12)     // Catch: java.lang.Exception -> L29
            goto L55
        L29:
            r11 = move-exception
            goto L82
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            S3.a.O(r12)
            java.lang.Object r11 = r11.a()
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L43
            int r11 = r11.intValue()
            goto L44
        L43:
            r11 = r3
        L44:
            e1.c r12 = e1.AbstractC0660a.f8255a     // Catch: java.lang.Exception -> L29
            int r12 = r10.f8385b     // Catch: java.lang.Exception -> L29
            r0.f8384z = r11     // Catch: java.lang.Exception -> L29
            r0.f8383C = r3     // Catch: java.lang.Exception -> L29
            e1.c r2 = e1.AbstractC0660a.f8255a     // Catch: java.lang.Exception -> L29
            java.lang.Object r12 = r2.c(r12, r11, r0)     // Catch: java.lang.Exception -> L29
            if (r12 != r1) goto L55
            return r1
        L55:
            com.android.app.network.responses.PostsResponse r12 = (com.android.app.network.responses.PostsResponse) r12     // Catch: java.lang.Exception -> L29
            java.util.List r5 = r12.getPosts()     // Catch: java.lang.Exception -> L29
            o0.b1 r12 = new o0.b1     // Catch: java.lang.Exception -> L29
            r0 = 0
            if (r11 != r3) goto L62
            r6 = r0
            goto L6a
        L62:
            int r1 = r11 + (-1)
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L29
            r2.<init>(r1)     // Catch: java.lang.Exception -> L29
            r6 = r2
        L6a:
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Exception -> L29
            if (r1 == 0) goto L72
        L70:
            r7 = r0
            goto L79
        L72:
            int r11 = r11 + r3
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> L29
            r0.<init>(r11)     // Catch: java.lang.Exception -> L29
            goto L70
        L79:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L29
            return r12
        L82:
            f3.c r12 = m2.C0.h()
            r12.a(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "CategoryPagingSource ## "
            r12.<init>(r0)
            java.lang.String r0 = r11.getMessage()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            t0.AbstractC1332d.X(r12)
            o0.a1 r12 = new o0.a1
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.C0694b.c(o0.Z0, v4.e):java.lang.Object");
    }
}
