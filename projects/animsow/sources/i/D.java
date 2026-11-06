package i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.internal.measurement.J4;
import com.google.firebase.messaging.FirebaseMessaging;
import d.AbstractC0628i;
import j.RunnableC0835a;
import m2.AbstractC1078w;
import m2.C1042h0;
import m2.C1051k0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9144b;

    public /* synthetic */ D(int i6, Object obj) {
        this.f9143a = i6;
        this.f9144b = obj;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((J3.z) this.f9144b).f1457y.f7441b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m2.N n5;
        String str;
        switch (this.f9143a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((E) this.f9144b).g();
                return;
            case 1:
                if (intent != null) {
                    ((P0.c) this.f9144b).g(intent);
                    return;
                }
                return;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                J3.z zVar = (J3.z) this.f9144b;
                if (zVar != null && zVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    J3.z zVar2 = (J3.z) this.f9144b;
                    zVar2.f1457y.getClass();
                    FirebaseMessaging.b(zVar2, 0L);
                    ((J3.z) this.f9144b).f1457y.f7441b.unregisterReceiver(this);
                    this.f9144b = null;
                    return;
                }
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0628i.p(this.f9144b);
                throw null;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                if (intent == null) {
                    n5 = ((C1051k0) this.f9144b).f10983E;
                    C1051k0.i(n5);
                    str = "App receiver called with null intent";
                } else {
                    String action = intent.getAction();
                    if (action == null) {
                        n5 = ((C1051k0) this.f9144b).f10983E;
                        C1051k0.i(n5);
                        str = "App receiver called with null action";
                    } else {
                        if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            C1051k0 c1051k0 = (C1051k0) this.f9144b;
                            J4.a();
                            if (c1051k0.f10981C.D(null, AbstractC1078w.f11135H0)) {
                                m2.N n6 = c1051k0.f10983E;
                                C1051k0.i(n6);
                                n6.f10723J.d("App receiver notified triggers are available");
                                C1042h0 c1042h0 = c1051k0.f10984F;
                                C1051k0.i(c1042h0);
                                c1042h0.A(new RunnableC0835a(19, c1051k0));
                                return;
                            }
                            return;
                        }
                        n5 = ((C1051k0) this.f9144b).f10983E;
                        C1051k0.i(n5);
                        str = "App receiver called with unknown action";
                    }
                }
                n5.f10718E.d(str);
                return;
        }
    }

    public /* synthetic */ D(Object obj, int i6) {
        this.f9143a = i6;
        this.f9144b = obj;
    }
}
