package com.onesignal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.onesignal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0598v implements H2.o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f7985x;

    public C0598v() {
        this.f7985x = new Handler(Looper.getMainLooper(), new l1.I(0));
    }

    public synchronized void a(l1.F f6, boolean z5) {
        try {
            if (this.f7984w || z5) {
                ((Handler) this.f7985x).obtainMessage(1, f6).sendToTarget();
            } else {
                this.f7984w = true;
                f6.f();
                this.f7984w = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    @Override // H2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N.C0 f(android.view.View r11, N.C0 r12, v0.C1389b0 r13) {
        /*
            r10 = this;
            N.A0 r0 = r12.f1943a
            r1 = 7
            G.c r1 = r0.f(r1)
            r2 = 32
            G.c r0 = r0.f(r2)
            java.lang.Object r2 = r10.f7985x
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r3 = r1.f642b
            r2.f7105w = r3
            boolean r3 = f2.h.w(r11)
            int r4 = r11.getPaddingBottom()
            int r5 = r11.getPaddingLeft()
            int r6 = r11.getPaddingRight()
            boolean r7 = r2.f7097o
            if (r7 == 0) goto L32
            int r4 = r12.a()
            r2.f7104v = r4
            int r7 = r13.f13087d
            int r4 = r4 + r7
        L32:
            boolean r7 = r2.f7098p
            int r8 = r1.f641a
            if (r7 == 0) goto L40
            if (r3 == 0) goto L3d
            int r5 = r13.f13086c
            goto L3f
        L3d:
            int r5 = r13.f13084a
        L3f:
            int r5 = r5 + r8
        L40:
            boolean r7 = r2.f7099q
            int r9 = r1.f643c
            if (r7 == 0) goto L4f
            if (r3 == 0) goto L4b
            int r13 = r13.f13084a
            goto L4d
        L4b:
            int r13 = r13.f13086c
        L4d:
            int r6 = r13 + r9
        L4f:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r3 = r2.f7101s
            r7 = 1
            if (r3 == 0) goto L62
            int r3 = r13.leftMargin
            if (r3 == r8) goto L62
            r13.leftMargin = r8
            r3 = r7
            goto L63
        L62:
            r3 = 0
        L63:
            boolean r8 = r2.f7102t
            if (r8 == 0) goto L6e
            int r8 = r13.rightMargin
            if (r8 == r9) goto L6e
            r13.rightMargin = r9
            goto L6f
        L6e:
            r7 = r3
        L6f:
            boolean r3 = r2.f7103u
            if (r3 == 0) goto L7c
            int r3 = r13.topMargin
            int r1 = r1.f642b
            if (r3 == r1) goto L7c
            r13.topMargin = r1
            goto L7e
        L7c:
            if (r7 == 0) goto L81
        L7e:
            r11.setLayoutParams(r13)
        L81:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r5, r13, r6, r4)
            boolean r11 = r10.f7984w
            if (r11 == 0) goto L90
            int r13 = r0.f644d
            r2.f7095m = r13
        L90:
            boolean r13 = r2.f7097o
            if (r13 != 0) goto L96
            if (r11 == 0) goto L99
        L96:
            r2.O()
        L99:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C0598v.f(android.view.View, N.C0, v0.b0):N.C0");
    }

    public /* synthetic */ C0598v(Object obj, boolean z5) {
        this.f7985x = obj;
        this.f7984w = z5;
    }
}
