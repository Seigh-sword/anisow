package com.onesignal;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0 f7636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThreadC0556g1 f7637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f7638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B0 f7639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7640e = false;

    public M0(D0 d02, B0 b02) {
        this.f7639d = b02;
        this.f7636a = d02;
        HandlerThreadC0556g1 handlerThreadC0556g1B = HandlerThreadC0556g1.b();
        this.f7637b = handlerThreadC0556g1B;
        D d6 = new D(2, this);
        this.f7638c = d6;
        handlerThreadC0556g1B.c(d6, 25000L);
    }

    public final synchronized void a(B0 b02) {
        this.f7637b.a(this.f7638c);
        if (this.f7640e) {
            AbstractC0603w1.b(EnumC0600v1.f7992B, "OSNotificationReceivedEvent already completed", null);
            return;
        }
        this.f7640e = true;
        if (OSUtils.p()) {
            new Thread(new RunnableC0570l0(this, 5, b02), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            b(b02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.onesignal.B0 r14) {
        /*
            r13 = this;
            com.onesignal.B0 r0 = r13.f7639d
            com.onesignal.B0 r0 = r0.a()
            if (r14 == 0) goto Ld
            com.onesignal.B0 r14 = r14.a()
            goto Le
        Ld:
            r14 = 0
        Le:
            r1 = 0
            r2 = 1
            com.onesignal.D0 r3 = r13.f7636a
            if (r14 == 0) goto L7b
            r3.getClass()
            java.lang.String r4 = r14.f7477h
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ r2
            com.onesignal.C r5 = com.onesignal.AbstractC0603w1.f8057w
            r5.getClass()
            java.lang.String r5 = com.onesignal.E1.f7517a
            java.lang.String r6 = "OS_RESTORE_TTL_FILTER"
            boolean r5 = com.onesignal.E1.b(r5, r6, r2)
            com.onesignal.I0 r6 = r3.f7506a
            if (r5 != 0) goto L31
        L2f:
            r5 = r2
            goto L4b
        L31:
            com.onesignal.t1 r5 = com.onesignal.AbstractC0603w1.f8056v
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            com.onesignal.B0 r5 = r6.f7582a
            long r9 = r5.f7495z
            int r5 = r5.f7469A
            long r11 = (long) r5
            long r9 = r9 + r11
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 <= 0) goto L4a
            goto L2f
        L4a:
            r5 = r1
        L4b:
            if (r4 == 0) goto L58
            if (r5 == 0) goto L58
            r6.b(r14)
            boolean r14 = r3.f7508c
            com.onesignal.AbstractC0571l1.M(r3, r14)
            goto L6b
        L58:
            r6.b(r0)
            boolean r14 = r3.f7507b
            if (r14 == 0) goto L63
            com.onesignal.AbstractC0571l1.E(r6)
            goto L6b
        L63:
            r6.f7586e = r1
            com.onesignal.AbstractC0571l1.N(r6, r2, r1)
            com.onesignal.AbstractC0603w1.z(r6)
        L6b:
            boolean r14 = r3.f7507b
            if (r14 == 0) goto L90
            r14 = 100
            long r0 = (long) r14
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L76
            goto L90
        L76:
            r14 = move-exception
            r14.printStackTrace()
            goto L90
        L7b:
            com.onesignal.I0 r14 = r3.f7506a
            r14.b(r0)
            boolean r0 = r3.f7507b
            if (r0 == 0) goto L88
            com.onesignal.AbstractC0571l1.E(r14)
            goto L90
        L88:
            r14.f7586e = r1
            com.onesignal.AbstractC0571l1.N(r14, r2, r1)
            com.onesignal.AbstractC0603w1.z(r14)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.M0.b(com.onesignal.B0):void");
    }

    public final String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.f7640e + ", notification=" + this.f7639d + '}';
    }
}
