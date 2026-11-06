package com.onesignal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: com.onesignal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0601w implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Activity f7999w;

    public DialogInterfaceOnClickListenerC0601w(Activity activity) {
        this.f7999w = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        Activity activity = this.f7999w;
        try {
            U1.e eVar = U1.e.f3586d;
            PendingIntent activity2 = null;
            Intent intentA = eVar.a(eVar.b(AbstractC0603w1.f8028b, U1.f.f3587a), activity, null);
            if (intentA != null) {
                activity2 = PendingIntent.getActivity(activity, 9000, intentA, 201326592);
            }
            if (activity2 != null) {
                activity2.send();
            }
        } catch (PendingIntent.CanceledException e6) {
            e6.printStackTrace();
        }
    }
}
