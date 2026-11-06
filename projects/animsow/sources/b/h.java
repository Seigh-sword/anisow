package B;

import N.I;
import N.V;
import android.view.View;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56a;

    public /* synthetic */ h(int i6) {
        this.f56a = i6;
    }

    public final int a(View view, View view2) {
        switch (this.f56a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                WeakHashMap weakHashMap = V.f1964a;
                float fM = I.m(view);
                float fM2 = I.m(view2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            default:
                return view.getTop() - view2.getTop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.f56a
            r1 = 1
            r2 = -1
            r3 = 0
            switch(r0) {
                case 0: goto L9e;
                case 1: goto L94;
                case 2: goto L5f;
                case 3: goto L4e;
                case 4: goto L45;
                case 5: goto L29;
                case 6: goto L20;
                default: goto L8;
            }
        L8:
            g5.f r7 = (g5.f) r7
            f5.w r7 = r7.f8545a
            g5.f r8 = (g5.f) r8
            f5.w r8 = r8.f8545a
            if (r7 != r8) goto L14
            r1 = r3
            goto L1f
        L14:
            if (r7 != 0) goto L18
            r1 = r2
            goto L1f
        L18:
            if (r8 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r7.compareTo(r8)
        L1f:
            return r1
        L20:
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r7 = r7.compareTo(r8)
            return r7
        L29:
            android.os.Message r7 = (android.os.Message) r7
            long r0 = r7.getWhen()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            android.os.Message r8 = (android.os.Message) r8
            long r0 = r8.getWhen()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            if (r7 != r8) goto L40
            goto L44
        L40:
            int r3 = r7.compareTo(r8)
        L44:
            return r3
        L45:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r6.a(r7, r8)
            return r7
        L4e:
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r7.longValue()
            long r7 = r8.longValue()
            int r7 = java.lang.Long.compare(r0, r7)
            return r7
        L5f:
            v0.D r7 = (v0.C1375D) r7
            v0.D r8 = (v0.C1375D) r8
            androidx.recyclerview.widget.RecyclerView r0 = r7.f12988d
            if (r0 != 0) goto L69
            r4 = r1
            goto L6a
        L69:
            r4 = r3
        L6a:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f12988d
            if (r5 != 0) goto L70
            r5 = r1
            goto L71
        L70:
            r5 = r3
        L71:
            if (r4 == r5) goto L79
            if (r0 != 0) goto L76
            goto L77
        L76:
            r1 = r2
        L77:
            r3 = r1
            goto L93
        L79:
            boolean r0 = r7.f12985a
            boolean r4 = r8.f12985a
            if (r0 == r4) goto L82
            if (r0 == 0) goto L77
            goto L76
        L82:
            int r0 = r8.f12986b
            int r1 = r7.f12986b
            int r0 = r0 - r1
            if (r0 == 0) goto L8b
            r3 = r0
            goto L93
        L8b:
            int r7 = r7.f12987c
            int r8 = r8.f12987c
            int r7 = r7 - r8
            if (r7 == 0) goto L93
            r3 = r7
        L93:
            return r3
        L94:
            v0.t r7 = (v0.C1410t) r7
            v0.t r8 = (v0.C1410t) r8
            int r7 = r7.f13230a
            int r8 = r8.f13230a
            int r7 = r7 - r8
            return r7
        L9e:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r6.a(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B.h.compare(java.lang.Object, java.lang.Object):int");
    }
}
