package v0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: v0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1416z extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1374C f13290a;

    public C1416z(C1374C c1374c) {
        this.f13290a = c1374c;
    }

    @Override // v0.j0
    public final void b(RecyclerView recyclerView, int i6, int i7) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1374C c1374c = this.f13290a;
        int iComputeVerticalScrollRange = c1374c.f12971s.computeVerticalScrollRange();
        int i8 = c1374c.f12970r;
        int i9 = iComputeVerticalScrollRange - i8;
        int i10 = c1374c.f12953a;
        c1374c.f12972t = i9 > 0 && i8 >= i10;
        int iComputeHorizontalScrollRange = c1374c.f12971s.computeHorizontalScrollRange();
        int i11 = c1374c.f12969q;
        boolean z5 = iComputeHorizontalScrollRange - i11 > 0 && i11 >= i10;
        c1374c.f12973u = z5;
        boolean z6 = c1374c.f12972t;
        if (!z6 && !z5) {
            if (c1374c.f12974v != 0) {
                c1374c.f(0);
                return;
            }
            return;
        }
        if (z6) {
            float f6 = i8;
            c1374c.f12964l = (int) ((((f6 / 2.0f) + iComputeVerticalScrollOffset) * f6) / iComputeVerticalScrollRange);
            c1374c.f12963k = Math.min(i8, (i8 * i8) / iComputeVerticalScrollRange);
        }
        if (c1374c.f12973u) {
            float f7 = iComputeHorizontalScrollOffset;
            float f8 = i11;
            c1374c.f12967o = (int) ((((f8 / 2.0f) + f7) * f8) / iComputeHorizontalScrollRange);
            c1374c.f12966n = Math.min(i11, (i11 * i11) / iComputeHorizontalScrollRange);
        }
        int i12 = c1374c.f12974v;
        if (i12 == 0 || i12 == 1) {
            c1374c.f(1);
        }
    }
}
