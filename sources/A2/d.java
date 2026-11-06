package A2;

import G1.m;
import N.V;
import P2.g;
import P2.i;
import P2.j;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.measurement.C0396c2;
import com.google.android.material.card.MaterialCardView;
import com.xo.anilab.R;
import java.util.WeakHashMap;
import r.C1267a;
import r2.AbstractC1274a;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final double f9y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f10z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f11a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f13c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f14d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f19i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f20j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f21k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f22l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f23m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f24n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RippleDrawable f25o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f26p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f27q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f29s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f30t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f31u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f32v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f33w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f12b = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f28r = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f34x = 0.0f;

    static {
        f10z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public d(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f11a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f13c = gVar;
        gVar.k(materialCardView.getContext());
        gVar.p();
        m mVarE = gVar.f2457w.f2417a.e();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC1274a.f12451e, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
            mVarE.f812e = new P2.a(dimension);
            mVarE.f813f = new P2.a(dimension);
            mVarE.f814g = new P2.a(dimension);
            mVarE.f815h = new P2.a(dimension);
        }
        this.f14d = new g();
        h(mVarE.a());
        this.f31u = Y2.b.A(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1301a.f12617a);
        this.f32v = Y2.b.z(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f33w = Y2.b.z(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(com.bumptech.glide.d dVar, float f6) {
        if (dVar instanceof i) {
            return (float) ((1.0d - f9y) * ((double) f6));
        }
        if (dVar instanceof P2.d) {
            return f6 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        com.bumptech.glide.d dVar = this.f23m.f2462a;
        g gVar = this.f13c;
        return Math.max(Math.max(b(dVar, gVar.i()), b(this.f23m.f2463b, gVar.f2457w.f2417a.f2467f.a(gVar.h()))), Math.max(b(this.f23m.f2464c, gVar.f2457w.f2417a.f2468g.a(gVar.h())), b(this.f23m.f2465d, gVar.f2457w.f2417a.f2469h.a(gVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f25o == null) {
            int[] iArr = N2.a.f2112a;
            this.f27q = new g(this.f23m);
            this.f25o = new RippleDrawable(this.f21k, null, this.f27q);
        }
        if (this.f26p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f25o, this.f14d, this.f20j});
            this.f26p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f26p;
    }

    public final c d(Drawable drawable) {
        int iCeil;
        int i6;
        if (this.f11a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i6 = iCeil2;
        } else {
            iCeil = 0;
            i6 = 0;
        }
        return new c(drawable, iCeil, i6, iCeil, i6);
    }

    public final void e(int i6, int i7) {
        int iCeil;
        int iCeil2;
        int i8;
        int i9;
        if (this.f26p != null) {
            MaterialCardView materialCardView = this.f11a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i10 = this.f17g;
            int i11 = (i10 & 8388613) == 8388613 ? ((i6 - this.f15e) - this.f16f) - iCeil2 : this.f15e;
            int i12 = (i10 & 80) == 80 ? this.f15e : ((i7 - this.f15e) - this.f16f) - iCeil;
            int i13 = (i10 & 8388613) == 8388613 ? this.f15e : ((i6 - this.f15e) - this.f16f) - iCeil2;
            int i14 = (i10 & 80) == 80 ? ((i7 - this.f15e) - this.f16f) - iCeil : this.f15e;
            WeakHashMap weakHashMap = V.f1964a;
            if (materialCardView.getLayoutDirection() == 1) {
                i9 = i13;
                i8 = i11;
            } else {
                i8 = i13;
                i9 = i11;
            }
            this.f26p.setLayerInset(2, i9, i14, i8, i12);
        }
    }

    public final void f(boolean z5, boolean z6) {
        Drawable drawable = this.f20j;
        if (drawable != null) {
            if (!z6) {
                drawable.setAlpha(z5 ? 255 : 0);
                this.f34x = z5 ? 1.0f : 0.0f;
                return;
            }
            float f6 = z5 ? 1.0f : 0.0f;
            float f7 = z5 ? 1.0f - this.f34x : this.f34x;
            ValueAnimator valueAnimator = this.f30t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f30t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f34x, f6);
            this.f30t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new b(0, this));
            this.f30t.setInterpolator(this.f31u);
            this.f30t.setDuration((long) ((z5 ? this.f32v : this.f33w) * f7));
            this.f30t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f20j = drawableMutate;
            H.a.h(drawableMutate, this.f22l);
            f(this.f11a.f7141F, false);
        } else {
            this.f20j = f10z;
        }
        LayerDrawable layerDrawable = this.f26p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f20j);
        }
    }

    public final void h(j jVar) {
        this.f23m = jVar;
        g gVar = this.f13c;
        gVar.setShapeAppearanceModel(jVar);
        gVar.f2456R = !gVar.l();
        g gVar2 = this.f14d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(jVar);
        }
        g gVar3 = this.f27q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(jVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f11a;
        return materialCardView.getPreventCornerOverlap() && this.f13c.l() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f11a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f19i;
        Drawable drawableC = j() ? c() : this.f14d;
        this.f19i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f11a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f11a;
        float cardViewRadius = 0.0f;
        float fA = ((materialCardView.getPreventCornerOverlap() && !this.f13c.l()) || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f9y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i6 = (int) (fA - cardViewRadius);
        Rect rect = this.f12b;
        materialCardView.f12405y.set(rect.left + i6, rect.top + i6, rect.right + i6, rect.bottom + i6);
        C0396c2 c0396c2 = materialCardView.f12402A;
        if (!((C1267a) c0396c2.f6776y).getUseCompatPadding()) {
            c0396c2.Q(0, 0, 0, 0);
            return;
        }
        r.b bVar = (r.b) ((Drawable) c0396c2.f6775x);
        float f6 = bVar.f12411e;
        float f7 = bVar.f12407a;
        int iCeil = (int) Math.ceil(r.c.a(f6, f7, c0396c2.H()));
        int iCeil2 = (int) Math.ceil(r.c.b(f6, f7, c0396c2.H()));
        c0396c2.Q(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void m() {
        boolean z5 = this.f28r;
        MaterialCardView materialCardView = this.f11a;
        if (!z5) {
            materialCardView.setBackgroundInternal(d(this.f13c));
        }
        materialCardView.setForeground(d(this.f19i));
    }
}
