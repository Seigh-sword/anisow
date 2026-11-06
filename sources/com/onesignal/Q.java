package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f7678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X1 f7679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T f7682g;

    public Q(boolean z5, Context context, Bundle bundle, X1 x12, JSONObject jSONObject, long j6, boolean z6, T t5) {
        this.f7676a = z5;
        this.f7677b = context;
        this.f7678c = bundle;
        this.f7679d = x12;
        this.f7680e = jSONObject;
        this.f7681f = j6;
        this.f7682g = t5;
    }

    @Override // com.onesignal.G0
    public final void a(boolean z5) throws Throwable {
        boolean z6 = this.f7676a;
        X1 x12 = this.f7679d;
        Bundle bundle = this.f7678c;
        if (z6 || !z5) {
            JSONObject jSONObject = this.f7680e;
            O0.a(this.f7677b, AbstractC0571l1.u(jSONObject), bundle.containsKey("android_notif_id") ? bundle.getInt("android_notif_id") : 0, jSONObject.toString(), this.f7681f, this.f7676a);
            this.f7682g.f7706d = true;
            ((S) x12.f7735x).b((T) x12.f7736y);
            return;
        }
        AbstractC0603w1.b(EnumC0600v1.f7992B, "startNotificationProcessing returning, with context: " + this.f7677b + " and bundle: " + bundle, null);
        Object obj = x12.f7736y;
        ((T) obj).f7704b = true;
        ((S) x12.f7735x).b((T) obj);
    }
}
