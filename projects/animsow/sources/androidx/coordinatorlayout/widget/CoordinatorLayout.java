package androidx.coordinatorlayout.widget;

import A.a;
import B.b;
import B.d;
import B.e;
import B.f;
import B.g;
import B.h;
import B.i;
import J3.w;
import M.c;
import N.C0;
import N.G;
import N.I;
import N.InterfaceC0105p;
import N.InterfaceC0106q;
import N.V;
import N.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import s.k;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0105p, InterfaceC0106q {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f5286P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Class[] f5287Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final ThreadLocal f5288R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final h f5289S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final c f5290T;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f5291A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int[] f5292B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5293C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5294D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int[] f5295E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f5296F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f5297G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public f f5298H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5299I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0 f5300J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f5301K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Drawable f5302L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f5303M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public S0.f f5304N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final r f5305O;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f5306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f5307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f5308y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f5309z;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f5286P = r02 != null ? r02.getName() : null;
        f5289S = new h(0);
        f5287Q = new Class[]{Context.class, AttributeSet.class};
        f5288R = new ThreadLocal();
        f5290T = new c(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f5306w = new ArrayList();
        this.f5307x = new w(3);
        this.f5308y = new ArrayList();
        this.f5309z = new ArrayList();
        this.f5291A = new int[2];
        this.f5292B = new int[2];
        this.f5305O = new r();
        int[] iArr = a.f0a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f5295E = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i6 = 0; i6 < length; i6++) {
                this.f5295E[i6] = (int) (r1[i6] * f6);
            }
        }
        this.f5302L = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d(this));
        WeakHashMap weakHashMap = V.f1964a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f5290T.h();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i6, Rect rect, Rect rect2, e eVar, int i7, int i8) {
        int i9 = eVar.f39c;
        if (i9 == 0) {
            i9 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i6);
        int i10 = eVar.f40d;
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, i6);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int i13 = absoluteGravity2 & 7;
        int i14 = absoluteGravity2 & 112;
        int iWidth = i13 != 1 ? i13 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i14 != 16 ? i14 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i11 == 1) {
            iWidth -= i7 / 2;
        } else if (i11 != 5) {
            iWidth -= i7;
        }
        if (i12 == 16) {
            iHeight -= i8 / 2;
        } else if (i12 != 80) {
            iHeight -= i8;
        }
        rect2.set(iWidth, iHeight, i7 + iWidth, i8 + iHeight);
    }

    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f38b) {
            B.c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (B.c) superclass.getAnnotation(B.c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar = (b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    b bVar2 = eVar.f37a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.i();
                        }
                        eVar.f37a = bVar;
                        eVar.f38b = true;
                        if (bVar != null) {
                            bVar.g(eVar);
                        }
                    }
                } catch (Exception e6) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                }
            }
            eVar.f38b = true;
        }
        return eVar;
    }

    public static void u(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        int i7 = eVar.f45i;
        if (i7 != i6) {
            WeakHashMap weakHashMap = V.f1964a;
            view.offsetLeftAndRight(i6 - i7);
            eVar.f45i = i6;
        }
    }

    public static void v(View view, int i6) {
        e eVar = (e) view.getLayoutParams();
        int i7 = eVar.f46j;
        if (i7 != i6) {
            WeakHashMap weakHashMap = V.f1964a;
            view.offsetTopAndBottom(i6 - i7);
            eVar.f46j = i6;
        }
    }

    @Override // N.InterfaceC0105p
    public final void a(View view, View view2, int i6, int i7) {
        r rVar = this.f5305O;
        if (i7 == 1) {
            rVar.f2043b = i6;
        } else {
            rVar.f2042a = i6;
        }
        this.f5297G = view2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            ((e) getChildAt(i8).getLayoutParams()).getClass();
        }
    }

    @Override // N.InterfaceC0105p
    public final void b(View view, int i6) {
        r rVar = this.f5305O;
        if (i6 == 1) {
            rVar.f2043b = 0;
        } else {
            rVar.f2042a = 0;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i6)) {
                b bVar = eVar.f37a;
                if (bVar != null) {
                    bVar.t(childAt, view, i6);
                }
                if (i6 == 0) {
                    eVar.f50n = false;
                } else if (i6 == 1) {
                    eVar.f51o = false;
                }
                eVar.getClass();
            }
        }
        this.f5297G = null;
    }

    @Override // N.InterfaceC0105p
    public final void c(View view, int i6, int i7, int[] iArr, int i8) {
        b bVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i8) && (bVar = eVar.f37a) != null) {
                    int[] iArr2 = this.f5291A;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.n(this, childAt, view, i6, i7, iArr2, i8);
                    iMax = i6 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i7 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z5) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // N.InterfaceC0106q
    public final void d(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i10) && (bVar = eVar.f37a) != null) {
                    int[] iArr2 = this.f5291A;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(this, childAt, i7, i8, i9, iArr2);
                    iMax = i8 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i9 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z5) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        b bVar = ((e) view.getLayoutParams()).f37a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5302L;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // N.InterfaceC0105p
    public final void e(View view, int i6, int i7, int i8, int i9, int i10) {
        d(view, i6, i7, i8, i9, 0, this.f5292B);
    }

    @Override // N.InterfaceC0105p
    public final boolean f(View view, View view2, int i6, int i7) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f37a;
                if (bVar != null) {
                    boolean zS = bVar.s(childAt, i6, i7);
                    z5 |= zS;
                    if (i7 == 0) {
                        eVar.f50n = zS;
                    } else if (i7 == 1) {
                        eVar.f51o = zS;
                    }
                } else if (i7 == 0) {
                    eVar.f50n = false;
                } else if (i7 == 1) {
                    eVar.f51o = false;
                }
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f5306w);
    }

    public final C0 getLastWindowInsets() {
        return this.f5300J;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f5305O;
        return rVar.f2043b | rVar.f2042a;
    }

    public Drawable getStatusBarBackground() {
        return this.f5302L;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i6, int i7) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i6) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i7) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i6 + iMax, i7 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z5) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        w wVar = this.f5307x;
        int i6 = ((k) wVar.f1442b).f12534y;
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < i6; i7++) {
            ArrayList arrayList2 = (ArrayList) ((k) wVar.f1442b).l(i7);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((k) wVar.f1442b).h(i7));
            }
        }
        ArrayList arrayList3 = this.f5309z;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = i.f57a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = i.f57a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        i.a(this, view, matrix);
        ThreadLocal threadLocal3 = i.f58b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i6) {
        StringBuilder sb;
        int[] iArr = this.f5295E;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i6);
        } else {
            if (i6 >= 0 && i6 < iArr.length) {
                return iArr[i6];
            }
            sb = new StringBuilder("Keyline index ");
            sb.append(i6);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final boolean o(View view, int i6, int i7) {
        c cVar = f5290T;
        Rect rectG = g();
        k(rectG, view);
        try {
            return rectG.contains(i6, i7);
        } finally {
            rectG.setEmpty();
            cVar.d(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f5299I) {
            if (this.f5298H == null) {
                this.f5298H = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f5298H);
        }
        if (this.f5300J == null) {
            WeakHashMap weakHashMap = V.f1964a;
            if (getFitsSystemWindows()) {
                G.c(this);
            }
        }
        this.f5294D = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f5299I && this.f5298H != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f5298H);
        }
        View view = this.f5297G;
        if (view != null) {
            b(view, 0);
        }
        this.f5294D = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5301K || this.f5302L == null) {
            return;
        }
        C0 c02 = this.f5300J;
        int iD = c02 != null ? c02.d() : 0;
        if (iD > 0) {
            this.f5302L.setBounds(0, 0, getWidth(), iD);
            this.f5302L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        b bVar;
        WeakHashMap weakHashMap = V.f1964a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f5306w;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f37a) == null || !bVar.k(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f37a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        b bVar;
        int childCount = getChildCount();
        boolean zM = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f37a) != null) {
                    zM |= bVar.m(view);
                }
            }
        }
        return zM;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        c(view, i6, i7, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        e(view, i6, i7, i8, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        a(view, view2, i6, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f3569w);
        SparseArray sparseArray = gVar.f55y;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            b bVar = n(childAt).f37a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableR;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f37a;
            if (id != -1 && bVar != null && (parcelableR = bVar.r(childAt)) != null) {
                sparseArray.append(id, parcelableR);
            }
        }
        gVar.f55y = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return f(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f5296F
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f5296F
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            B.e r6 = (B.e) r6
            B.b r6 = r6.f37a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f5296F
            boolean r6 = r6.u(r7, r1)
        L2a:
            android.view.View r7 = r0.f5296F
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.t(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(int r26) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i6) {
        Rect rectG;
        Rect rectG2;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f47k;
        if (view2 == null && eVar.f42f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f5290T;
        if (view2 != null) {
            rectG = g();
            rectG2 = g();
            try {
                k(rectG, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i6, rectG, rectG2, eVar2, measuredWidth, measuredHeight);
                h(eVar2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                cVar.d(rectG);
                rectG2.setEmpty();
                cVar.d(rectG2);
            }
        }
        int i7 = eVar.f41e;
        if (i7 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            rectG = g();
            rectG.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f5300J != null) {
                WeakHashMap weakHashMap = V.f1964a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG.left = this.f5300J.b() + rectG.left;
                    rectG.top = this.f5300J.d() + rectG.top;
                    rectG.right -= this.f5300J.c();
                    rectG.bottom -= this.f5300J.a();
                }
            }
            rectG2 = g();
            int i8 = eVar3.f39c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG, rectG2, i6);
            view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i9 = eVar4.f39c;
        if (i9 == 0) {
            i9 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i6);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i6 == 1) {
            i7 = width - i7;
        }
        int iM = m(i7) - measuredWidth2;
        if (i10 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i10 == 5) {
            iM += measuredWidth2;
        }
        int i12 = i11 != 16 ? i11 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i6) {
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f5308y;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        h hVar = f5289S;
        if (hVar != null) {
            Collections.sort(arrayList, hVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zJ = false;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            e eVar = (e) view.getLayoutParams();
            b bVar = eVar.f37a;
            if (!(zJ || z6) || actionMasked == 0) {
                if (!zJ && bVar != null) {
                    if (i6 == 0) {
                        zJ = bVar.j(this, view, motionEvent);
                    } else if (i6 == 1) {
                        zJ = bVar.u(view, motionEvent);
                    }
                    if (zJ) {
                        this.f5296F = view;
                    }
                }
                if (eVar.f37a == null) {
                    eVar.f49m = false;
                }
                boolean z7 = eVar.f49m;
                if (z7) {
                    z5 = true;
                } else {
                    eVar.f49m = z7;
                    z5 = z7;
                }
                z6 = z5 && !z7;
                if (z5 && !z6) {
                    break;
                }
            } else if (bVar != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i6 == 0) {
                    bVar.j(this, view, motionEventObtain);
                } else if (i6 == 1) {
                    bVar.u(view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        b bVar = ((e) view.getLayoutParams()).f37a;
        if (bVar != null) {
            bVar.p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.f5293C) {
            return;
        }
        t(false);
        this.f5293C = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5303M = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f5302L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f5302L = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f5302L.setState(getDrawableState());
                }
                Drawable drawable3 = this.f5302L;
                WeakHashMap weakHashMap = V.f1964a;
                H.b.b(drawable3, getLayoutDirection());
                this.f5302L.setVisible(getVisibility() == 0, false);
                this.f5302L.setCallback(this);
            }
            WeakHashMap weakHashMap2 = V.f1964a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i6) {
        setStatusBarBackground(new ColorDrawable(i6));
    }

    public void setStatusBarBackgroundResource(int i6) {
        Drawable drawableB;
        if (i6 != 0) {
            Context context = getContext();
            Object obj = E.f.f379a;
            drawableB = E.a.b(context, i6);
        } else {
            drawableB = null;
        }
        setStatusBarBackground(drawableB);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z5 = i6 == 0;
        Drawable drawable = this.f5302L;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.f5302L.setVisible(z5, false);
    }

    public final void t(boolean z5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            b bVar = ((e) childAt.getLayoutParams()).f37a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z5) {
                    bVar.j(this, childAt, motionEventObtain);
                } else {
                    bVar.u(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            ((e) getChildAt(i7).getLayoutParams()).f49m = false;
        }
        this.f5296F = null;
        this.f5293C = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5302L;
    }

    public final void w() {
        WeakHashMap weakHashMap = V.f1964a;
        if (!getFitsSystemWindows()) {
            I.u(this, null);
            return;
        }
        if (this.f5304N == null) {
            this.f5304N = new S0.f(5, this);
        }
        I.u(this, this.f5304N);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
