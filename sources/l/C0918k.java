package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import i.C0805e;
import i.DialogInterfaceC0809i;

/* JADX INFO: renamed from: l.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0918k implements InterfaceC0901A, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public z f9741A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0917j f9742B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f9743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LayoutInflater f9744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f9745y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ExpandedMenuView f9746z;

    public C0918k(Context context) {
        this.f9743w = context;
        this.f9744x = LayoutInflater.from(context);
    }

    @Override // l.InterfaceC0901A
    public final void b(Context context, o oVar) {
        if (this.f9743w != null) {
            this.f9743w = context;
            if (this.f9744x == null) {
                this.f9744x = LayoutInflater.from(context);
            }
        }
        this.f9745y = oVar;
        C0917j c0917j = this.f9742B;
        if (c0917j != null) {
            c0917j.notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC0901A
    public final void c(o oVar, boolean z5) {
        z zVar = this.f9741A;
        if (zVar != null) {
            zVar.c(oVar, z5);
        }
    }

    @Override // l.InterfaceC0901A
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0901A
    public final boolean e() {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final Parcelable g() {
        if (this.f9746z == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f9746z;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // l.InterfaceC0901A
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f9746z.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // l.InterfaceC0901A
    public final boolean i(SubMenuC0907G subMenuC0907G) {
        if (!subMenuC0907G.hasVisibleItems()) {
            return false;
        }
        p pVar = new p();
        pVar.f9778w = subMenuC0907G;
        Context context = subMenuC0907G.f9754a;
        T1.j jVar = new T1.j(context);
        C0918k c0918k = new C0918k(((C0805e) jVar.f3425x).f9283a);
        pVar.f9780y = c0918k;
        c0918k.f9741A = pVar;
        subMenuC0907G.b(c0918k, context);
        C0918k c0918k2 = pVar.f9780y;
        if (c0918k2.f9742B == null) {
            c0918k2.f9742B = new C0917j(c0918k2);
        }
        C0917j c0917j = c0918k2.f9742B;
        Object obj = jVar.f3425x;
        C0805e c0805e = (C0805e) obj;
        c0805e.f9289g = c0917j;
        c0805e.f9290h = pVar;
        View view = subMenuC0907G.f9768o;
        if (view != null) {
            c0805e.f9287e = view;
        } else {
            c0805e.f9285c = subMenuC0907G.f9767n;
            ((C0805e) obj).f9286d = subMenuC0907G.f9766m;
        }
        ((C0805e) obj).f9288f = pVar;
        DialogInterfaceC0809i dialogInterfaceC0809iG = jVar.g();
        pVar.f9779x = dialogInterfaceC0809iG;
        dialogInterfaceC0809iG.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f9779x.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f9779x.show();
        z zVar = this.f9741A;
        if (zVar == null) {
            return true;
        }
        zVar.f(subMenuC0907G);
        return true;
    }

    @Override // l.InterfaceC0901A
    public final void j(z zVar) {
        this.f9741A = zVar;
    }

    @Override // l.InterfaceC0901A
    public final boolean l(q qVar) {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final boolean m(q qVar) {
        return false;
    }

    @Override // l.InterfaceC0901A
    public final void n(boolean z5) {
        C0917j c0917j = this.f9742B;
        if (c0917j != null) {
            c0917j.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
        this.f9745y.q(this.f9742B.getItem(i6), this, 0);
    }
}
