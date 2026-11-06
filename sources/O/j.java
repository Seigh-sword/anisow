package O;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import g.C0712a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0712a f2306a;

    public j(C0712a c0712a) {
        this.f2306a = c0712a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i6) {
        i iVarA = this.f2306a.a(i6);
        if (iVarA == null) {
            return null;
        }
        return iVarA.f2303a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i6) {
        this.f2306a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i6) {
        i iVarB = this.f2306a.b(i6);
        if (iVarB == null) {
            return null;
        }
        return iVarB.f2303a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i6, int i7, Bundle bundle) {
        return this.f2306a.c(i6, i7, bundle);
    }
}
