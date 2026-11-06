package Q2;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d.AbstractC0628i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f2802x;

    public d(SideSheetBehavior sideSheetBehavior) {
        this.f2802x = sideSheetBehavior;
    }

    @Override // com.bumptech.glide.c
    public final void G(int i6) {
        if (i6 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f2802x;
            if (sideSheetBehavior.f7277g) {
                sideSheetBehavior.w(1);
            }
        }
    }

    @Override // com.bumptech.glide.c
    public final void H(View view, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f2802x;
        WeakReference weakReference = sideSheetBehavior.f7287q;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            a aVar = sideSheetBehavior.f7271a;
            int left = view.getLeft();
            int right = view.getRight();
            int i8 = aVar.f2794a;
            SideSheetBehavior sideSheetBehavior2 = aVar.f2795b;
            switch (i8) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    if (left <= sideSheetBehavior2.f7283m) {
                        marginLayoutParams.leftMargin = right;
                    }
                    break;
                default:
                    int i9 = sideSheetBehavior2.f7283m;
                    if (left <= i9) {
                        marginLayoutParams.rightMargin = i9 - left;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f7292v;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        sideSheetBehavior.f7271a.h(i6);
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // com.bumptech.glide.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r4.f2802x
            Q2.a r1 = r0.f7271a
            boolean r1 = r1.k(r6)
            r2 = 3
            if (r1 == 0) goto Lc
            goto L56
        Lc:
            Q2.a r1 = r0.f7271a
            boolean r1 = r1.n(r5, r6)
            r3 = 5
            if (r1 == 0) goto L27
            Q2.a r1 = r0.f7271a
            boolean r6 = r1.m(r6, r7)
            if (r6 != 0) goto L25
            Q2.a r6 = r0.f7271a
            boolean r6 = r6.l(r5)
            if (r6 == 0) goto L56
        L25:
            r2 = r3
            goto L56
        L27:
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L39
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L39
            goto L25
        L39:
            int r6 = r5.getLeft()
            Q2.a r7 = r0.f7271a
            int r7 = r7.i()
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            Q2.a r1 = r0.f7271a
            int r1 = r1.j()
            int r6 = r6 - r1
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L25
        L56:
            r6 = 1
            r0.y(r5, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.d.I(android.view.View, float, float):void");
    }

    @Override // com.bumptech.glide.c
    public final boolean Q(View view, int i6) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f2802x;
        return (sideSheetBehavior.f7278h == 1 || (weakReference = sideSheetBehavior.f7286p) == null || weakReference.get() != view) ? false : true;
    }

    @Override // com.bumptech.glide.c
    public final int p(View view, int i6) {
        int i7;
        int i8;
        SideSheetBehavior sideSheetBehavior = this.f2802x;
        a aVar = sideSheetBehavior.f7271a;
        switch (aVar.f2794a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                i7 = -aVar.f2795b.f7282l;
                break;
            default:
                i7 = aVar.i();
                break;
        }
        a aVar2 = sideSheetBehavior.f7271a;
        int i9 = aVar2.f2794a;
        SideSheetBehavior sideSheetBehavior2 = aVar2.f2795b;
        switch (i9) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                i8 = sideSheetBehavior2.f7285o;
                break;
            default:
                i8 = sideSheetBehavior2.f7283m;
                break;
        }
        return com.bumptech.glide.c.o(i6, i7, i8);
    }

    @Override // com.bumptech.glide.c
    public final int q(View view, int i6) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.c
    public final int u(View view) {
        SideSheetBehavior sideSheetBehavior = this.f2802x;
        return sideSheetBehavior.f7282l + sideSheetBehavior.f7285o;
    }
}
