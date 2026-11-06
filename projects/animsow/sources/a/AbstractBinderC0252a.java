package a;

import Z.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0252a extends Binder implements b {
    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        switch (i6) {
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.LONG_FIELD_NUMBER /* 4 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.STRING_FIELD_NUMBER /* 5 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return super.onTransact(i6, parcel, parcel2, i7);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
