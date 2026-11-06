package P0;

import I0.o;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import i.C0803c;
import i.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f2392h = o.y("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D f2393g;

    public c(Context context, C0803c c0803c) {
        super(context, c0803c);
        this.f2393g = new D(1, this);
    }

    @Override // P0.d
    public final void d() {
        o.w().u(f2392h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f2396b.registerReceiver(this.f2393g, f());
    }

    @Override // P0.d
    public final void e() {
        o.w().u(f2392h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f2396b.unregisterReceiver(this.f2393g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
