package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class o extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7237d = u.d(null).getMaximum(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f7238e = (u.d(null).getMaximum(7) + u.d(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f7239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.support.v4.media.b f7240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f7241c;

    public o(n nVar, c cVar) {
        this.f7239a = nVar;
        this.f7241c = cVar;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.f7241c.f7170A;
        n nVar = this.f7239a;
        Calendar calendar = nVar.f7233w;
        int i6 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i7 = i6 - firstDayOfWeek;
        return i7 < 0 ? i7 + nVar.f7236z : i7;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i6) {
        if (i6 < a() || i6 > c()) {
            return null;
        }
        int iA = (i6 - a()) + 1;
        Calendar calendarB = u.b(this.f7239a.f7233w);
        calendarB.set(5, iA);
        return Long.valueOf(calendarB.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f7239a.f7230A) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f7238e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6 / this.f7239a.f7236z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            android.support.v4.media.b r1 = r4.f7240b
            if (r1 != 0) goto Lf
            android.support.v4.media.b r1 = new android.support.v4.media.b
            r1.<init>(r0)
            r4.f7240b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131427417(0x7f0b0059, float:1.847645E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.n r7 = r4.f7239a
            int r2 = r7.f7230A
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            if (r0 != 0) goto L6f
        L6e:
            return r0
        L6f:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.u.c()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
