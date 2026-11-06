package m;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.C0396c2;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: m.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0964h0 extends TextView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f10272A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public L3.c f10273B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Future f10274C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0986t f10275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0956d0 f10276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0396c2 f10277y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0948C f10278z;

    public C0964h0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0948C getEmojiTextViewHelper() {
        if (this.f10278z == null) {
            this.f10278z = new C0948C(this);
        }
        return this.f10278z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0986t c0986t = this.f10275w;
        if (c0986t != null) {
            c0986t.a();
        }
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p1.f10365c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0956d0 c0956d0 = this.f10276x;
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
        C0956d0 c0956d0 = this.f10276x;
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
        C0956d0 c0956d0 = this.f10276x;
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
        C0956d0 c0956d0 = this.f10276x;
        return c0956d0 != null ? c0956d0.f10258i.f10327f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (p1.f10365c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            return c0956d0.f10258i.f10322a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0651b.E(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0958e0 getSuperCaller() {
        L3.c cVar;
        if (this.f10273B == null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                cVar = new C0962g0(this);
            } else if (i6 >= 28) {
                cVar = new C0960f0(this);
            } else if (i6 >= 26) {
                cVar = new L3.c(4, this);
            }
            this.f10273B = cVar;
        }
        return this.f10273B;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0986t c0986t = this.f10275w;
        if (c0986t != null) {
            return c0986t.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0986t c0986t = this.f10275w;
        if (c0986t != null) {
            return c0986t.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10276x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10276x.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0396c2 c0396c2;
        if (Build.VERSION.SDK_INT >= 28 || (c0396c2 = this.f10277y) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0396c2.f6776y;
        return textClassifier == null ? X.a((TextView) c0396c2.f6775x) : textClassifier;
    }

    public L.e getTextMetricsParamsCompat() {
        return AbstractC0651b.s(this);
    }

    public final void m() {
        Future future = this.f10274C;
        if (future == null) {
            return;
        }
        try {
            this.f10274C = null;
            AbstractC0628i.p(future.get());
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0651b.s(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f10276x.getClass();
        C0956d0.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        com.bumptech.glide.c.y(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30 || i6 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 == null || p1.f10365c) {
            return;
        }
        c0956d0.f10258i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        m();
        super.onMeasure(i6, i7);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        super.onTextChanged(charSequence, i6, i7, i8);
        C0956d0 c0956d0 = this.f10276x;
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
        C0956d0 c0956d0 = this.f10276x;
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
        C0956d0 c0956d0 = this.f10276x;
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
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            c0956d0.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0986t c0986t = this.f10275w;
        if (c0986t != null) {
            c0986t.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        C0986t c0986t = this.f10275w;
        if (c0986t != null) {
            c0986t.g(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i6 != 0 ? AbstractC0651b.p(context, i6) : null, i7 != 0 ? AbstractC0651b.p(context, i7) : null, i8 != 0 ? AbstractC0651b.p(context, i8) : null, i9 != 0 ? AbstractC0651b.p(context, i9) : null);
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i6 != 0 ? AbstractC0651b.p(context, i6) : null, i7 != 0 ? AbstractC0651b.p(context, i7) : null, i8 != 0 ? AbstractC0651b.p(context, i8) : null, i9 != 0 ? AbstractC0651b.p(context, i9) : null);
        C0956d0 c0956d0 = this.f10276x;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((B3.e) getEmojiTextViewHelper().f10089b.f1734x).r(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i6);
        } else {
            AbstractC0651b.z(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i6);
        } else {
            AbstractC0651b.A(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i6) {
        AbstractC0651b.B(this, i6);
    }

    public void setPrecomputedText(L.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0651b.s(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0986t c0986t = this.f10275w;
        if (c0986t != null) {
            c0986t.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0986t c0986t = this.f10275w;
        if (c0986t != null) {
            c0986t.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0956d0 c0956d0 = this.f10276x;
        c0956d0.l(colorStateList);
        c0956d0.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0956d0 c0956d0 = this.f10276x;
        c0956d0.m(mode);
        c0956d0.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            c0956d0.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0396c2 c0396c2;
        if (Build.VERSION.SDK_INT >= 28 || (c0396c2 = this.f10277y) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0396c2.f6776y = textClassifier;
        }
    }

    public void setTextFuture(Future<L.f> future) {
        this.f10274C = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(L.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f1664b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i6 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i6 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i6 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i6 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i6 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i6 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i6 = 7;
            }
        }
        setTextDirection(i6);
        getPaint().set(eVar.f1663a);
        T.m.e(this, eVar.f1665c);
        T.m.h(this, eVar.f1666d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        boolean z5 = p1.f10365c;
        if (z5) {
            super.setTextSize(i6, f6);
            return;
        }
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 == null || z5) {
            return;
        }
        C0974m0 c0974m0 = c0956d0.f10258i;
        if (c0974m0.f()) {
            return;
        }
        c0974m0.g(i6, f6);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i6) {
        Typeface typefaceCreate;
        if (this.f10272A) {
            return;
        }
        if (typeface == null || i6 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            S0.f fVar = G.g.f648a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i6);
        }
        this.f10272A = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i6);
        } finally {
            this.f10272A = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0964h0(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Y0.a(context);
        this.f10272A = false;
        this.f10273B = null;
        X0.a(getContext(), this);
        C0986t c0986t = new C0986t(this);
        this.f10275w = c0986t;
        c0986t.e(attributeSet, i6);
        C0956d0 c0956d0 = new C0956d0(this);
        this.f10276x = c0956d0;
        c0956d0.f(attributeSet, i6);
        c0956d0.b();
        this.f10277y = new C0396c2((TextView) this);
        getEmojiTextViewHelper().a(attributeSet, i6);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i6, float f6) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            getSuperCaller().l(i6, f6);
        } else if (i7 >= 34) {
            T.p.a(this, i6, f6);
        } else {
            AbstractC0651b.B(this, Math.round(TypedValue.applyDimension(i6, f6, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0956d0 c0956d0 = this.f10276x;
        if (c0956d0 != null) {
            c0956d0.b();
        }
    }
}
