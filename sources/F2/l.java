package f2;

import android.os.Parcel;
import e2.InterfaceC0663a;
import h2.AbstractC0769a;
import j2.AbstractC0847b;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0769a {
    public final InterfaceC0663a G(e2.b bVar, String str, int i6) {
        Parcel parcelD = D();
        AbstractC0847b.c(parcelD, bVar);
        parcelD.writeString(str);
        parcelD.writeInt(i6);
        Parcel parcelS = s(parcelD, 2);
        InterfaceC0663a interfaceC0663aE = e2.b.e(parcelS.readStrongBinder());
        parcelS.recycle();
        return interfaceC0663aE;
    }

    public final InterfaceC0663a H(e2.b bVar, String str, int i6, e2.b bVar2) {
        Parcel parcelD = D();
        AbstractC0847b.c(parcelD, bVar);
        parcelD.writeString(str);
        parcelD.writeInt(i6);
        AbstractC0847b.c(parcelD, bVar2);
        Parcel parcelS = s(parcelD, 8);
        InterfaceC0663a interfaceC0663aE = e2.b.e(parcelS.readStrongBinder());
        parcelS.recycle();
        return interfaceC0663aE;
    }

    public final InterfaceC0663a I(e2.b bVar, String str, int i6) {
        Parcel parcelD = D();
        AbstractC0847b.c(parcelD, bVar);
        parcelD.writeString(str);
        parcelD.writeInt(i6);
        Parcel parcelS = s(parcelD, 4);
        InterfaceC0663a interfaceC0663aE = e2.b.e(parcelS.readStrongBinder());
        parcelS.recycle();
        return interfaceC0663aE;
    }

    public final InterfaceC0663a J(e2.b bVar, String str, boolean z5, long j6) {
        Parcel parcelD = D();
        AbstractC0847b.c(parcelD, bVar);
        parcelD.writeString(str);
        parcelD.writeInt(z5 ? 1 : 0);
        parcelD.writeLong(j6);
        Parcel parcelS = s(parcelD, 7);
        InterfaceC0663a interfaceC0663aE = e2.b.e(parcelS.readStrongBinder());
        parcelS.recycle();
        return interfaceC0663aE;
    }
}
