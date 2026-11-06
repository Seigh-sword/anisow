package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: l.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0904D extends AbstractC0911d implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I.a f9658d;

    public MenuC0904D(Context context, I.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f9658d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return m(((o) this.f9658d).add(i6));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = ((o) this.f9658d).addIntentOptions(i6, i7, i8, componentName, intentArr, intent, i9, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                menuItemArr[i10] = m(menuItemArr2[i10]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return ((o) this.f9658d).addSubMenu(i6);
    }

    @Override // android.view.Menu
    public final void clear() {
        s.k kVar = (s.k) this.f9699b;
        if (kVar != null) {
            kVar.clear();
        }
        s.k kVar2 = (s.k) this.f9700c;
        if (kVar2 != null) {
            kVar2.clear();
        }
        ((o) this.f9658d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f9658d).close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        return m(((o) this.f9658d).findItem(i6));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return m(((o) this.f9658d).getItem(i6));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f9658d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return ((o) this.f9658d).isShortcutKey(i6, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i7) {
        return ((o) this.f9658d).performIdentifierAction(i6, i7);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        return ((o) this.f9658d).performShortcut(i6, keyEvent, i7);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        if (((s.k) this.f9699b) != null) {
            int i7 = 0;
            while (true) {
                s.k kVar = (s.k) this.f9699b;
                if (i7 >= kVar.f12534y) {
                    break;
                }
                if (((I.b) kVar.h(i7)).getGroupId() == i6) {
                    ((s.k) this.f9699b).j(i7);
                    i7--;
                }
                i7++;
            }
        }
        ((o) this.f9658d).removeGroup(i6);
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        if (((s.k) this.f9699b) != null) {
            int i7 = 0;
            while (true) {
                s.k kVar = (s.k) this.f9699b;
                if (i7 >= kVar.f12534y) {
                    break;
                }
                if (((I.b) kVar.h(i7)).getItemId() == i6) {
                    ((s.k) this.f9699b).j(i7);
                    break;
                }
                i7++;
            }
        }
        ((o) this.f9658d).removeItem(i6);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z5, boolean z6) {
        ((o) this.f9658d).setGroupCheckable(i6, z5, z6);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z5) {
        ((o) this.f9658d).setGroupEnabled(i6, z5);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z5) {
        ((o) this.f9658d).setGroupVisible(i6, z5);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f9658d.setQwertyMode(z5);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f9658d).size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, int i9) {
        return m(((o) this.f9658d).add(i6, i7, i8, i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return ((o) this.f9658d).addSubMenu(i6, i7, i8, i9);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return m(((o) this.f9658d).add(i6, i7, i8, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        return this.f9658d.addSubMenu(i6, i7, i8, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m(((o) this.f9658d).add(charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f9658d).addSubMenu(charSequence);
    }
}
