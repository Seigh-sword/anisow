package X1;

import android.os.Parcel;
import e2.InterfaceC0663a;
import h2.AbstractC0769a;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0769a implements A {
    @Override // X1.A
    public final InterfaceC0663a c() {
        Parcel parcelS = s(D(), 1);
        InterfaceC0663a interfaceC0663aE = e2.b.e(parcelS.readStrongBinder());
        parcelS.recycle();
        return interfaceC0663aE;
    }

    @Override // X1.A
    public final int f() {
        Parcel parcelS = s(D(), 2);
        int i6 = parcelS.readInt();
        parcelS.recycle();
        return i6;
    }
}
