package J2;

import F0.C0014a;
import N.V;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import i.ViewOnClickListenerC0802b;
import java.util.HashSet;
import java.util.WeakHashMap;
import l.InterfaceC0903C;
import l.o;
import l.q;
import s2.AbstractC1301a;
import u2.C1368a;
import x2.C1490a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ViewGroup implements InterfaceC0903C {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int[] f1286e0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int[] f1287f0 = {-16842910};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1288A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public c[] f1289B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f1290C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f1291D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ColorStateList f1292E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f1293F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ColorStateList f1294G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ColorStateList f1295H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f1296I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f1297J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f1298K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Drawable f1299L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ColorStateList f1300M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f1301N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final SparseArray f1302O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f1303P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f1304Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f1305R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f1306S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f1307T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f1308U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f1309V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public P2.j f1310W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1311a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ColorStateList f1312b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public g f1313c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public o f1314d0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0014a f1315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ViewOnClickListenerC0802b f1316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final M.c f1317y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseArray f1318z;

    public e(Context context) {
        super(context);
        this.f1317y = new M.c(5);
        this.f1318z = new SparseArray(5);
        this.f1290C = 0;
        this.f1291D = 0;
        this.f1302O = new SparseArray(5);
        this.f1303P = -1;
        this.f1304Q = -1;
        this.f1305R = -1;
        this.f1311a0 = false;
        this.f1295H = c();
        if (isInEditMode()) {
            this.f1315w = null;
        } else {
            C0014a c0014a = new C0014a();
            this.f1315w = c0014a;
            c0014a.W(0);
            c0014a.K(Y2.b.z(getContext(), com.xo.anilab.R.attr.motionDurationMedium4, getResources().getInteger(com.xo.anilab.R.integer.material_motion_duration_long_1)));
            c0014a.M(Y2.b.A(getContext(), com.xo.anilab.R.attr.motionEasingStandard, AbstractC1301a.f12618b));
            c0014a.S(new H2.k());
        }
        this.f1316x = new ViewOnClickListenerC0802b(4, this);
        WeakHashMap weakHashMap = V.f1964a;
        setImportantForAccessibility(1);
    }

    private c getNewItem() {
        c cVar = (c) this.f1317y.h();
        return cVar == null ? new C1490a(getContext()) : cVar;
    }

    private void setBadgeIfNeeded(c cVar) {
        C1368a c1368a;
        int id = cVar.getId();
        if (id == -1 || (c1368a = (C1368a) this.f1302O.get(id)) == null) {
            return;
        }
        cVar.setBadge(c1368a);
    }

    @Override // l.InterfaceC0903C
    public final void a(o oVar) {
        this.f1314d0 = oVar;
    }

    public final void b() {
        removeAllViews();
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    this.f1317y.d(cVar);
                    cVar.i(cVar.f1261J);
                    cVar.f1267P = null;
                    cVar.f1273V = 0.0f;
                    cVar.f1280w = false;
                }
            }
        }
        if (this.f1314d0.f9759f.size() == 0) {
            this.f1290C = 0;
            this.f1291D = 0;
            this.f1289B = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < this.f1314d0.f9759f.size(); i6++) {
            hashSet.add(Integer.valueOf(this.f1314d0.getItem(i6).getItemId()));
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f1302O;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i7);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i7++;
        }
        this.f1289B = new c[this.f1314d0.f9759f.size()];
        int i8 = this.f1288A;
        boolean z5 = i8 != -1 ? i8 == 0 : this.f1314d0.l().size() > 3;
        for (int i9 = 0; i9 < this.f1314d0.f9759f.size(); i9++) {
            this.f1313c0.f1322x = true;
            this.f1314d0.getItem(i9).setCheckable(true);
            this.f1313c0.f1322x = false;
            c newItem = getNewItem();
            this.f1289B[i9] = newItem;
            newItem.setIconTintList(this.f1292E);
            newItem.setIconSize(this.f1293F);
            newItem.setTextColor(this.f1295H);
            newItem.setTextAppearanceInactive(this.f1296I);
            newItem.setTextAppearanceActive(this.f1297J);
            newItem.setTextAppearanceActiveBoldEnabled(this.f1298K);
            newItem.setTextColor(this.f1294G);
            int i10 = this.f1303P;
            if (i10 != -1) {
                newItem.setItemPaddingTop(i10);
            }
            int i11 = this.f1304Q;
            if (i11 != -1) {
                newItem.setItemPaddingBottom(i11);
            }
            int i12 = this.f1305R;
            if (i12 != -1) {
                newItem.setActiveIndicatorLabelPadding(i12);
            }
            newItem.setActiveIndicatorWidth(this.f1307T);
            newItem.setActiveIndicatorHeight(this.f1308U);
            newItem.setActiveIndicatorMarginHorizontal(this.f1309V);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f1311a0);
            newItem.setActiveIndicatorEnabled(this.f1306S);
            Drawable drawable = this.f1299L;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f1301N);
            }
            newItem.setItemRippleColor(this.f1300M);
            newItem.setShifting(z5);
            newItem.setLabelVisibilityMode(this.f1288A);
            q qVar = (q) this.f1314d0.getItem(i9);
            newItem.b(qVar);
            newItem.setItemPosition(i9);
            SparseArray sparseArray2 = this.f1318z;
            int i13 = qVar.f9784a;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i13));
            newItem.setOnClickListener(this.f1316x);
            int i14 = this.f1290C;
            if (i14 != 0 && i13 == i14) {
                this.f1291D = i9;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f1314d0.f9759f.size() - 1, this.f1291D);
        this.f1291D = iMin;
        this.f1314d0.getItem(iMin).setChecked(true);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = E.f.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.xo.anilab.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = f1287f0;
        return new ColorStateList(new int[][]{iArr, f1286e0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListB.getColorForState(iArr, defaultColor), i6, defaultColor});
    }

    public final P2.g d() {
        if (this.f1310W == null || this.f1312b0 == null) {
            return null;
        }
        P2.g gVar = new P2.g(this.f1310W);
        gVar.n(this.f1312b0);
        return gVar;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f1305R;
    }

    public SparseArray<C1368a> getBadgeDrawables() {
        return this.f1302O;
    }

    public ColorStateList getIconTintList() {
        return this.f1292E;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f1312b0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f1306S;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f1308U;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f1309V;
    }

    public P2.j getItemActiveIndicatorShapeAppearance() {
        return this.f1310W;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f1307T;
    }

    public Drawable getItemBackground() {
        c[] cVarArr = this.f1289B;
        return (cVarArr == null || cVarArr.length <= 0) ? this.f1299L : cVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f1301N;
    }

    public int getItemIconSize() {
        return this.f1293F;
    }

    public int getItemPaddingBottom() {
        return this.f1304Q;
    }

    public int getItemPaddingTop() {
        return this.f1303P;
    }

    public ColorStateList getItemRippleColor() {
        return this.f1300M;
    }

    public int getItemTextAppearanceActive() {
        return this.f1297J;
    }

    public int getItemTextAppearanceInactive() {
        return this.f1296I;
    }

    public ColorStateList getItemTextColor() {
        return this.f1294G;
    }

    public int getLabelVisibilityMode() {
        return this.f1288A;
    }

    public o getMenu() {
        return this.f1314d0;
    }

    public int getSelectedItemId() {
        return this.f1290C;
    }

    public int getSelectedItemPosition() {
        return this.f1291D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f1314d0.l().size(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i6) {
        this.f1305R = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorLabelPadding(i6);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1292E = colorStateList;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f1312b0 = colorStateList;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.f1306S = z5;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorEnabled(z5);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i6) {
        this.f1308U = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorHeight(i6);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i6) {
        this.f1309V = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorMarginHorizontal(i6);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z5) {
        this.f1311a0 = z5;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorResizeable(z5);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(P2.j jVar) {
        this.f1310W = jVar;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i6) {
        this.f1307T = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setActiveIndicatorWidth(i6);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f1299L = drawable;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i6) {
        this.f1301N = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemBackground(i6);
            }
        }
    }

    public void setItemIconSize(int i6) {
        this.f1293F = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setIconSize(i6);
            }
        }
    }

    public void setItemPaddingBottom(int i6) {
        this.f1304Q = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingBottom(i6);
            }
        }
    }

    public void setItemPaddingTop(int i6) {
        this.f1303P = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemPaddingTop(i6);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f1300M = colorStateList;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i6) {
        this.f1297J = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActive(i6);
                ColorStateList colorStateList = this.f1294G;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.f1298K = z5;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceActiveBoldEnabled(z5);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i6) {
        this.f1296I = i6;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextAppearanceInactive(i6);
                ColorStateList colorStateList = this.f1294G;
                if (colorStateList != null) {
                    cVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1294G = colorStateList;
        c[] cVarArr = this.f1289B;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                cVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i6) {
        this.f1288A = i6;
    }

    public void setPresenter(g gVar) {
        this.f1313c0 = gVar;
    }
}
