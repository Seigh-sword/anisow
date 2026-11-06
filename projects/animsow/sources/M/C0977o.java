package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.xo.anilab.R;
import java.util.ArrayList;
import l.InterfaceC0901A;
import l.InterfaceC0902B;
import l.InterfaceC0903C;
import l.SubMenuC0907G;

/* JADX INFO: renamed from: m.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0977o implements InterfaceC0901A {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public l.z f10338A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC0903C f10341D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f10342E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0973m f10343F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f10344G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f10345H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10346I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f10347J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f10348K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f10349L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f10350M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f10351N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C0965i f10353P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0965i f10354Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public RunnableC0969k f10355R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0967j f10356S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f10358U;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f10359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Context f10360x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l.o f10361y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LayoutInflater f10362z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f10339B = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f10340C = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final SparseBooleanArray f10352O = new SparseBooleanArray();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final L3.c f10357T = new L3.c(3, this);

    public C0977o(Context context) {
        this.f10359w = context;
        this.f10362z = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(l.q qVar, View view, ViewGroup viewGroup) {
        View actionView = qVar.getActionView();
        if (actionView == null || qVar.e()) {
            InterfaceC0902B interfaceC0902B = view instanceof InterfaceC0902B ? (InterfaceC0902B) view : (InterfaceC0902B) this.f10362z.inflate(this.f10340C, viewGroup, false);
            interfaceC0902B.b(qVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0902B;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f10341D);
            if (this.f10356S == null) {
                this.f10356S = new C0967j(this);
            }
            actionMenuItemView.setPopupCallback(this.f10356S);
            actionView = (View) interfaceC0902B;
        }
        actionView.setVisibility(qVar.f9783C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0981q)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // l.InterfaceC0901A
    public final void b(Context context, l.o oVar) {
        this.f10360x = context;
        LayoutInflater.from(context);
        this.f10361y = oVar;
        Resources resources = context.getResources();
        if (!this.f10347J) {
            this.f10346I = true;
        }
        int i6 = 2;
        this.f10348K = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600 || ((i7 > 960 && i8 > 720) || (i7 > 720 && i8 > 960))) {
            i6 = 5;
        } else if (i7 >= 500 || ((i7 > 640 && i8 > 480) || (i7 > 480 && i8 > 640))) {
            i6 = 4;
        } else if (i7 >= 360) {
            i6 = 3;
        }
        this.f10350M = i6;
        int measuredWidth = this.f10348K;
        if (this.f10346I) {
            if (this.f10343F == null) {
                C0973m c0973m = new C0973m(this, this.f10359w);
                this.f10343F = c0973m;
                if (this.f10345H) {
                    c0973m.setImageDrawable(this.f10344G);
                    this.f10344G = null;
                    this.f10345H = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10343F.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f10343F.getMeasuredWidth();
        } else {
            this.f10343F = null;
        }
        this.f10349L = measuredWidth;
        float f6 = resources.getDisplayMetrics().density;
    }

    @Override // l.InterfaceC0901A
    public final void c(l.o oVar, boolean z5) {
        f();
        C0965i c0965i = this.f10354Q;
        if (c0965i != null && c0965i.b()) {
            c0965i.f9831j.dismiss();
        }
        l.z zVar = this.f10338A;
        if (zVar != null) {
            zVar.c(oVar, z5);
        }
    }

    @Override // l.InterfaceC0901A
    public final int d() {
        return this.f10342E;
    }

    @Override // l.InterfaceC0901A
    public final boolean e() {
        int size;
        ArrayList arrayListL;
        int i6;
        boolean z5;
        l.o oVar = this.f10361y;
        if (oVar != null) {
            arrayListL = oVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i7 = this.f10350M;
        int i8 = this.f10349L;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f10341D;
        int i9 = 0;
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i6 = 2;
            z5 = true;
            if (i9 >= size) {
                break;
            }
            l.q qVar = (l.q) arrayListL.get(i9);
            int i12 = qVar.f9808y;
            if ((i12 & 2) == 2) {
                i10++;
            } else if ((i12 & 1) == 1) {
                i11++;
            } else {
                z6 = true;
            }
            if (this.f10351N && qVar.f9783C) {
                i7 = 0;
            }
            i9++;
        }
        if (this.f10346I && (z6 || i11 + i10 > i7)) {
            i7--;
        }
        int i13 = i7 - i10;
        SparseBooleanArray sparseBooleanArray = this.f10352O;
        sparseBooleanArray.clear();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            l.q qVar2 = (l.q) arrayListL.get(i14);
            int i16 = qVar2.f9808y;
            boolean z7 = (i16 & 2) == i6 ? z5 : false;
            int i17 = qVar2.f9785b;
            if (z7) {
                View viewA = a(qVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                if (i17 != 0) {
                    sparseBooleanArray.put(i17, z5);
                }
                qVar2.h(z5);
            } else if ((i16 & 1) == z5) {
                boolean z8 = sparseBooleanArray.get(i17);
                boolean z9 = ((i13 > 0 || z8) && i8 > 0) ? z5 : false;
                if (z9) {
                    View viewA2 = a(qVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z9 &= i8 + i15 > 0;
                }
                if (z9 && i17 != 0) {
                    sparseBooleanArray.put(i17, true);
                } else if (z8) {
                    sparseBooleanArray.put(i17, false);
                    for (int i18 = 0; i18 < i14; i18++) {
                        l.q qVar3 = (l.q) arrayListL.get(i18);
                        if (qVar3.f9785b == i17) {
                            if (qVar3.f()) {
                                i13++;
                            }
                            qVar3.h(false);
                        }
                    }
                }
                if (z9) {
                    i13--;
                }
                qVar2.h(z9);
            } else {
                qVar2.h(false);
                i14++;
                i6 = 2;
                z5 = true;
            }
            i14++;
            i6 = 2;
            z5 = true;
        }
        return z5;
    }

    public final boolean f() {
        Object obj;
        RunnableC0969k runnableC0969k = this.f10355R;
        if (runnableC0969k != null && (obj = this.f10341D) != null) {
            ((View) obj).removeCallbacks(runnableC0969k);
            this.f10355R = null;
            return true;
        }
        C0965i c0965i = this.f10353P;
        if (c0965i == null) {
            return false;
        }
        if (c0965i.b()) {
            c0965i.f9831j.dismiss();
        }
        return true;
    }

    @Override // l.InterfaceC0901A
    public final Parcelable g() {
        C0975n c0975n = new C0975n();
        c0975n.f10334w = this.f10358U;
        return c0975n;
    }

    @Override // l.InterfaceC0901A
    public final void h(Parcelable parcelable) {
        int i6;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C0975n) && (i6 = ((C0975n) parcelable).f10334w) > 0 && (menuItemFindItem = this.f10361y.findItem(i6)) != null) {
            i((SubMenuC0907G) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC0901A
    public final boolean i(SubMenuC0907G subMenuC0907G) {
        boolean z5;
        if (!subMenuC0907G.hasVisibleItems()) {
            return false;
        }
        SubMenuC0907G subMenuC0907G2 = subMenuC0907G;
        while (true) {
            l.o oVar = subMenuC0907G2.f9680z;
            if (oVar == this.f10361y) {
                break;
            }
            subMenuC0907G2 = (SubMenuC0907G) oVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f10341D;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i6);
                if ((childAt instanceof InterfaceC0902B) && ((InterfaceC0902B) childAt).getItemData() == subMenuC0907G2.f9679A) {
                    view = childAt;
                    break;
                }
                i6++;
            }
        }
        if (view == null) {
            return false;
        }
        this.f10358U = subMenuC0907G.f9679A.f9784a;
        int size = subMenuC0907G.f9759f.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z5 = false;
                break;
            }
            MenuItem item = subMenuC0907G.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                z5 = true;
                break;
            }
            i7++;
        }
        C0965i c0965i = new C0965i(this, this.f10360x, subMenuC0907G, view);
        this.f10354Q = c0965i;
        c0965i.f9829h = z5;
        l.w wVar = c0965i.f9831j;
        if (wVar != null) {
            wVar.r(z5);
        }
        C0965i c0965i2 = this.f10354Q;
        if (!c0965i2.b()) {
            if (c0965i2.f9827f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0965i2.d(0, 0, false, false);
        }
        l.z zVar = this.f10338A;
        if (zVar != null) {
            zVar.f(subMenuC0907G);
        }
        return true;
    }

    @Override // l.InterfaceC0901A
    public final void j(l.z zVar) {
        this.f10338A = zVar;
    }

    public final boolean k() {
        C0965i c0965i = this.f10353P;
        return c0965i != null && c0965i.b();
    }

    @Override // l.InterfaceC0901A
    public final /* bridge */ /* synthetic */ boolean l(l.q qVar) {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final /* bridge */ /* synthetic */ boolean m(l.q qVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC0901A
    public final void n(boolean z5) {
        int size;
        int i6;
        ViewGroup viewGroup = (ViewGroup) this.f10341D;
        ArrayList arrayList = null;
        if (viewGroup != null) {
            l.o oVar = this.f10361y;
            if (oVar != null) {
                oVar.i();
                ArrayList arrayListL = this.f10361y.l();
                int size2 = arrayListL.size();
                i6 = 0;
                for (int i7 = 0; i7 < size2; i7++) {
                    l.q qVar = (l.q) arrayListL.get(i7);
                    if (qVar.f()) {
                        View childAt = viewGroup.getChildAt(i6);
                        l.q itemData = childAt instanceof InterfaceC0902B ? ((InterfaceC0902B) childAt).getItemData() : null;
                        View viewA = a(qVar, childAt, viewGroup);
                        if (qVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f10341D).addView(viewA, i6);
                        }
                        i6++;
                    }
                }
            } else {
                i6 = 0;
            }
            while (i6 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i6) == this.f10343F) {
                    i6++;
                } else {
                    viewGroup.removeViewAt(i6);
                }
            }
        }
        ((View) this.f10341D).requestLayout();
        l.o oVar2 = this.f10361y;
        if (oVar2 != null) {
            oVar2.i();
            ArrayList arrayList2 = oVar2.f9762i;
            int size3 = arrayList2.size();
            for (int i8 = 0; i8 < size3; i8++) {
                l.r rVar = ((l.q) arrayList2.get(i8)).f9781A;
            }
        }
        l.o oVar3 = this.f10361y;
        if (oVar3 != null) {
            oVar3.i();
            arrayList = oVar3.f9763j;
        }
        if (!this.f10346I || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((l.q) arrayList.get(0)).f9783C))) {
            C0973m c0973m = this.f10343F;
            if (c0973m != null) {
                Object parent = c0973m.getParent();
                Object obj = this.f10341D;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f10343F);
                }
            }
        } else {
            if (this.f10343F == null) {
                this.f10343F = new C0973m(this, this.f10359w);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f10343F.getParent();
            if (viewGroup3 != this.f10341D) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f10343F);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f10341D;
                C0973m c0973m2 = this.f10343F;
                actionMenuView.getClass();
                C0981q c0981qJ = ActionMenuView.j();
                c0981qJ.f10366a = true;
                actionMenuView.addView(c0973m2, c0981qJ);
            }
        }
        ((ActionMenuView) this.f10341D).setOverflowReserved(this.f10346I);
    }

    public final boolean o() {
        l.o oVar;
        int i6 = 0;
        if (this.f10346I && !k() && (oVar = this.f10361y) != null && this.f10341D != null && this.f10355R == null) {
            oVar.i();
            if (!oVar.f9763j.isEmpty()) {
                RunnableC0969k runnableC0969k = new RunnableC0969k(this, i6, new C0965i(this, this.f10360x, this.f10361y, this.f10343F));
                this.f10355R = runnableC0969k;
                ((View) this.f10341D).post(runnableC0969k);
                return true;
            }
        }
        return false;
    }
}
