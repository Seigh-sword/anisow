package j2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: j2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0846a extends Binder implements IInterface {
    public AbstractBinderC0846a(String str) {
        attachInterface(this, str);
    }

    public boolean b(int i6, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i6, parcel, parcel2, i7)) {
            return true;
        }
        return b(i6, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
