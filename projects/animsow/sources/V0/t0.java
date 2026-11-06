package v0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.datastore.preferences.protobuf.C0289n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13233A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13234B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f13235C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13237x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public OverScroller f13238y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Interpolator f13239z;

    public t0(RecyclerView recyclerView) {
        this.f13235C = recyclerView;
        V.d dVar = RecyclerView.f5688W0;
        this.f13239z = dVar;
        this.f13233A = false;
        this.f13234B = false;
        this.f13238y = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f13233A) {
            this.f13234B = true;
            return;
        }
        RecyclerView recyclerView = this.f13235C;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = N.V.f1964a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i6, int i7, int i8, Interpolator interpolator) {
        RecyclerView recyclerView = this.f13235C;
        if (i8 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i6);
            int iAbs2 = Math.abs(i7);
            boolean z5 = iAbs > iAbs2;
            int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z5) {
                iAbs = iAbs2;
            }
            i8 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i9 = i8;
        if (interpolator == null) {
            interpolator = RecyclerView.f5688W0;
        }
        if (this.f13239z != interpolator) {
            this.f13239z = interpolator;
            this.f13238y = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f13237x = 0;
        this.f13236w = 0;
        recyclerView.setScrollState(2);
        this.f13238y.startScroll(0, 0, i6, i7, i9);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f13235C;
        if (recyclerView.f5704I == null) {
            recyclerView.removeCallbacks(this);
            this.f13238y.abortAnimation();
            return;
        }
        this.f13234B = false;
        this.f13233A = true;
        recyclerView.m();
        OverScroller overScroller = this.f13238y;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i10 = currX - this.f13236w;
            int i11 = currY - this.f13237x;
            this.f13236w = currX;
            this.f13237x = currY;
            int[] iArr = recyclerView.f5715N0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zR = recyclerView.r(i10, i11, iArr, null, 1);
            int[] iArr2 = recyclerView.f5715N0;
            if (zR) {
                i10 -= iArr2[0];
                i11 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i10, i11);
            }
            if (recyclerView.f5702H != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(i10, i11, iArr2);
                int i12 = iArr2[0];
                int i13 = iArr2[1];
                int i14 = i10 - i12;
                int i15 = i11 - i13;
                C1383L c1383l = recyclerView.f5704I.f13113e;
                if (c1383l != null && !c1383l.f13043d && c1383l.f13044e) {
                    int iB = recyclerView.f5692B0.b();
                    if (iB == 0) {
                        c1383l.i();
                    } else {
                        if (c1383l.f13040a >= iB) {
                            c1383l.f13040a = iB - 1;
                        }
                        c1383l.g(i12, i13);
                    }
                }
                i9 = i12;
                i6 = i14;
                i7 = i15;
                i8 = i13;
            } else {
                i6 = i10;
                i7 = i11;
                i8 = 0;
                i9 = 0;
            }
            if (!recyclerView.f5708K.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f5715N0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i16 = i8;
            recyclerView.s(i9, i8, i6, i7, null, 1, iArr3);
            int i17 = i6 - iArr2[0];
            int i18 = i7 - iArr2[1];
            if (i9 != 0 || i16 != 0) {
                recyclerView.t(i9, i16);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i17 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i18 != 0));
            C1383L c1383l2 = recyclerView.f5704I.f13113e;
            if ((c1383l2 == null || !c1383l2.f13043d) && z5) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i19 = i17 < 0 ? -currVelocity : i17 > 0 ? currVelocity : 0;
                    if (i18 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i18 <= 0) {
                        currVelocity = 0;
                    }
                    if (i19 < 0) {
                        recyclerView.v();
                        if (recyclerView.f5736f0.isFinished()) {
                            recyclerView.f5736f0.onAbsorb(-i19);
                        }
                    } else if (i19 > 0) {
                        recyclerView.w();
                        if (recyclerView.f5738h0.isFinished()) {
                            recyclerView.f5738h0.onAbsorb(i19);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f5737g0.isFinished()) {
                            recyclerView.f5737g0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f5739i0.isFinished()) {
                            recyclerView.f5739i0.onAbsorb(currVelocity);
                        }
                    }
                    if (i19 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = N.V.f1964a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0289n c0289n = recyclerView.f5690A0;
                int[] iArr4 = (int[]) c0289n.f5493d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0289n.f5492c = 0;
            } else {
                a();
                RunnableC1376E runnableC1376E = recyclerView.f5760z0;
                if (runnableC1376E != null) {
                    runnableC1376E.a(recyclerView, i9, i16);
                }
            }
        }
        C1383L c1383l3 = recyclerView.f5704I.f13113e;
        if (c1383l3 != null && c1383l3.f13043d) {
            c1383l3.g(0, 0);
        }
        this.f13233A = false;
        if (!this.f13234B) {
            recyclerView.setScrollState(0);
            recyclerView.f0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = N.V.f1964a;
            recyclerView.postOnAnimation(this);
        }
    }
}
