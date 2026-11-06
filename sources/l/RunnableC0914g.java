package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import b2.C0337b;
import com.google.android.gms.internal.measurement.InterfaceC0394c0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;
import m2.B1;
import m2.C1076v;
import m2.K1;
import m2.S0;
import m2.Y0;
import m2.x1;
import m2.z1;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: l.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0914g implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f9705A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9708y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f9709z;

    public /* synthetic */ RunnableC0914g(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f9706w = i6;
        this.f9705A = obj;
        this.f9707x = obj2;
        this.f9708y = obj3;
        this.f9709z = obj4;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:73:0x009c). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        AtomicReference atomicReference;
        Object obj;
        m2.G g4;
        byte[] bArrI = null;
        switch (this.f9706w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C0915h c0915h = (C0915h) this.f9707x;
                if (c0915h != null) {
                    L3.c cVar = (L3.c) this.f9705A;
                    ((ViewOnKeyListenerC0916i) cVar.f1734x).f9735W = true;
                    c0915h.f9711b.c(false);
                    ((ViewOnKeyListenerC0916i) cVar.f1734x).f9735W = false;
                }
                MenuItem menuItem = (MenuItem) this.f9708y;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) this.f9709z).q(menuItem, null, 4);
                    return;
                }
                return;
            case 1:
                Object obj2 = this.f9709z;
                Object obj3 = this.f9708y;
                Object obj4 = this.f9707x;
                try {
                    boolean booleanExtra = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj4).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj4).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    I0.o.w().u(ConstraintProxyUpdateReceiver.f5844a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    S0.g.a((Context) obj3, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    S0.g.a((Context) obj3, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    S0.g.a((Context) obj3, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    S0.g.a((Context) obj3, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj2).finish();
                }
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                Y0 y0Q = ((AppMeasurementDynamiteService) this.f9705A).f7026c.q();
                InterfaceC0394c0 interfaceC0394c0 = (InterfaceC0394c0) this.f9707x;
                C1076v c1076v = (C1076v) this.f9708y;
                String str = (String) this.f9709z;
                y0Q.r();
                y0Q.y();
                if (U1.f.f3588b.b(y0Q.q().a(), 12451000) == 0) {
                    y0Q.B(new RunnableC0914g(y0Q, c1076v, str, interfaceC0394c0, 5));
                    return;
                } else {
                    y0Q.f().f10718E.d("Not bundling data. Service unavailable or out of date");
                    y0Q.q().Q(interfaceC0394c0, new byte[0]);
                    return;
                }
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                Y0 y0Q2 = ((AppMeasurementDynamiteService) this.f9705A).f7026c.q();
                InterfaceC0394c0 interfaceC0394c02 = (InterfaceC0394c0) this.f9707x;
                String str2 = (String) this.f9708y;
                String str3 = (String) this.f9709z;
                y0Q2.r();
                y0Q2.y();
                y0Q2.B(new S0(y0Q2, str2, str3, y0Q2.N(false), interfaceC0394c02));
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                synchronized (((AtomicReference) this.f9707x)) {
                    try {
                        try {
                            obj = this.f9705A;
                            g4 = ((Y0) obj).f10831z;
                        } catch (RemoteException e6) {
                            ((Y0) this.f9705A).f().f10715B.c(e6, "Failed to get trigger URIs; remote exception");
                            atomicReference = (AtomicReference) this.f9707x;
                        }
                        if (g4 == null) {
                            ((Y0) obj).f().f10715B.d("Failed to get trigger URIs; not connected to service");
                        } else {
                            AbstractC1332d.m((B1) this.f9708y);
                            ((AtomicReference) this.f9707x).set(g4.g((Bundle) this.f9709z, (B1) this.f9708y));
                            ((Y0) this.f9705A).M();
                            atomicReference = (AtomicReference) this.f9707x;
                            atomicReference.notify();
                        }
                    } finally {
                        ((AtomicReference) this.f9707x).notify();
                    }
                }
                return;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                Object obj5 = this.f9709z;
                Object objQ = this.f9705A;
                try {
                    m2.G g6 = ((Y0) objQ).f10831z;
                    if (g6 == null) {
                        ((Y0) objQ).f().f10715B.d("Discarding data. Failed to send event to service to bundle");
                    } else {
                        bArrI = g6.i((C1076v) this.f9707x, (String) this.f9708y);
                        ((Y0) objQ).M();
                        K1 k1Q = ((Y0) objQ).q();
                        InterfaceC0394c0 interfaceC0394c03 = (InterfaceC0394c0) obj5;
                        k1Q.Q(interfaceC0394c03, bArrI);
                        obj5 = interfaceC0394c03;
                        objQ = k1Q;
                    }
                } catch (RemoteException e7) {
                    ((Y0) objQ).f().f10715B.c(e7, "Failed to send event to the service to bundle");
                } finally {
                    ((Y0) objQ).q().Q((InterfaceC0394c0) obj5, bArrI);
                }
                return;
            default:
                z1 z1Var = (z1) this.f9705A;
                K1 k1A0 = z1Var.f11288w.a0();
                String str4 = (String) this.f9707x;
                String str5 = (String) this.f9708y;
                Bundle bundle = (Bundle) this.f9709z;
                ((C0337b) z1Var.f11288w.h()).getClass();
                C1076v c1076vG = k1A0.G(str5, bundle, "auto", System.currentTimeMillis(), false);
                x1 x1Var = z1Var.f11288w;
                AbstractC1332d.m(c1076vG);
                x1Var.v(c1076vG, str4);
                return;
        }
    }
}
