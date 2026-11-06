package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import v0.AbstractC1393d0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1393d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f7189a;

    public i(k kVar) {
        this.f7189a = kVar;
        u.d(null);
        u.d(null);
    }

    @Override // v0.AbstractC1393d0
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            int i6 = k.f7193F0;
            this.f7189a.getClass();
            throw null;
        }
    }
}
