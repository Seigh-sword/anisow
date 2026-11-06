package P0;

import I0.o;
import android.content.Intent;
import android.content.IntentFilter;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f2391i = o.y("BatteryNotLowTracker");

    @Override // P0.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f2396b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        o.w().v(f2391i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // P0.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // P0.c
    public final void g(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        o.w().u(f2391i, AbstractC0628i.q("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        c(bool);
    }
}
