package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import java.io.IOException;
import org.json.JSONException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    public void onMessage(Context context, Intent intent) throws JSONException, IllegalAccessException, NoSuchFieldException, InstantiationException, IOException, ClassNotFoundException {
        Bundle extras = intent != null ? intent.getExtras() : null;
        AbstractC0571l1.K(context, extras, new C0539b(context, extras));
    }

    public void onRegistered(Context context, String str) {
        AbstractC0603w1.b(EnumC0600v1.f7991A, "ADM registration ID: " + str, null);
        C0594t1.g(str);
    }

    public void onRegistrationError(Context context, String str) {
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7997y;
        AbstractC0603w1.b(enumC0600v1, "ADM:onRegistrationError: " + str, null);
        if (AbstractC1305a.c("INVALID_SENDER", str)) {
            AbstractC0603w1.b(enumC0600v1, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null);
        }
        C0594t1.g(null);
    }

    public void onUnregistered(Context context, String str) {
        AbstractC0603w1.b(EnumC0600v1.f7991A, "ADM:onUnregistered: " + str, null);
    }
}
