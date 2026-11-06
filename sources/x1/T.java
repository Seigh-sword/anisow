package X1;

import android.os.Parcel;
import e2.InterfaceC0663a;
import j2.AbstractBinderC0846a;
import j2.AbstractC0847b;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends AbstractBinderC0846a implements A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4557c = 0;

    @Override // j2.AbstractBinderC0846a
    public final boolean b(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 == 1) {
            InterfaceC0663a interfaceC0663aC = ((U1.n) this).c();
            parcel2.writeNoException();
            AbstractC0847b.c(parcel2, interfaceC0663aC);
        } else {
            if (i6 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((U1.n) this).f3606d);
        }
        return true;
    }
}
