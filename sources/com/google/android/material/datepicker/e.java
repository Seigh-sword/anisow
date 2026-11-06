package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.xo.anilab.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7178d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f7179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7181c;

    static {
        f7178d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public e() {
        Calendar calendarD = u.d(null);
        this.f7179a = calendarD;
        this.f7180b = calendarD.getMaximum(7);
        this.f7181c = calendarD.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f7180b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        int i7 = this.f7180b;
        if (i6 >= i7) {
            return null;
        }
        int i8 = i6 + this.f7181c;
        if (i8 > i7) {
            i8 -= i7;
        }
        return Integer.valueOf(i8);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i7 = i6 + this.f7181c;
        int i8 = this.f7180b;
        if (i7 > i8) {
            i7 -= i8;
        }
        Calendar calendar = this.f7179a;
        calendar.set(7, i7);
        textView.setText(calendar.getDisplayName(7, f7178d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i6) {
        Calendar calendarD = u.d(null);
        this.f7179a = calendarD;
        this.f7180b = calendarD.getMaximum(7);
        this.f7181c = i6;
    }
}
