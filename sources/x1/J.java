package X1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class J extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f4528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0238f f4529h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC0238f abstractC0238f, int i6, IBinder iBinder, Bundle bundle) {
        super(abstractC0238f, i6, bundle);
        this.f4529h = abstractC0238f;
        this.f4528g = iBinder;
    }

    @Override // X1.z
    public final void b(U1.b bVar) {
        AbstractC0238f abstractC0238f = this.f4529h;
        InterfaceC0235c interfaceC0235c = abstractC0238f.f4583u;
        if (interfaceC0235c != null) {
            interfaceC0235c.e(bVar);
        }
        abstractC0238f.f4566d = bVar.f3576x;
        abstractC0238f.f4567e = System.currentTimeMillis();
    }

    @Override // X1.z
    public final boolean c() {
        IBinder iBinder = this.f4528g;
        try {
            AbstractC1332d.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0238f abstractC0238f = this.f4529h;
            if (!abstractC0238f.u().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + abstractC0238f.u() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceO = abstractC0238f.o(iBinder);
            if (iInterfaceO == null || !(AbstractC0238f.y(abstractC0238f, 2, 4, iInterfaceO) || AbstractC0238f.y(abstractC0238f, 3, 4, iInterfaceO))) {
                return false;
            }
            abstractC0238f.f4587y = null;
            InterfaceC0234b interfaceC0234b = abstractC0238f.f4582t;
            if (interfaceC0234b == null) {
                return true;
            }
            interfaceC0234b.i();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
