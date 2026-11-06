package androidx.appcompat.widget;

import N.C0090e0;
import N.V;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xo.anilab.R;
import d2.AbstractC0651b;
import h.AbstractC0732a;
import l.o;
import m.C0949a;
import m.C0965i;
import m.C0977o;
import m.p1;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5138A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0090e0 f5139B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5140C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5141D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f5142E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f5143F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f5144G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View f5145H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public View f5146I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public LinearLayout f5147J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f5148K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f5149L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f5150M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f5151N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f5152O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f5153P;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0949a f5154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f5155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ActionMenuView f5156y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0977o f5157z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        C0949a c0949a = new C0949a();
        c0949a.f10241y = this;
        c0949a.f10239w = false;
        this.f5154w = c0949a;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f5155x = context;
        } else {
            this.f5155x = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0732a.f8566d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0651b.p(context, resourceId));
        this.f5150M = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f5151N = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f5138A = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f5153P = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i6, int i7) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i7);
        return Math.max(0, i6 - view.getMeasuredWidth());
    }

    public static int j(View view, int i6, int i7, int i8, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = ((i8 - measuredHeight) / 2) + i7;
        if (z5) {
            view.layout(i6 - measuredWidth, i9, i6, measuredHeight + i9);
        } else {
            view.layout(i6, i9, i6 + measuredWidth, measuredHeight + i9);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(k.AbstractC0880c r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f5144G
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f5153P
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f5144G = r0
        L15:
            r6.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r6.f5144G
            goto L15
        L22:
            android.view.View r0 = r6.f5144G
            r2 = 2131230789(0x7f080045, float:1.807764E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f5145H = r0
            m.c r2 = new m.c
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            l.o r7 = r7.c()
            m.o r0 = r6.f5157z
            if (r0 == 0) goto L4f
            r0.f()
            m.i r0 = r0.f10354Q
            if (r0 == 0) goto L4f
            boolean r2 = r0.b()
            if (r2 == 0) goto L4f
            l.w r0 = r0.f9831j
            r0.dismiss()
        L4f:
            m.o r0 = new m.o
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f5157z = r0
            r2 = 1
            r0.f10346I = r2
            r0.f10347J = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            m.o r3 = r6.f5157z
            android.content.Context r4 = r6.f5155x
            r7.b(r3, r4)
            m.o r7 = r6.f5157z
            l.C r3 = r7.f10341D
            if (r3 != 0) goto L87
            android.view.LayoutInflater r4 = r7.f10362z
            int r5 = r7.f10339B
            android.view.View r1 = r4.inflate(r5, r6, r1)
            l.C r1 = (l.InterfaceC0903C) r1
            r7.f10341D = r1
            l.o r4 = r7.f10361y
            r1.a(r4)
            r7.n(r2)
        L87:
            l.C r1 = r7.f10341D
            if (r3 == r1) goto L91
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L91:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f5156y = r1
            r7 = 0
            r1.setBackground(r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f5156y
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.c(k.c):void");
    }

    public final void d() {
        if (this.f5147J == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f5147J = linearLayout;
            this.f5148K = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f5149L = (TextView) this.f5147J.findViewById(R.id.action_bar_subtitle);
            int i6 = this.f5150M;
            if (i6 != 0) {
                this.f5148K.setTextAppearance(getContext(), i6);
            }
            int i7 = this.f5151N;
            if (i7 != 0) {
                this.f5149L.setTextAppearance(getContext(), i7);
            }
        }
        this.f5148K.setText(this.f5142E);
        this.f5149L.setText(this.f5143F);
        boolean z5 = !TextUtils.isEmpty(this.f5142E);
        boolean z6 = !TextUtils.isEmpty(this.f5143F);
        this.f5149L.setVisibility(z6 ? 0 : 8);
        this.f5147J.setVisibility((z5 || z6) ? 0 : 8);
        if (this.f5147J.getParent() == null) {
            addView(this.f5147J);
        }
    }

    public final void e() {
        removeAllViews();
        this.f5146I = null;
        this.f5156y = null;
        this.f5157z = null;
        View view = this.f5145H;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0732a.f8563a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0977o c0977o = this.f5157z;
        if (c0977o != null) {
            Configuration configuration2 = c0977o.f10360x.getResources().getConfiguration();
            int i6 = configuration2.screenWidthDp;
            int i7 = configuration2.screenHeightDp;
            c0977o.f10350M = (configuration2.smallestScreenWidthDp > 600 || i6 > 600 || (i6 > 960 && i7 > 720) || (i6 > 720 && i7 > 960)) ? 5 : (i6 >= 500 || (i6 > 640 && i7 > 480) || (i6 > 480 && i7 > 640)) ? 4 : i6 >= 360 ? 3 : 2;
            o oVar = c0977o.f10361y;
            if (oVar != null) {
                oVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f5139B != null ? this.f5154w.f10240x : getVisibility();
    }

    public int getContentHeight() {
        return this.f5138A;
    }

    public CharSequence getSubtitle() {
        return this.f5143F;
    }

    public CharSequence getTitle() {
        return this.f5142E;
    }

    public final boolean h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5141D = false;
        }
        if (!this.f5141D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f5141D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5141D = false;
        }
        return true;
    }

    public final boolean i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5140C = false;
        }
        if (!this.f5140C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f5140C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5140C = false;
        }
        return true;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i6) {
        if (i6 != getVisibility()) {
            C0090e0 c0090e0 = this.f5139B;
            if (c0090e0 != null) {
                c0090e0.b();
            }
            super.setVisibility(i6);
        }
    }

    public final C0090e0 l(int i6, long j6) {
        C0090e0 c0090e0 = this.f5139B;
        if (c0090e0 != null) {
            c0090e0.b();
        }
        C0949a c0949a = this.f5154w;
        if (i6 != 0) {
            C0090e0 c0090e0A = V.a(this);
            c0090e0A.a(0.0f);
            c0090e0A.c(j6);
            ((ActionBarContextView) c0949a.f10241y).f5139B = c0090e0A;
            c0949a.f10240x = i6;
            c0090e0A.d(c0949a);
            return c0090e0A;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0090e0 c0090e0A2 = V.a(this);
        c0090e0A2.a(1.0f);
        c0090e0A2.c(j6);
        ((ActionBarContextView) c0949a.f10241y).f5139B = c0090e0A2;
        c0949a.f10240x = i6;
        c0090e0A2.d(c0949a);
        return c0090e0A2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0977o c0977o = this.f5157z;
        if (c0977o != null) {
            c0977o.f();
            C0965i c0965i = this.f5157z.f10354Q;
            if (c0965i == null || !c0965i.b()) {
                return;
            }
            c0965i.f9831j.dismiss();
        }
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        h(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        boolean z6 = p1.f10363a;
        boolean z7 = getLayoutDirection() == 1;
        int paddingRight = z7 ? (i8 - i6) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
        View view = this.f5144G;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5144G.getLayoutParams();
            int i10 = z7 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i11 = z7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i12 = z7 ? paddingRight - i10 : paddingRight + i10;
            int iJ = j(this.f5144G, i12, paddingTop, paddingTop2, z7) + i12;
            paddingRight = z7 ? iJ - i11 : iJ + i11;
        }
        LinearLayout linearLayout = this.f5147J;
        if (linearLayout != null && this.f5146I == null && linearLayout.getVisibility() != 8) {
            paddingRight += j(this.f5147J, paddingRight, paddingTop, paddingTop2, z7);
        }
        View view2 = this.f5146I;
        if (view2 != null) {
            j(view2, paddingRight, paddingTop, paddingTop2, z7);
        }
        int paddingLeft = z7 ? getPaddingLeft() : (i8 - i6) - getPaddingRight();
        ActionMenuView actionMenuView = this.f5156y;
        if (actionMenuView != null) {
            j(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        if (View.MeasureSpec.getMode(i6) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i7) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i6);
        int size2 = this.f5138A;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i7);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f5144G;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5144G.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f5156y;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f5156y, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f5147J;
        if (linearLayout != null && this.f5146I == null) {
            if (this.f5152O) {
                this.f5147J.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f5147J.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f5147J.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f5146I;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                iMin = Math.min(i10, iMin);
            }
            this.f5146I.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(iMin, i11));
        }
        if (this.f5138A <= 0) {
            int childCount = getChildCount();
            size2 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > size2) {
                    size2 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        i(motionEvent);
        return true;
    }

    public void setContentHeight(int i6) {
        this.f5138A = i6;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f5146I;
        if (view2 != null) {
            removeView(view2);
        }
        this.f5146I = view;
        if (view != null && (linearLayout = this.f5147J) != null) {
            removeView(linearLayout);
            this.f5147J = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f5143F = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f5142E = charSequence;
        d();
        V.m(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f5152O) {
            requestLayout();
        }
        this.f5152O = z5;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
