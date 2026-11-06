package com.onesignal;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class P implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f7661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f7664f;

    public P(boolean z5, JSONObject jSONObject, Context context, int i6, String str, long j6) {
        this.f7659a = z5;
        this.f7660b = jSONObject;
        this.f7661c = context;
        this.f7662d = i6;
        this.f7663e = str;
        this.f7664f = j6;
    }

    @Override // com.onesignal.G0
    public final void a(boolean z5) throws Throwable {
        boolean z6 = this.f7659a;
        if (z6 || !z5) {
            O0.a(this.f7661c, AbstractC0571l1.u(this.f7660b), this.f7662d, this.f7663e, this.f7664f, this.f7659a);
            if (z6) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }
}
