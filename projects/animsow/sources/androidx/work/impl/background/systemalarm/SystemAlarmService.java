package androidx.work.impl.background.systemalarm;

import I0.o;
import L0.g;
import L0.h;
import S0.k;
import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0324y;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0324y implements g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f5846z = o.y("SystemAlarmService");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f5847x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5848y;

    public final void a() {
        this.f5848y = true;
        o.w().u(f5846z, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.f3084a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = k.f3085b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                o.w().z(k.f3084a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0324y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f5847x = hVar;
        if (hVar.f1702F != null) {
            o.w().v(h.f1696G, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            hVar.f1702F = this;
        }
        this.f5848y = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0324y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5848y = true;
        this.f5847x.d();
    }

    @Override // androidx.lifecycle.AbstractServiceC0324y, android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i7) {
        super.onStartCommand(intent, i6, i7);
        if (this.f5848y) {
            o.w().x(f5846z, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5847x.d();
            h hVar = new h(this);
            this.f5847x = hVar;
            if (hVar.f1702F != null) {
                o.w().v(h.f1696G, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                hVar.f1702F = this;
            }
            this.f5848y = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5847x.b(intent, i7);
        return 3;
    }
}
