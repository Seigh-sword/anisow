package m2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends Y1.a {
    public static final Parcelable.Creator<B1> CREATOR = new X1.M(13);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f10497A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f10498B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f10499C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f10500D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f10501E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f10502F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f10503G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final long f10504H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final long f10505I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f10506J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f10507K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f10508L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final String f10509M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Boolean f10510N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final long f10511O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final List f10512P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f10513Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final String f10514R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final String f10515S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final String f10516T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final boolean f10517U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final long f10518V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int f10519W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final String f10520X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f10521Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final long f10522Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final String f10523a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final String f10524b0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f10525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f10527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f10528z;

    public B1(String str, String str2, String str3, long j6, String str4, long j7, long j8, String str5, boolean z5, boolean z6, String str6, long j9, int i6, boolean z7, boolean z8, String str7, Boolean bool, long j10, List list, String str8, String str9, String str10, boolean z9, long j11, int i7, String str11, int i8, long j12, String str12, String str13) {
        AbstractC1332d.g(str);
        this.f10525w = str;
        this.f10526x = TextUtils.isEmpty(str2) ? null : str2;
        this.f10527y = str3;
        this.f10502F = j6;
        this.f10528z = str4;
        this.f10497A = j7;
        this.f10498B = j8;
        this.f10499C = str5;
        this.f10500D = z5;
        this.f10501E = z6;
        this.f10503G = str6;
        this.f10504H = 0L;
        this.f10505I = j9;
        this.f10506J = i6;
        this.f10507K = z7;
        this.f10508L = z8;
        this.f10509M = str7;
        this.f10510N = bool;
        this.f10511O = j10;
        this.f10512P = list;
        this.f10513Q = null;
        this.f10514R = str8;
        this.f10515S = str9;
        this.f10516T = str10;
        this.f10517U = z9;
        this.f10518V = j11;
        this.f10519W = i7;
        this.f10520X = str11;
        this.f10521Y = i8;
        this.f10522Z = j12;
        this.f10523a0 = str12;
        this.f10524b0 = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.F0(parcel, 2, this.f10525w);
        AbstractC1332d.F0(parcel, 3, this.f10526x);
        AbstractC1332d.F0(parcel, 4, this.f10527y);
        AbstractC1332d.F0(parcel, 5, this.f10528z);
        AbstractC1332d.N0(parcel, 6, 8);
        parcel.writeLong(this.f10497A);
        AbstractC1332d.N0(parcel, 7, 8);
        parcel.writeLong(this.f10498B);
        AbstractC1332d.F0(parcel, 8, this.f10499C);
        AbstractC1332d.N0(parcel, 9, 4);
        parcel.writeInt(this.f10500D ? 1 : 0);
        AbstractC1332d.N0(parcel, 10, 4);
        parcel.writeInt(this.f10501E ? 1 : 0);
        AbstractC1332d.N0(parcel, 11, 8);
        parcel.writeLong(this.f10502F);
        AbstractC1332d.F0(parcel, 12, this.f10503G);
        AbstractC1332d.N0(parcel, 13, 8);
        parcel.writeLong(this.f10504H);
        AbstractC1332d.N0(parcel, 14, 8);
        parcel.writeLong(this.f10505I);
        AbstractC1332d.N0(parcel, 15, 4);
        parcel.writeInt(this.f10506J);
        AbstractC1332d.N0(parcel, 16, 4);
        parcel.writeInt(this.f10507K ? 1 : 0);
        AbstractC1332d.N0(parcel, 18, 4);
        parcel.writeInt(this.f10508L ? 1 : 0);
        AbstractC1332d.F0(parcel, 19, this.f10509M);
        Boolean bool = this.f10510N;
        if (bool != null) {
            AbstractC1332d.N0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AbstractC1332d.N0(parcel, 22, 8);
        parcel.writeLong(this.f10511O);
        List<String> list = this.f10512P;
        if (list != null) {
            int iJ02 = AbstractC1332d.J0(parcel, 23);
            parcel.writeStringList(list);
            AbstractC1332d.L0(parcel, iJ02);
        }
        AbstractC1332d.F0(parcel, 24, this.f10513Q);
        AbstractC1332d.F0(parcel, 25, this.f10514R);
        AbstractC1332d.F0(parcel, 26, this.f10515S);
        AbstractC1332d.F0(parcel, 27, this.f10516T);
        AbstractC1332d.N0(parcel, 28, 4);
        parcel.writeInt(this.f10517U ? 1 : 0);
        AbstractC1332d.N0(parcel, 29, 8);
        parcel.writeLong(this.f10518V);
        AbstractC1332d.N0(parcel, 30, 4);
        parcel.writeInt(this.f10519W);
        AbstractC1332d.F0(parcel, 31, this.f10520X);
        AbstractC1332d.N0(parcel, 32, 4);
        parcel.writeInt(this.f10521Y);
        AbstractC1332d.N0(parcel, 34, 8);
        parcel.writeLong(this.f10522Z);
        AbstractC1332d.F0(parcel, 35, this.f10523a0);
        AbstractC1332d.F0(parcel, 36, this.f10524b0);
        AbstractC1332d.L0(parcel, iJ0);
    }

    public B1(String str, String str2, String str3, String str4, long j6, long j7, String str5, boolean z5, boolean z6, long j8, String str6, long j9, long j10, int i6, boolean z7, boolean z8, String str7, Boolean bool, long j11, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z9, long j12, int i7, String str12, int i8, long j13, String str13, String str14) {
        this.f10525w = str;
        this.f10526x = str2;
        this.f10527y = str3;
        this.f10502F = j8;
        this.f10528z = str4;
        this.f10497A = j6;
        this.f10498B = j7;
        this.f10499C = str5;
        this.f10500D = z5;
        this.f10501E = z6;
        this.f10503G = str6;
        this.f10504H = j9;
        this.f10505I = j10;
        this.f10506J = i6;
        this.f10507K = z7;
        this.f10508L = z8;
        this.f10509M = str7;
        this.f10510N = bool;
        this.f10511O = j11;
        this.f10512P = arrayList;
        this.f10513Q = str8;
        this.f10514R = str9;
        this.f10515S = str10;
        this.f10516T = str11;
        this.f10517U = z9;
        this.f10518V = j12;
        this.f10519W = i7;
        this.f10520X = str12;
        this.f10521Y = i8;
        this.f10522Z = j13;
        this.f10523a0 = str13;
        this.f10524b0 = str14;
    }
}
