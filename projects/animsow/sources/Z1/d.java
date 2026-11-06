package Z1;

import W1.InterfaceC0210d;
import W1.InterfaceC0216j;
import X1.AbstractC0242j;
import X1.C0239g;
import X1.C0249q;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import h2.AbstractC0771c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0242j {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0249q f4956F;

    public d(Context context, Looper looper, C0239g c0239g, C0249q c0249q, InterfaceC0210d interfaceC0210d, InterfaceC0216j interfaceC0216j) {
        super(context, looper, 270, c0239g, interfaceC0210d, interfaceC0216j);
        this.f4956F = c0249q;
    }

    @Override // X1.AbstractC0238f, V1.b
    public final int m() {
        return 203400000;
    }

    @Override // X1.AbstractC0238f
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // X1.AbstractC0238f
    public final U1.d[] q() {
        return AbstractC0771c.f8979b;
    }

    @Override // X1.AbstractC0238f
    public final Bundle r() {
        C0249q c0249q = this.f4956F;
        c0249q.getClass();
        Bundle bundle = new Bundle();
        String str = c0249q.f4641a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // X1.AbstractC0238f
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // X1.AbstractC0238f
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // X1.AbstractC0238f
    public final boolean w() {
        return true;
    }
}
