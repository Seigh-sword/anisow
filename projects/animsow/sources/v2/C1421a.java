package v2;

import R2.j;
import R2.n;
import android.view.View;
import android.view.ViewParent;
import com.bumptech.glide.c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p1.C1243i;

/* JADX INFO: renamed from: v2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1421a extends c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13298y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f13299z;

    public C1421a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f13299z = swipeDismissBehavior;
    }

    @Override // com.bumptech.glide.c
    public final void F(View view, int i6) {
        this.f13298y = i6;
        this.f13297x = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f13299z;
            swipeDismissBehavior.f7046d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f7046d = false;
        }
    }

    @Override // com.bumptech.glide.c
    public final void G(int i6) {
        C1243i c1243i = this.f13299z.f7044b;
        if (c1243i != null) {
            if (i6 == 0) {
                n.b().e(((j) c1243i.f12254x).f2990t);
            } else if (i6 == 1 || i6 == 2) {
                n.b().d(((j) c1243i.f12254x).f2990t);
            }
        }
    }

    @Override // com.bumptech.glide.c
    public final void H(View view, int i6, int i7) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f13299z;
        float f6 = width * swipeDismissBehavior.f7049g;
        float width2 = view.getWidth() * swipeDismissBehavior.f7050h;
        float fAbs = Math.abs(i6 - this.f13297x);
        if (fAbs <= f6) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f6) / (width2 - f6))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // com.bumptech.glide.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f13298y = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f13299z
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = N.V.f1964a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f7047e
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r2) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f13297x
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f7048f
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f13297x
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r10 = r8.f13297x
            int r0 = r10 - r11
            goto L69
        L66:
            int r0 = r8.f13297x
            r2 = r4
        L69:
            V.e r10 = r3.f7043a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L80
            androidx.lifecycle.a0 r10 = new androidx.lifecycle.a0
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = N.V.f1964a
            r9.postOnAnimation(r10)
            goto L89
        L80:
            if (r2 == 0) goto L89
            p1.i r10 = r3.f7044b
            if (r10 == 0) goto L89
            r10.o(r9)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C1421a.I(android.view.View, float, float):void");
    }

    @Override // com.bumptech.glide.c
    public final boolean Q(View view, int i6) {
        int i7 = this.f13298y;
        return (i7 == -1 || i7 == i6) && this.f13299z.v(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // com.bumptech.glide.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(android.view.View r4, int r5) {
        /*
            r3 = this;
            java.util.WeakHashMap r0 = N.V.f1964a
            int r0 = r4.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lb
            r0 = r1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.f13299z
            int r2 = r2.f7047e
            if (r2 != 0) goto L26
            if (r0 == 0) goto L1e
        L14:
            int r0 = r3.f13297x
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.f13297x
            goto L39
        L1e:
            int r0 = r3.f13297x
            int r4 = r4.getWidth()
            int r4 = r4 + r0
            goto L39
        L26:
            if (r2 != r1) goto L2b
            if (r0 == 0) goto L14
            goto L1e
        L2b:
            int r0 = r3.f13297x
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r3.f13297x
            int r4 = r4.getWidth()
            int r4 = r4 + r1
        L39:
            int r5 = java.lang.Math.max(r0, r5)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C1421a.p(android.view.View, int):int");
    }

    @Override // com.bumptech.glide.c
    public final int q(View view, int i6) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.c
    public final int u(View view) {
        return view.getWidth();
    }
}
