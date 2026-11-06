package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0558h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0585q0 f7824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0579o0 f7825c;

    public C0558h0(C0579o0 c0579o0, boolean z5, C0585q0 c0585q0) {
        this.f7825c = c0579o0;
        this.f7823a = z5;
        this.f7824b = c0585q0;
    }

    public final void a(JSONObject jSONObject) {
        C0579o0 c0579o0 = this.f7825c;
        c0579o0.f7923x = false;
        if (jSONObject != null) {
            c0579o0.f7921v = jSONObject.toString();
        }
        if (c0579o0.f7922w != null) {
            boolean z5 = this.f7823a;
            C0585q0 c0585q0 = this.f7824b;
            if (!z5) {
                AbstractC0603w1.f8002C.k(c0585q0.f7951a);
            }
            C0552f0 c0552f0 = c0579o0.f7922w;
            c0552f0.f7802a = c0579o0.r0(c0552f0.f7802a);
            p2.h(c0585q0, c0579o0.f7922w);
            c0579o0.f7922w = null;
        }
    }
}
