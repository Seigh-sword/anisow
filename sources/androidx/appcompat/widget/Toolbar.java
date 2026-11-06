package androidx.appcompat.widget;

import L3.c;
import M4.B;
import N.InterfaceC0102m;
import N.V;
import S0.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.xo.anilab.R;
import d2.AbstractC0651b;
import h.AbstractC0732a;
import h0.M;
import i.AbstractC0801a;
import i.C0803c;
import i.ViewOnClickListenerC0802b;
import j.RunnableC0835a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0887j;
import l.o;
import l.q;
import m.C0964h0;
import m.C0977o;
import m.D;
import m.F;
import m.InterfaceC0982q0;
import m.T0;
import m.ViewOnClickListenerC0953c;
import m.b1;
import m.c1;
import m.d1;
import m.e1;
import m.f1;
import m.h1;
import m.i1;
import m.p1;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0102m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public F f5218A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Drawable f5219B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final CharSequence f5220C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public D f5221D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f5222E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Context f5223F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f5224G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f5225H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f5226I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f5227J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f5228K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f5229L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f5230M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f5231N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f5232O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public T0 f5233P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f5234Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f5235R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f5236S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public CharSequence f5237T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public CharSequence f5238U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ColorStateList f5239V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ColorStateList f5240W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f5241a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f5242b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ArrayList f5243c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ArrayList f5244d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int[] f5245e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final C0803c f5246f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ArrayList f5247g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final f f5248h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public i1 f5249i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public C0977o f5250j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public d1 f5251k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f5252l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public OnBackInvokedCallback f5253m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public OnBackInvokedDispatcher f5254n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f5255o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RunnableC0835a f5256p0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ActionMenuView f5257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0964h0 f5258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0964h0 f5259y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public D f5260z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i6 = 0; i6 < menu.size(); i6++) {
            arrayList.add(menu.getItem(i6));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0887j(getContext());
    }

    public static e1 h() {
        e1 e1Var = new e1(-2, -2);
        e1Var.f10268b = 0;
        e1Var.f9272a = 8388627;
        return e1Var;
    }

    public static e1 i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e1) {
            e1 e1Var = (e1) layoutParams;
            e1 e1Var2 = new e1(e1Var);
            e1Var2.f10268b = 0;
            e1Var2.f10268b = e1Var.f10268b;
            return e1Var2;
        }
        if (layoutParams instanceof AbstractC0801a) {
            e1 e1Var3 = new e1((AbstractC0801a) layoutParams);
            e1Var3.f10268b = 0;
            return e1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            e1 e1Var4 = new e1(layoutParams);
            e1Var4.f10268b = 0;
            return e1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        e1 e1Var5 = new e1(marginLayoutParams);
        e1Var5.f10268b = 0;
        ((ViewGroup.MarginLayoutParams) e1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return e1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i6, ArrayList arrayList) {
        boolean z5 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, getLayoutDirection());
        arrayList.clear();
        if (!z5) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                e1 e1Var = (e1) childAt.getLayoutParams();
                if (e1Var.f10268b == 0 && t(childAt)) {
                    int i8 = e1Var.f9272a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            e1 e1Var2 = (e1) childAt2.getLayoutParams();
            if (e1Var2.f10268b == 0 && t(childAt2)) {
                int i10 = e1Var2.f9272a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i10, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e1 e1VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (e1) layoutParams;
        e1VarH.f10268b = 1;
        if (!z5 || this.f5222E == null) {
            addView(view, e1VarH);
        } else {
            view.setLayoutParams(e1VarH);
            this.f5244d0.add(view);
        }
    }

    public final void c() {
        if (this.f5221D == null) {
            D d6 = new D(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f5221D = d6;
            d6.setImageDrawable(this.f5219B);
            this.f5221D.setContentDescription(this.f5220C);
            e1 e1VarH = h();
            e1VarH.f9272a = (this.f5227J & 112) | 8388611;
            e1VarH.f10268b = 2;
            this.f5221D.setLayoutParams(e1VarH);
            this.f5221D.setOnClickListener(new ViewOnClickListenerC0802b(1, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e1);
    }

    public final void d() {
        if (this.f5233P == null) {
            T0 t02 = new T0();
            t02.f10197a = 0;
            t02.f10198b = 0;
            t02.f10199c = Integer.MIN_VALUE;
            t02.f10200d = Integer.MIN_VALUE;
            t02.f10201e = 0;
            t02.f10202f = 0;
            t02.f10203g = false;
            t02.f10204h = false;
            this.f5233P = t02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f5257w;
        if (actionMenuView.f5189L == null) {
            o oVar = (o) actionMenuView.getMenu();
            if (this.f5251k0 == null) {
                this.f5251k0 = new d1(this);
            }
            this.f5257w.setExpandedActionViewsExclusive(true);
            oVar.b(this.f5251k0, this.f5223F);
            u();
        }
    }

    public final void f() {
        if (this.f5257w == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f5257w = actionMenuView;
            actionMenuView.setPopupTheme(this.f5224G);
            this.f5257w.setOnMenuItemClickListener(this.f5248h0);
            ActionMenuView actionMenuView2 = this.f5257w;
            c cVar = new c(5, this);
            actionMenuView2.f5194Q = null;
            actionMenuView2.f5195R = cVar;
            e1 e1VarH = h();
            e1VarH.f9272a = (this.f5227J & 112) | 8388613;
            this.f5257w.setLayoutParams(e1VarH);
            b(this.f5257w, false);
        }
    }

    public final void g() {
        if (this.f5260z == null) {
            this.f5260z = new D(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e1 e1VarH = h();
            e1VarH.f9272a = (this.f5227J & 112) | 8388611;
            this.f5260z.setLayoutParams(e1VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e1 e1Var = new e1(context, attributeSet);
        e1Var.f9272a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8564b);
        e1Var.f9272a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        e1Var.f10268b = 0;
        return e1Var;
    }

    public CharSequence getCollapseContentDescription() {
        D d6 = this.f5221D;
        if (d6 != null) {
            return d6.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        D d6 = this.f5221D;
        if (d6 != null) {
            return d6.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        T0 t02 = this.f5233P;
        if (t02 != null) {
            return t02.f10203g ? t02.f10197a : t02.f10198b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i6 = this.f5235R;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        T0 t02 = this.f5233P;
        if (t02 != null) {
            return t02.f10197a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        T0 t02 = this.f5233P;
        if (t02 != null) {
            return t02.f10198b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        T0 t02 = this.f5233P;
        if (t02 != null) {
            return t02.f10203g ? t02.f10198b : t02.f10197a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i6 = this.f5234Q;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        o oVar;
        ActionMenuView actionMenuView = this.f5257w;
        return (actionMenuView == null || (oVar = actionMenuView.f5189L) == null || !oVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f5235R, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f5234Q, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        F f6 = this.f5218A;
        if (f6 != null) {
            return f6.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        F f6 = this.f5218A;
        if (f6 != null) {
            return f6.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f5257w.getMenu();
    }

    public View getNavButtonView() {
        return this.f5260z;
    }

    public CharSequence getNavigationContentDescription() {
        D d6 = this.f5260z;
        if (d6 != null) {
            return d6.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        D d6 = this.f5260z;
        if (d6 != null) {
            return d6.getDrawable();
        }
        return null;
    }

    public C0977o getOuterActionMenuPresenter() {
        return this.f5250j0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f5257w.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f5223F;
    }

    public int getPopupTheme() {
        return this.f5224G;
    }

    public CharSequence getSubtitle() {
        return this.f5238U;
    }

    public final TextView getSubtitleTextView() {
        return this.f5259y;
    }

    public CharSequence getTitle() {
        return this.f5237T;
    }

    public int getTitleMarginBottom() {
        return this.f5232O;
    }

    public int getTitleMarginEnd() {
        return this.f5230M;
    }

    public int getTitleMarginStart() {
        return this.f5229L;
    }

    public int getTitleMarginTop() {
        return this.f5231N;
    }

    public final TextView getTitleTextView() {
        return this.f5258x;
    }

    public InterfaceC0982q0 getWrapper() {
        Drawable drawable;
        if (this.f5249i0 == null) {
            i1 i1Var = new i1();
            i1Var.f10296n = 0;
            i1Var.f10283a = this;
            i1Var.f10290h = getTitle();
            i1Var.f10291i = getSubtitle();
            i1Var.f10289g = i1Var.f10290h != null;
            i1Var.f10288f = getNavigationIcon();
            C0803c c0803cJ = C0803c.J(getContext(), null, AbstractC0732a.f8563a, R.attr.actionBarStyle, 0);
            i1Var.f10297o = c0803cJ.v(15);
            CharSequence charSequenceE = c0803cJ.E(27);
            if (!TextUtils.isEmpty(charSequenceE)) {
                i1Var.f10289g = true;
                i1Var.f10290h = charSequenceE;
                if ((i1Var.f10284b & 8) != 0) {
                    Toolbar toolbar = i1Var.f10283a;
                    toolbar.setTitle(charSequenceE);
                    if (i1Var.f10289g) {
                        V.m(toolbar.getRootView(), charSequenceE);
                    }
                }
            }
            CharSequence charSequenceE2 = c0803cJ.E(25);
            if (!TextUtils.isEmpty(charSequenceE2)) {
                i1Var.f10291i = charSequenceE2;
                if ((i1Var.f10284b & 8) != 0) {
                    setSubtitle(charSequenceE2);
                }
            }
            Drawable drawableV = c0803cJ.v(20);
            if (drawableV != null) {
                i1Var.f10287e = drawableV;
                i1Var.c();
            }
            Drawable drawableV2 = c0803cJ.v(17);
            if (drawableV2 != null) {
                i1Var.f10286d = drawableV2;
                i1Var.c();
            }
            if (i1Var.f10288f == null && (drawable = i1Var.f10297o) != null) {
                i1Var.f10288f = drawable;
                int i6 = i1Var.f10284b & 4;
                Toolbar toolbar2 = i1Var.f10283a;
                if (i6 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            i1Var.a(c0803cJ.z(10, 0));
            int iB = c0803cJ.B(9, 0);
            if (iB != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(iB, (ViewGroup) this, false);
                View view = i1Var.f10285c;
                if (view != null && (i1Var.f10284b & 16) != 0) {
                    removeView(view);
                }
                i1Var.f10285c = viewInflate;
                if (viewInflate != null && (i1Var.f10284b & 16) != 0) {
                    addView(viewInflate);
                }
                i1Var.a(i1Var.f10284b | 16);
            }
            int layoutDimension = ((TypedArray) c0803cJ.f9278y).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int iT = c0803cJ.t(7, -1);
            int iT2 = c0803cJ.t(3, -1);
            if (iT >= 0 || iT2 >= 0) {
                int iMax = Math.max(iT, 0);
                int iMax2 = Math.max(iT2, 0);
                d();
                this.f5233P.a(iMax, iMax2);
            }
            int iB2 = c0803cJ.B(28, 0);
            if (iB2 != 0) {
                Context context = getContext();
                this.f5225H = iB2;
                C0964h0 c0964h0 = this.f5258x;
                if (c0964h0 != null) {
                    c0964h0.setTextAppearance(context, iB2);
                }
            }
            int iB3 = c0803cJ.B(26, 0);
            if (iB3 != 0) {
                Context context2 = getContext();
                this.f5226I = iB3;
                C0964h0 c0964h02 = this.f5259y;
                if (c0964h02 != null) {
                    c0964h02.setTextAppearance(context2, iB3);
                }
            }
            int iB4 = c0803cJ.B(22, 0);
            if (iB4 != 0) {
                setPopupTheme(iB4);
            }
            c0803cJ.M();
            if (R.string.abc_action_bar_up_description != i1Var.f10296n) {
                i1Var.f10296n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i7 = i1Var.f10296n;
                    i1Var.f10292j = i7 != 0 ? getContext().getString(i7) : null;
                    i1Var.b();
                }
            }
            i1Var.f10292j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC0953c(i1Var));
            this.f5249i0 = i1Var;
        }
        return this.f5249i0;
    }

    public final int j(View view, int i6) {
        e1 e1Var = (e1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i6 > 0 ? (measuredHeight - i6) / 2 : 0;
        int i8 = e1Var.f9272a & 112;
        if (i8 != 16 && i8 != 48 && i8 != 80) {
            i8 = this.f5236S & 112;
        }
        if (i8 == 48) {
            return getPaddingTop() - i7;
        }
        if (i8 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin) - i7;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin;
        if (iMax < i9) {
            iMax = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
            if (i10 < i11) {
                iMax = Math.max(0, iMax - (i11 - i10));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i6) {
        getMenuInflater().inflate(i6, getMenu());
    }

    public final void n() {
        Iterator it = this.f5247g0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f5246f0.f9278y).iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).f8668a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f5247g0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f5244d0.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5256p0);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5242b0 = false;
        }
        if (!this.f5242b0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f5242b0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5242b0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0289 A[LOOP:0: B:109:0x0287->B:110:0x0289, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a5 A[LOOP:1: B:112:0x02a3->B:113:0x02a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c5 A[LOOP:2: B:115:0x02c3->B:116:0x02c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0313 A[LOOP:3: B:124:0x0311->B:125:0x0313, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        char c6;
        char c7;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z5 = p1.f10363a;
        int i8 = 0;
        if (getLayoutDirection() == 1) {
            c7 = 1;
            c6 = 0;
        } else {
            c6 = 1;
            c7 = 0;
        }
        if (t(this.f5260z)) {
            s(this.f5260z, i6, 0, i7, this.f5228K);
            iK = k(this.f5260z) + this.f5260z.getMeasuredWidth();
            iMax = Math.max(0, l(this.f5260z) + this.f5260z.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f5260z.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.f5221D)) {
            s(this.f5221D, i6, 0, i7, this.f5228K);
            iK = k(this.f5221D) + this.f5221D.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f5221D) + this.f5221D.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5221D.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.f5245e0;
        iArr[c7] = iMax4;
        if (t(this.f5257w)) {
            s(this.f5257w, i6, iMax3, i7, this.f5228K);
            iK2 = k(this.f5257w) + this.f5257w.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f5257w) + this.f5257w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5257w.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c6] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.f5222E)) {
            iMax5 += r(this.f5222E, i6, iMax5, i7, 0, iArr);
            iMax = Math.max(iMax, l(this.f5222E) + this.f5222E.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5222E.getMeasuredState());
        }
        if (t(this.f5218A)) {
            iMax5 += r(this.f5218A, i6, iMax5, i7, 0, iArr);
            iMax = Math.max(iMax, l(this.f5218A) + this.f5218A.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5218A.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (((e1) childAt.getLayoutParams()).f10268b == 0 && t(childAt)) {
                iMax5 += r(childAt, i6, iMax5, i7, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i10 = this.f5231N + this.f5232O;
        int i11 = this.f5229L + this.f5230M;
        if (t(this.f5258x)) {
            r(this.f5258x, i6, iMax5 + i11, i7, i10, iArr);
            int iK3 = k(this.f5258x) + this.f5258x.getMeasuredWidth();
            iL = l(this.f5258x) + this.f5258x.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f5258x.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f5259y)) {
            iMax2 = Math.max(iMax2, r(this.f5259y, i6, iMax5 + i11, i7, iL + i10, iArr));
            iL += l(this.f5259y) + this.f5259y.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f5259y.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i6, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i7, iCombineMeasuredStates2 << 16);
        if (!this.f5252l0) {
            i8 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i8 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i8);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof h1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h1 h1Var = (h1) parcelable;
        super.onRestoreInstanceState(h1Var.f3569w);
        ActionMenuView actionMenuView = this.f5257w;
        o oVar = actionMenuView != null ? actionMenuView.f5189L : null;
        int i6 = h1Var.f10279y;
        if (i6 != 0 && this.f5251k0 != null && oVar != null && (menuItemFindItem = oVar.findItem(i6)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (h1Var.f10280z) {
            RunnableC0835a runnableC0835a = this.f5256p0;
            removeCallbacks(runnableC0835a);
            post(runnableC0835a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            m.T0 r0 = r2.f5233P
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.f10203g
            if (r1 != r3) goto L12
            goto L45
        L12:
            r0.f10203g = r1
            boolean r3 = r0.f10204h
            if (r3 == 0) goto L3d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2f
            int r1 = r0.f10200d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.f10201e
        L23:
            r0.f10197a = r1
            int r1 = r0.f10199c
            if (r1 == r3) goto L2a
            goto L2c
        L2a:
            int r1 = r0.f10202f
        L2c:
            r0.f10198b = r1
            goto L45
        L2f:
            int r1 = r0.f10199c
            if (r1 == r3) goto L34
            goto L36
        L34:
            int r1 = r0.f10201e
        L36:
            r0.f10197a = r1
            int r1 = r0.f10200d
            if (r1 == r3) goto L2a
            goto L2c
        L3d:
            int r3 = r0.f10201e
            r0.f10197a = r3
            int r3 = r0.f10202f
            r0.f10198b = r3
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0977o c0977o;
        q qVar;
        h1 h1Var = new h1(super.onSaveInstanceState());
        d1 d1Var = this.f5251k0;
        if (d1Var != null && (qVar = d1Var.f10264x) != null) {
            h1Var.f10279y = qVar.f9784a;
        }
        ActionMenuView actionMenuView = this.f5257w;
        h1Var.f10280z = (actionMenuView == null || (c0977o = actionMenuView.f5193P) == null || !c0977o.k()) ? false : true;
        return h1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5241a0 = false;
        }
        if (!this.f5241a0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f5241a0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5241a0 = false;
        }
        return true;
    }

    public final int p(View view, int i6, int i7, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) e1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i8) + i6;
        iArr[0] = Math.max(0, -i8);
        int iJ = j(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).rightMargin + iMax;
    }

    public final int q(View view, int i6, int i7, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) e1Var).rightMargin - iArr[1];
        int iMax = i6 - Math.max(0, i8);
        iArr[1] = Math.max(0, -i8);
        int iJ = j(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).leftMargin);
    }

    public final int r(View view, int i6, int i7, int i8, int i9, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i11) + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + iMax + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i9 >= 0) {
            if (mode != 0) {
                i9 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i9);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.f5255o0 != z5) {
            this.f5255o0 = z5;
            u();
        }
    }

    public void setCollapseContentDescription(int i6) {
        setCollapseContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setCollapseIcon(int i6) {
        setCollapseIcon(AbstractC0651b.p(getContext(), i6));
    }

    public void setCollapsible(boolean z5) {
        this.f5252l0 = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.f5235R) {
            this.f5235R = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.f5234Q) {
            this.f5234Q = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i6) {
        setLogo(AbstractC0651b.p(getContext(), i6));
    }

    public void setLogoDescription(int i6) {
        setLogoDescription(getContext().getText(i6));
    }

    public void setNavigationContentDescription(int i6) {
        setNavigationContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setNavigationIcon(int i6) {
        setNavigationIcon(AbstractC0651b.p(getContext(), i6));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f5260z.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f5257w.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i6) {
        if (this.f5224G != i6) {
            this.f5224G = i6;
            if (i6 == 0) {
                this.f5223F = getContext();
            } else {
                this.f5223F = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setSubtitle(int i6) {
        setSubtitle(getContext().getText(i6));
    }

    public void setSubtitleTextColor(int i6) {
        setSubtitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setTitle(int i6) {
        setTitle(getContext().getText(i6));
    }

    public void setTitleMarginBottom(int i6) {
        this.f5232O = i6;
        requestLayout();
    }

    public void setTitleMarginEnd(int i6) {
        this.f5230M = i6;
        requestLayout();
    }

    public void setTitleMarginStart(int i6) {
        this.f5229L = i6;
        requestLayout();
    }

    public void setTitleMarginTop(int i6) {
        this.f5231N = i6;
        requestLayout();
    }

    public void setTitleTextColor(int i6) {
        setTitleTextColor(ColorStateList.valueOf(i6));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = c1.a(this);
            d1 d1Var = this.f5251k0;
            int i6 = 0;
            boolean z5 = (d1Var != null && d1Var.f10264x != null) && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f5255o0;
            if (z5 && this.f5254n0 == null) {
                if (this.f5253m0 == null) {
                    this.f5253m0 = c1.b(new b1(this, i6));
                }
                c1.c(onBackInvokedDispatcherA, this.f5253m0);
            } else {
                if (z5 || (onBackInvokedDispatcher = this.f5254n0) == null) {
                    return;
                }
                c1.d(onBackInvokedDispatcher, this.f5253m0);
                onBackInvokedDispatcherA = null;
            }
            this.f5254n0 = onBackInvokedDispatcherA;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f5236S = 8388627;
        this.f5243c0 = new ArrayList();
        this.f5244d0 = new ArrayList();
        this.f5245e0 = new int[2];
        this.f5246f0 = new C0803c(new b1(this, 1));
        this.f5247g0 = new ArrayList();
        this.f5248h0 = new f(4, this);
        this.f5256p0 = new RunnableC0835a(3, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0732a.f8585w;
        C0803c c0803cJ = C0803c.J(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        V.k(this, context, iArr, attributeSet, (TypedArray) c0803cJ.f9278y, R.attr.toolbarStyle);
        this.f5225H = c0803cJ.B(28, 0);
        this.f5226I = c0803cJ.B(19, 0);
        this.f5236S = ((TypedArray) c0803cJ.f9278y).getInteger(0, 8388627);
        this.f5227J = ((TypedArray) c0803cJ.f9278y).getInteger(2, 48);
        int iT = c0803cJ.t(22, 0);
        iT = c0803cJ.G(27) ? c0803cJ.t(27, iT) : iT;
        this.f5232O = iT;
        this.f5231N = iT;
        this.f5230M = iT;
        this.f5229L = iT;
        int iT2 = c0803cJ.t(25, -1);
        if (iT2 >= 0) {
            this.f5229L = iT2;
        }
        int iT3 = c0803cJ.t(24, -1);
        if (iT3 >= 0) {
            this.f5230M = iT3;
        }
        int iT4 = c0803cJ.t(26, -1);
        if (iT4 >= 0) {
            this.f5231N = iT4;
        }
        int iT5 = c0803cJ.t(23, -1);
        if (iT5 >= 0) {
            this.f5232O = iT5;
        }
        this.f5228K = c0803cJ.u(13, -1);
        int iT6 = c0803cJ.t(9, Integer.MIN_VALUE);
        int iT7 = c0803cJ.t(5, Integer.MIN_VALUE);
        int iU = c0803cJ.u(7, 0);
        int iU2 = c0803cJ.u(8, 0);
        d();
        T0 t02 = this.f5233P;
        t02.f10204h = false;
        if (iU != Integer.MIN_VALUE) {
            t02.f10201e = iU;
            t02.f10197a = iU;
        }
        if (iU2 != Integer.MIN_VALUE) {
            t02.f10202f = iU2;
            t02.f10198b = iU2;
        }
        if (iT6 != Integer.MIN_VALUE || iT7 != Integer.MIN_VALUE) {
            t02.a(iT6, iT7);
        }
        this.f5234Q = c0803cJ.t(10, Integer.MIN_VALUE);
        this.f5235R = c0803cJ.t(6, Integer.MIN_VALUE);
        this.f5219B = c0803cJ.v(4);
        this.f5220C = c0803cJ.E(3);
        CharSequence charSequenceE = c0803cJ.E(21);
        if (!TextUtils.isEmpty(charSequenceE)) {
            setTitle(charSequenceE);
        }
        CharSequence charSequenceE2 = c0803cJ.E(18);
        if (!TextUtils.isEmpty(charSequenceE2)) {
            setSubtitle(charSequenceE2);
        }
        this.f5223F = getContext();
        setPopupTheme(c0803cJ.B(17, 0));
        Drawable drawableV = c0803cJ.v(16);
        if (drawableV != null) {
            setNavigationIcon(drawableV);
        }
        CharSequence charSequenceE3 = c0803cJ.E(15);
        if (!TextUtils.isEmpty(charSequenceE3)) {
            setNavigationContentDescription(charSequenceE3);
        }
        Drawable drawableV2 = c0803cJ.v(11);
        if (drawableV2 != null) {
            setLogo(drawableV2);
        }
        CharSequence charSequenceE4 = c0803cJ.E(12);
        if (!TextUtils.isEmpty(charSequenceE4)) {
            setLogoDescription(charSequenceE4);
        }
        if (c0803cJ.G(29)) {
            setTitleTextColor(c0803cJ.s(29));
        }
        if (c0803cJ.G(20)) {
            setSubtitleTextColor(c0803cJ.s(20));
        }
        if (c0803cJ.G(14)) {
            m(c0803cJ.B(14, 0));
        }
        c0803cJ.M();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        D d6 = this.f5221D;
        if (d6 != null) {
            d6.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f5221D.setImageDrawable(drawable);
        } else {
            D d6 = this.f5221D;
            if (d6 != null) {
                d6.setImageDrawable(this.f5219B);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f5218A == null) {
                this.f5218A = new F(getContext(), null, 0);
            }
            if (!o(this.f5218A)) {
                b(this.f5218A, true);
            }
        } else {
            F f6 = this.f5218A;
            if (f6 != null && o(f6)) {
                removeView(this.f5218A);
                this.f5244d0.remove(this.f5218A);
            }
        }
        F f7 = this.f5218A;
        if (f7 != null) {
            f7.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f5218A == null) {
            this.f5218A = new F(getContext(), null, 0);
        }
        F f6 = this.f5218A;
        if (f6 != null) {
            f6.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        D d6 = this.f5260z;
        if (d6 != null) {
            d6.setContentDescription(charSequence);
            B.q(this.f5260z, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f5260z)) {
                b(this.f5260z, true);
            }
        } else {
            D d6 = this.f5260z;
            if (d6 != null && o(d6)) {
                removeView(this.f5260z);
                this.f5244d0.remove(this.f5260z);
            }
        }
        D d7 = this.f5260z;
        if (d7 != null) {
            d7.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0964h0 c0964h0 = this.f5259y;
            if (c0964h0 != null && o(c0964h0)) {
                removeView(this.f5259y);
                this.f5244d0.remove(this.f5259y);
            }
        } else {
            if (this.f5259y == null) {
                Context context = getContext();
                C0964h0 c0964h02 = new C0964h0(context, null);
                this.f5259y = c0964h02;
                c0964h02.setSingleLine();
                this.f5259y.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.f5226I;
                if (i6 != 0) {
                    this.f5259y.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.f5240W;
                if (colorStateList != null) {
                    this.f5259y.setTextColor(colorStateList);
                }
            }
            if (!o(this.f5259y)) {
                b(this.f5259y, true);
            }
        }
        C0964h0 c0964h03 = this.f5259y;
        if (c0964h03 != null) {
            c0964h03.setText(charSequence);
        }
        this.f5238U = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f5240W = colorStateList;
        C0964h0 c0964h0 = this.f5259y;
        if (c0964h0 != null) {
            c0964h0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0964h0 c0964h0 = this.f5258x;
            if (c0964h0 != null && o(c0964h0)) {
                removeView(this.f5258x);
                this.f5244d0.remove(this.f5258x);
            }
        } else {
            if (this.f5258x == null) {
                Context context = getContext();
                C0964h0 c0964h02 = new C0964h0(context, null);
                this.f5258x = c0964h02;
                c0964h02.setSingleLine();
                this.f5258x.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.f5225H;
                if (i6 != 0) {
                    this.f5258x.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.f5239V;
                if (colorStateList != null) {
                    this.f5258x.setTextColor(colorStateList);
                }
            }
            if (!o(this.f5258x)) {
                b(this.f5258x, true);
            }
        }
        C0964h0 c0964h03 = this.f5258x;
        if (c0964h03 != null) {
            c0964h03.setText(charSequence);
        }
        this.f5237T = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f5239V = colorStateList;
        C0964h0 c0964h0 = this.f5258x;
        if (c0964h0 != null) {
            c0964h0.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setOnMenuItemClickListener(f1 f1Var) {
    }
}
