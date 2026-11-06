package v0;

import android.view.View;

/* JADX INFO: renamed from: v0.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1379H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public P f13016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13020e;

    public C1379H() {
        d();
    }

    public final void a() {
        this.f13018c = this.f13019d ? this.f13016a.e() : this.f13016a.f();
    }

    public final void b(View view, int i6) {
        if (this.f13019d) {
            this.f13018c = this.f13016a.h() + this.f13016a.b(view);
        } else {
            this.f13018c = this.f13016a.d(view);
        }
        this.f13017b = i6;
    }

    public final void c(View view, int i6) {
        int iMin;
        int iH = this.f13016a.h();
        if (iH >= 0) {
            b(view, i6);
            return;
        }
        this.f13017b = i6;
        if (this.f13019d) {
            int iE = (this.f13016a.e() - iH) - this.f13016a.b(view);
            this.f13018c = this.f13016a.e() - iE;
            if (iE <= 0) {
                return;
            }
            int iC = this.f13018c - this.f13016a.c(view);
            int iF = this.f13016a.f();
            int iMin2 = iC - (Math.min(this.f13016a.d(view) - iF, 0) + iF);
            if (iMin2 >= 0) {
                return;
            }
            iMin = Math.min(iE, -iMin2) + this.f13018c;
        } else {
            int iD = this.f13016a.d(view);
            int iF2 = iD - this.f13016a.f();
            this.f13018c = iD;
            if (iF2 <= 0) {
                return;
            }
            int iE2 = (this.f13016a.e() - Math.min(0, (this.f13016a.e() - iH) - this.f13016a.b(view))) - (this.f13016a.c(view) + iD);
            if (iE2 >= 0) {
                return;
            } else {
                iMin = this.f13018c - Math.min(iF2, -iE2);
            }
        }
        this.f13018c = iMin;
    }

    public final void d() {
        this.f13017b = -1;
        this.f13018c = Integer.MIN_VALUE;
        this.f13019d = false;
        this.f13020e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f13017b + ", mCoordinate=" + this.f13018c + ", mLayoutFromEnd=" + this.f13019d + ", mValid=" + this.f13020e + '}';
    }
}
