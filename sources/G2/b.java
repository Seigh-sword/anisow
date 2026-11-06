package g2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f8526c;

    public b(IBinder iBinder) {
        this.f8526c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8526c;
    }

    public final Parcel b(Parcel parcel, int i6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f8526c.transact(i6, parcel, parcelObtain, 0);
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
