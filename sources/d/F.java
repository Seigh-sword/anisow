package D;

import android.app.Notification;
import android.os.Parcel;
import b.C0326a;
import b.InterfaceC0328c;
import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class F implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Notification f170d;

    public F(String str, int i6, Notification notification) {
        this.f167a = str;
        this.f168b = i6;
        this.f170d = notification;
    }

    public final void a(InterfaceC0328c interfaceC0328c) {
        String str = this.f167a;
        int i6 = this.f168b;
        String str2 = this.f169c;
        C0326a c0326a = (C0326a) interfaceC0328c;
        c0326a.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0328c.f5868a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i6);
            parcelObtain.writeString(str2);
            Notification notification = this.f170d;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            c0326a.f5866c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f167a);
        sb.append(", id:");
        sb.append(this.f168b);
        sb.append(", tag:");
        return AbstractC0628i.m(sb, this.f169c, "]");
    }
}
