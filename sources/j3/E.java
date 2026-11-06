package J3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class E extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F f1352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f1353b;

    public E(F f6, F f7) {
        this.f1353b = f6;
        this.f1352a = f7;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f1353b.f1358w.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            F f6 = this.f1352a;
            if (f6 == null) {
                return;
            }
            if (f6.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                F f7 = this.f1352a;
                f7.f1361z.f1349f.schedule(f7, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f1352a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
