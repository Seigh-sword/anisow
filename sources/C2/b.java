package C2;

import F.j;
import F.q;
import G0.d;
import G0.e;
import G0.f;
import H2.m;
import K2.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import f2.h;
import i.C0803c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.C0955d;
import m.C0990v;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C0990v {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int[] f138U = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int[] f139V = {R.attr.state_error};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[][] f140W = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f141a0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinkedHashSet f142A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinkedHashSet f143B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f144C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f145D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f146E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f147F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f148G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Drawable f149H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Drawable f150I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f151J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ColorStateList f152K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ColorStateList f153L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public PorterDuff.Mode f154M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f155N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int[] f156O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f157P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence f158Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f159R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final f f160S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final c f161T;

    public b(Context context, AttributeSet attributeSet) {
        super(U2.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f142A = new LinkedHashSet();
        this.f143B = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = q.f458a;
        Drawable drawableA = j.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f684w = drawableA;
        drawableA.setCallback(fVar.f680B);
        new e(fVar.f684w.getConstantState());
        this.f160S = fVar;
        this.f161T = new c(this, 2);
        Context context3 = getContext();
        this.f149H = T.c.a(this);
        this.f152K = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C0803c c0803cF = m.f(context3, attributeSet, AbstractC1274a.f12466t, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.f150I = c0803cF.v(2);
        if (this.f149H != null && C0.p(context3, R.attr.isMaterial3Theme, false)) {
            int iB = c0803cF.B(0, 0);
            int iB2 = c0803cF.B(1, 0);
            if (iB == f141a0 && iB2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f149H = AbstractC0651b.p(context3, R.drawable.mtrl_checkbox_button);
                this.f151J = true;
                if (this.f150I == null) {
                    this.f150I = AbstractC0651b.p(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f153L = h.p(context3, c0803cF, 3);
        this.f154M = h.B(c0803cF.z(4, -1), PorterDuff.Mode.SRC_IN);
        this.f145D = c0803cF.r(10, false);
        this.f146E = c0803cF.r(6, true);
        this.f147F = c0803cF.r(9, false);
        this.f148G = c0803cF.E(8);
        if (c0803cF.G(7)) {
            setCheckedState(c0803cF.z(7, 0));
        }
        c0803cF.M();
        a();
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i6;
        int i7 = this.f155N;
        if (i7 == 1) {
            resources = getResources();
            i6 = R.string.mtrl_checkbox_state_description_checked;
        } else if (i7 == 0) {
            resources = getResources();
            i6 = R.string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i6 = R.string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i6);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f144C == null) {
            int iF = C0.f(this, R.attr.colorControlActivated);
            int iF2 = C0.f(this, R.attr.colorError);
            int iF3 = C0.f(this, R.attr.colorSurface);
            int iF4 = C0.f(this, R.attr.colorOnSurface);
            this.f144C = new ColorStateList(f140W, new int[]{C0.l(1.0f, iF3, iF2), C0.l(1.0f, iF3, iF), C0.l(0.54f, iF3, iF4), C0.l(0.38f, iF3, iF4), C0.l(0.38f, iF3, iF4)});
        }
        return this.f144C;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f152K;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0955d c0955d;
        Drawable drawableMutate = this.f149H;
        ColorStateList colorStateList3 = this.f152K;
        PorterDuff.Mode modeB = T.b.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                H.a.i(drawableMutate, modeB);
            }
        }
        this.f149H = drawableMutate;
        Drawable drawableMutate2 = this.f150I;
        ColorStateList colorStateList4 = this.f153L;
        PorterDuff.Mode mode = this.f154M;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                H.a.i(drawableMutate2, mode);
            }
        }
        this.f150I = drawableMutate2;
        if (this.f151J) {
            f fVar = this.f160S;
            if (fVar != null) {
                Drawable drawable = fVar.f684w;
                c cVar = this.f161T;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.f673a == null) {
                        cVar.f673a = new G0.b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f673a);
                }
                ArrayList arrayList = fVar.f679A;
                d dVar = fVar.f681x;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (fVar.f679A.size() == 0 && (c0955d = fVar.f683z) != null) {
                        dVar.f675b.removeListener(c0955d);
                        fVar.f683z = null;
                    }
                }
                Drawable drawable2 = fVar.f684w;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.f673a == null) {
                        cVar.f673a = new G0.b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f673a);
                } else if (cVar != null) {
                    if (fVar.f679A == null) {
                        fVar.f679A = new ArrayList();
                    }
                    if (!fVar.f679A.contains(cVar)) {
                        fVar.f679A.add(cVar);
                        if (fVar.f683z == null) {
                            fVar.f683z = new C0955d(2, fVar);
                        }
                        dVar.f675b.addListener(fVar.f683z);
                    }
                }
            }
            Drawable drawable3 = this.f149H;
            if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f149H).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable4 = this.f149H;
        if (drawable4 != null && (colorStateList2 = this.f152K) != null) {
            H.a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f150I;
        if (drawable5 != null && (colorStateList = this.f153L) != null) {
            H.a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f149H;
        Drawable drawable7 = this.f150I;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f6 = intrinsicWidth / intrinsicHeight;
                if (f6 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f6);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f6 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f149H;
    }

    public Drawable getButtonIconDrawable() {
        return this.f150I;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f153L;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f154M;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f152K;
    }

    public int getCheckedState() {
        return this.f155N;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f148G;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f155N == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f145D && this.f152K == null && this.f153L == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f138U);
        }
        if (this.f147F) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f139V);
        }
        int i7 = 0;
        while (true) {
            if (i7 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i8 = iArrOnCreateDrawableState[i7];
            if (i8 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i8 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i7] = 16842912;
                break;
            }
            i7++;
        }
        this.f156O = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f146E || !TextUtils.isEmpty(getText()) || (drawableA = T.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (h.w(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            H.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f147F) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f148G));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f137w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f137w = getCheckedState();
        return aVar;
    }

    @Override // m.C0990v, android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(AbstractC0651b.p(getContext(), i6));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f150I = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i6) {
        setButtonIconDrawable(AbstractC0651b.p(getContext(), i6));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f153L == colorStateList) {
            return;
        }
        this.f153L = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f154M == mode) {
            return;
        }
        this.f154M = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f152K == colorStateList) {
            return;
        }
        this.f152K = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z5) {
        this.f146E = z5;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        setCheckedState(z5 ? 1 : 0);
    }

    public void setCheckedState(int i6) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f155N != i6) {
            this.f155N = i6;
            super.setChecked(i6 == 1);
            refreshDrawableState();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && this.f158Q == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f157P) {
                return;
            }
            this.f157P = true;
            LinkedHashSet linkedHashSet = this.f143B;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC0628i.p(it.next());
                    throw null;
                }
            }
            if (this.f155N != 2 && (onCheckedChangeListener = this.f159R) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i7 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f157P = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f148G = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i6) {
        setErrorAccessibilityLabel(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setErrorShown(boolean z5) {
        if (this.f147F == z5) {
            return;
        }
        this.f147F = z5;
        refreshDrawableState();
        Iterator it = this.f142A.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f159R = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f158Q = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.f145D = z5;
        T.b.c(this, z5 ? getMaterialThemeColorsTintList() : null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // m.C0990v, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f149H = drawable;
        this.f151J = false;
        a();
    }
}
