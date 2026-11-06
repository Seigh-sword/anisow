package m2;

import X1.InterfaceC0234b;
import X1.InterfaceC0235c;
import a2.C0259a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1040g1 implements ServiceConnection, InterfaceC0234b, InterfaceC0235c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f10914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile L f10915x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Y0 f10916y;

    public ServiceConnectionC1040g1(Y0 y02) {
        this.f10916y = y02;
    }

    @Override // X1.InterfaceC0234b
    public final void b(int i6) {
        AbstractC1332d.f("MeasurementServiceConnection.onConnectionSuspended");
        Y0 y02 = this.f10916y;
        y02.f().f10722I.d("Service connection suspended");
        y02.g().A(new RunnableC1043h1(this, 1));
    }

    @Override // X1.InterfaceC0235c
    public final void e(U1.b bVar) {
        int i6;
        AbstractC1332d.f("MeasurementServiceConnection.onConnectionFailed");
        N n5 = ((C1051k0) this.f10916y.f1668w).f10983E;
        if (n5 == null || !n5.f11239x) {
            n5 = null;
        }
        if (n5 != null) {
            n5.f10718E.c(bVar, "Service connection failed");
        }
        synchronized (this) {
            i6 = 0;
            this.f10914w = false;
            this.f10915x = null;
        }
        this.f10916y.g().A(new RunnableC1043h1(this, i6));
    }

    @Override // X1.InterfaceC0234b
    public final void i() {
        AbstractC1332d.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC1332d.m(this.f10915x);
                this.f10916y.g().A(new RunnableC1037f1(this, (G) this.f10915x.t(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f10915x = null;
                this.f10914w = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1332d.f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            int i6 = 0;
            if (iBinder == null) {
                this.f10914w = false;
                this.f10916y.f().f10715B.d("Service connected with null binder");
                return;
            }
            G h4 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    h4 = iInterfaceQueryLocalInterface instanceof G ? (G) iInterfaceQueryLocalInterface : new H(iBinder);
                    this.f10916y.f().f10723J.d("Bound to IMeasurementService interface");
                } else {
                    this.f10916y.f().f10715B.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.f10916y.f().f10715B.d("Service connect failed to get IMeasurementService");
            }
            if (h4 == null) {
                this.f10914w = false;
                try {
                    C0259a.b().c(this.f10916y.a(), this.f10916y.f10830y);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f10916y.g().A(new RunnableC1037f1(this, h4, i6));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1332d.f("MeasurementServiceConnection.onServiceDisconnected");
        Y0 y02 = this.f10916y;
        y02.f().f10722I.d("Service disconnected");
        y02.g().A(new RunnableC1028c1(this, 1, componentName));
    }
}
