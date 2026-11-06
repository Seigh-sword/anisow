package v0;

import N.C0083b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends C0083b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f13276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f13277e;

    public w0(RecyclerView recyclerView) {
        this.f13276d = recyclerView;
        v0 v0Var = this.f13277e;
        this.f13277e = v0Var == null ? new v0(this) : v0Var;
    }

    @Override // N.C0083b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f13276d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // N.C0083b
    public final void d(View view, O.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1973a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f2303a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f13276d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC1397f0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f13110b;
        m0 m0Var = recyclerView2.f5755x;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f13110b.canScrollHorizontally(-1)) {
            iVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f13110b.canScrollVertically(1) || layoutManager.f13110b.canScrollHorizontally(1)) {
            iVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        r0 r0Var = recyclerView2.f5692B0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(m0Var, r0Var), layoutManager.x(m0Var, r0Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // N.C0083b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f13276d
            boolean r0 = r4.K()
            r1 = 0
            if (r0 != 0) goto L8d
            v0.f0 r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8d
            v0.f0 r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f13110b
            v0.m0 r2 = r0.f5755x
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f13123o
            int r2 = r4.G()
            int r0 = r0 - r2
            int r2 = r4.D()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f13110b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f13122n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f13123o
            int r0 = r4.G()
            int r5 = r5 - r0
            int r0 = r4.D()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f13110b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f13122n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L87
            if (r5 != 0) goto L87
            r6 = r1
            goto L8c
        L87:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f13110b
            r4.b0(r5, r0, r6)
        L8c:
            return r6
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.w0.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
