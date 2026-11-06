package X1;

import android.os.Parcel;
import h2.AbstractC0769a;
import j2.AbstractC0847b;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0769a implements E {
    public final boolean G() {
        Parcel parcelS = s(D(), 7);
        int i6 = AbstractC0847b.f9445a;
        boolean z5 = parcelS.readInt() != 0;
        parcelS.recycle();
        return z5;
    }
}
