package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) throws JSONException, IllegalAccessException, NoSuchFieldException, InstantiationException, IOException, ClassNotFoundException {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        AbstractC0571l1.K(applicationContext, extras, new C0536a(this, extras, applicationContext));
    }

    public void onRegistered(String str) {
        AbstractC0603w1.b(EnumC0600v1.f7991A, "ADM registration ID: " + str, null);
        C0594t1.g(str);
    }

    public void onRegistrationError(String str) {
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7997y;
        AbstractC0603w1.b(enumC0600v1, "ADM:onRegistrationError: " + str, null);
        if ("INVALID_SENDER".equals(str)) {
            AbstractC0603w1.b(enumC0600v1, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null);
        }
        C0594t1.g(null);
    }

    public void onUnregistered(String str) {
        AbstractC0603w1.b(EnumC0600v1.f7991A, "ADM:onUnregistered: " + str, null);
    }
}
