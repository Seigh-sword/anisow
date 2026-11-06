package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class m<S> extends s {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f7228u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public c f7229v0;

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void A(Bundle bundle) {
        super.A(bundle);
        if (bundle == null) {
            bundle = this.f8591B;
        }
        this.f7228u0 = bundle.getInt("THEME_RES_ID_KEY");
        H1.a.o(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7229v0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m(), this.f7228u0));
        throw null;
    }

    @Override // h0.AbstractComponentCallbacksC0734B
    public final void H(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f7228u0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7229v0);
    }
}
