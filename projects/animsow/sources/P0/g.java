package P0;

import I0.o;
import android.content.Intent;
import android.content.IntentFilter;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f2405i = o.y("StorageNotLowTracker");

    @Override // P0.d
    public final Object a() {
        Intent intentRegisterReceiver = this.f2396b.registerReceiver(null, f());
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    @Override // P0.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // P0.c
    public final void g(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        o.w().u(f2405i, AbstractC0628i.q("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        c(bool);
    }
}
