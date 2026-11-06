package com.onesignal;

import android.content.Context;
import android.content.Intent;
import com.android.app.MainApp;
import com.android.app.activities.HomeActivity;
import org.json.JSONObject;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ L0 f7609x;

    public /* synthetic */ K0(L0 l02, int i6) {
        this.f7608w = i6;
        this.f7609x = l02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i6 = this.f7608w;
        Integer numValueOf = null;
        L0 l02 = this.f7609x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0603w1.b(EnumC0600v1.f7992B, "Running complete from OSNotificationOpenedResult timeout runnable!", null);
                l02.a(false);
                return;
            default:
                AbstractC0603w1.f8047m.getClass();
                Context context = MainApp.f6264y;
                if (context == null) {
                    AbstractC1305a.W("appContext");
                    throw null;
                }
                try {
                    AbstractC1305a.l(l02);
                    B0 b02 = l02.f7620c;
                    str = b02.f7483n;
                    JSONObject jSONObject = b02.f7478i;
                    if (str == null) {
                        str = null;
                    }
                    if (jSONObject != null && jSONObject.has("post_id")) {
                        numValueOf = Integer.valueOf(jSONObject.getInt("post_id"));
                    }
                } catch (Exception e6) {
                    m2.C0.h().a(e6);
                    e6.printStackTrace();
                }
                if (str != null) {
                    Intent intent = new Intent(context, (Class<?>) HomeActivity.class);
                    intent.setFlags(335544320);
                    intent.putExtra("OPEN_WEB_URL", str);
                    context.startActivity(intent);
                    return;
                }
                if (numValueOf != null) {
                    Intent intent2 = new Intent(context, (Class<?>) HomeActivity.class);
                    intent2.setFlags(335544320);
                    intent2.putExtra("OPEN_POST", numValueOf.intValue());
                    context.startActivity(intent2);
                    return;
                }
                Intent intent3 = new Intent(context, (Class<?>) HomeActivity.class);
                intent3.setFlags(335577088);
                context.startActivity(intent3);
                return;
        }
    }
}
