package l;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class t implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f9814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9815b;

    public t(v vVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9815b = vVar;
        this.f9814a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f9814a.onMenuItemActionCollapse(this.f9815b.m(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f9814a.onMenuItemActionExpand(this.f9815b.m(menuItem));
    }
}
