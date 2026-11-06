package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: h0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0737b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8755a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8755a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C0738c(parcel);
            case 1:
                return new C0739d(parcel);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                S s5 = new S();
                s5.f8673w = parcel.readString();
                s5.f8674x = parcel.readInt();
                return s5;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                X x5 = new X();
                x5.f8721A = null;
                x5.f8722B = new ArrayList();
                x5.f8723C = new ArrayList();
                x5.f8725w = parcel.createStringArrayList();
                x5.f8726x = parcel.createStringArrayList();
                x5.f8727y = (C0738c[]) parcel.createTypedArray(C0738c.CREATOR);
                x5.f8728z = parcel.readInt();
                x5.f8721A = parcel.readString();
                x5.f8722B = parcel.createStringArrayList();
                x5.f8723C = parcel.createTypedArrayList(C0739d.CREATOR);
                x5.f8724D = parcel.createTypedArrayList(S.CREATOR);
                return x5;
            default:
                return new b0(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.f8755a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new C0738c[i6];
            case 1:
                return new C0739d[i6];
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return new S[i6];
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new X[i6];
            default:
                return new b0[i6];
        }
    }
}
