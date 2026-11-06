package P2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import m2.C0;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements u {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Paint f2438S;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f2439A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Matrix f2440B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Path f2441C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Path f2442D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final RectF f2443E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final RectF f2444F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Region f2445G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Region f2446H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public j f2447I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Paint f2448J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Paint f2449K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final O2.a f2450L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C1243i f2451M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final l f2452N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public PorterDuffColorFilter f2453O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public PorterDuffColorFilter f2454P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final RectF f2455Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f2456R;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f2457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s[] f2458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s[] f2459y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final BitSet f2460z;

    static {
        Paint paint = new Paint(1);
        f2438S = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public final void b(RectF rectF, Path path) {
        f fVar = this.f2457w;
        this.f2452N.a(fVar.f2417a, fVar.f2426j, rectF, this.f2451M, path);
        if (this.f2457w.f2425i != 1.0f) {
            Matrix matrix = this.f2440B;
            matrix.reset();
            float f6 = this.f2457w.f2425i;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f2455Q, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z5) {
        int color;
        int iD;
        if (colorStateList == null || mode == null) {
            return (!z5 || (iD = d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z5) {
            colorForState = d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i6) {
        int i7;
        f fVar = this.f2457w;
        float f6 = fVar.f2430n + fVar.f2431o + fVar.f2429m;
        G2.a aVar = fVar.f2418b;
        if (aVar == null || !aVar.f863a || G.a.d(i6, 255) != aVar.f866d) {
            return i6;
        }
        float fMin = (aVar.f867e <= 0.0f || f6 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f6 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i6);
        int iL = C0.l(fMin, G.a.d(i6, 255), aVar.f864b);
        if (fMin > 0.0f && (i7 = aVar.f865c) != 0) {
            iL = G.a.b(G.a.d(i7, G2.a.f862f), iL);
        }
        return G.a.d(iL, iAlpha);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.g.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f2460z.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i6 = this.f2457w.f2434r;
        Path path = this.f2441C;
        O2.a aVar = this.f2450L;
        if (i6 != 0) {
            canvas.drawPath(path, aVar.f2317a);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            s sVar = this.f2458x[i7];
            int i8 = this.f2457w.f2433q;
            Matrix matrix = s.f2503b;
            sVar.a(matrix, aVar, i8, canvas);
            this.f2459y[i7].a(matrix, aVar, this.f2457w.f2433q, canvas);
        }
        if (this.f2456R) {
            int iSin = (int) (Math.sin(Math.toRadians(r0.f2435s)) * ((double) this.f2457w.f2434r));
            int iCos = (int) (Math.cos(Math.toRadians(r2.f2435s)) * ((double) this.f2457w.f2434r));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f2438S);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (!jVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = jVar.f2467f.a(rectF) * this.f2457w.f2426j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.f2449K;
        Path path = this.f2442D;
        j jVar = this.f2447I;
        RectF rectF = this.f2444F;
        rectF.set(h());
        float strokeWidth = j() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, jVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2457w.f2428l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2457w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f2457w.f2432p == 2) {
            return;
        }
        if (l()) {
            outline.setRoundRect(getBounds(), i() * this.f2457w.f2426j);
            return;
        }
        RectF rectFH = h();
        Path path = this.f2441C;
        b(rectFH, path);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            F2.c.a(outline, path);
            return;
        }
        if (i6 >= 29) {
            try {
                F2.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            F2.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2457w.f2424h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f2445G;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.f2441C;
        b(rectFH, path);
        Region region2 = this.f2446H;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.f2443E;
        rectF.set(getBounds());
        return rectF;
    }

    public final float i() {
        return this.f2457w.f2417a.f2466e.a(h());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f2439A = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f2457w.f2422f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f2457w.f2421e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f2457w.f2420d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f2457w.f2419c) != null && colorStateList4.isStateful())));
    }

    public final boolean j() {
        Paint.Style style = this.f2457w.f2437u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2449K.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.f2457w.f2418b = new G2.a(context);
        s();
    }

    public final boolean l() {
        return this.f2457w.f2417a.d(h());
    }

    public final void m(float f6) {
        f fVar = this.f2457w;
        if (fVar.f2430n != f6) {
            fVar.f2430n = f6;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2457w = new f(this.f2457w);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        f fVar = this.f2457w;
        if (fVar.f2419c != colorStateList) {
            fVar.f2419c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(float f6) {
        f fVar = this.f2457w;
        if (fVar.f2426j != f6) {
            fVar.f2426j = f6;
            this.f2439A = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2439A = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, H2.i
    public boolean onStateChange(int[] iArr) {
        boolean z5 = q(iArr) || r();
        if (z5) {
            invalidateSelf();
        }
        return z5;
    }

    public final void p() {
        this.f2450L.a(-12303292);
        this.f2457w.f2436t = false;
        super.invalidateSelf();
    }

    public final boolean q(int[] iArr) {
        boolean z5;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2457w.f2419c == null || color2 == (colorForState2 = this.f2457w.f2419c.getColorForState(iArr, (color2 = (paint2 = this.f2448J).getColor())))) {
            z5 = false;
        } else {
            paint2.setColor(colorForState2);
            z5 = true;
        }
        if (this.f2457w.f2420d == null || color == (colorForState = this.f2457w.f2420d.getColorForState(iArr, (color = (paint = this.f2449K).getColor())))) {
            return z5;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter = this.f2453O;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2454P;
        f fVar = this.f2457w;
        this.f2453O = c(fVar.f2422f, fVar.f2423g, this.f2448J, true);
        f fVar2 = this.f2457w;
        this.f2454P = c(fVar2.f2421e, fVar2.f2423g, this.f2449K, false);
        f fVar3 = this.f2457w;
        if (fVar3.f2436t) {
            this.f2450L.a(fVar3.f2422f.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.f2453O) && Objects.equals(porterDuffColorFilter2, this.f2454P)) ? false : true;
    }

    public final void s() {
        f fVar = this.f2457w;
        float f6 = fVar.f2430n + fVar.f2431o;
        fVar.f2433q = (int) Math.ceil(0.75f * f6);
        this.f2457w.f2434r = (int) Math.ceil(f6 * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        f fVar = this.f2457w;
        if (fVar.f2428l != i6) {
            fVar.f2428l = i6;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2457w.getClass();
        super.invalidateSelf();
    }

    @Override // P2.u
    public final void setShapeAppearanceModel(j jVar) {
        this.f2457w.f2417a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2457w.f2422f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f2457w;
        if (fVar.f2423g != mode) {
            fVar.f2423g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public g(f fVar) {
        this.f2458x = new s[4];
        this.f2459y = new s[4];
        this.f2460z = new BitSet(8);
        this.f2440B = new Matrix();
        this.f2441C = new Path();
        this.f2442D = new Path();
        this.f2443E = new RectF();
        this.f2444F = new RectF();
        this.f2445G = new Region();
        this.f2446H = new Region();
        Paint paint = new Paint(1);
        this.f2448J = paint;
        Paint paint2 = new Paint(1);
        this.f2449K = paint2;
        this.f2450L = new O2.a();
        this.f2452N = Looper.getMainLooper().getThread() == Thread.currentThread() ? k.f2474a : new l();
        this.f2455Q = new RectF();
        this.f2456R = true;
        this.f2457w = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        q(getState());
        this.f2451M = new C1243i(16, this);
    }

    public g(j jVar) {
        this(new f(jVar));
    }

    public g(Context context, AttributeSet attributeSet, int i6, int i7) {
        this(j.b(context, attributeSet, i6, i7).a());
    }
}
