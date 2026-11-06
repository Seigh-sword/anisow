package com.google.android.material.timepicker;

import H2.l;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f7410w;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f7410w = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f7410w;
        if (zIsEmpty) {
            chipTextInputComboView.f7378w.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f7378w;
        if (TextUtils.isEmpty(strA)) {
            strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(strA);
    }
}
