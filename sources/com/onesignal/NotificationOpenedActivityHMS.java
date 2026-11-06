package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NotificationOpenedActivityHMS extends Activity {
    public final void a() {
        JSONObject jSONObjectF;
        Intent intent = getIntent();
        AbstractC0603w1.B(getApplicationContext());
        if (intent != null) {
            if (AbstractC0571l1.B(intent.getExtras())) {
                jSONObjectF = AbstractC0571l1.f(intent.getExtras());
                try {
                    String str = (String) new JSONObject(jSONObjectF.optString("custom")).remove("actionId");
                    if (str != null) {
                        jSONObjectF.put("actionId", str);
                    }
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            } else {
                jSONObjectF = null;
            }
            if (jSONObjectF != null && !AbstractC0571l1.G(this, jSONObjectF)) {
                AbstractC0603w1.y(this, new JSONArray().put(jSONObjectF), AbstractC0571l1.u(jSONObjectF));
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a();
    }
}
