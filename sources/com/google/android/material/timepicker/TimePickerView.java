package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.xo.anilab.R;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f7408P = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Chip f7409O;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i iVar = new i(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f7134y.add(new h(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f7409O = chip2;
        k kVar = new k(new GestureDetector(getContext(), new j(this)));
        chip.setOnTouchListener(kVar);
        chip2.setOnTouchListener(kVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(iVar);
        chip2.setOnClickListener(iVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i6) {
        super.onVisibilityChanged(view, i6);
        if (view == this && i6 == 0) {
            this.f7409O.sendAccessibilityEvent(8);
        }
    }
}
