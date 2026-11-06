package P0;

import I0.o;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f2390i = o.y("BatteryChrgTracker");

    @Override // P0.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f2396b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            o.w().v(f2390i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // P0.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // P0.c
    public final void g(Intent intent) {
        Boolean bool;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        o.w().u(f2390i, "Received ".concat(action), new Throwable[0]);
        switch (action) {
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
            case "android.os.action.DISCHARGING":
                bool = Boolean.FALSE;
                break;
            case "android.os.action.CHARGING":
            case "android.intent.action.ACTION_POWER_CONNECTED":
                bool = Boolean.TRUE;
                break;
            default:
                return;
        }
        c(bool);
    }
}
