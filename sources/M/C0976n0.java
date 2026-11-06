package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: m.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0976n0 extends ToggleButton {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0986t f10335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0956d0 f10336x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0948C f10337y;

    public C0976n0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        X0.a(getContext(), this);
        C0986t c0986t = new C0986t(this);
        this.f10335w = c0986t;
        c0986t.e(attributeSet, R.attr.buttonStyleToggle);
        C0956d0 c0956d0 = new C0956d0(this);
        this.f10336x = c0956d0;
        c0956d0.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0948C getEmojiTextViewHelper() {
        if (this.f10337y == null) {
            this.f10337y = new C0948C(this);
        }
        return this.f10337y;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0986t c0986t = this.f10335w;
        if (c0986t != null) {
            c0986t.a();
        }
        C0956d0 c0956d0 = this.f10336x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10335w;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10335w;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10336x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10336x.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10335w;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10335w;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10336x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10336x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((B3.e) getEmojiTextViewHelper().f10089b.f1734x).r(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0986t c0986t = this.f10335w;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10335w;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0956d0 c0956d0 = this.f10336x;
        c0956d0.l(colorStateList);
        c0956d0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0956d0 c0956d0 = this.f10336x;
        c0956d0.m(mode);
        c0956d0.b();
    }
}
