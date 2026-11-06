package com.onesignal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends AbstractC0571l1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7709i;

    public /* synthetic */ T0(Object obj, int i6, Object obj2) {
        this.f7707g = i6;
        this.f7709i = obj;
        this.f7708h = obj2;
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void H(int i6, String str, Throwable th) {
        switch (this.f7707g) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0603w1.b(EnumC0600v1.f7997y, "Receive receipt failed with statusCode: " + i6 + " response: " + str, null);
                break;
            case 1:
                ((InterfaceC0609y1) this.f7708h).c(i6, str);
                break;
        }
    }

    @Override // com.onesignal.AbstractC0571l1
    public final void I(String str) {
        int i6 = this.f7707g;
        Object obj = this.f7708h;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0603w1.b(EnumC0600v1.f7992B, "Receive receipt sent for notificationID: " + ((String) obj), null);
                break;
            case 1:
                ((InterfaceC0609y1) obj).a(str);
                break;
            default:
                Z1 z12 = (Z1) this.f7709i;
                z12.f7754f.addAll((ArrayList) obj);
                E1.g("GTPlayerPurchases", "purchaseTokens", z12.f7754f.toString());
                E1.h("GTPlayerPurchases", "ExistingPurchases", true);
                z12.f7755g = false;
                z12.f7756h = false;
                break;
        }
    }
}
