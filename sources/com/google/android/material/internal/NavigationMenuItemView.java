package com.google.android.material.internal;

import F.j;
import H.a;
import H2.d;
import M4.B;
import N.V;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import l.InterfaceC0902B;
import l.q;
import m.B0;
import y2.C1503e;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends d implements InterfaceC0902B {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f7258f0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f7259R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f7260S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f7261T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final boolean f7262U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final CheckedTextView f7263V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public FrameLayout f7264W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public q f7265a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ColorStateList f7266b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f7267c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Drawable f7268d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final C1503e f7269e0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7262U = true;
        C1503e c1503e = new C1503e(3, this);
        this.f7269e0 = c1503e;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.xo.anilab.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.xo.anilab.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.xo.anilab.R.id.design_menu_item_text);
        this.f7263V = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        V.l(checkedTextView, c1503e);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f7264W == null) {
                this.f7264W = (FrameLayout) ((ViewStub) findViewById(com.xo.anilab.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f7264W.removeAllViews();
            this.f7264W.addView(view);
        }
    }

    @Override // l.InterfaceC0902B
    public final void b(q qVar) {
        B0 b02;
        int i6;
        StateListDrawable stateListDrawable;
        this.f7265a0 = qVar;
        int i7 = qVar.f9784a;
        if (i7 > 0) {
            setId(i7);
        }
        setVisibility(qVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.xo.anilab.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f7258f0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = V.f1964a;
            setBackground(stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.f9788e);
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.f9800q);
        B.q(this, qVar.f9801r);
        q qVar2 = this.f7265a0;
        CharSequence charSequence = qVar2.f9788e;
        CheckedTextView checkedTextView = this.f7263V;
        if (charSequence == null && qVar2.getIcon() == null && this.f7265a0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f7264W;
            if (frameLayout == null) {
                return;
            }
            b02 = (B0) frameLayout.getLayoutParams();
            i6 = -1;
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f7264W;
            if (frameLayout2 == null) {
                return;
            }
            b02 = (B0) frameLayout2.getLayoutParams();
            i6 = -2;
        }
        ((LinearLayout.LayoutParams) b02).width = i6;
        this.f7264W.setLayoutParams(b02);
    }

    @Override // l.InterfaceC0902B
    public q getItemData() {
        return this.f7265a0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        q qVar = this.f7265a0;
        if (qVar != null && qVar.isCheckable() && this.f7265a0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f7258f0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.f7261T != z5) {
            this.f7261T = z5;
            this.f7269e0.h(this.f7263V, 2048);
        }
    }

    public void setChecked(boolean z5) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f7263V;
        checkedTextView.setChecked(z5);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z5 && this.f7262U) ? 1 : 0);
    }

    public void setHorizontalPadding(int i6) {
        setPadding(i6, getPaddingTop(), i6, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f7267c0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f7266b0);
            }
            int i6 = this.f7259R;
            drawable.setBounds(0, 0, i6, i6);
        } else if (this.f7260S) {
            if (this.f7268d0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = F.q.f458a;
                Drawable drawableA = j.a(resources, com.xo.anilab.R.drawable.navigation_empty_icon, theme);
                this.f7268d0 = drawableA;
                if (drawableA != null) {
                    int i7 = this.f7259R;
                    drawableA.setBounds(0, 0, i7, i7);
                }
            }
            drawable = this.f7268d0;
        }
        this.f7263V.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i6) {
        this.f7263V.setCompoundDrawablePadding(i6);
    }

    public void setIconSize(int i6) {
        this.f7259R = i6;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f7266b0 = colorStateList;
        this.f7267c0 = colorStateList != null;
        q qVar = this.f7265a0;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i6) {
        this.f7263V.setMaxLines(i6);
    }

    public void setNeedsEmptyIcon(boolean z5) {
        this.f7260S = z5;
    }

    public void setTextAppearance(int i6) {
        this.f7263V.setTextAppearance(i6);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7263V.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7263V.setText(charSequence);
    }
}
