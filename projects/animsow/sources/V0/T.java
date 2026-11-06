package v0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class T extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f13064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f13065b = new x0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P f13066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P f13067d;

    public static int b(View view, Q q5) {
        return ((q5.c(view) / 2) + q5.d(view)) - ((q5.g() / 2) + q5.f());
    }

    public static View c(AbstractC1397f0 abstractC1397f0, Q q5) {
        int iV = abstractC1397f0.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iG = (q5.g() / 2) + q5.f();
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = abstractC1397f0.u(i7);
            int iAbs = Math.abs(((q5.c(viewU) / 2) + q5.d(viewU)) - iG);
            if (iAbs < i6) {
                view = viewU;
                i6 = iAbs;
            }
        }
        return view;
    }

    public final int[] a(AbstractC1397f0 abstractC1397f0, View view) {
        int[] iArr = new int[2];
        if (abstractC1397f0.d()) {
            iArr[0] = b(view, d(abstractC1397f0));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1397f0.e()) {
            iArr[1] = b(view, e(abstractC1397f0));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final Q d(AbstractC1397f0 abstractC1397f0) {
        P p5 = this.f13067d;
        if (p5 == null || p5.f13059a != abstractC1397f0) {
            this.f13067d = new P(abstractC1397f0, 0);
        }
        return this.f13067d;
    }

    public final Q e(AbstractC1397f0 abstractC1397f0) {
        P p5 = this.f13066c;
        if (p5 == null || p5.f13059a != abstractC1397f0) {
            this.f13066c = new P(abstractC1397f0, 1);
        }
        return this.f13066c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.f13064a
            if (r0 != 0) goto L5
            goto L3f
        L5:
            v0.f0 r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            goto L3f
        Lc:
            boolean r1 = r0.e()
            if (r1 == 0) goto L1b
            v0.Q r1 = r5.e(r0)
        L16:
            android.view.View r1 = c(r0, r1)
            goto L27
        L1b:
            boolean r1 = r0.d()
            if (r1 == 0) goto L26
            v0.Q r1 = r5.d(r0)
            goto L16
        L26:
            r1 = 0
        L27:
            if (r1 != 0) goto L2a
            goto L3f
        L2a:
            int[] r0 = r5.a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L38
            r4 = r0[r3]
            if (r4 == 0) goto L3f
        L38:
            androidx.recyclerview.widget.RecyclerView r4 = r5.f13064a
            r0 = r0[r3]
            r4.b0(r2, r0, r1)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.T.f():void");
    }
}
