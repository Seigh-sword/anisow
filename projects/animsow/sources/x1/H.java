package X1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import j2.AbstractBinderC0846a;
import j2.AbstractC0847b;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractBinderC0846a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC0238f f4524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4525d;

    public H(AbstractC0238f abstractC0238f, int i6) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f4524c = abstractC0238f;
        this.f4525d = i6;
    }

    @Override // j2.AbstractBinderC0846a
    public final boolean b(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 == 1) {
            int i7 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC0847b.a(parcel, Bundle.CREATOR);
            AbstractC0847b.b(parcel);
            AbstractC1332d.n(this.f4524c, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0238f abstractC0238f = this.f4524c;
            abstractC0238f.getClass();
            J j6 = new J(abstractC0238f, i7, strongBinder, bundle);
            G g4 = abstractC0238f.f4573k;
            g4.sendMessage(g4.obtainMessage(1, this.f4525d, -1, j6));
            this.f4524c = null;
        } else if (i6 == 2) {
            parcel.readInt();
            AbstractC0847b.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i6 != 3) {
                return false;
            }
            int i8 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            L l5 = (L) AbstractC0847b.a(parcel, L.CREATOR);
            AbstractC0847b.b(parcel);
            AbstractC0238f abstractC0238f2 = this.f4524c;
            AbstractC1332d.n(abstractC0238f2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC1332d.m(l5);
            abstractC0238f2.f4561A = l5;
            Bundle bundle2 = l5.f4531w;
            AbstractC1332d.n(this.f4524c, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0238f abstractC0238f3 = this.f4524c;
            abstractC0238f3.getClass();
            J j7 = new J(abstractC0238f3, i8, strongBinder2, bundle2);
            G g6 = abstractC0238f3.f4573k;
            g6.sendMessage(g6.obtainMessage(1, this.f4525d, -1, j7));
            this.f4524c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
