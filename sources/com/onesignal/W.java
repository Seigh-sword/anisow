package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class W extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws JSONException, IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, InstantiationException, IOException, ClassNotFoundException {
        super.onCreate(bundle);
        AbstractC0571l1.L(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) throws JSONException, IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, InstantiationException, IOException, ClassNotFoundException {
        AbstractC1305a.o(intent, "intent");
        super.onNewIntent(intent);
        AbstractC0571l1.L(this, getIntent());
        finish();
    }
}
