package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class FCMIntentService extends IntentService {
    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) throws JSONException, IllegalAccessException, NoSuchFieldException, InstantiationException, IOException, ClassNotFoundException {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        AbstractC0603w1.B(this);
        AbstractC0571l1.K(this, extras, new C0539b(this, intent));
    }
}
