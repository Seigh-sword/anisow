package s1;

import android.content.Context;
import f2.InterfaceC0699c;
import s3.InterfaceC1304a;

/* JADX INFO: renamed from: s1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1291A implements InterfaceC0699c, InterfaceC1304a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12541x;

    public C1291A(int i6) {
        this.f12540w = 1;
        this.f12541x = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // s3.InterfaceC1304a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.StackTraceElement[] a(java.lang.StackTraceElement[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f12540w
            int r3 = r0.f12541x
            switch(r2) {
                case 2: goto L74;
                default: goto Lb;
            }
        Lb:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r5 = r1.length
            java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r5]
            r6 = 1
            r9 = r6
            r7 = 0
            r8 = 0
        L17:
            int r10 = r1.length
            if (r7 >= r10) goto L69
            r10 = r1[r7]
            java.lang.Object r11 = r2.get(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L57
            int r12 = r11.intValue()
            int r13 = r7 - r12
            int r14 = r7 + r13
            int r15 = r1.length
            if (r14 <= r15) goto L30
            goto L57
        L30:
            r14 = 0
        L31:
            if (r14 >= r13) goto L45
            int r15 = r12 + r14
            r15 = r1[r15]
            int r16 = r7 + r14
            r4 = r1[r16]
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L42
            goto L57
        L42:
            int r14 = r14 + 1
            goto L31
        L45:
            int r4 = r11.intValue()
            int r4 = r7 - r4
            if (r9 >= r3) goto L53
            java.lang.System.arraycopy(r1, r7, r5, r8, r4)
            int r8 = r8 + r4
            int r9 = r9 + 1
        L53:
            int r4 = r4 + (-1)
            int r4 = r4 + r7
            goto L5f
        L57:
            r4 = r1[r7]
            r5[r8] = r4
            int r8 = r8 + 1
            r9 = r6
            r4 = r7
        L5f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.put(r10, r7)
            int r7 = r4 + 1
            goto L17
        L69:
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r8]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r2, r3, r8)
            int r3 = r1.length
            if (r8 >= r3) goto L73
            r1 = r2
        L73:
            return r1
        L74:
            int r2 = r1.length
            if (r2 > r3) goto L78
            goto L88
        L78:
            int r2 = r3 / 2
            int r4 = r3 - r2
            java.lang.StackTraceElement[] r3 = new java.lang.StackTraceElement[r3]
            r5 = 0
            java.lang.System.arraycopy(r1, r5, r3, r5, r4)
            int r5 = r1.length
            int r5 = r5 - r2
            java.lang.System.arraycopy(r1, r5, r3, r4, r2)
            r1 = r3
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.C1291A.a(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // f2.InterfaceC0699c
    public final int e(Context context, String str) {
        return this.f12541x;
    }

    @Override // f2.InterfaceC0699c
    public final int g(Context context, String str, boolean z5) {
        return 0;
    }

    public /* synthetic */ C1291A(int i6, int i7) {
        this.f12540w = i7;
        this.f12541x = i6;
    }
}
