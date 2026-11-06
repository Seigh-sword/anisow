package S2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.xo.anilab.R;
import java.util.List;
import java.util.Locale;
import m.C0984s;
import m.K0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public final class t extends C0984s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final K0 f3211A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AccessibilityManager f3212B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f3213C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f3214D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float f3215E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ColorStateList f3216F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f3217G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ColorStateList f3218H;

    public t(Context context, AttributeSet attributeSet) {
        super(U2.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f3213C = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = H2.m.e(context2, attributeSet, AbstractC1274a.f12460n, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayE.hasValue(0) && typedArrayE.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f3214D = typedArrayE.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f3215E = typedArrayE.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayE.hasValue(2)) {
            this.f3216F = ColorStateList.valueOf(typedArrayE.getColor(2, 0));
        }
        this.f3217G = typedArrayE.getColor(4, 0);
        this.f3218H = f2.h.o(context2, typedArrayE, 5);
        this.f3212B = (AccessibilityManager) context2.getSystemService("accessibility");
        K0 k02 = new K0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f3211A = k02;
        k02.f10157U = true;
        k02.f10158V.setFocusable(true);
        k02.f10147K = this;
        k02.f10158V.setInputMethodMode(2);
        k02.o(getAdapter());
        k02.f10148L = new r(this);
        if (typedArrayE.hasValue(6)) {
            setSimpleItems(typedArrayE.getResourceId(6, 0));
        }
        typedArrayE.recycle();
    }

    public static void a(t tVar, Object obj) {
        tVar.setText(tVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f3212B;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f3211A.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f3216F;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f7351d0) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f3215E;
    }

    public int getSimpleItemSelectedColor() {
        return this.f3217G;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f3218H;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f7351d0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3211A.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                K0 k02 = this.f3211A;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !k02.f10158V.isShowing() ? -1 : k02.f10161y.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = k02.f10158V.getBackground();
                if (background != null) {
                    Rect rect = this.f3213C;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z5);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t5) {
        super.setAdapter(t5);
        this.f3211A.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        K0 k02 = this.f3211A;
        if (k02 != null) {
            k02.m(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i6) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i6));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f3216F = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof P2.g) {
            ((P2.g) dropDownBackground).n(this.f3216F);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f3211A.f10149M = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i6) {
        super.setRawInputType(i6);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i6) {
        this.f3217G = i6;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f3218H = colorStateList;
        if (getAdapter() instanceof s) {
            ((s) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i6) {
        setSimpleItems(getResources().getStringArray(i6));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f3211A.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new s(this, getContext(), this.f3214D, strArr));
    }
}
