package l;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class u implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f9816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9817b;

    public u(v vVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9817b = vVar;
        this.f9816a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f9816a.onMenuItemClick(this.f9817b.m(menuItem));
    }
}
