package S0;

import android.content.Context;
import android.os.PowerManager;
import d.AbstractC0628i;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3084a = I0.o.y("WakeLocks");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f3085b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strQ = AbstractC0628i.q("WorkManager: ", str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strQ);
        WeakHashMap weakHashMap = f3085b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strQ);
        }
        return wakeLockNewWakeLock;
    }
}
