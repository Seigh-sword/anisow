package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.AbstractC0628i;

/* JADX INFO: renamed from: l.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0907G extends o implements SubMenu {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final q f9679A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o f9680z;

    public SubMenuC0907G(Context context, o oVar, q qVar) {
        super(context);
        this.f9680z = oVar;
        this.f9679A = qVar;
    }

    @Override // l.o
    public final boolean d(q qVar) {
        return this.f9680z.d(qVar);
    }

    @Override // l.o
    public final boolean e(o oVar, MenuItem menuItem) {
        return super.e(oVar, menuItem) || this.f9680z.e(oVar, menuItem);
    }

    @Override // l.o
    public final boolean f(q qVar) {
        return this.f9680z.f(qVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f9679A;
    }

    @Override // l.o
    public final String j() {
        q qVar = this.f9679A;
        int i6 = qVar != null ? qVar.f9784a : 0;
        if (i6 == 0) {
            return null;
        }
        return AbstractC0628i.f("android:menu:actionviewstates:", i6);
    }

    @Override // l.o
    public final o k() {
        return this.f9680z.k();
    }

    @Override // l.o
    public final boolean m() {
        return this.f9680z.m();
    }

    @Override // l.o
    public final boolean n() {
        return this.f9680z.n();
    }

    @Override // l.o
    public final boolean o() {
        return this.f9680z.o();
    }

    @Override // l.o, android.view.Menu
    public final void setGroupDividerEnabled(boolean z5) {
        this.f9680z.setGroupDividerEnabled(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i6) {
        u(0, null, i6, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i6) {
        u(i6, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i6) {
        this.f9679A.setIcon(i6);
        return this;
    }

    @Override // l.o, android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f9680z.setQwertyMode(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f9679A.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }
}
