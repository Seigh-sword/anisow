package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0908a implements I.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f9681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f9682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f9683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f9684d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f9686f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f9688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f9689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f9690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f9691k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9685e = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9687g = 4096;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f9692l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f9693m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9694n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9695o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9696p = 16;

    public C0908a(Context context, CharSequence charSequence) {
        this.f9689i = context;
        this.f9681a = charSequence;
    }

    @Override // I.b
    public final r a() {
        return null;
    }

    @Override // I.b
    public final I.b b(r rVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f9688h;
        if (drawable != null) {
            if (this.f9694n || this.f9695o) {
                this.f9688h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f9688h = drawableMutate;
                if (this.f9694n) {
                    H.a.h(drawableMutate, this.f9692l);
                }
                if (this.f9695o) {
                    H.a.i(this.f9688h, this.f9693m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // I.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9687g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9686f;
    }

    @Override // I.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9690j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f9688h;
    }

    @Override // I.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9692l;
    }

    @Override // I.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9693m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9683c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9685e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9684d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9681a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9682b;
        return charSequence != null ? charSequence : this.f9681a;
    }

    @Override // I.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9691k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9696p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9696p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9696p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f9696p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f9686f = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        this.f9696p = (z5 ? 1 : 0) | (this.f9696p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        this.f9696p = (z5 ? 2 : 0) | (this.f9696p & (-3));
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final I.b setContentDescription(CharSequence charSequence) {
        this.f9690j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        this.f9696p = (z5 ? 16 : 0) | (this.f9696p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        Object obj = E.f.f379a;
        this.f9688h = E.a.b(this.f9689i, i6);
        c();
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9692l = colorStateList;
        this.f9694n = true;
        c();
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9693m = mode;
        this.f9695o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9683c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        this.f9684d = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7) {
        this.f9684d = c6;
        this.f9686f = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        this.f9681a = this.f9689i.getResources().getString(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9682b = charSequence;
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final I.b setTooltipText(CharSequence charSequence) {
        this.f9691k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        this.f9696p = (this.f9696p & 8) | (z5 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i6) {
        this.f9686f = Character.toLowerCase(c6);
        this.f9687g = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f9690j = charSequence;
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i6) {
        this.f9684d = c6;
        this.f9685e = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f9684d = c6;
        this.f9685e = KeyEvent.normalizeMetaState(i6);
        this.f9686f = Character.toLowerCase(c7);
        this.f9687g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9681a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f9691k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9688h = drawable;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i6) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        return this;
    }
}
