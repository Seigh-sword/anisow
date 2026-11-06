package com.onesignal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class I1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f7589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ JSONObject f7590y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AbstractC0571l1 f7591z;

    public /* synthetic */ I1(String str, JSONObject jSONObject, AbstractC0571l1 abstractC0571l1, int i6) {
        this.f7588w = i6;
        this.f7589x = str;
        this.f7590y = jSONObject;
        this.f7591z = abstractC0571l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7588w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0571l1.D(this.f7589x, "PUT", this.f7590y, this.f7591z, 120000, null);
                break;
            default:
                AbstractC0571l1.D(this.f7589x, "POST", this.f7590y, this.f7591z, 120000, null);
                break;
        }
    }
}
