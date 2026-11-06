package com.google.android.material.button;

import H2.m;
import N.V;
import P2.j;
import U2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.h;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p1.C1243i;
import r2.AbstractC1274a;
import u.f;
import y2.C1503e;
import z2.d;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f7125G = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Integer[] f7126A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f7127B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f7128C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f7129D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f7130E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public HashSet f7131F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f7132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1243i f7133x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f7134y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f7135z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f7132w = new ArrayList();
        this.f7133x = new C1243i(this);
        this.f7134y = new LinkedHashSet();
        this.f7135z = new f(1, this);
        this.f7127B = false;
        this.f7131F = new HashSet();
        TypedArray typedArrayE = m.e(getContext(), attributeSet, AbstractC1274a.f12462p, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayE.getBoolean(3, false));
        this.f7130E = typedArrayE.getResourceId(1, -1);
        this.f7129D = typedArrayE.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
        WeakHashMap weakHashMap = V.f1964a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (c(i6)) {
                return i6;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if ((getChildAt(i7) instanceof MaterialButton) && c(i7)) {
                i6++;
            }
        }
        return i6;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = V.f1964a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f7133x);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i6 = firstVisibleChildIndex + 1; i6 < getChildCount(); i6++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i6);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i6 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f7121K);
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f7132w.add(new d(shapeAppearanceModel.f2466e, shapeAppearanceModel.f2469h, shapeAppearanceModel.f2467f, shapeAppearanceModel.f2468g));
        materialButton.setEnabled(isEnabled());
        V.l(materialButton, new C1503e(1, this));
    }

    public final void b(int i6, boolean z5) {
        if (i6 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i6);
            return;
        }
        HashSet hashSet = new HashSet(this.f7131F);
        if (z5 && !hashSet.contains(Integer.valueOf(i6))) {
            if (this.f7128C && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i6));
        } else {
            if (z5 || !hashSet.contains(Integer.valueOf(i6))) {
                return;
            }
            if (!this.f7129D || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i6));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i6) {
        return getChildAt(i6).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f7131F;
        this.f7131F = new HashSet(set);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = ((MaterialButton) getChildAt(i6)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f7127B = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f7127B = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f7134y.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f7135z);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            treeMap.put((MaterialButton) getChildAt(i6), Integer.valueOf(i6));
        }
        this.f7126A = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i6 = 0; i6 < childCount; i6++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i6);
            if (materialButton.getVisibility() != 8) {
                G1.m mVarE = materialButton.getShapeAppearanceModel().e();
                d dVar2 = (d) this.f7132w.get(i6);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z5 = getOrientation() == 0;
                    P2.a aVar = d.f14103e;
                    if (i6 == firstVisibleChildIndex) {
                        dVar = z5 ? f2.h.w(this) ? new d(aVar, aVar, dVar2.f14105b, dVar2.f14106c) : new d(dVar2.f14104a, dVar2.f14107d, aVar, aVar) : new d(dVar2.f14104a, aVar, dVar2.f14105b, aVar);
                    } else if (i6 == lastVisibleChildIndex) {
                        dVar = z5 ? f2.h.w(this) ? new d(dVar2.f14104a, dVar2.f14107d, aVar, aVar) : new d(aVar, aVar, dVar2.f14105b, dVar2.f14106c) : new d(aVar, dVar2.f14107d, aVar, dVar2.f14106c);
                    } else {
                        dVar2 = null;
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    mVarE.f812e = new P2.a(0.0f);
                    mVarE.f813f = new P2.a(0.0f);
                    mVarE.f814g = new P2.a(0.0f);
                    mVarE.f815h = new P2.a(0.0f);
                } else {
                    mVarE.f812e = dVar2.f14104a;
                    mVarE.f815h = dVar2.f14107d;
                    mVarE.f813f = dVar2.f14105b;
                    mVarE.f814g = dVar2.f14106c;
                }
                materialButton.setShapeAppearanceModel(mVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f7128C || this.f7131F.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f7131F.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = ((MaterialButton) getChildAt(i6)).getId();
            if (this.f7131F.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i7) {
        Integer[] numArr = this.f7126A;
        if (numArr != null && i7 < numArr.length) {
            return numArr[i7].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i7;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.f7130E;
        if (i6 != -1) {
            d(Collections.singleton(Integer.valueOf(i6)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f7128C ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        e();
        a();
        super.onMeasure(i6, i7);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f7132w.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            ((MaterialButton) getChildAt(i6)).setEnabled(z5);
        }
    }

    public void setSelectionRequired(boolean z5) {
        this.f7129D = z5;
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }

    public void setSingleSelection(boolean z5) {
        if (this.f7128C != z5) {
            this.f7128C = z5;
            d(new HashSet());
        }
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            ((MaterialButton) getChildAt(i6)).setA11yClassName((this.f7128C ? RadioButton.class : ToggleButton.class).getName());
        }
    }
}
