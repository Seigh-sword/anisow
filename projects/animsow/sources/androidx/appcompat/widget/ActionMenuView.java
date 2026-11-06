package androidx.appcompat.widget;

import B3.e;
import S0.f;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.InterfaceC0903C;
import l.m;
import l.n;
import l.o;
import l.q;
import l.z;
import m.B0;
import m.C0;
import m.C0965i;
import m.C0973m;
import m.C0977o;
import m.C0981q;
import m.InterfaceC0979p;
import m.p1;
import m.r;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends C0 implements n, InterfaceC0903C {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public o f5189L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Context f5190M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f5191N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f5192O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0977o f5193P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public z f5194Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public m f5195R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f5196S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f5197T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f5198U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f5199V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public r f5200W;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f5198U = (int) (56.0f * f6);
        this.f5199V = (int) (f6 * 4.0f);
        this.f5190M = context;
        this.f5191N = 0;
    }

    public static C0981q j() {
        C0981q c0981q = new C0981q(-2, -2);
        c0981q.f10366a = false;
        ((LinearLayout.LayoutParams) c0981q).gravity = 16;
        return c0981q;
    }

    public static C0981q k(ViewGroup.LayoutParams layoutParams) {
        C0981q c0981q;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0981q) {
            C0981q c0981q2 = (C0981q) layoutParams;
            c0981q = new C0981q(c0981q2);
            c0981q.f10366a = c0981q2.f10366a;
        } else {
            c0981q = new C0981q(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0981q).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0981q).gravity = 16;
        }
        return c0981q;
    }

    @Override // l.InterfaceC0903C
    public final void a(o oVar) {
        this.f5189L = oVar;
    }

    @Override // l.n
    public final boolean c(q qVar) {
        return this.f5189L.q(qVar, null, 0);
    }

    @Override // m.C0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0981q;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.C0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ B0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.C0
    /* JADX INFO: renamed from: g */
    public final B0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0981q(getContext(), attributeSet);
    }

    @Override // m.C0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // m.C0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0981q(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f5189L == null) {
            Context context = getContext();
            o oVar = new o(context);
            this.f5189L = oVar;
            oVar.f9758e = new f(3, this);
            C0977o c0977o = new C0977o(context);
            this.f5193P = c0977o;
            c0977o.f10346I = true;
            c0977o.f10347J = true;
            z eVar = this.f5194Q;
            if (eVar == null) {
                eVar = new e();
            }
            c0977o.f10338A = eVar;
            this.f5189L.b(c0977o, this.f5190M);
            C0977o c0977o2 = this.f5193P;
            c0977o2.f10341D = this;
            this.f5189L = c0977o2.f10361y;
        }
        return this.f5189L;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0977o c0977o = this.f5193P;
        C0973m c0973m = c0977o.f10343F;
        if (c0973m != null) {
            return c0973m.getDrawable();
        }
        if (c0977o.f10345H) {
            return c0977o.f10344G;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f5191N;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // m.C0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ B0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i6) {
        boolean zA = false;
        if (i6 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i6 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i6);
        if (i6 < getChildCount() && (childAt instanceof InterfaceC0979p)) {
            zA = ((InterfaceC0979p) childAt).a();
        }
        return (i6 <= 0 || !(childAt2 instanceof InterfaceC0979p)) ? zA : zA | ((InterfaceC0979p) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0977o c0977o = this.f5193P;
        if (c0977o != null) {
            c0977o.n(false);
            if (this.f5193P.k()) {
                this.f5193P.f();
                this.f5193P.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0977o c0977o = this.f5193P;
        if (c0977o != null) {
            c0977o.f();
            C0965i c0965i = c0977o.f10354Q;
            if (c0965i == null || !c0965i.b()) {
                return;
            }
            c0965i.f9831j.dismiss();
        }
    }

    @Override // m.C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int width;
        int paddingLeft;
        if (!this.f5196S) {
            super.onLayout(z5, i6, i7, i8, i9);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i9 - i7) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i8 - i6;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean z6 = p1.f10363a;
        boolean z7 = getLayoutDirection() == 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0981q c0981q = (C0981q) childAt.getLayoutParams();
                if (c0981q.f10366a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z7) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0981q).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0981q).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0981q).leftMargin) + ((LinearLayout.LayoutParams) c0981q).rightMargin;
                    l(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int iMax = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (z7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                C0981q c0981q2 = (C0981q) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0981q2.f10366a) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) c0981q2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0981q2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            C0981q c0981q3 = (C0981q) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0981q3.f10366a) {
                int i23 = paddingLeft2 + ((LinearLayout.LayoutParams) c0981q3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0981q3).rightMargin + iMax + i23;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // m.C0, android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        boolean z5;
        int i11;
        int i12;
        int i13;
        int i14;
        ?? r12;
        int i15;
        int i16;
        int i17;
        o oVar;
        boolean z6 = this.f5196S;
        boolean z7 = View.MeasureSpec.getMode(i6) == 1073741824;
        this.f5196S = z7;
        if (z6 != z7) {
            this.f5197T = 0;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (this.f5196S && (oVar = this.f5189L) != null && size != this.f5197T) {
            this.f5197T = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f5196S || childCount <= 0) {
            for (int i18 = 0; i18 < childCount; i18++) {
                C0981q c0981q = (C0981q) getChildAt(i18).getLayoutParams();
                ((LinearLayout.LayoutParams) c0981q).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0981q).leftMargin = 0;
            }
            super.onMeasure(i6, i7);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i6);
        int size3 = View.MeasureSpec.getSize(i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, paddingBottom, -2);
        int i19 = size2 - paddingRight;
        int i20 = this.f5198U;
        int i21 = i19 / i20;
        int i22 = i19 % i20;
        if (i21 == 0) {
            setMeasuredDimension(i19, 0);
            return;
        }
        int i23 = (i22 / i21) + i20;
        int childCount2 = getChildCount();
        int i24 = 0;
        int iMax = 0;
        int i25 = 0;
        boolean z8 = false;
        int i26 = 0;
        int iMax2 = 0;
        long j6 = 0;
        while (true) {
            i8 = this.f5199V;
            if (i25 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i25);
            int i27 = size3;
            if (childAt.getVisibility() == 8) {
                i15 = i19;
                i16 = paddingBottom;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i28 = i24 + 1;
                if (z9) {
                    childAt.setPadding(i8, 0, i8, 0);
                }
                C0981q c0981q2 = (C0981q) childAt.getLayoutParams();
                c0981q2.f10371f = false;
                c0981q2.f10368c = 0;
                c0981q2.f10367b = 0;
                c0981q2.f10369d = false;
                ((LinearLayout.LayoutParams) c0981q2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0981q2).rightMargin = 0;
                c0981q2.f10370e = z9 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i29 = c0981q2.f10366a ? 1 : i21;
                C0981q c0981q3 = (C0981q) childAt.getLayoutParams();
                i15 = i19;
                i16 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i29 <= 0 || (z10 && i29 < 2)) {
                    i17 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i29 * i23, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i17 = measuredWidth / i23;
                    if (measuredWidth % i23 != 0) {
                        i17++;
                    }
                    if (z10 && i17 < 2) {
                        i17 = 2;
                    }
                }
                c0981q3.f10369d = !c0981q3.f10366a && z10;
                c0981q3.f10367b = i17;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i23, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i17);
                if (c0981q2.f10369d) {
                    i26++;
                }
                if (c0981q2.f10366a) {
                    z8 = true;
                }
                i21 -= i17;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i17 == 1) {
                    j6 |= (long) (1 << i25);
                }
                i24 = i28;
            }
            i25++;
            size3 = i27;
            paddingBottom = i16;
            i19 = i15;
        }
        int i30 = i19;
        int i31 = size3;
        int i32 = iMax2;
        boolean z11 = z8 && i24 == 2;
        boolean z12 = false;
        while (i26 > 0 && i21 > 0) {
            int i33 = Integer.MAX_VALUE;
            int i34 = 0;
            int i35 = 0;
            long j7 = 0;
            while (i35 < childCount2) {
                int i36 = i32;
                C0981q c0981q4 = (C0981q) getChildAt(i35).getLayoutParams();
                boolean z13 = z12;
                if (c0981q4.f10369d) {
                    int i37 = c0981q4.f10367b;
                    if (i37 < i33) {
                        j7 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        i34++;
                        j7 |= 1 << i35;
                    }
                }
                i35++;
                z12 = z13;
                i32 = i36;
            }
            i10 = i32;
            z5 = z12;
            j6 |= j7;
            if (i34 > i21) {
                i9 = mode;
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                C0981q c0981q5 = (C0981q) childAt2.getLayoutParams();
                int i40 = mode;
                int i41 = childMeasureSpec;
                int i42 = childCount2;
                long j8 = 1 << i39;
                if ((j7 & j8) != 0) {
                    if (z11 && c0981q5.f10370e) {
                        r12 = 1;
                        r12 = 1;
                        if (i21 == 1) {
                            childAt2.setPadding(i8 + i23, 0, i8, 0);
                        }
                    } else {
                        r12 = 1;
                    }
                    c0981q5.f10367b += r12;
                    c0981q5.f10371f = r12;
                    i21--;
                } else if (c0981q5.f10367b == i38) {
                    j6 |= j8;
                }
                i39++;
                childMeasureSpec = i41;
                mode = i40;
                childCount2 = i42;
            }
            i32 = i10;
            z12 = true;
        }
        i9 = mode;
        i10 = i32;
        z5 = z12;
        int i43 = childMeasureSpec;
        int i44 = childCount2;
        boolean z14 = !z8 && i24 == 1;
        if (i21 <= 0 || j6 == 0 || (i21 >= i24 - 1 && !z14 && iMax <= 1)) {
            i11 = i44;
        } else {
            float fBitCount = Long.bitCount(j6);
            if (!z14) {
                if ((j6 & 1) != 0 && !((C0981q) getChildAt(0).getLayoutParams()).f10370e) {
                    fBitCount -= 0.5f;
                }
                int i45 = i44 - 1;
                if ((j6 & ((long) (1 << i45))) != 0 && !((C0981q) getChildAt(i45).getLayoutParams()).f10370e) {
                    fBitCount -= 0.5f;
                }
            }
            int i46 = fBitCount > 0.0f ? (int) ((i21 * i23) / fBitCount) : 0;
            i11 = i44;
            for (int i47 = 0; i47 < i11; i47++) {
                if ((j6 & ((long) (1 << i47))) != 0) {
                    View childAt3 = getChildAt(i47);
                    C0981q c0981q6 = (C0981q) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0981q6.f10368c = i46;
                        c0981q6.f10371f = true;
                        if (i47 == 0 && !c0981q6.f10370e) {
                            ((LinearLayout.LayoutParams) c0981q6).leftMargin = (-i46) / 2;
                        }
                        z5 = true;
                    } else if (c0981q6.f10366a) {
                        c0981q6.f10368c = i46;
                        c0981q6.f10371f = true;
                        ((LinearLayout.LayoutParams) c0981q6).rightMargin = (-i46) / 2;
                        z5 = true;
                    } else {
                        if (i47 != 0) {
                            ((LinearLayout.LayoutParams) c0981q6).leftMargin = i46 / 2;
                        }
                        if (i47 != i11 - 1) {
                            ((LinearLayout.LayoutParams) c0981q6).rightMargin = i46 / 2;
                        }
                    }
                }
            }
        }
        if (z5) {
            int i48 = 0;
            while (i48 < i11) {
                View childAt4 = getChildAt(i48);
                C0981q c0981q7 = (C0981q) childAt4.getLayoutParams();
                if (c0981q7.f10371f) {
                    i14 = i43;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0981q7.f10367b * i23) + c0981q7.f10368c, 1073741824), i14);
                } else {
                    i14 = i43;
                }
                i48++;
                i43 = i14;
            }
        }
        if (i9 != 1073741824) {
            i13 = i30;
            i12 = i10;
        } else {
            i12 = i31;
            i13 = i30;
        }
        setMeasuredDimension(i13, i12);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.f5193P.f10351N = z5;
    }

    public void setOnMenuItemClickListener(r rVar) {
        this.f5200W = rVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0977o c0977o = this.f5193P;
        C0973m c0973m = c0977o.f10343F;
        if (c0973m != null) {
            c0973m.setImageDrawable(drawable);
        } else {
            c0977o.f10345H = true;
            c0977o.f10344G = drawable;
        }
    }

    public void setOverflowReserved(boolean z5) {
        this.f5192O = z5;
    }

    public void setPopupTheme(int i6) {
        if (this.f5191N != i6) {
            this.f5191N = i6;
            if (i6 == 0) {
                this.f5190M = getContext();
            } else {
                this.f5190M = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setPresenter(C0977o c0977o) {
        this.f5193P = c0977o;
        c0977o.f10341D = this;
        this.f5189L = c0977o.f10361y;
    }

    @Override // m.C0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
