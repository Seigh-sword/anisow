package com.onesignal;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThreadC0556g1 f7618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K0 f7619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B0 f7620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X1 f7621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7622e = false;

    public L0(B0 b02, X1 x12) {
        this.f7620c = b02;
        this.f7621d = x12;
        HandlerThreadC0556g1 handlerThreadC0556g1B = HandlerThreadC0556g1.b();
        this.f7618a = handlerThreadC0556g1B;
        K0 k02 = new K0(this, 0);
        this.f7619b = k02;
        handlerThreadC0556g1B.c(k02, 5000L);
    }

    public final void a(boolean z5) {
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        AbstractC0603w1.b(enumC0600v1, "OSNotificationOpenedResult complete called with opened: " + z5, null);
        this.f7618a.a(this.f7619b);
        if (this.f7622e) {
            AbstractC0603w1.b(enumC0600v1, "OSNotificationOpenedResult already completed", null);
            return;
        }
        this.f7622e = true;
        if (z5) {
            AbstractC0603w1.e(this.f7620c.f7473d);
        }
        AbstractC0603w1.f8026a.remove(this);
    }

    public final String toString() {
        return "OSNotificationOpenedResult{notification=" + this.f7620c + ", action=" + this.f7621d + ", isComplete=" + this.f7622e + '}';
    }
}
