package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.gms.internal.measurement.C0396c2;
import d2.AbstractC0651b;
import i.C0803c;

/* JADX INFO: renamed from: m.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0984s extends AutoCompleteTextView {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f10374z = {R.attr.popupBackground};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0986t f10375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0956d0 f10376x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0396c2 f10377y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0984s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.xo.anilab.R.attr.autoCompleteTextViewStyle);
        Y0.a(context);
        X0.a(getContext(), this);
        C0803c c0803cJ = C0803c.J(getContext(), attributeSet, f10374z, com.xo.anilab.R.attr.autoCompleteTextViewStyle, 0);
        if (c0803cJ.G(0)) {
            setDropDownBackgroundDrawable(c0803cJ.v(0));
        }
        c0803cJ.M();
        C0986t c0986t = new C0986t(this);
        this.f10375w = c0986t;
        c0986t.e(attributeSet, com.xo.anilab.R.attr.autoCompleteTextViewStyle);
        C0956d0 c0956d0 = new C0956d0(this);
        this.f10376x = c0956d0;
        c0956d0.f(attributeSet, com.xo.anilab.R.attr.autoCompleteTextViewStyle);
        c0956d0.b();
        C0396c2 c0396c2 = new C0396c2((EditText) this);
        this.f10377y = c0396c2;
        c0396c2.J(attributeSet, com.xo.anilab.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerG = c0396c2.G(keyListener);
            if (keyListenerG == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerG);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0986t c0986t = this.f10375w;
        if (c0986t != null) {
            c0986t.a();
        }
        C0956d0 c0956d0 = this.f10376x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0651b.E(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10375w;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10375w;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10376x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10376x.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.c.y(this, editorInfo, inputConnectionOnCreateInputConnection);
        return this.f10377y.K(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10375w;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10375w;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10376x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10376x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0651b.G(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i6) {
        setDropDownBackgroundDrawable(AbstractC0651b.p(getContext(), i6));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((P2.e) ((e0.b) this.f10377y.f6776y).f8233c).n(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f10377y.G(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0986t c0986t = this.f10375w;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10375w;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0956d0 c0956d0 = this.f10376x;
        c0956d0.l(colorStateList);
        c0956d0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0956d0 c0956d0 = this.f10376x;
        c0956d0.m(mode);
        c0956d0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        C0956d0 c0956d0 = this.f10376x;
        if (c0956d0 != null) {
            c0956d0.g(context, i6);
        }
    }
}
