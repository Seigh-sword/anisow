package z2;

import N.V;
import P2.f;
import P2.g;
import P2.j;
import P2.u;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.xo.anilab.R;
import java.util.WeakHashMap;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f14083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f14084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f14091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f14092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f14093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f14094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f14095m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14099q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f14101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14102t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14096n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14097o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14098p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14100r = true;

    public c(MaterialButton materialButton, j jVar) {
        this.f14083a = materialButton;
        this.f14084b = jVar;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f14101s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (u) (this.f14101s.getNumberOfLayers() > 2 ? this.f14101s.getDrawable(2) : this.f14101s.getDrawable(1));
    }

    public final g b(boolean z5) {
        RippleDrawable rippleDrawable = this.f14101s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f14101s.getDrawable(0)).getDrawable()).getDrawable(!z5 ? 1 : 0);
    }

    public final void c(j jVar) {
        this.f14084b = jVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(jVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(jVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void d(int i6, int i7) {
        WeakHashMap weakHashMap = V.f1964a;
        MaterialButton materialButton = this.f14083a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i8 = this.f14087e;
        int i9 = this.f14088f;
        this.f14088f = i7;
        this.f14087e = i6;
        if (!this.f14097o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i6) - i8, paddingEnd, (paddingBottom + i7) - i9);
    }

    public final void e() {
        g gVar = new g(this.f14084b);
        MaterialButton materialButton = this.f14083a;
        gVar.k(materialButton.getContext());
        H.a.h(gVar, this.f14092j);
        PorterDuff.Mode mode = this.f14091i;
        if (mode != null) {
            H.a.i(gVar, mode);
        }
        float f6 = this.f14090h;
        ColorStateList colorStateList = this.f14093k;
        gVar.f2457w.f2427k = f6;
        gVar.invalidateSelf();
        f fVar = gVar.f2457w;
        if (fVar.f2420d != colorStateList) {
            fVar.f2420d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f14084b);
        gVar2.setTint(0);
        float f7 = this.f14090h;
        int iF = this.f14096n ? C0.f(materialButton, R.attr.colorSurface) : 0;
        gVar2.f2457w.f2427k = f7;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iF);
        f fVar2 = gVar2.f2457w;
        if (fVar2.f2420d != colorStateListValueOf) {
            fVar2.f2420d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f14084b);
        this.f14095m = gVar3;
        H.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(N2.a.b(this.f14094l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f14085c, this.f14087e, this.f14086d, this.f14088f), this.f14095m);
        this.f14101s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.m(this.f14102t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f6 = this.f14090h;
            ColorStateList colorStateList = this.f14093k;
            gVarB.f2457w.f2427k = f6;
            gVarB.invalidateSelf();
            f fVar = gVarB.f2457w;
            if (fVar.f2420d != colorStateList) {
                fVar.f2420d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f7 = this.f14090h;
                int iF = this.f14096n ? C0.f(this.f14083a, R.attr.colorSurface) : 0;
                gVarB2.f2457w.f2427k = f7;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iF);
                f fVar2 = gVarB2.f2457w;
                if (fVar2.f2420d != colorStateListValueOf) {
                    fVar2.f2420d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}
