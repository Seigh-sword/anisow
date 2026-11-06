package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import k0.AbstractC0888a;
import m2.C1051k0;
import m2.InterfaceC1027c0;
import m2.N;
import m2.P;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC0888a implements InterfaceC1027c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1243i f7024c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (this.f7024c == null) {
            this.f7024c = new C1243i(this);
        }
        C1243i c1243i = this.f7024c;
        c1243i.getClass();
        N n5 = C1051k0.b(context, null, null).f10983E;
        C1051k0.i(n5);
        P p5 = n5.f10718E;
        if (intent == null) {
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            P p6 = n5.f10723J;
            p6.c(action, "Local receiver got");
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                p6.d("Starting wakeful intent.");
                ((AppMeasurementReceiver) ((InterfaceC1027c0) c1243i.f12254x)).getClass();
                AbstractC0888a.b(context, className);
                return;
            }
            if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
                return;
            } else {
                str = "Install Referrer Broadcasts are deprecated";
            }
        }
        p5.d(str);
    }
}
