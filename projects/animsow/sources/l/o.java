package l;

import N.X;
import N.Z;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class o implements I.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f9753y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f9755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f9758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f9762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f9763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9764k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f9766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f9767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f9768o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f9775v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9777x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9765l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9769p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9770q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9771r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9772s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f9773t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f9774u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9776w = false;

    public o(Context context) {
        Resources resources;
        int identifier;
        boolean z5 = false;
        this.f9754a = context;
        Resources resources2 = context.getResources();
        this.f9755b = resources2;
        this.f9759f = new ArrayList();
        this.f9760g = new ArrayList();
        this.f9761h = true;
        this.f9762i = new ArrayList();
        this.f9763j = new ArrayList();
        this.f9764k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = Z.f1970a;
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : X.b(viewConfiguration)) {
                z5 = true;
            }
        }
        this.f9757d = z5;
    }

    public q a(int i6, int i7, int i8, CharSequence charSequence) {
        int i9;
        int i10 = ((-65536) & i8) >> 16;
        if (i10 < 0 || i10 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i11 = (f9753y[i10] << 16) | (65535 & i8);
        q qVar = new q(this, i6, i7, i8, i11, charSequence, this.f9765l);
        ArrayList arrayList = this.f9759f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i9 = 0;
                break;
            }
            if (((q) arrayList.get(size)).f9787d <= i11) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i9, qVar);
        p(true);
        return qVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return a(0, 0, 0, this.f9755b.getString(i6));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        int i10;
        PackageManager packageManager = this.f9754a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i9 & 1) == 0) {
            removeGroup(i6);
        }
        for (int i11 = 0; i11 < size; i11++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i11);
            int i12 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i12 < 0 ? intent : intentArr[i12]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q qVarA = a(i6, i7, i8, resolveInfo.loadLabel(packageManager));
            qVarA.setIcon(resolveInfo.loadIcon(packageManager));
            qVarA.f9790g = intent2;
            if (menuItemArr != null && (i10 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i10] = qVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return addSubMenu(0, 0, 0, this.f9755b.getString(i6));
    }

    public final void b(InterfaceC0901A interfaceC0901A, Context context) {
        this.f9774u.add(new WeakReference(interfaceC0901A));
        interfaceC0901A.b(context, this);
        this.f9764k = true;
    }

    public final void c(boolean z5) {
        if (this.f9772s) {
            return;
        }
        this.f9772s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9774u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0901A interfaceC0901A = (InterfaceC0901A) weakReference.get();
            if (interfaceC0901A == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0901A.c(this, z5);
            }
        }
        this.f9772s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f9775v;
        if (qVar != null) {
            d(qVar);
        }
        this.f9759f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f9767n = null;
        this.f9766m = null;
        this.f9768o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9774u;
        boolean zM = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f9775v == qVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0901A interfaceC0901A = (InterfaceC0901A) weakReference.get();
                if (interfaceC0901A != null) {
                    zM = interfaceC0901A.m(qVar);
                    if (zM) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zM) {
                this.f9775v = null;
            }
        }
        return zM;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f9758e;
        return mVar != null && mVar.i(oVar, menuItem);
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9774u;
        boolean zL = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0901A interfaceC0901A = (InterfaceC0901A) weakReference.get();
            if (interfaceC0901A != null) {
                zL = interfaceC0901A.l(qVar);
                if (zL) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zL) {
            this.f9775v = qVar;
        }
        return zL;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f9759f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = (q) arrayList.get(i7);
            if (qVar.f9784a == i6) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (menuItemFindItem = qVar.f9798o.findItem(i6)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final q g(int i6, KeyEvent keyEvent) {
        ArrayList arrayList = this.f9773t;
        arrayList.clear();
        h(arrayList, i6, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean zN = n();
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = (q) arrayList.get(i7);
            char c6 = zN ? qVar.f9793j : qVar.f9791h;
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (zN && c6 == '\b' && i6 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return (MenuItem) this.f9759f.get(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.ArrayList r17, int r18, android.view.KeyEvent r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r16.n()
            int r4 = r19.getModifiers()
            android.view.KeyCharacterMap$KeyData r5 = new android.view.KeyCharacterMap$KeyData
            r5.<init>()
            boolean r6 = r2.getKeyData(r5)
            r7 = 67
            if (r6 != 0) goto L1e
            if (r1 == r7) goto L1e
            return
        L1e:
            r6 = r16
            java.util.ArrayList r8 = r6.f9759f
            int r9 = r8.size()
            r10 = 0
            r11 = r10
        L28:
            if (r11 >= r9) goto L7a
            java.lang.Object r12 = r8.get(r11)
            l.q r12 = (l.q) r12
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L3b
            l.G r13 = r12.f9798o
            r13.h(r0, r1, r2)
        L3b:
            if (r3 == 0) goto L40
            char r13 = r12.f9793j
            goto L42
        L40:
            char r13 = r12.f9791h
        L42:
            if (r3 == 0) goto L47
            int r14 = r12.f9794k
            goto L49
        L47:
            int r14 = r12.f9792i
        L49:
            r15 = 69647(0x1100f, float:9.7596E-41)
            r7 = r4 & r15
            r14 = r14 & r15
            if (r7 != r14) goto L69
            if (r13 == 0) goto L69
            char[] r7 = r5.meta
            char r14 = r7[r10]
            if (r13 == r14) goto L6c
            r14 = 2
            char r7 = r7[r14]
            if (r13 == r7) goto L6c
            if (r3 == 0) goto L69
            r7 = 8
            if (r13 != r7) goto L69
            r7 = 67
            if (r1 != r7) goto L77
            goto L6e
        L69:
            r7 = 67
            goto L77
        L6c:
            r7 = 67
        L6e:
            boolean r13 = r12.isEnabled()
            if (r13 == 0) goto L77
            r0.add(r12)
        L77:
            int r11 = r11 + 1
            goto L28
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.o.h(java.util.ArrayList, int, android.view.KeyEvent):void");
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f9777x) {
            return true;
        }
        ArrayList arrayList = this.f9759f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((q) arrayList.get(i6)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f9764k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9774u;
            boolean zE = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC0901A interfaceC0901A = (InterfaceC0901A) weakReference.get();
                if (interfaceC0901A == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= interfaceC0901A.e();
                }
            }
            ArrayList arrayList = this.f9762i;
            ArrayList arrayList2 = this.f9763j;
            arrayList.clear();
            arrayList2.clear();
            if (zE) {
                int size = arrayListL.size();
                for (int i6 = 0; i6 < size; i6++) {
                    q qVar = (q) arrayListL.get(i6);
                    if (qVar.f()) {
                        arrayList.add(qVar);
                    } else {
                        arrayList2.add(qVar);
                    }
                }
            } else {
                arrayList2.addAll(l());
            }
            this.f9764k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return g(i6, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z5 = this.f9761h;
        ArrayList arrayList = this.f9760g;
        if (!z5) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f9759f;
        int size = arrayList2.size();
        for (int i6 = 0; i6 < size; i6++) {
            q qVar = (q) arrayList2.get(i6);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f9761h = false;
        this.f9764k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f9776w;
    }

    public boolean n() {
        return this.f9756c;
    }

    public boolean o() {
        return this.f9757d;
    }

    public final void p(boolean z5) {
        if (this.f9769p) {
            this.f9770q = true;
            if (z5) {
                this.f9771r = true;
                return;
            }
            return;
        }
        if (z5) {
            this.f9761h = true;
            this.f9764k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9774u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0901A interfaceC0901A = (InterfaceC0901A) weakReference.get();
            if (interfaceC0901A == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0901A.n(z5);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i7) {
        return q(findItem(i6), null, i7);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        q qVarG = g(i6, keyEvent);
        boolean zQ = qVarG != null ? q(qVarG, null, i7) : false;
        if ((i7 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f A[PHI: r1
      0x005f: PHI (r1v12 boolean) = (r1v10 boolean), (r1v9 boolean), (r1v13 boolean) binds: [B:68:0x00ce, B:43:0x006f, B:36:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, l.InterfaceC0901A r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.o.q(android.view.MenuItem, l.A, int):boolean");
    }

    public final void r(InterfaceC0901A interfaceC0901A) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9774u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC0901A interfaceC0901A2 = (InterfaceC0901A) weakReference.get();
            if (interfaceC0901A2 == null || interfaceC0901A2 == interfaceC0901A) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        ArrayList arrayList = this.f9759f;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((q) arrayList.get(i8)).f9785b == i6) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            int size2 = arrayList.size() - i8;
            while (true) {
                int i9 = i7 + 1;
                if (i7 >= size2 || ((q) arrayList.get(i8)).f9785b != i6) {
                    break;
                }
                if (i8 >= 0) {
                    ArrayList arrayList2 = this.f9759f;
                    if (i8 < arrayList2.size()) {
                        arrayList2.remove(i8);
                    }
                }
                i7 = i9;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        ArrayList arrayList = this.f9759f;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (((q) arrayList.get(i7)).f9784a == i6) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            ArrayList arrayList2 = this.f9759f;
            if (i7 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i7);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f9759f.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0907G) item.getSubMenu()).s(bundle);
            }
        }
        int i7 = bundle.getInt("android:menu:expandedactionview");
        if (i7 <= 0 || (menuItemFindItem = findItem(i7)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z5, boolean z6) {
        ArrayList arrayList = this.f9759f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = (q) arrayList.get(i7);
            if (qVar.f9785b == i6) {
                qVar.g(z6);
                qVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.f9776w = z5;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z5) {
        ArrayList arrayList = this.f9759f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = (q) arrayList.get(i7);
            if (qVar.f9785b == i6) {
                qVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z5) {
        ArrayList arrayList = this.f9759f;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = (q) arrayList.get(i7);
            if (qVar.f9785b == i6) {
                int i8 = qVar.f9807x;
                int i9 = (i8 & (-9)) | (z5 ? 0 : 8);
                qVar.f9807x = i9;
                if (i8 != i9) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f9756c = z5;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f9759f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f9759f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0907G) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i6, CharSequence charSequence, int i7, Drawable drawable, View view) {
        if (view != null) {
            this.f9768o = view;
            this.f9766m = null;
            this.f9767n = null;
        } else {
            if (i6 > 0) {
                this.f9766m = this.f9755b.getText(i6);
            } else if (charSequence != null) {
                this.f9766m = charSequence;
            }
            if (i7 > 0) {
                Object obj = E.f.f379a;
                this.f9767n = E.a.b(this.f9754a, i7);
            } else if (drawable != null) {
                this.f9767n = drawable;
            }
            this.f9768o = null;
        }
        p(false);
    }

    public final void v() {
        this.f9769p = false;
        if (this.f9770q) {
            this.f9770q = false;
            p(this.f9771r);
        }
    }

    public final void w() {
        if (this.f9769p) {
            return;
        }
        this.f9769p = true;
        this.f9770q = false;
        this.f9771r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, int i9) {
        return a(i6, i7, i8, this.f9755b.getString(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return addSubMenu(i6, i7, i8, this.f9755b.getString(i9));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return a(i6, i7, i8, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        q qVarA = a(i6, i7, i8, charSequence);
        SubMenuC0907G subMenuC0907G = new SubMenuC0907G(this.f9754a, this, qVarA);
        qVarA.f9798o = subMenuC0907G;
        subMenuC0907G.setHeaderTitle(qVarA.f9788e);
        return subMenuC0907G;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public o k() {
        return this;
    }
}
