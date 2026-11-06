package V;

import N.C0083b;
import N.V;
import O.i;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import g.C0712a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends C0083b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f3640n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final P2.e f3641o = new P2.e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final B3.e f3642p = new B3.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f3647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f3648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f3649j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3643d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f3644e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f3645f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f3646g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3650k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3651l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3652m = Integer.MIN_VALUE;

    public b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f3648i = view;
        this.f3647h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = V.f1964a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // N.C0083b
    public final C0712a b(View view) {
        if (this.f3649j == null) {
            this.f3649j = new a(this);
        }
        return this.f3649j;
    }

    @Override // N.C0083b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // N.C0083b
    public final void d(View view, i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1973a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((D2.d) this).f295q;
        accessibilityNodeInfo.setCheckable(chip.d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        iVar.j(chip.getText());
    }

    public final boolean j(int i6) {
        if (this.f3651l != i6) {
            return false;
        }
        this.f3651l = Integer.MIN_VALUE;
        D2.d dVar = (D2.d) this;
        if (i6 == 1) {
            Chip chip = dVar.f295q;
            chip.f7157I = false;
            chip.refreshDrawableState();
        }
        q(i6, 8);
        return true;
    }

    public final i k(int i6) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        i iVar = new i(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f3640n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        iVar.f2304b = -1;
        View view = this.f3648i;
        accessibilityNodeInfoObtain.setParent(view);
        o(i6, iVar);
        if (iVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3644e;
        iVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        iVar.f2305c = i6;
        accessibilityNodeInfoObtain.setSource(view, i6);
        if (this.f3650k == i6) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            iVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            iVar.a(64);
        }
        boolean z5 = this.f3651l == i6;
        if (z5) {
            iVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            iVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z5);
        int[] iArr = this.f3646g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f3643d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            iVar.f(rect3);
            if (iVar.f2304b != -1) {
                i iVar2 = new i(AccessibilityNodeInfo.obtain());
                for (int i7 = iVar.f2304b; i7 != -1; i7 = iVar2.f2304b) {
                    iVar2.f2304b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = iVar2.f2303a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i7, iVar2);
                    iVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f3645f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                iVar.f2303a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return iVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V.b.m(int, android.graphics.Rect):boolean");
    }

    public final i n(int i6) {
        if (i6 != -1) {
            return k(i6);
        }
        View view = this.f3648i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        i iVar = new i(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = V.f1964a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            iVar.f2303a.addChild(view, ((Integer) arrayList.get(i7)).intValue());
        }
        return iVar;
    }

    public abstract void o(int i6, i iVar);

    public final boolean p(int i6) {
        int i7;
        View view = this.f3648i;
        if ((!view.isFocused() && !view.requestFocus()) || (i7 = this.f3651l) == i6) {
            return false;
        }
        if (i7 != Integer.MIN_VALUE) {
            j(i7);
        }
        if (i6 == Integer.MIN_VALUE) {
            return false;
        }
        this.f3651l = i6;
        D2.d dVar = (D2.d) this;
        if (i6 == 1) {
            Chip chip = dVar.f295q;
            chip.f7157I = true;
            chip.refreshDrawableState();
        }
        q(i6, 8);
        return true;
    }

    public final void q(int i6, int i7) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i6 == Integer.MIN_VALUE || !this.f3647h.isEnabled() || (parent = (view = this.f3648i).getParent()) == null) {
            return;
        }
        if (i6 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i7);
            i iVarN = n(i6);
            accessibilityEventObtain.getText().add(iVarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = iVarN.f2303a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i6);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i7);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
