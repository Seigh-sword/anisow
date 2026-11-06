package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0561i0 implements InterfaceC0611z0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0585q0 f7838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0579o0 f7839y;

    public /* synthetic */ C0561i0(C0579o0 c0579o0, C0585q0 c0585q0, int i6) {
        this.f7837w = i6;
        this.f7839y = c0579o0;
        this.f7838x = c0585q0;
    }

    @Override // com.onesignal.InterfaceC0611z0, com.onesignal.InterfaceC0609y1
    public final void a(String str) {
        int i6 = this.f7837w;
        C0579o0 c0579o0 = this.f7839y;
        C0585q0 c0585q0 = this.f7838x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    C0552f0 c0552f0Z = C0579o0.Z(c0579o0, new JSONObject(str), c0585q0);
                    String str2 = c0552f0Z.f7802a;
                    C0594t1 c0594t1 = c0579o0.f7906g;
                    if (str2 == null) {
                        c0594t1.getClass();
                        C0594t1.d("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    } else if (c0579o0.f7923x) {
                        c0579o0.f7922w = c0552f0Z;
                    } else {
                        AbstractC0603w1.f8002C.k(c0585q0.f7951a);
                        c0594t1.getClass();
                        C0594t1.h("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
                        c0552f0Z.f7802a = c0579o0.r0(c0552f0Z.f7802a);
                        p2.h(c0585q0, c0552f0Z);
                    }
                } catch (JSONException e6) {
                    e6.printStackTrace();
                    return;
                }
                break;
            case 1:
                try {
                    C0552f0 c0552f0Z2 = C0579o0.Z(c0579o0, new JSONObject(str), c0585q0);
                    String str3 = c0552f0Z2.f7802a;
                    C0594t1 c0594t12 = c0579o0.f7906g;
                    if (str3 == null) {
                        c0594t12.getClass();
                        C0594t1.d("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    } else if (c0579o0.f7923x) {
                        c0579o0.f7922w = c0552f0Z2;
                    } else {
                        c0594t12.getClass();
                        C0594t1.h("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
                        c0552f0Z2.f7802a = c0579o0.r0(c0552f0Z2.f7802a);
                        p2.h(c0585q0, c0552f0Z2);
                    }
                } catch (JSONException e7) {
                    e7.printStackTrace();
                    return;
                }
                break;
        }
    }

    @Override // com.onesignal.InterfaceC0611z0
    public final void d(String str) {
        int i6 = this.f7837w;
        C0585q0 c0585q0 = this.f7838x;
        C0579o0 c0579o0 = this.f7839y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0579o0.f7920u = false;
                try {
                    if (new JSONObject(str).getBoolean("retry")) {
                        c0579o0.n0(c0585q0);
                    } else {
                        c0579o0.l0(c0585q0, true);
                    }
                } catch (JSONException e6) {
                    e6.printStackTrace();
                    return;
                }
                break;
            case 1:
                c0579o0.c0(null);
                break;
            default:
                c0579o0.f7914o.remove(c0585q0.f7951a);
                break;
        }
    }
}
