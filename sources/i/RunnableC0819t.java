package i;

import N.C0090e0;
import N.V;
import android.view.ViewGroup;

/* JADX INFO: renamed from: i.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0819t implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ H f9342x;

    public /* synthetic */ RunnableC0819t(H h4, int i6) {
        this.f9341w = i6;
        this.f9342x = h4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i6 = this.f9341w;
        H h4 = this.f9342x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if ((1 & h4.f9213w0) != 0) {
                    h4.u(0);
                }
                if ((h4.f9213w0 & 4096) != 0) {
                    h4.u(108);
                }
                h4.f9212v0 = false;
                h4.f9213w0 = 0;
                break;
            default:
                h4.f9183S.showAtLocation(h4.f9182R, 55, 0, 0);
                C0090e0 c0090e0 = h4.f9185U;
                if (c0090e0 != null) {
                    c0090e0.b();
                }
                if (!(h4.f9187W && (viewGroup = h4.f9188X) != null && viewGroup.isLaidOut())) {
                    h4.f9182R.setAlpha(1.0f);
                    h4.f9182R.setVisibility(0);
                } else {
                    h4.f9182R.setAlpha(0.0f);
                    C0090e0 c0090e0A = V.a(h4.f9182R);
                    c0090e0A.a(1.0f);
                    h4.f9185U = c0090e0A;
                    c0090e0A.d(new w(0, this));
                }
                break;
        }
    }
}
