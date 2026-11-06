package h0;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import s.C1280b;

/* JADX INFO: renamed from: h0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0752q extends u0 {
    public static void r(C1280b c1280b, View view) {
        WeakHashMap weakHashMap = N.V.f1964a;
        String strK = N.I.k(view);
        if (strK != null) {
            c1280b.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = viewGroup.getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    r(c1280b, childAt);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x03f7 A[LOOP:17: B:139:0x03f1->B:141:0x03f7, LOOP_END] */
    @Override // h0.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0752q.b(java.util.ArrayList, boolean):void");
    }
}
