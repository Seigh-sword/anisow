package com.google.android.gms.common.api;

import Y1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new android.support.v4.media.a(22);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6434x;

    public Scope(int i6, String str) {
        AbstractC1332d.h("scopeUri must not be null or empty", str);
        this.f6433w = i6;
        this.f6434x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f6434x.equals(((Scope) obj).f6434x);
    }

    public final int hashCode() {
        return this.f6434x.hashCode();
    }

    public final String toString() {
        return this.f6434x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f6433w);
        AbstractC1332d.F0(parcel, 2, this.f6434x);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
