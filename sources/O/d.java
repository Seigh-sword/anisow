package O;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f2289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f2290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f2291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f2292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f2293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f2294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f2295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f2296l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f2299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f2300d;

    static {
        new d(1);
        new d(2);
        new d(4);
        new d(8);
        f2289e = new d(16);
        new d(32);
        new d(64);
        new d(128);
        new d(256, l.class);
        new d(512, l.class);
        new d(1024, m.class);
        new d(2048, m.class);
        f2290f = new d(4096);
        f2291g = new d(8192);
        new d(16384);
        new d(32768);
        new d(65536);
        new d(131072, q.class);
        f2292h = new d(262144);
        f2293i = new d(524288);
        f2294j = new d(1048576);
        new d(2097152, r.class);
        int i6 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, o.class);
        f2295k = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2296l = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new d(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new d(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new d(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new d(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, p.class);
        new d(i6 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, n.class);
        new d(i6 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new d(i6 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new d(i6 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new d(i6 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new d(i6 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new d(i6 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new d(i6 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new d(i6 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new d(i6 >= 34 ? g.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public d(int i6) {
        this(null, i6, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2297a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f2297a;
        Object obj3 = this.f2297a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2297a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = i.d(this.f2298b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2297a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public d(int i6, Class cls) {
        this(null, i6, null, null, cls);
    }

    public d(Object obj, int i6, String str, s sVar, Class cls) {
        this.f2298b = i6;
        this.f2300d = sVar;
        this.f2297a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i6, str) : obj;
        this.f2299c = cls;
    }
}
