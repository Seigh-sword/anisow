package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import v0.S;
import v0.r0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends LinearLayoutManager {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f7187E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ k f7188F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, int i6, int i7) {
        super(i6);
        this.f7188F = kVar;
        this.f7187E = i7;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(r0 r0Var, int[] iArr) {
        int i6 = this.f7187E;
        k kVar = this.f7188F;
        if (i6 == 0) {
            iArr[0] = kVar.f7194A0.getWidth();
            iArr[1] = kVar.f7194A0.getWidth();
        } else {
            iArr[0] = kVar.f7194A0.getHeight();
            iArr[1] = kVar.f7194A0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, v0.AbstractC1397f0
    public final void y0(RecyclerView recyclerView, int i6) {
        S s5 = new S(this, recyclerView.getContext(), 2);
        s5.f13040a = i6;
        z0(s5);
    }
}
