package o2;

import Z.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h2.AbstractC0770b;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Binder implements e, IInterface {
    @Override // android.os.Binder
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i6, parcel, parcel2, i7)) {
            return true;
        }
        switch (i6) {
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0770b.b(parcel);
                parcel2.writeNoException();
                break;
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0770b.b(parcel);
                parcel2.writeNoException();
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0770b.b(parcel);
                parcel2.writeNoException();
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                i iVar = (i) AbstractC0770b.a(parcel, i.CREATOR);
                AbstractC0770b.b(parcel);
                n(iVar);
                parcel2.writeNoException();
                break;
            case 9:
                AbstractC0770b.b(parcel);
                parcel2.writeNoException();
                break;
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
