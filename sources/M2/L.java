package m2;

import X1.AbstractC0238f;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0238f {
    @Override // X1.AbstractC0238f, V1.b
    public final int m() {
        return 12451000;
    }

    @Override // X1.AbstractC0238f
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof G ? (G) iInterfaceQueryLocalInterface : new H(iBinder);
    }

    @Override // X1.AbstractC0238f
    public final String u() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // X1.AbstractC0238f
    public final String v() {
        return "com.google.android.gms.measurement.START";
    }
}
