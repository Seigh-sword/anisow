package com.google.android.gms.common.api;

import U1.b;
import Y1.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new android.support.v4.media.a(23);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6436x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final PendingIntent f6437y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f6438z;

    public Status(int i6, String str, PendingIntent pendingIntent, b bVar) {
        this.f6435w = i6;
        this.f6436x = str;
        this.f6437y = pendingIntent;
        this.f6438z = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6435w == status.f6435w && AbstractC1332d.D(this.f6436x, status.f6436x) && AbstractC1332d.D(this.f6437y, status.f6437y) && AbstractC1332d.D(this.f6438z, status.f6438z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6435w), this.f6436x, this.f6437y, this.f6438z});
    }

    public final String toString() {
        C1358b c1358b = new C1358b(this);
        String strI = this.f6436x;
        if (strI == null) {
            strI = AbstractC1332d.I(this.f6435w);
        }
        c1358b.c(strI, "statusCode");
        c1358b.c(this.f6437y, "resolution");
        return c1358b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f6435w);
        AbstractC1332d.F0(parcel, 2, this.f6436x);
        AbstractC1332d.D0(parcel, 3, this.f6437y, i6);
        AbstractC1332d.D0(parcel, 4, this.f6438z, i6);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
