package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.xo.anilab.R;
import d2.AbstractC0651b;

/* JADX INFO: renamed from: m.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0992w extends CheckedTextView {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0994x f10397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0986t f10398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0956d0 f10399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0948C f10400z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0992w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        Y0.a(context);
        X0.a(getContext(), this);
        C0956d0 c0956d0 = new C0956d0(this);
        this.f10399y = c0956d0;
        c0956d0.f(attributeSet, R.attr.checkedTextViewStyle);
        c0956d0.b();
        C0986t c0986t = new C0986t(this);
        this.f10398x = c0986t;
        c0986t.e(attributeSet, R.attr.checkedTextViewStyle);
        C0994x c0994x = new C0994x(this, 0);
        this.f10397w = c0994x;
        c0994x.c(attributeSet, R.attr.checkedTextViewStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
    }

    private C0948C getEmojiTextViewHelper() {
        if (this.f10400z == null) {
            this.f10400z = new C0948C(this);
        }
        return this.f10400z;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0956d0 c0956d0 = this.f10399y;
        if (c0956d0 != null) {
            c0956d0.b();
        }
        C0986t c0986t = this.f10398x;
        if (c0986t != null) {
            c0986t.a();
        }
        C0994x c0994x = this.f10397w;
        if (c0994x != null) {
            c0994x.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0651b.E(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10398x;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10398x;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0994x c0994x = this.f10397w;
        if (c0994x != null) {
            return c0994x.f10403b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0994x c0994x = this.f10397w;
        if (c0994x != null) {
            return c0994x.f10404c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10399y.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10399y.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.c.y(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10398x;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10398x;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i6) {
        setCheckMarkDrawable(AbstractC0651b.p(getContext(), i6));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10399y;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10399y;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0651b.G(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0986t c0986t = this.f10398x;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10398x;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0994x c0994x = this.f10397w;
        if (c0994x != null) {
            c0994x.f10403b = colorStateList;
            c0994x.f10405d = true;
            c0994x.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0994x c0994x = this.f10397w;
        if (c0994x != null) {
            c0994x.f10404c = mode;
            c0994x.f10406e = true;
            c0994x.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0956d0 c0956d0 = this.f10399y;
        c0956d0.l(colorStateList);
        c0956d0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0956d0 c0956d0 = this.f10399y;
        c0956d0.m(mode);
        c0956d0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        C0956d0 c0956d0 = this.f10399y;
        if (c0956d0 != null) {
            c0956d0.g(context, i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0994x c0994x = this.f10397w;
        if (c0994x != null) {
            if (c0994x.f10407f) {
                c0994x.f10407f = false;
            } else {
                c0994x.f10407f = true;
                c0994x.b();
            }
        }
    }
}
