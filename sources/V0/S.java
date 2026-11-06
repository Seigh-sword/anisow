package v0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class S extends C1383L {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13063r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(Object obj, Context context, int i6) {
        super(context);
        this.f13062q = i6;
        this.f13063r = obj;
    }

    @Override // v0.C1383L
    public final int b(View view, int i6) {
        switch (this.f13062q) {
            case 1:
                ((CarouselLayoutManager) this.f13063r).getClass();
                return 0;
            default:
                return super.b(view, i6);
        }
    }

    @Override // v0.C1383L
    public final int c(View view, int i6) {
        switch (this.f13062q) {
            case 1:
                ((CarouselLayoutManager) this.f13063r).getClass();
                return 0;
            default:
                return super.c(view, i6);
        }
    }

    @Override // v0.C1383L
    public final float d(DisplayMetrics displayMetrics) {
        switch (this.f13062q) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return 100.0f / displayMetrics.densityDpi;
            case 1:
            default:
                return super.d(displayMetrics);
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // v0.C1383L
    public final int e(int i6) {
        switch (this.f13062q) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return Math.min(100, super.e(i6));
            default:
                return super.e(i6);
        }
    }

    @Override // v0.C1383L
    public final PointF f(int i6) {
        switch (this.f13062q) {
            case 1:
                ((CarouselLayoutManager) this.f13063r).getClass();
                return null;
            default:
                return super.f(i6);
        }
    }

    @Override // v0.C1383L
    public final void h(View view, r0 r0Var, p0 p0Var) {
        switch (this.f13062q) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                T t5 = (T) this.f13063r;
                int[] iArrA = t5.a(t5.f13064a.getLayoutManager(), view);
                int i6 = iArrA[0];
                int i7 = iArrA[1];
                int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i6), Math.abs(i7)))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f13049j;
                    p0Var.f13189a = i6;
                    p0Var.f13190b = i7;
                    p0Var.f13191c = iCeil;
                    p0Var.f13193e = decelerateInterpolator;
                    p0Var.f13194f = true;
                }
                break;
            default:
                super.h(view, r0Var, p0Var);
                break;
        }
    }
}
