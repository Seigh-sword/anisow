package com.onesignal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: com.onesignal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0560i implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7836x;

    public /* synthetic */ DialogInterfaceOnClickListenerC0560i(int i6, Object obj) {
        this.f7835w = i6;
        this.f7836x = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        int i7 = this.f7835w;
        Object obj = this.f7836x;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                N n5 = (N) ((InterfaceC0557h) obj);
                int i8 = n5.f7643a;
                Activity activity = n5.f7644b;
                switch (i8) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        AbstractC1305a.o(activity, "context");
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + activity.getPackageName()));
                        activity.startActivity(intent);
                        M.i(true, 2);
                        break;
                    default:
                        AbstractC1305a.o(activity, "context");
                        Intent intent2 = new Intent();
                        intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                        intent2.addFlags(268435456);
                        intent2.putExtra("app_package", activity.getPackageName());
                        intent2.putExtra("app_uid", activity.getApplicationInfo().uid);
                        intent2.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
                        activity.startActivity(intent2);
                        X.f7726b = true;
                        break;
                }
                break;
            case 1:
                switch (((N) ((InterfaceC0557h) obj)).f7643a) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        M.i(true, 2);
                        break;
                    default:
                        X.c(false);
                        break;
                }
                break;
            default:
                E1.h(E1.f7517a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
                break;
        }
    }
}
