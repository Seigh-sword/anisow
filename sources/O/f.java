package O;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static h a(boolean z5, int i6, int i7, int i8, int i9, boolean z6, String str, String str2) {
        return new h(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z5).setColumnIndex(i6).setRowIndex(i7).setColumnSpan(i8).setRowSpan(i9).setSelected(z6).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static i b(AccessibilityNodeInfo accessibilityNodeInfo, int i6, int i7) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i6, i7);
        if (child != null) {
            return new i(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static i f(AccessibilityNodeInfo accessibilityNodeInfo, int i6) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i6);
        if (parent != null) {
            return new i(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z5) {
        accessibilityNodeInfo.setTextSelectable(z5);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
