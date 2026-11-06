package androidx.work.impl.background.systemalarm;

import I0.o;
import J0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5845a = o.y("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o.w().u(f5845a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k kVarJ = k.J(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (k.f1205s) {
                try {
                    kVarJ.f1214p = pendingResultGoAsync;
                    if (kVarJ.f1213o) {
                        pendingResultGoAsync.finish();
                        kVarJ.f1214p = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e6) {
            o.w().v(f5845a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e6);
        }
    }
}
