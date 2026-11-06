package com.onesignal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws JSONException, IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, InstantiationException, IOException, ClassNotFoundException {
        AbstractC0571l1.L(context, intent);
    }
}
