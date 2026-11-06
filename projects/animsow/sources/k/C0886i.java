package k;

import N.AbstractC0103n;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import d.AbstractC0628i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.q;
import l.r;
import l.v;

/* JADX INFO: renamed from: k.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0886i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f9585A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f9586B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C0887j f9589E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f9590a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f9600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f9601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f9603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f9605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f9613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f9614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r f9615z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f9587C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f9588D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9591b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9592c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9593d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9594e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9595f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9596g = true;

    public C0886i(C0887j c0887j, Menu menu) {
        this.f9589E = c0887j;
        this.f9590a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f9589E.f9620c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e6) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z5 = false;
        menuItem.setChecked(this.f9608s).setVisible(this.f9609t).setEnabled(this.f9610u).setCheckable(this.f9607r >= 1).setTitleCondensed(this.f9601l).setIcon(this.f9602m);
        int i6 = this.f9611v;
        if (i6 >= 0) {
            menuItem.setShowAsAction(i6);
        }
        String str = this.f9614y;
        C0887j c0887j = this.f9589E;
        if (str != null) {
            if (c0887j.f9620c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0887j.f9621d == null) {
                c0887j.f9621d = C0887j.a(c0887j.f9620c);
            }
            Object obj = c0887j.f9621d;
            String str2 = this.f9614y;
            MenuItemOnMenuItemClickListenerC0885h menuItemOnMenuItemClickListenerC0885h = new MenuItemOnMenuItemClickListenerC0885h();
            menuItemOnMenuItemClickListenerC0885h.f9583a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0885h.f9584b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0885h.f9582c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0885h);
            } catch (Exception e6) {
                StringBuilder sbN = AbstractC0628i.n("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbN.append(cls.getName());
                InflateException inflateException = new InflateException(sbN.toString());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }
        if (this.f9607r >= 2) {
            if (menuItem instanceof q) {
                ((q) menuItem).g(true);
            } else if (menuItem instanceof v) {
                v vVar = (v) menuItem;
                try {
                    Method method = vVar.f9819e;
                    I.b bVar = vVar.f9818d;
                    if (method == null) {
                        vVar.f9819e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    vVar.f9819e.invoke(bVar, Boolean.TRUE);
                } catch (Exception e7) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
                }
            }
        }
        String str3 = this.f9613x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0887j.f9616e, c0887j.f9618a));
            z5 = true;
        }
        int i7 = this.f9612w;
        if (i7 > 0) {
            if (z5) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i7);
            }
        }
        r rVar = this.f9615z;
        if (rVar != null) {
            if (menuItem instanceof I.b) {
                ((I.b) menuItem).b(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f9585A;
        boolean z6 = menuItem instanceof I.b;
        if (z6) {
            ((I.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0103n.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f9586B;
        if (z6) {
            ((I.b) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0103n.m(menuItem, charSequence2);
        }
        char c6 = this.f9603n;
        int i8 = this.f9604o;
        if (z6) {
            ((I.b) menuItem).setAlphabeticShortcut(c6, i8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0103n.g(menuItem, c6, i8);
        }
        char c7 = this.f9605p;
        int i9 = this.f9606q;
        if (z6) {
            ((I.b) menuItem).setNumericShortcut(c7, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0103n.k(menuItem, c7, i9);
        }
        PorterDuff.Mode mode = this.f9588D;
        if (mode != null) {
            if (z6) {
                ((I.b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0103n.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f9587C;
        if (colorStateList != null) {
            if (z6) {
                ((I.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0103n.i(menuItem, colorStateList);
            }
        }
    }
}
