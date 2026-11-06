package c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(9);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f6094w;

    public e(Parcel parcel) {
        b bVar;
        IBinder strongBinder = parcel.readStrongBinder();
        int i6 = c.f6088d;
        if (strongBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.f6087b);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                C0349a c0349a = new C0349a();
                c0349a.f6086c = strongBinder;
                bVar = c0349a;
            } else {
                bVar = (b) iInterfaceQueryLocalInterface;
            }
        }
        this.f6094w = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        synchronized (this) {
            try {
                if (this.f6094w == null) {
                    this.f6094w = new c(this);
                }
                parcel.writeStrongBinder(this.f6094w.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i6, Bundle bundle) {
    }
}
