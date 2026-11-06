package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import d2.AbstractC0651b;
import l.ViewTreeObserverOnGlobalLayoutListenerC0912e;

/* JADX INFO: loaded from: classes.dex */
public final class W extends Spinner {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f10209E = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f10210A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final V f10211B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10212C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f10213D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0986t f10214w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f10215x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0971l f10216y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SpinnerAdapter f10217z;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public W(android.content.Context r12, android.util.AttributeSet r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.W.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i6 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f10213D;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0986t c0986t = this.f10214w;
        if (c0986t != null) {
            c0986t.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        V v5 = this.f10211B;
        return v5 != null ? v5.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        V v5 = this.f10211B;
        return v5 != null ? v5.g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f10211B != null ? this.f10212C : super.getDropDownWidth();
    }

    public final V getInternalPopup() {
        return this.f10211B;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        V v5 = this.f10211B;
        return v5 != null ? v5.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f10215x;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        V v5 = this.f10211B;
        return v5 != null ? v5.j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10214w;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10214w;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V v5 = this.f10211B;
        if (v5 == null || !v5.a()) {
            return;
        }
        v5.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f10211B == null || View.MeasureSpec.getMode(i6) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        U u5 = (U) parcelable;
        super.onRestoreInstanceState(u5.getSuperState());
        if (!u5.f10205w || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0912e(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        U u5 = new U(super.onSaveInstanceState());
        V v5 = this.f10211B;
        u5.f10205w = v5 != null && v5.a();
        return u5;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0971l c0971l = this.f10216y;
        if (c0971l == null || !c0971l.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        V v5 = this.f10211B;
        if (v5 == null) {
            return super.performClick();
        }
        if (v5.a()) {
            return true;
        }
        this.f10211B.d(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10214w;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10214w;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i6) {
        V v5 = this.f10211B;
        if (v5 == null) {
            super.setDropDownHorizontalOffset(i6);
        } else {
            v5.p(i6);
            v5.b(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i6) {
        V v5 = this.f10211B;
        if (v5 != null) {
            v5.n(i6);
        } else {
            super.setDropDownVerticalOffset(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i6) {
        if (this.f10211B != null) {
            this.f10212C = i6;
        } else {
            super.setDropDownWidth(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        V v5 = this.f10211B;
        if (v5 != null) {
            v5.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i6) {
        setPopupBackgroundDrawable(AbstractC0651b.p(getPopupContext(), i6));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        V v5 = this.f10211B;
        if (v5 != null) {
            v5.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0986t c0986t = this.f10214w;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10214w;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f10210A) {
            this.f10217z = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        V v5 = this.f10211B;
        if (v5 != null) {
            Context context = this.f10215x;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            Q q5 = new Q();
            q5.f10180a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                q5.f10181b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                O.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            v5.o(q5);
        }
    }
}
