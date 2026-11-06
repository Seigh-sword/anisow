package u2;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new M(18);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Integer f12879A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Integer f12880B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Integer f12881C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Integer f12882D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f12884F;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Locale f12888J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CharSequence f12889K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CharSequence f12890L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12891M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f12892N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Integer f12893O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Integer f12895Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Integer f12896R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Integer f12897S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Integer f12898T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Integer f12899U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Integer f12900V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Integer f12901W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Integer f12902X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Integer f12903Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Boolean f12904Z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f12906x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f12907y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f12908z;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f12883E = 255;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f12885G = -2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f12886H = -2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f12887I = -2;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Boolean f12894P = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f12905w);
        parcel.writeSerializable(this.f12906x);
        parcel.writeSerializable(this.f12907y);
        parcel.writeSerializable(this.f12908z);
        parcel.writeSerializable(this.f12879A);
        parcel.writeSerializable(this.f12880B);
        parcel.writeSerializable(this.f12881C);
        parcel.writeSerializable(this.f12882D);
        parcel.writeInt(this.f12883E);
        parcel.writeString(this.f12884F);
        parcel.writeInt(this.f12885G);
        parcel.writeInt(this.f12886H);
        parcel.writeInt(this.f12887I);
        CharSequence charSequence = this.f12889K;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f12890L;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f12891M);
        parcel.writeSerializable(this.f12893O);
        parcel.writeSerializable(this.f12895Q);
        parcel.writeSerializable(this.f12896R);
        parcel.writeSerializable(this.f12897S);
        parcel.writeSerializable(this.f12898T);
        parcel.writeSerializable(this.f12899U);
        parcel.writeSerializable(this.f12900V);
        parcel.writeSerializable(this.f12903Y);
        parcel.writeSerializable(this.f12901W);
        parcel.writeSerializable(this.f12902X);
        parcel.writeSerializable(this.f12894P);
        parcel.writeSerializable(this.f12888J);
        parcel.writeSerializable(this.f12904Z);
    }
}
