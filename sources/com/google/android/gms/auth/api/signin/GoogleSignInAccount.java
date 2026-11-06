package com.google.android.gms.auth.api.signin;

import Y1.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new android.support.v4.media.a(19);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f6417A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Uri f6418B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f6419C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f6420D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final String f6421E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final List f6422F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f6423G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f6424H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final HashSet f6425I = new HashSet();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f6428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f6429z;

    public GoogleSignInAccount(int i6, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, ArrayList arrayList, String str7, String str8) {
        this.f6426w = i6;
        this.f6427x = str;
        this.f6428y = str2;
        this.f6429z = str3;
        this.f6417A = str4;
        this.f6418B = uri;
        this.f6419C = str5;
        this.f6420D = j6;
        this.f6421E = str6;
        this.f6422F = arrayList;
        this.f6423G = str7;
        this.f6424H = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j6 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            hashSet.add(new Scope(1, jSONArray.getString(i6)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC1332d.g(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j6, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f6419C = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f6421E.equals(this.f6421E)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f6422F);
            hashSet.addAll(googleSignInAccount.f6425I);
            HashSet hashSet2 = new HashSet(this.f6422F);
            hashSet2.addAll(this.f6425I);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6421E.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f6422F);
        hashSet.addAll(this.f6425I);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f6426w);
        AbstractC1332d.F0(parcel, 2, this.f6427x);
        AbstractC1332d.F0(parcel, 3, this.f6428y);
        AbstractC1332d.F0(parcel, 4, this.f6429z);
        AbstractC1332d.F0(parcel, 5, this.f6417A);
        AbstractC1332d.D0(parcel, 6, this.f6418B, i6);
        AbstractC1332d.F0(parcel, 7, this.f6419C);
        AbstractC1332d.N0(parcel, 8, 8);
        parcel.writeLong(this.f6420D);
        AbstractC1332d.F0(parcel, 9, this.f6421E);
        AbstractC1332d.H0(parcel, 10, this.f6422F);
        AbstractC1332d.F0(parcel, 11, this.f6423G);
        AbstractC1332d.F0(parcel, 12, this.f6424H);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
