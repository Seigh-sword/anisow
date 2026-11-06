package v0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class P extends Q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(AbstractC1397f0 abstractC1397f0, int i6) {
        super(abstractC1397f0);
        this.f13058d = i6;
    }

    @Override // v0.Q
    public final int b(View view) {
        int i6 = this.f13058d;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g0 g0Var = (g0) view.getLayoutParams();
                abstractC1397f0.getClass();
                return view.getRight() + ((g0) view.getLayoutParams()).f13126b.right + ((ViewGroup.MarginLayoutParams) g0Var).rightMargin;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                abstractC1397f0.getClass();
                return view.getBottom() + ((g0) view.getLayoutParams()).f13126b.bottom + ((ViewGroup.MarginLayoutParams) g0Var2).bottomMargin;
        }
    }

    @Override // v0.Q
    public final int c(View view) {
        int i6 = this.f13058d;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g0 g0Var = (g0) view.getLayoutParams();
                abstractC1397f0.getClass();
                return AbstractC1397f0.A(view) + ((ViewGroup.MarginLayoutParams) g0Var).leftMargin + ((ViewGroup.MarginLayoutParams) g0Var).rightMargin;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                abstractC1397f0.getClass();
                return AbstractC1397f0.z(view) + ((ViewGroup.MarginLayoutParams) g0Var2).topMargin + ((ViewGroup.MarginLayoutParams) g0Var2).bottomMargin;
        }
    }

    @Override // v0.Q
    public final int d(View view) {
        int i6 = this.f13058d;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g0 g0Var = (g0) view.getLayoutParams();
                abstractC1397f0.getClass();
                return (view.getLeft() - ((g0) view.getLayoutParams()).f13126b.left) - ((ViewGroup.MarginLayoutParams) g0Var).leftMargin;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                abstractC1397f0.getClass();
                return (view.getTop() - ((g0) view.getLayoutParams()).f13126b.top) - ((ViewGroup.MarginLayoutParams) g0Var2).topMargin;
        }
    }

    @Override // v0.Q
    public final int e() {
        int i6 = this.f13058d;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return abstractC1397f0.f13122n - abstractC1397f0.F();
            default:
                return abstractC1397f0.f13123o - abstractC1397f0.D();
        }
    }

    @Override // v0.Q
    public final int f() {
        int i6 = this.f13058d;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return abstractC1397f0.E();
            default:
                return abstractC1397f0.G();
        }
    }

    @Override // v0.Q
    public final int g() {
        int i6 = this.f13058d;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return (abstractC1397f0.f13122n - abstractC1397f0.E()) - abstractC1397f0.F();
            default:
                return (abstractC1397f0.f13123o - abstractC1397f0.G()) - abstractC1397f0.D();
        }
    }

    @Override // v0.Q
    public final int i(View view) {
        int i6 = this.f13058d;
        Rect rect = this.f13061c;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                abstractC1397f0.K(view, rect);
                return rect.right;
            default:
                abstractC1397f0.K(view, rect);
                return rect.bottom;
        }
    }

    @Override // v0.Q
    public final int j(View view) {
        int i6 = this.f13058d;
        Rect rect = this.f13061c;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                abstractC1397f0.K(view, rect);
                return rect.left;
            default:
                abstractC1397f0.K(view, rect);
                return rect.top;
        }
    }

    @Override // v0.Q
    public final void k(int i6) {
        int i7 = this.f13058d;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                abstractC1397f0.O(i6);
                break;
            default:
                abstractC1397f0.P(i6);
                break;
        }
    }

    public final int l(View view) {
        int i6 = this.f13058d;
        AbstractC1397f0 abstractC1397f0 = this.f13059a;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g0 g0Var = (g0) view.getLayoutParams();
                abstractC1397f0.getClass();
                return AbstractC1397f0.z(view) + ((ViewGroup.MarginLayoutParams) g0Var).topMargin + ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                abstractC1397f0.getClass();
                return AbstractC1397f0.A(view) + ((ViewGroup.MarginLayoutParams) g0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) g0Var2).rightMargin;
        }
    }
}
