package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.io.IOException;
import k0.AbstractC0888a;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class FCMBroadcastReceiver extends AbstractC0888a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7551c = 0;

    public static void c(Bundle bundle, C c6) {
        String string = AbstractC0571l1.f(bundle).toString();
        int i6 = c6.f7496a;
        switch (i6) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((Bundle) c6.f7497b).putString("json_payload", string);
                break;
            default:
                ((PersistableBundle) c6.f7497b).putString("json_payload", string);
                break;
        }
        AbstractC0603w1.f8056v.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        switch (i6) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((Bundle) c6.f7497b).putLong("timestamp", jCurrentTimeMillis);
                break;
            default:
                ((PersistableBundle) c6.f7497b).putLong("timestamp", jCurrentTimeMillis);
                break;
        }
    }

    public static void d(Context context, Bundle bundle) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("json_payload", AbstractC0571l1.f(bundle).toString());
        AbstractC0603w1.f8056v.getClass();
        persistableBundle.putLong("timestamp", System.currentTimeMillis() / 1000);
        Intent intent = new Intent(context, (Class<?>) FCMIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", persistableBundle);
        int i6 = FCMIntentJobService.f7552D;
        ComponentName componentName = new ComponentName(context, (Class<?>) FCMIntentJobService.class);
        synchronized (H.f7565B) {
            try {
                JobIntentService$WorkEnqueuer jobIntentService$WorkEnqueuerB = H.b(context, componentName, true, 123890, false);
                jobIntentService$WorkEnqueuerB.ensureJobId(123890);
                try {
                    jobIntentService$WorkEnqueuerB.enqueueWork(intent);
                } catch (IllegalStateException e6) {
                    throw e6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(Context context, Bundle bundle) {
        ComponentName componentName = new ComponentName(context.getPackageName(), FCMIntentService.class.getName());
        Bundle bundle2 = new Bundle();
        bundle2.putString("json_payload", AbstractC0571l1.f(bundle).toString());
        AbstractC0603w1.f8056v.getClass();
        bundle2.putLong("timestamp", System.currentTimeMillis() / 1000);
        AbstractC0888a.b(context, new Intent().replaceExtras(bundle2).setComponent(componentName));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws JSONException, IllegalAccessException, NoSuchFieldException, InstantiationException, IOException, ClassNotFoundException {
        String stringExtra;
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        AbstractC0603w1.B(context);
        T1.j jVar = new T1.j(0, this);
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) || ((stringExtra = intent.getStringExtra("message_type")) != null && !"gcm".equals(stringExtra))) {
            jVar.b(null);
        }
        AbstractC0571l1.K(context, extras, new C0536a(context, extras, jVar));
    }
}
