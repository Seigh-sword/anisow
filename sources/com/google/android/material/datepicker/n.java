package com.google.android.material.datepicker;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new M(22);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f7230A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f7231B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f7232C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Calendar f7233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f7234x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f7235y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f7236z;

    public n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarB = u.b(calendar);
        this.f7233w = calendarB;
        this.f7234x = calendarB.get(2);
        this.f7235y = calendarB.get(1);
        this.f7236z = calendarB.getMaximum(7);
        this.f7230A = calendarB.getActualMaximum(5);
        this.f7231B = calendarB.getTimeInMillis();
    }

    public static n a(int i6, int i7) {
        Calendar calendarD = u.d(null);
        calendarD.set(1, i6);
        calendarD.set(2, i7);
        return new n(calendarD);
    }

    public static n b(long j6) {
        Calendar calendarD = u.d(null);
        calendarD.setTimeInMillis(j6);
        return new n(calendarD);
    }

    public final String c() {
        if (this.f7232C == null) {
            this.f7232C = u.a("yMMMM", Locale.getDefault()).format(new Date(this.f7233w.getTimeInMillis()));
        }
        return this.f7232C;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7233w.compareTo(((n) obj).f7233w);
    }

    public final int d(n nVar) {
        if (!(this.f7233w instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (nVar.f7234x - this.f7234x) + ((nVar.f7235y - this.f7235y) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f7234x == nVar.f7234x && this.f7235y == nVar.f7235y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7234x), Integer.valueOf(this.f7235y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f7235y);
        parcel.writeInt(this.f7234x);
    }
}
