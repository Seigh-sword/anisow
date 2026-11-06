package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0769a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f8975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8976d;

    public /* synthetic */ AbstractC0769a(IBinder iBinder, String str, int i6) {
        this.f8975c = iBinder;
        this.f8976d = str;
    }

    public final Parcel D() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8976d);
        return parcelObtain;
    }

    public final Parcel E(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8975c.transact(i6, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void F(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f8975c.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8975c;
    }

    public final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f8976d);
        return parcelObtain;
    }

    public final void e(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f8975c.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel s(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8975c.transact(i6, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } finally {
            parcel.recycle();
        }
    }
}
