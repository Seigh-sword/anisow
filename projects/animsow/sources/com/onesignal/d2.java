package com.onesignal;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends i2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f7784m;

    @Override // com.onesignal.i2
    public final void A(String str) {
        AbstractC0603w1.f8040h = str;
        if (AbstractC0603w1.f8028b != null) {
            E1.g(E1.f7517a, "GT_PLAYER_ID", AbstractC0603w1.f8040h);
        }
        AbstractC0603w1.C();
        OSSubscriptionState oSSubscriptionStateN = AbstractC0603w1.n(AbstractC0603w1.f8028b);
        boolean z5 = true;
        if (str != null ? str.equals(oSSubscriptionStateN.f7655x) : oSSubscriptionStateN.f7655x == null) {
            z5 = false;
        }
        oSSubscriptionStateN.f7655x = str;
        if (z5) {
            oSSubscriptionStateN.f7654w.h(oSSubscriptionStateN);
        }
        C1474r c1474r = AbstractC0603w1.f8039g0;
        if (c1474r != null) {
            AbstractC0603w1.O((JSONArray) c1474r.f13586z, c1474r.f13585y, (AbstractC0571l1) c1474r.f13584x);
            AbstractC0603w1.f8039g0 = null;
        }
        M1.a().v();
        M1.c().v();
    }

    @Override // com.onesignal.i2
    public final void e(JSONObject jSONObject) {
    }

    @Override // com.onesignal.i2
    public final void g(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            ArrayList arrayList = AbstractC0603w1.f8026a;
        }
        if (jSONObject.has("sms_number")) {
            ArrayList arrayList2 = AbstractC0603w1.f8026a;
        }
    }

    @Override // com.onesignal.i2
    public final String j() {
        return AbstractC0603w1.v();
    }

    @Override // com.onesignal.i2
    public final EnumC0600v1 k() {
        return EnumC0600v1.f7997y;
    }

    @Override // com.onesignal.i2
    public final b2 q(String str) {
        return new b2(1, str, true);
    }

    @Override // com.onesignal.i2
    public final void r(JSONObject jSONObject) {
    }

    @Override // com.onesignal.i2
    public final void v() {
        l().a();
    }
}
