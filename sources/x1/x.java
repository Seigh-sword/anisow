package X1;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class x extends Y1.a {
    public static final Parcelable.Creator<x> CREATOR = new android.support.v4.media.a(26);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4658w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Account f4659x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f4660y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final GoogleSignInAccount f4661z;

    public x(int i6, Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this.f4658w = i6;
        this.f4659x = account;
        this.f4660y = i7;
        this.f4661z = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f4658w);
        AbstractC1332d.D0(parcel, 2, this.f4659x, i6);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f4660y);
        AbstractC1332d.D0(parcel, 4, this.f4661z, i6);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
