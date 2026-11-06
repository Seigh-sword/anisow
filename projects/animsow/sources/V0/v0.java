package v0;

import N.C0083b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import g.C0712a;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends C0083b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f13270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f13271e = new WeakHashMap();

    public v0(w0 w0Var) {
        this.f13270d = w0Var;
    }

    @Override // N.C0083b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0083b c0083b = (C0083b) this.f13271e.get(view);
        return c0083b != null ? c0083b.a(view, accessibilityEvent) : this.f1973a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // N.C0083b
    public final C0712a b(View view) {
        C0083b c0083b = (C0083b) this.f13271e.get(view);
        return c0083b != null ? c0083b.b(view) : super.b(view);
    }

    @Override // N.C0083b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0083b c0083b = (C0083b) this.f13271e.get(view);
        if (c0083b != null) {
            c0083b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // N.C0083b
    public final void d(View view, O.i iVar) {
        w0 w0Var = this.f13270d;
        boolean zK = w0Var.f13276d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f1973a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        if (!zK) {
            RecyclerView recyclerView = w0Var.f13276d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().V(view, iVar);
                C0083b c0083b = (C0083b) this.f13271e.get(view);
                if (c0083b != null) {
                    c0083b.d(view, iVar);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // N.C0083b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0083b c0083b = (C0083b) this.f13271e.get(view);
        if (c0083b != null) {
            c0083b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // N.C0083b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0083b c0083b = (C0083b) this.f13271e.get(viewGroup);
        return c0083b != null ? c0083b.f(viewGroup, view, accessibilityEvent) : this.f1973a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // N.C0083b
    public final boolean g(View view, int i6, Bundle bundle) {
        w0 w0Var = this.f13270d;
        if (!w0Var.f13276d.K()) {
            RecyclerView recyclerView = w0Var.f13276d;
            if (recyclerView.getLayoutManager() != null) {
                C0083b c0083b = (C0083b) this.f13271e.get(view);
                if (c0083b != null) {
                    if (c0083b.g(view, i6, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i6, bundle)) {
                    return true;
                }
                m0 m0Var = recyclerView.getLayoutManager().f13110b.f5755x;
                return false;
            }
        }
        return super.g(view, i6, bundle);
    }

    @Override // N.C0083b
    public final void h(View view, int i6) {
        C0083b c0083b = (C0083b) this.f13271e.get(view);
        if (c0083b != null) {
            c0083b.h(view, i6);
        } else {
            super.h(view, i6);
        }
    }

    @Override // N.C0083b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0083b c0083b = (C0083b) this.f13271e.get(view);
        if (c0083b != null) {
            c0083b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
