package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xo.anilab.R;
import java.util.Locale;
import v0.W;
import v0.u0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends W {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f7252d;

    public w(k kVar) {
        this.f7252d = kVar;
    }

    @Override // v0.W
    public final int a() {
        return this.f7252d.f7199v0.f7171B;
    }

    @Override // v0.W
    public final void c(u0 u0Var, int i6) {
        k kVar = this.f7252d;
        int i7 = kVar.f7199v0.f7173w.f7235y + i6;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
        TextView textView = ((v) u0Var).f7251u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(u.c().get(1) == i7 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i7)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i7)));
        android.support.v4.media.b bVar = kVar.f7202y0;
        if (u.c().get(1) == i7) {
            Object obj = bVar.f5070f;
        } else {
            Object obj2 = bVar.f5068d;
        }
        throw null;
    }

    @Override // v0.W
    public final u0 d(RecyclerView recyclerView) {
        return new v((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
