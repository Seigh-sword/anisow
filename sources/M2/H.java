package m2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import h2.AbstractC0769a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC0769a implements G {
    public H(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // m2.G
    public final void A(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 25);
    }

    @Override // m2.G
    public final void C(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 26);
    }

    @Override // m2.G
    public final List g(Bundle bundle, B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        com.google.android.gms.internal.measurement.G.c(parcelB, bundle);
        Parcel parcelE = E(parcelB, 24);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(r1.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // m2.G
    public final void h(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 18);
    }

    @Override // m2.G
    public final byte[] i(C1076v c1076v, String str) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, c1076v);
        parcelB.writeString(str);
        Parcel parcelE = E(parcelB, 9);
        byte[] bArrCreateByteArray = parcelE.createByteArray();
        parcelE.recycle();
        return bArrCreateByteArray;
    }

    @Override // m2.G
    public final void j(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 27);
    }

    @Override // m2.G
    public final C1038g k(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        Parcel parcelE = E(parcelB, 21);
        C1038g c1038g = (C1038g) com.google.android.gms.internal.measurement.G.a(parcelE, C1038g.CREATOR);
        parcelE.recycle();
        return c1038g;
    }

    @Override // m2.G
    public final void l(C1076v c1076v, B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, c1076v);
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 1);
    }

    @Override // m2.G
    public final void m(C1029d c1029d, B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, c1029d);
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 12);
    }

    @Override // m2.G
    public final List o(String str, String str2, boolean z5, B1 b1) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.G.f6599a;
        parcelB.writeInt(z5 ? 1 : 0);
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        Parcel parcelE = E(parcelB, 14);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(G1.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // m2.G
    public final void p(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 6);
    }

    @Override // m2.G
    public final void q(G1 g12, B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, g12);
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 2);
    }

    @Override // m2.G
    public final void r(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 20);
    }

    @Override // m2.G
    public final void t(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 4);
    }

    @Override // m2.G
    public final String u(B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        Parcel parcelE = E(parcelB, 11);
        String string = parcelE.readString();
        parcelE.recycle();
        return string;
    }

    @Override // m2.G
    public final void v(long j6, String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeLong(j6);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        F(parcelB, 10);
    }

    @Override // m2.G
    public final List w(String str, String str2, String str3, boolean z5) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.G.f6599a;
        parcelB.writeInt(z5 ? 1 : 0);
        Parcel parcelE = E(parcelB, 15);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(G1.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // m2.G
    public final List y(String str, String str2, String str3) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        parcelB.writeString(str3);
        Parcel parcelE = E(parcelB, 17);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(C1029d.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // m2.G
    public final List z(String str, String str2, B1 b1) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        Parcel parcelE = E(parcelB, 16);
        ArrayList arrayListCreateTypedArrayList = parcelE.createTypedArrayList(C1029d.CREATOR);
        parcelE.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // m2.G
    /* JADX INFO: renamed from: g */
    public final void mo1g(Bundle bundle, B1 b1) {
        Parcel parcelB = b();
        com.google.android.gms.internal.measurement.G.c(parcelB, bundle);
        com.google.android.gms.internal.measurement.G.c(parcelB, b1);
        F(parcelB, 19);
    }
}
