package com.google.android.material.timepicker;

import G1.m;
import N.V;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xo.anilab.R;
import java.util.WeakHashMap;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ConstraintLayout {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final e f7414O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f7415P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final P2.g f7416Q;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.e] */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        P2.g gVar = new P2.g();
        this.f7416Q = gVar;
        P2.h hVar = new P2.h(0.5f);
        m mVarE = gVar.f2457w.f2417a.e();
        mVarE.f812e = hVar;
        mVarE.f813f = hVar;
        mVarE.f814g = hVar;
        mVarE.f815h = hVar;
        gVar.setShapeAppearanceModel(mVarE.a());
        this.f7416Q.n(ColorStateList.valueOf(-1));
        P2.g gVar2 = this.f7416Q;
        WeakHashMap weakHashMap = V.f1964a;
        setBackground(gVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12438B, R.attr.materialClockStyle, 0);
        this.f7415P = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f7414O = new Runnable() { // from class: com.google.android.material.timepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f7413w.m();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = V.f1964a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f7414O;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f7414O;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i6) {
        this.f7416Q.n(ColorStateList.valueOf(i6));
    }
}
