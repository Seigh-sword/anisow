package Q2;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import m3.v0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SideSheetBehavior f2795b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i6) {
        this.f2794a = i6;
        this.f2795b = sideSheetBehavior;
    }

    public final float h(int i6) {
        switch (this.f2794a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                float fJ = j();
                return (i6 - fJ) / (i() - fJ);
            default:
                float fJ2 = j();
                return (fJ2 - i6) / (fJ2 - i());
        }
    }

    public final int i() {
        int i6 = this.f2794a;
        SideSheetBehavior sideSheetBehavior = this.f2795b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return Math.max(0, sideSheetBehavior.f7284n + sideSheetBehavior.f7285o);
            default:
                return Math.max(0, (j() - sideSheetBehavior.f7282l) - sideSheetBehavior.f7285o);
        }
    }

    public final int j() {
        int i6 = this.f2794a;
        SideSheetBehavior sideSheetBehavior = this.f2795b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (-sideSheetBehavior.f7282l) - sideSheetBehavior.f7285o;
            default:
                return sideSheetBehavior.f7283m;
        }
    }

    public final boolean k(float f6) {
        switch (this.f2794a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (f6 > 0.0f) {
                }
                break;
            default:
                if (f6 < 0.0f) {
                }
                break;
        }
        return true;
    }

    public final boolean l(View view) {
        switch (this.f2794a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (view.getRight() < (i() - j()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (i() + j()) / 2) {
                }
                break;
        }
        return true;
    }

    public final boolean m(float f6, float f7) {
        int i6 = this.f2794a;
        SideSheetBehavior sideSheetBehavior = this.f2795b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (Math.abs(f6) > Math.abs(f7)) {
                    float fAbs = Math.abs(f6);
                    sideSheetBehavior.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f6) > Math.abs(f7)) {
                    float fAbs2 = Math.abs(f6);
                    sideSheetBehavior.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return true;
    }

    public final boolean n(View view, float f6) {
        int i6 = this.f2794a;
        SideSheetBehavior sideSheetBehavior = this.f2795b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (Math.abs((f6 * sideSheetBehavior.f7281k) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f6 * sideSheetBehavior.f7281k) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return true;
    }
}
