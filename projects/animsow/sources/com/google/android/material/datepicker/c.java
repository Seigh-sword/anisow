package com.google.android.material.datepicker;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new M(20);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f7170A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f7171B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f7172C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f7173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f7174x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f7175y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final n f7176z;

    public c(n nVar, n nVar2, b bVar, n nVar3, int i6) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(bVar, "validator cannot be null");
        this.f7173w = nVar;
        this.f7174x = nVar2;
        this.f7176z = nVar3;
        this.f7170A = i6;
        this.f7175y = bVar;
        if (nVar3 != null && nVar.f7233w.compareTo(nVar3.f7233w) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.f7233w.compareTo(nVar2.f7233w) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i6 < 0 || i6 > u.d(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f7172C = nVar.d(nVar2) + 1;
        this.f7171B = (nVar2.f7235y - nVar.f7235y) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7173w.equals(cVar.f7173w) && this.f7174x.equals(cVar.f7174x) && Objects.equals(this.f7176z, cVar.f7176z) && this.f7170A == cVar.f7170A && this.f7175y.equals(cVar.f7175y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7173w, this.f7174x, this.f7176z, Integer.valueOf(this.f7170A), this.f7175y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f7173w, 0);
        parcel.writeParcelable(this.f7174x, 0);
        parcel.writeParcelable(this.f7176z, 0);
        parcel.writeParcelable(this.f7175y, 0);
        parcel.writeInt(this.f7170A);
    }
}
