package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d2.AbstractC0651b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q implements I.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public r f9781A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f9782B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f9788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f9789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f9790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f9791h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f9793j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f9795l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f9797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SubMenuC0907G f9798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f9799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f9800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f9801r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f9809z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9792i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9794k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9796m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f9802s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f9803t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9804u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9805v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9806w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9807x = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9783C = false;

    public q(o oVar, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10) {
        this.f9797n = oVar;
        this.f9784a = i7;
        this.f9785b = i6;
        this.f9786c = i8;
        this.f9787d = i9;
        this.f9788e = charSequence;
        this.f9808y = i10;
    }

    public static void c(int i6, int i7, String str, StringBuilder sb) {
        if ((i6 & i7) == i7) {
            sb.append(str);
        }
    }

    @Override // I.b
    public final r a() {
        return this.f9781A;
    }

    @Override // I.b
    public final I.b b(r rVar) {
        r rVar2 = this.f9781A;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f9809z = null;
        this.f9781A = rVar;
        this.f9797n.p(true);
        r rVar3 = this.f9781A;
        if (rVar3 != null) {
            rVar3.f9810a = new S0.f(2, this);
            rVar3.f9811b.setVisibilityListener(rVar3);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f9808y & 8) == 0) {
            return false;
        }
        if (this.f9809z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9782B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9797n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f9806w && (this.f9804u || this.f9805v)) {
            drawable = drawable.mutate();
            if (this.f9804u) {
                H.a.h(drawable, this.f9802s);
            }
            if (this.f9805v) {
                H.a.i(drawable, this.f9803t);
            }
            this.f9806w = false;
        }
        return drawable;
    }

    public final boolean e() {
        r rVar;
        if ((this.f9808y & 8) == 0) {
            return false;
        }
        if (this.f9809z == null && (rVar = this.f9781A) != null) {
            this.f9809z = rVar.f9811b.onCreateActionView(this);
        }
        return this.f9809z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9782B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f9797n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f9807x & 32) == 32;
    }

    public final void g(boolean z5) {
        this.f9807x = (z5 ? 4 : 0) | (this.f9807x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f9809z;
        if (view != null) {
            return view;
        }
        r rVar = this.f9781A;
        if (rVar == null) {
            return null;
        }
        View viewOnCreateActionView = rVar.f9811b.onCreateActionView(this);
        this.f9809z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // I.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9794k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9793j;
    }

    @Override // I.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9800q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f9785b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f9795l;
        if (drawable != null) {
            return d(drawable);
        }
        int i6 = this.f9796m;
        if (i6 == 0) {
            return null;
        }
        Drawable drawableP = AbstractC0651b.p(this.f9797n.f9754a, i6);
        this.f9796m = 0;
        this.f9795l = drawableP;
        return d(drawableP);
    }

    @Override // I.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9802s;
    }

    @Override // I.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9803t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9790g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f9784a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9792i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9791h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f9786c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f9798o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9788e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9789f;
        return charSequence != null ? charSequence : this.f9788e;
    }

    @Override // I.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9801r;
    }

    public final void h(boolean z5) {
        this.f9807x = z5 ? this.f9807x | 32 : this.f9807x & (-33);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f9798o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f9783C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9807x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9807x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9807x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        r rVar = this.f9781A;
        return (rVar == null || !rVar.f9811b.overridesItemVisibility()) ? (this.f9807x & 8) == 0 : (this.f9807x & 8) == 0 && this.f9781A.f9811b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        int i7;
        Context context = this.f9797n.f9754a;
        View viewInflate = LayoutInflater.from(context).inflate(i6, (ViewGroup) new LinearLayout(context), false);
        this.f9809z = viewInflate;
        this.f9781A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i7 = this.f9784a) > 0) {
            viewInflate.setId(i7);
        }
        o oVar = this.f9797n;
        oVar.f9764k = true;
        oVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.f9793j == c6) {
            return this;
        }
        this.f9793j = Character.toLowerCase(c6);
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        int i6 = this.f9807x;
        int i7 = (z5 ? 1 : 0) | (i6 & (-2));
        this.f9807x = i7;
        if (i6 != i7) {
            this.f9797n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        int i6 = this.f9807x;
        if ((i6 & 4) != 0) {
            o oVar = this.f9797n;
            oVar.getClass();
            ArrayList arrayList = oVar.f9759f;
            int size = arrayList.size();
            oVar.w();
            for (int i7 = 0; i7 < size; i7++) {
                q qVar = (q) arrayList.get(i7);
                if (qVar.f9785b == this.f9785b && (qVar.f9807x & 4) != 0 && qVar.isCheckable()) {
                    boolean z6 = qVar == this;
                    int i8 = qVar.f9807x;
                    int i9 = (z6 ? 2 : 0) | (i8 & (-3));
                    qVar.f9807x = i9;
                    if (i8 != i9) {
                        qVar.f9797n.p(false);
                    }
                }
            }
            oVar.v();
        } else {
            int i10 = (i6 & (-3)) | (z5 ? 2 : 0);
            this.f9807x = i10;
            if (i6 != i10) {
                this.f9797n.p(false);
            }
        }
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final I.b setContentDescription(CharSequence charSequence) {
        this.f9800q = charSequence;
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        this.f9807x = z5 ? this.f9807x | 16 : this.f9807x & (-17);
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        this.f9795l = null;
        this.f9796m = i6;
        this.f9806w = true;
        this.f9797n.p(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9802s = colorStateList;
        this.f9804u = true;
        this.f9806w = true;
        this.f9797n.p(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9803t = mode;
        this.f9805v = true;
        this.f9806w = true;
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9790g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        if (this.f9791h == c6) {
            return this;
        }
        this.f9791h = c6;
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9782B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9799p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7) {
        this.f9791h = c6;
        this.f9793j = Character.toLowerCase(c7);
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i6) {
        int i7 = i6 & 3;
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9808y = i6;
        o oVar = this.f9797n;
        oVar.f9764k = true;
        oVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        setTitle(this.f9797n.f9754a.getString(i6));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9789f = charSequence;
        this.f9797n.p(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final I.b setTooltipText(CharSequence charSequence) {
        this.f9801r = charSequence;
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        int i6 = this.f9807x;
        int i7 = (z5 ? 0 : 8) | (i6 & (-9));
        this.f9807x = i7;
        if (i6 != i7) {
            o oVar = this.f9797n;
            oVar.f9761h = true;
            oVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f9788e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i6) {
        if (this.f9793j == c6 && this.f9794k == i6) {
            return this;
        }
        this.f9793j = Character.toLowerCase(c6);
        this.f9794k = KeyEvent.normalizeMetaState(i6);
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9796m = 0;
        this.f9795l = drawable;
        this.f9806w = true;
        this.f9797n.p(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i6) {
        if (this.f9791h == c6 && this.f9792i == i6) {
            return this;
        }
        this.f9791h = c6;
        this.f9792i = KeyEvent.normalizeMetaState(i6);
        this.f9797n.p(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f9791h = c6;
        this.f9792i = KeyEvent.normalizeMetaState(i6);
        this.f9793j = Character.toLowerCase(c7);
        this.f9794k = KeyEvent.normalizeMetaState(i7);
        this.f9797n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9788e = charSequence;
        this.f9797n.p(false);
        SubMenuC0907G subMenuC0907G = this.f9798o;
        if (subMenuC0907G != null) {
            subMenuC0907G.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i6;
        this.f9809z = view;
        this.f9781A = null;
        if (view != null && view.getId() == -1 && (i6 = this.f9784a) > 0) {
            view.setId(i6);
        }
        o oVar = this.f9797n;
        oVar.f9764k = true;
        oVar.p(true);
        return this;
    }
}
