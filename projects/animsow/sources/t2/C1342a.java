package t2;

import android.os.Parcel;
import android.os.Parcelable;
import m.g1;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1342a extends U.b {
    public static final Parcelable.Creator<C1342a> CREATOR = new g1(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f12725A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f12726B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f12727C;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f12728y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f12729z;

    public C1342a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12728y = parcel.readByte() != 0;
        this.f12729z = parcel.readByte() != 0;
        this.f12725A = parcel.readInt();
        this.f12726B = parcel.readFloat();
        this.f12727C = parcel.readByte() != 0;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeByte(this.f12728y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12729z ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12725A);
        parcel.writeFloat(this.f12726B);
        parcel.writeByte(this.f12727C ? (byte) 1 : (byte) 0);
    }
}
