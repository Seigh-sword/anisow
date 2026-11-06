package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Binder implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6088d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f6089c;

    public c(e eVar) {
        this.f6089c = eVar;
        attachInterface(this, b.f6087b);
    }

    @Override // android.os.Binder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        String str = b.f6087b;
        if (i6 >= 1 && i6 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i6 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i6 != 1) {
            return super.onTransact(i6, parcel, parcel2, i7);
        }
        int i8 = parcel.readInt();
        Object objCreateFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
        e eVar = this.f6089c;
        eVar.getClass();
        eVar.a(i8, (Bundle) objCreateFromParcel);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
