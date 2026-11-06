package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import d2.AbstractC0651b;

/* JADX INFO: renamed from: m.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0990v extends CheckBox implements T.s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0994x f10392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0986t f10393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0956d0 f10394y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0948C f10395z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0990v(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Y0.a(context);
        X0.a(getContext(), this);
        C0994x c0994x = new C0994x(this, 1);
        this.f10392w = c0994x;
        c0994x.c(attributeSet, i6);
        C0986t c0986t = new C0986t(this);
        this.f10393x = c0986t;
        c0986t.e(attributeSet, i6);
        C0956d0 c0956d0 = new C0956d0(this);
        this.f10394y = c0956d0;
        c0956d0.f(attributeSet, i6);
        getEmojiTextViewHelper().a(attributeSet, i6);
    }

    private C0948C getEmojiTextViewHelper() {
        if (this.f10395z == null) {
            this.f10395z = new C0948C(this);
        }
        return this.f10395z;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0986t c0986t = this.f10393x;
        if (c0986t != null) {
            c0986t.a();
        }
        C0956d0 c0956d0 = this.f10394y;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10393x;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10393x;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    @Override // T.s
    public ColorStateList getSupportButtonTintList() {
        C0994x c0994x = this.f10392w;
        if (c0994x != null) {
            return c0994x.f10403b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0994x c0994x = this.f10392w;
        if (c0994x != null) {
            return c0994x.f10404c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10394y.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10394y.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10393x;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10393x;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(AbstractC0651b.p(getContext(), i6));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10394y;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10394y;
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
        C0986t c0986t = this.f10393x;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10393x;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    @Override // T.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0994x c0994x = this.f10392w;
        if (c0994x != null) {
            c0994x.f10403b = colorStateList;
            c0994x.f10405d = true;
            c0994x.a();
        }
    }

    @Override // T.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0994x c0994x = this.f10392w;
        if (c0994x != null) {
            c0994x.f10404c = mode;
            c0994x.f10406e = true;
            c0994x.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0956d0 c0956d0 = this.f10394y;
        c0956d0.l(colorStateList);
        c0956d0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0956d0 c0956d0 = this.f10394y;
        c0956d0.m(mode);
        c0956d0.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0994x c0994x = this.f10392w;
        if (c0994x != null) {
            if (c0994x.f10407f) {
                c0994x.f10407f = false;
            } else {
                c0994x.f10407f = true;
                c0994x.a();
            }
        }
    }
}
