package com.google.android.material.carousel;

import B2.a;
import B2.b;
import B2.c;
import B2.e;
import B2.f;
import B2.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.d;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.xo.anilab.R;
import d.AbstractC0628i;
import d.RunnableC0632m;
import java.util.List;
import r2.AbstractC1274a;
import s2.AbstractC1301a;
import u1.C1358b;
import v0.AbstractC1397f0;
import v0.S;
import v0.g0;
import v0.m0;
import v0.q0;
import v0.r0;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC1397f0 implements q0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f7143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f7144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f7145r;

    /* JADX WARN: Type inference failed for: r1v1, types: [B2.a] */
    public CarouselLayoutManager() {
        g gVar = new g();
        new b();
        final int i6 = 1;
        this.f7145r = new View.OnLayoutChangeListener(this) { // from class: B2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselLayoutManager f80b;

            {
                this.f80b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                int i15 = i6;
                int i16 = 13;
                CarouselLayoutManager carouselLayoutManager = this.f80b;
                carouselLayoutManager.getClass();
                switch (i15) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (i7 != i11 || i8 != i12 || i9 != i13 || i10 != i14) {
                            view.post(new RunnableC0632m(i16, carouselLayoutManager));
                        }
                        break;
                    default:
                        if (i7 != i11 || i8 != i12 || i9 != i13 || i10 != i14) {
                            view.post(new RunnableC0632m(i16, carouselLayoutManager));
                        }
                        break;
                }
            }
        };
        this.f7143p = gVar;
        m0();
        H0(0);
    }

    public static float D0(float f6, C1358b c1358b) {
        f fVar = (f) c1358b.f12822x;
        fVar.getClass();
        f fVar2 = (f) c1358b.f12823y;
        fVar2.getClass();
        fVar.getClass();
        fVar2.getClass();
        return AbstractC1301a.b(0.0f, 0.0f, 0.0f, 0.0f, f6);
    }

    public static C1358b E0(float f6, List list, boolean z5) {
        float f7 = Float.MAX_VALUE;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        float f8 = -3.4028235E38f;
        float f9 = Float.MAX_VALUE;
        float f10 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((f) list.get(i10)).getClass();
            float fAbs = Math.abs(0.0f - f6);
            if (0.0f <= f6 && fAbs <= f7) {
                i6 = i10;
                f7 = fAbs;
            }
            if (0.0f > f6 && fAbs <= f9) {
                i8 = i10;
                f9 = fAbs;
            }
            if (0.0f <= f10) {
                f10 = 0.0f;
                i7 = i10;
            }
            if (0.0f > f8) {
                f8 = 0.0f;
                i9 = i10;
            }
        }
        if (i6 == -1) {
            i6 = i7;
        }
        if (i8 == -1) {
            i8 = i9;
        }
        return new C1358b((f) list.get(i6), (f) list.get(i8));
    }

    public final float B0(int i6) {
        c cVar = this.f7144q;
        int i7 = cVar.f83b;
        CarouselLayoutManager carouselLayoutManager = cVar.f84c;
        switch (i7) {
            case d.f6312l /* 0 */:
                switch (i7) {
                    case d.f6312l /* 0 */:
                        break;
                    default:
                        carouselLayoutManager.G();
                        break;
                }
                break;
            default:
                boolean zG0 = carouselLayoutManager.G0();
                int i8 = cVar.f83b;
                if (!zG0) {
                    switch (i8) {
                        case d.f6312l /* 0 */:
                            carouselLayoutManager.E();
                            break;
                    }
                } else {
                    switch (i8) {
                        case d.f6312l /* 0 */:
                            int i9 = carouselLayoutManager.f13122n;
                            carouselLayoutManager.F();
                            break;
                        default:
                            int i10 = carouselLayoutManager.f13122n;
                            break;
                    }
                }
                break;
        }
        throw null;
    }

    public final int C0() {
        return F0() ? this.f13122n : this.f13123o;
    }

    public final boolean F0() {
        return this.f7144q.f85a == 0;
    }

    public final boolean G0() {
        return F0() && C() == 1;
    }

    public final void H0(int i6) {
        c cVar;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException(AbstractC0628i.f("invalid orientation:", i6));
        }
        c(null);
        c cVar2 = this.f7144q;
        if (cVar2 == null || i6 != cVar2.f85a) {
            if (i6 == 0) {
                cVar = new c(0, this, 1);
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(1, this, 0);
            }
            this.f7144q = cVar;
            m0();
        }
    }

    @Override // v0.AbstractC1397f0
    public final boolean L() {
        return true;
    }

    @Override // v0.AbstractC1397f0
    public final void R(RecyclerView recyclerView) {
        e eVar = this.f7143p;
        Context context = recyclerView.getContext();
        float dimension = eVar.f86a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eVar.f86a = dimension;
        float dimension2 = eVar.f87b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eVar.f87b = dimension2;
        m0();
        recyclerView.addOnLayoutChangeListener(this.f7145r);
    }

    @Override // v0.AbstractC1397f0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f7145r);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    @Override // v0.AbstractC1397f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View T(android.view.View r7, int r8, v0.m0 r9, v0.r0 r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.T(android.view.View, int, v0.m0, v0.r0):android.view.View");
    }

    @Override // v0.AbstractC1397f0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC1397f0.H(u(0)));
            accessibilityEvent.setToIndex(AbstractC1397f0.H(u(v() - 1)));
        }
    }

    @Override // v0.AbstractC1397f0
    public final void X(int i6, int i7) {
        B();
    }

    @Override // v0.q0
    public final PointF a(int i6) {
        return null;
    }

    @Override // v0.AbstractC1397f0
    public final void a0(int i6, int i7) {
        B();
    }

    @Override // v0.AbstractC1397f0
    public final void c0(m0 m0Var, r0 r0Var) {
        if (r0Var.b() <= 0 || C0() <= 0.0f) {
            h0(m0Var);
        } else {
            G0();
            View view = m0Var.i(0, Long.MAX_VALUE).f13248a;
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // v0.AbstractC1397f0
    public final boolean d() {
        return F0();
    }

    @Override // v0.AbstractC1397f0
    public final void d0(r0 r0Var) {
        if (v() == 0) {
            return;
        }
        AbstractC1397f0.H(u(0));
    }

    @Override // v0.AbstractC1397f0
    public final boolean e() {
        return !F0();
    }

    @Override // v0.AbstractC1397f0
    public final int j(r0 r0Var) {
        v();
        return 0;
    }

    @Override // v0.AbstractC1397f0
    public final int k(r0 r0Var) {
        return 0;
    }

    @Override // v0.AbstractC1397f0
    public final int l(r0 r0Var) {
        return 0;
    }

    @Override // v0.AbstractC1397f0
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z6) {
        return false;
    }

    @Override // v0.AbstractC1397f0
    public final int m(r0 r0Var) {
        v();
        return 0;
    }

    @Override // v0.AbstractC1397f0
    public final int n(r0 r0Var) {
        return 0;
    }

    @Override // v0.AbstractC1397f0
    public final int n0(int i6, m0 m0Var, r0 r0Var) {
        if (!F0() || v() == 0 || i6 == 0) {
            return 0;
        }
        View view = m0Var.i(0, Long.MAX_VALUE).f13248a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // v0.AbstractC1397f0
    public final int o(r0 r0Var) {
        return 0;
    }

    @Override // v0.AbstractC1397f0
    public final void o0(int i6) {
    }

    @Override // v0.AbstractC1397f0
    public final int p0(int i6, m0 m0Var, r0 r0Var) {
        if (!e() || v() == 0 || i6 == 0) {
            return 0;
        }
        View view = m0Var.i(0, Long.MAX_VALUE).f13248a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // v0.AbstractC1397f0
    public final g0 r() {
        return new g0(-2, -2);
    }

    @Override // v0.AbstractC1397f0
    public final void y(Rect rect, View view) {
        super.y(rect, view);
        rect.centerY();
        if (F0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // v0.AbstractC1397f0
    public final void y0(RecyclerView recyclerView, int i6) {
        S s5 = new S(this, recyclerView.getContext(), 1);
        s5.f13040a = i6;
        z0(s5);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [B2.a] */
    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        new b();
        final int i8 = 0;
        this.f7145r = new View.OnLayoutChangeListener(this) { // from class: B2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselLayoutManager f80b;

            {
                this.f80b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i72, int i82, int i9, int i10, int i11, int i12, int i13, int i14) {
                int i15 = i8;
                int i16 = 13;
                CarouselLayoutManager carouselLayoutManager = this.f80b;
                carouselLayoutManager.getClass();
                switch (i15) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        if (i72 != i11 || i82 != i12 || i9 != i13 || i10 != i14) {
                            view.post(new RunnableC0632m(i16, carouselLayoutManager));
                        }
                        break;
                    default:
                        if (i72 != i11 || i82 != i12 || i9 != i13 || i10 != i14) {
                            view.post(new RunnableC0632m(i16, carouselLayoutManager));
                        }
                        break;
                }
            }
        };
        this.f7143p = new g();
        m0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12452f);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m0();
            H0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
