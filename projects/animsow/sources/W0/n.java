package w0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Binder implements InterfaceC1451f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13517d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f13518c;

    public n(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f13518c = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final void b(int i6, String[] strArr) {
        synchronized (this.f13518c.f5785y) {
            try {
                String str = (String) this.f13518c.f5784x.get(Integer.valueOf(i6));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = this.f13518c.f5785y.beginBroadcast();
                for (int i7 = 0; i7 < iBeginBroadcast; i7++) {
                    try {
                        Integer num = (Integer) this.f13518c.f5785y.getBroadcastCookie(i7);
                        int iIntValue = num.intValue();
                        String str2 = (String) this.f13518c.f5784x.get(num);
                        if (i6 != iIntValue && str.equals(str2)) {
                            try {
                                ((InterfaceC1449d) this.f13518c.f5785y.getBroadcastItem(i7)).x(strArr);
                            } catch (RemoteException e6) {
                                Log.w("ROOM", "Error invoking a remote callback", e6);
                            }
                        }
                    } finally {
                        this.f13518c.f5785y.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Binder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        InterfaceC1449d interfaceC1449d = null;
        InterfaceC1449d interfaceC1449d2 = null;
        if (i6 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1449d)) {
                    C1448c c1448c = new C1448c();
                    c1448c.f13496c = strongBinder;
                    interfaceC1449d = c1448c;
                } else {
                    interfaceC1449d = (InterfaceC1449d) iInterfaceQueryLocalInterface;
                }
            }
            int iS = s(interfaceC1449d, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iS);
            return true;
        }
        if (i6 != 2) {
            if (i6 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                b(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i6 != 1598968902) {
                return super.onTransact(i6, parcel, parcel2, i7);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC1449d)) {
                C1448c c1448c2 = new C1448c();
                c1448c2.f13496c = strongBinder2;
                interfaceC1449d2 = c1448c2;
            } else {
                interfaceC1449d2 = (InterfaceC1449d) iInterfaceQueryLocalInterface2;
            }
        }
        int i8 = parcel.readInt();
        synchronized (this.f13518c.f5785y) {
            this.f13518c.f5785y.unregister(interfaceC1449d2);
            this.f13518c.f5784x.remove(Integer.valueOf(i8));
        }
        parcel2.writeNoException();
        return true;
    }

    public final int s(InterfaceC1449d interfaceC1449d, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f13518c.f5785y) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f13518c;
                int i6 = multiInstanceInvalidationService.f5783w + 1;
                multiInstanceInvalidationService.f5783w = i6;
                if (multiInstanceInvalidationService.f5785y.register(interfaceC1449d, Integer.valueOf(i6))) {
                    this.f13518c.f5784x.put(Integer.valueOf(i6), str);
                    return i6;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f13518c;
                multiInstanceInvalidationService2.f5783w--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
