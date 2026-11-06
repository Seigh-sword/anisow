package com.google.android.material.timepicker;

import N.V;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r2.AbstractC1274a;
import z.C1518i;
import z.C1519j;
import z.n;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends f implements d {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final ClockHandView f7380R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Rect f7381S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final RectF f7382T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Rect f7383U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final SparseArray f7384V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final c f7385W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int[] f7386a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final float[] f7387b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f7388c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f7389d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f7390e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f7391f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String[] f7392g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f7393h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ColorStateList f7394i0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7381S = new Rect();
        this.f7382T = new RectF();
        this.f7383U = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f7384V = sparseArray;
        this.f7387b0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12454h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListO = f2.h.o(context, typedArrayObtainStyledAttributes, 1);
        this.f7394i0 = colorStateListO;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f7380R = clockHandView;
        this.f7388c0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListO.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListO.getDefaultColor());
        this.f7386a0 = new int[]{colorForState, colorForState, colorStateListO.getDefaultColor()};
        clockHandView.f7406y.add(this);
        int defaultColor = E.f.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListO2 = f2.h.o(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListO2 != null ? colorStateListO2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f7385W = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f7392g0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z5 = false;
        for (int i6 = 0; i6 < Math.max(this.f7392g0.length, size); i6++) {
            TextView textView = (TextView) sparseArray.get(i6);
            if (i6 >= this.f7392g0.length) {
                removeView(textView);
                sparseArray.remove(i6);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i6, textView);
                    addView(textView);
                }
                textView.setText(this.f7392g0[i6]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i6));
                int i7 = (i6 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i7));
                z5 = i7 > 1 ? true : z5;
                V.l(textView, this.f7385W);
                textView.setTextColor(this.f7394i0);
            }
        }
        ClockHandView clockHandView2 = this.f7380R;
        if (clockHandView2.f7405x && !z5) {
            clockHandView2.f7403I = 1;
        }
        clockHandView2.f7405x = z5;
        clockHandView2.invalidate();
        this.f7389d0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f7390e0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f7391f0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.f
    public final void m() {
        n nVar = new n();
        nVar.b(this);
        HashMap map = new HashMap();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i7 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i7 == null) {
                    i7 = 1;
                }
                if (!map.containsKey(i7)) {
                    map.put(i7, new ArrayList());
                }
                ((List) map.get(i7)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f7415P * 0.66f) : this.f7415P;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = nVar.f14050c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new C1518i());
                }
                C1519j c1519j = ((C1518i) map2.get(Integer.valueOf(id))).f13946d;
                c1519j.f14016z = R.id.circle_center;
                c1519j.f13950A = iRound;
                c1519j.f13951B = size;
                size += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.f7384V;
            if (i8 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i8)).setVisibility(0);
            i8++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f7380R.f7397C;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i6 = 0;
        while (true) {
            sparseArray = this.f7384V;
            int size = sparseArray.size();
            rectF = this.f7382T;
            rect = this.f7381S;
            if (i6 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i6);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f6) {
                    textView = textView2;
                    f6 = fHeight;
                }
            }
            i6++;
        }
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            TextView textView3 = (TextView) sparseArray.get(i7);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f7383U);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f7386a0, this.f7387b0, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f7392g0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f7391f0 / Math.max(Math.max(this.f7389d0 / displayMetrics.heightPixels, this.f7390e0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
