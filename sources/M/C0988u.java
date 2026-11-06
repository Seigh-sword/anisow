package m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import d2.AbstractC0651b;

/* JADX INFO: renamed from: m.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0988u extends Button {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0986t f10389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0956d0 f10390x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0948C f10391y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0988u(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Y0.a(context);
        X0.a(getContext(), this);
        C0986t c0986t = new C0986t(this);
        this.f10389w = c0986t;
        c0986t.e(attributeSet, i6);
        C0956d0 c0956d0 = new C0956d0(this);
        this.f10390x = c0956d0;
        c0956d0.f(attributeSet, i6);
        c0956d0.b();
        getEmojiTextViewHelper().a(attributeSet, i6);
    }

    private C0948C getEmojiTextViewHelper() {
        if (this.f10391y == null) {
            this.f10391y = new C0948C(this);
        }
        return this.f10391y;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0986t c0986t = this.f10389w;
        if (c0986t != null) {
            c0986t.a();
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p1.f10365c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            return Math.round(c0956d0.f10258i.f10326e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p1.f10365c) {
            return super.getAutoSizeMinTextSize();
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            return Math.round(c0956d0.f10258i.f10325d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p1.f10365c) {
            return super.getAutoSizeStepGranularity();
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            return Math.round(c0956d0.f10258i.f10324c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p1.f10365c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0956d0 c0956d0 = this.f10390x;
        return c0956d0 != null ? c0956d0.f10258i.f10327f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (p1.f10365c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            return c0956d0.f10258i.f10322a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0651b.E(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10389w;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10389w;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10390x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10390x.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 == null || p1.f10365c) {
            return;
        }
        c0956d0.f10258i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 == null || p1.f10365c) {
            return;
        }
        C0974m0 c0974m0 = c0956d0.f10258i;
        if (c0974m0.f()) {
            c0974m0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i7, int i8, int i9) {
        if (p1.f10365c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
            return;
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            c0956d0.i(i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (p1.f10365c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            c0956d0.j(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (p1.f10365c) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            c0956d0.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10389w;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10389w;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0651b.G(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((B3.e) getEmojiTextViewHelper().f10089b.f1734x).r(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z5) {
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            c0956d0.f10250a.setAllCaps(z5);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0986t c0986t = this.f10389w;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10389w;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0956d0 c0956d0 = this.f10390x;
        c0956d0.l(colorStateList);
        c0956d0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0956d0 c0956d0 = this.f10390x;
        c0956d0.m(mode);
        c0956d0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 != null) {
            c0956d0.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        boolean z5 = p1.f10365c;
        if (z5) {
            super.setTextSize(i6, f6);
            return;
        }
        C0956d0 c0956d0 = this.f10390x;
        if (c0956d0 == null || z5) {
            return;
        }
        C0974m0 c0974m0 = c0956d0.f10258i;
        if (c0974m0.f()) {
            return;
        }
        c0974m0.g(i6, f6);
    }
}
