package w0;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: w0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1448c implements InterfaceC1449d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f13496c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13496c;
    }

    @Override // w0.InterfaceC1449d
    public final void x(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f13496c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
