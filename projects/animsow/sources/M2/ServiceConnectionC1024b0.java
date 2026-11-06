package m2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: m2.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1024b0 implements ServiceConnection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f10850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1021a0 f10851x;

    public ServiceConnectionC1024b0(C1021a0 c1021a0, String str) {
        this.f10851x = c1021a0;
        this.f10850w = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1021a0 c1021a0 = this.f10851x;
        if (iBinder == null) {
            N n5 = c1021a0.f10841a.f10983E;
            C1051k0.i(n5);
            n5.f10718E.d("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i6 = com.google.android.gms.internal.measurement.I.f6605c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            Object l5 = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.J ? (com.google.android.gms.internal.measurement.J) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.L(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            if (l5 == null) {
                N n6 = c1021a0.f10841a.f10983E;
                C1051k0.i(n6);
                n6.f10718E.d("Install Referrer Service implementation was not found");
            } else {
                N n7 = c1021a0.f10841a.f10983E;
                C1051k0.i(n7);
                n7.f10723J.d("Install Referrer Service connected");
                C1042h0 c1042h0 = c1021a0.f10841a.f10984F;
                C1051k0.i(c1042h0);
                c1042h0.A(new K.a(this, l5, this, 11));
            }
        } catch (RuntimeException e6) {
            N n8 = c1021a0.f10841a.f10983E;
            C1051k0.i(n8);
            n8.f10718E.c(e6, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        N n5 = this.f10851x.f10841a.f10983E;
        C1051k0.i(n5);
        n5.f10723J.d("Install Referrer Service disconnected");
    }
}
