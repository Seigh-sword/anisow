package T1;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new android.support.v4.media.a(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Messenger f3422w;

    public h(IBinder iBinder) {
        this.f3422w = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f3422w;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((h) obj).f3422w;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f3422w;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        Messenger messenger = this.f3422w;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
