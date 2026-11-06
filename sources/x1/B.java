package X1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class B implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f4518c;

    public B(IBinder iBinder) {
        this.f4518c = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4518c;
    }

    public final void b(H h4, C0241i c0241i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(h4);
            parcelObtain.writeInt(1);
            M.a(c0241i, parcelObtain, 0);
            this.f4518c.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
