package J2;

import H2.m;
import N.V;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.xo.anilab.R;
import i.C0803c;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0887j;
import l.InterfaceC0901A;
import l.InterfaceC0903C;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends FrameLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f1325B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public i f1326A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f1327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x2.b f1328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f1329y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0887j f1330z;

    public k(Context context, AttributeSet attributeSet) {
        super(U2.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        g gVar = new g();
        gVar.f1322x = false;
        this.f1329y = gVar;
        Context context2 = getContext();
        C0803c c0803cF = m.f(context2, attributeSet, AbstractC1274a.f12437A, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        d dVar = new d(context2, getClass(), getMaxItemCount());
        this.f1327w = dVar;
        x2.b bVar = new x2.b(context2);
        this.f1328x = bVar;
        gVar.f1321w = bVar;
        gVar.f1323y = 1;
        bVar.setPresenter(gVar);
        dVar.b(gVar, dVar.f9754a);
        getContext();
        gVar.f1321w.f1314d0 = dVar;
        bVar.setIconTintList(c0803cF.G(6) ? c0803cF.s(6) : bVar.c());
        setItemIconSize(c0803cF.u(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (c0803cF.G(12)) {
            setItemTextAppearanceInactive(c0803cF.B(12, 0));
        }
        if (c0803cF.G(10)) {
            setItemTextAppearanceActive(c0803cF.B(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(c0803cF.r(11, true));
        if (c0803cF.G(13)) {
            setItemTextColor(c0803cF.s(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListG = C0.g(background);
        if (background == null || colorStateListG != null) {
            P2.g gVar2 = new P2.g(P2.j.b(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (colorStateListG != null) {
                gVar2.n(colorStateListG);
            }
            gVar2.k(context2);
            WeakHashMap weakHashMap = V.f1964a;
            setBackground(gVar2);
        }
        if (c0803cF.G(8)) {
            setItemPaddingTop(c0803cF.u(8, 0));
        }
        if (c0803cF.G(7)) {
            setItemPaddingBottom(c0803cF.u(7, 0));
        }
        if (c0803cF.G(0)) {
            setActiveIndicatorLabelPadding(c0803cF.u(0, 0));
        }
        if (c0803cF.G(2)) {
            setElevation(c0803cF.u(2, 0));
        }
        H.a.h(getBackground().mutate(), f2.h.p(context2, c0803cF, 1));
        setLabelVisibilityMode(((TypedArray) c0803cF.f9278y).getInteger(14, -1));
        int iB = c0803cF.B(4, 0);
        if (iB != 0) {
            bVar.setItemBackgroundRes(iB);
        } else {
            setItemRippleColor(f2.h.p(context2, c0803cF, 9));
        }
        int iB2 = c0803cF.B(3, 0);
        if (iB2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iB2, AbstractC1274a.f12472z);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(f2.h.o(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(P2.j.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new P2.a(0)).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (c0803cF.G(15)) {
            int iB3 = c0803cF.B(15, 0);
            gVar.f1322x = true;
            getMenuInflater().inflate(iB3, dVar);
            gVar.f1322x = false;
            gVar.n(true);
        }
        c0803cF.M();
        addView(bVar);
        dVar.f9758e = new K1.b(11, this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f1330z == null) {
            this.f1330z = new C0887j(getContext());
        }
        return this.f1330z;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f1328x.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f1328x.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f1328x.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f1328x.getItemActiveIndicatorMarginHorizontal();
    }

    public P2.j getItemActiveIndicatorShapeAppearance() {
        return this.f1328x.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f1328x.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f1328x.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f1328x.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f1328x.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f1328x.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f1328x.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f1328x.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f1328x.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f1328x.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f1328x.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f1328x.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f1328x.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f1327w;
    }

    public InterfaceC0903C getMenuView() {
        return this.f1328x;
    }

    public g getPresenter() {
        return this.f1329y;
    }

    public int getSelectedItemId() {
        return this.f1328x.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof P2.g) {
            Y2.b.B(this, (P2.g) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f3569w);
        Bundle bundle = jVar.f1324y;
        d dVar = this.f1327w;
        dVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = dVar.f9774u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0901A interfaceC0901A = (InterfaceC0901A) weakReference.get();
                if (interfaceC0901A == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iD = interfaceC0901A.d();
                    if (iD > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(iD)) != null) {
                        interfaceC0901A.h(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableG;
        j jVar = new j(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        jVar.f1324y = bundle;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f1327w.f9774u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0901A interfaceC0901A = (InterfaceC0901A) weakReference.get();
                if (interfaceC0901A == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iD = interfaceC0901A.d();
                    if (iD > 0 && (parcelableG = interfaceC0901A.g()) != null) {
                        sparseArray.put(iD, parcelableG);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return jVar;
    }

    public void setActiveIndicatorLabelPadding(int i6) {
        this.f1328x.setActiveIndicatorLabelPadding(i6);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof P2.g) {
            ((P2.g) background).m(f6);
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f1328x.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.f1328x.setItemActiveIndicatorEnabled(z5);
    }

    public void setItemActiveIndicatorHeight(int i6) {
        this.f1328x.setItemActiveIndicatorHeight(i6);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i6) {
        this.f1328x.setItemActiveIndicatorMarginHorizontal(i6);
    }

    public void setItemActiveIndicatorShapeAppearance(P2.j jVar) {
        this.f1328x.setItemActiveIndicatorShapeAppearance(jVar);
    }

    public void setItemActiveIndicatorWidth(int i6) {
        this.f1328x.setItemActiveIndicatorWidth(i6);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1328x.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i6) {
        this.f1328x.setItemBackgroundRes(i6);
    }

    public void setItemIconSize(int i6) {
        this.f1328x.setItemIconSize(i6);
    }

    public void setItemIconSizeRes(int i6) {
        setItemIconSize(getResources().getDimensionPixelSize(i6));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1328x.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i6) {
        this.f1328x.setItemPaddingBottom(i6);
    }

    public void setItemPaddingTop(int i6) {
        this.f1328x.setItemPaddingTop(i6);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f1328x.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i6) {
        this.f1328x.setItemTextAppearanceActive(i6);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.f1328x.setItemTextAppearanceActiveBoldEnabled(z5);
    }

    public void setItemTextAppearanceInactive(int i6) {
        this.f1328x.setItemTextAppearanceInactive(i6);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1328x.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i6) {
        x2.b bVar = this.f1328x;
        if (bVar.getLabelVisibilityMode() != i6) {
            bVar.setLabelVisibilityMode(i6);
            this.f1329y.n(false);
        }
    }

    public void setOnItemSelectedListener(i iVar) {
        this.f1326A = iVar;
    }

    public void setSelectedItemId(int i6) {
        d dVar = this.f1327w;
        MenuItem menuItemFindItem = dVar.findItem(i6);
        if (menuItemFindItem == null || dVar.q(menuItemFindItem, this.f1329y, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(h hVar) {
    }
}
