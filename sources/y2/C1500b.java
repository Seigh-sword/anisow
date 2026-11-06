package y2;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: y2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1500b extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f13789x;

    public C1500b(BottomSheetBehavior bottomSheetBehavior) {
        this.f13789x = bottomSheetBehavior;
    }

    @Override // com.bumptech.glide.c
    public final void G(int i6) {
        if (i6 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f13789x;
            if (bottomSheetBehavior.f7062K) {
                bottomSheetBehavior.I(1);
            }
        }
    }

    @Override // com.bumptech.glide.c
    public final void H(View view, int i6, int i7) {
        this.f13789x.y(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // com.bumptech.glide.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C1500b.I(android.view.View, float, float):void");
    }

    @Override // com.bumptech.glide.c
    public final boolean Q(View view, int i6) {
        BottomSheetBehavior bottomSheetBehavior = this.f13789x;
        int i7 = bottomSheetBehavior.f7063L;
        if (i7 == 1 || bottomSheetBehavior.f7081b0) {
            return false;
        }
        if (i7 == 3 && bottomSheetBehavior.f7077Z == i6) {
            WeakReference weakReference = bottomSheetBehavior.f7073V;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.f7072U;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // com.bumptech.glide.c
    public final int p(View view, int i6) {
        return view.getLeft();
    }

    @Override // com.bumptech.glide.c
    public final int q(View view, int i6) {
        return com.bumptech.glide.c.o(i6, this.f13789x.C(), v());
    }

    @Override // com.bumptech.glide.c
    public final int v() {
        BottomSheetBehavior bottomSheetBehavior = this.f13789x;
        return bottomSheetBehavior.f7060I ? bottomSheetBehavior.f7071T : bottomSheetBehavior.f7058G;
    }
}
