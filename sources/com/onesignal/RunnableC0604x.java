package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0604x implements Runnable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final RunnableC0604x f8061x = new RunnableC0604x(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8062w;

    public /* synthetic */ RunnableC0604x(int i6) {
        this.f8062w = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8062w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Activity activityJ = AbstractC0603w1.j();
                if (activityJ == null) {
                    return;
                }
                String strE = OSUtils.e(activityJ, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                new AlertDialog.Builder(activityJ).setMessage(strE).setPositiveButton(OSUtils.e(activityJ, "onesignal_gms_missing_alert_button_update", "Update"), new DialogInterfaceOnClickListenerC0601w(activityJ)).setNegativeButton(OSUtils.e(activityJ, "onesignal_gms_missing_alert_button_skip", "Skip"), new DialogInterfaceOnClickListenerC0560i(2, this)).setNeutralButton(OSUtils.e(activityJ, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
                return;
            case 1:
                C0546d0.f7780b = true;
                AbstractC0603w1.b(EnumC0600v1.f7992B, "OSFocusHandler setting stop state: true", null);
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                C0598v c0598vD = M1.d(!AbstractC0603w1.f8012M);
                if (c0598vD.f7984w) {
                    AbstractC0603w1.f8012M = true;
                }
                ArrayList arrayList = AbstractC0603w1.f8018S;
                synchronized (arrayList) {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0558h0) it.next()).a((((JSONObject) c0598vD.f7985x) == null || c0598vD.toString().equals("{}")) ? null : (JSONObject) c0598vD.f7985x);
                        }
                        AbstractC0603w1.f8018S.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0603w1.f8053s.getClass();
                C0594t1.d("Running onAppLostFocus() operation from a pending task queue.");
                AbstractC0603w1.f();
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                try {
                    X1 x12 = AbstractC0595u.f7980j;
                    Thread.sleep(30000);
                    AbstractC0603w1.b(EnumC0600v1.f7998z, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.", null);
                    M.c();
                    M.h(M.f7633g);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                try {
                    AbstractC0603w1.c();
                    return;
                } catch (JSONException e6) {
                    AbstractC0603w1.b(EnumC0600v1.f7996x, "FATAL Error registering device!", e6);
                    return;
                }
        }
    }
}
