package D0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import j0.C0840b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Animatable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final LinearInterpolator f273C = new LinearInterpolator();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0840b f274D = new C0840b();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f275E = {-16777216};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f276A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f277B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f279x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Resources f280y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f281z;

    public e(Context context) {
        context.getClass();
        this.f280y = context.getResources();
        d dVar = new d();
        this.f278w = dVar;
        dVar.f260i = f275E;
        dVar.a(0);
        dVar.f259h = 2.5f;
        dVar.f253b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, 0, dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f273C);
        valueAnimatorOfFloat.addListener(new c(this, dVar));
        this.f281z = valueAnimatorOfFloat;
    }

    public static void d(float f6, d dVar) {
        int i6;
        if (f6 > 0.75f) {
            float f7 = (f6 - 0.75f) / 0.25f;
            int[] iArr = dVar.f260i;
            int i7 = dVar.f261j;
            int i8 = iArr[i7];
            int i9 = iArr[(i7 + 1) % iArr.length];
            i6 = ((((i8 >> 24) & 255) + ((int) ((((i9 >> 24) & 255) - r1) * f7))) << 24) | ((((i8 >> 16) & 255) + ((int) ((((i9 >> 16) & 255) - r3) * f7))) << 16) | ((((i8 >> 8) & 255) + ((int) ((((i9 >> 8) & 255) - r4) * f7))) << 8) | ((i8 & 255) + ((int) (f7 * ((i9 & 255) - r2))));
        } else {
            i6 = dVar.f260i[dVar.f261j];
        }
        dVar.f272u = i6;
    }

    public final void a(float f6, d dVar, boolean z5) {
        float interpolation;
        float interpolation2;
        if (this.f277B) {
            d(f6, dVar);
            float fFloor = (float) (Math.floor(dVar.f264m / 0.8f) + 1.0d);
            float f7 = dVar.f262k;
            float f8 = dVar.f263l;
            dVar.f256e = (((f8 - 0.01f) - f7) * f6) + f7;
            dVar.f257f = f8;
            float f9 = dVar.f264m;
            dVar.f258g = ((fFloor - f9) * f6) + f9;
            return;
        }
        if (f6 != 1.0f || z5) {
            float f10 = dVar.f264m;
            C0840b c0840b = f274D;
            if (f6 < 0.5f) {
                interpolation = dVar.f262k;
                interpolation2 = (c0840b.getInterpolation(f6 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f11 = dVar.f262k + 0.79f;
                interpolation = f11 - (((1.0f - c0840b.getInterpolation((f6 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f11;
            }
            float f12 = (0.20999998f * f6) + f10;
            float f13 = (f6 + this.f276A) * 216.0f;
            dVar.f256e = interpolation;
            dVar.f257f = interpolation2;
            dVar.f258g = f12;
            this.f279x = f13;
        }
    }

    public final void b(float f6, float f7, float f8, float f9) {
        float f10 = this.f280y.getDisplayMetrics().density;
        float f11 = f7 * f10;
        d dVar = this.f278w;
        dVar.f259h = f11;
        dVar.f253b.setStrokeWidth(f11);
        dVar.f268q = f6 * f10;
        dVar.a(0);
        dVar.f269r = (int) (f8 * f10);
        dVar.f270s = (int) (f9 * f10);
    }

    public final void c(int i6) {
        float f6;
        float f7;
        float f8;
        float f9;
        if (i6 == 0) {
            f6 = 12.0f;
            f7 = 6.0f;
            f8 = 11.0f;
            f9 = 3.0f;
        } else {
            f6 = 10.0f;
            f7 = 5.0f;
            f8 = 7.5f;
            f9 = 2.5f;
        }
        b(f8, f9, f6, f7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f279x, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f278w;
        RectF rectF = dVar.f252a;
        float f6 = dVar.f268q;
        float fMin = (dVar.f259h / 2.0f) + f6;
        if (f6 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f269r * dVar.f267p) / 2.0f, dVar.f259h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f7 = dVar.f256e;
        float f8 = dVar.f258g;
        float f9 = (f7 + f8) * 360.0f;
        float f10 = ((dVar.f257f + f8) * 360.0f) - f9;
        Paint paint = dVar.f253b;
        paint.setColor(dVar.f272u);
        paint.setAlpha(dVar.f271t);
        float f11 = dVar.f259h / 2.0f;
        rectF.inset(f11, f11);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f255d);
        float f12 = -f11;
        rectF.inset(f12, f12);
        canvas.drawArc(rectF, f9, f10, false, paint);
        if (dVar.f265n) {
            Path path = dVar.f266o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f266o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f13 = (dVar.f269r * dVar.f267p) / 2.0f;
            dVar.f266o.moveTo(0.0f, 0.0f);
            dVar.f266o.lineTo(dVar.f269r * dVar.f267p, 0.0f);
            Path path3 = dVar.f266o;
            float f14 = dVar.f269r;
            float f15 = dVar.f267p;
            path3.lineTo((f14 * f15) / 2.0f, dVar.f270s * f15);
            dVar.f266o.offset((rectF.centerX() + fMin2) - f13, (dVar.f259h / 2.0f) + rectF.centerY());
            dVar.f266o.close();
            Paint paint2 = dVar.f254c;
            paint2.setColor(dVar.f272u);
            paint2.setAlpha(dVar.f271t);
            canvas.save();
            canvas.rotate(f9 + f10, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f266o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f278w.f271t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f281z.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f278w.f271t = i6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f278w.f253b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator;
        long j6;
        this.f281z.cancel();
        d dVar = this.f278w;
        float f6 = dVar.f256e;
        dVar.f262k = f6;
        float f7 = dVar.f257f;
        dVar.f263l = f7;
        dVar.f264m = dVar.f258g;
        if (f7 != f6) {
            this.f277B = true;
            valueAnimator = this.f281z;
            j6 = 666;
        } else {
            dVar.a(0);
            dVar.f262k = 0.0f;
            dVar.f263l = 0.0f;
            dVar.f264m = 0.0f;
            dVar.f256e = 0.0f;
            dVar.f257f = 0.0f;
            dVar.f258g = 0.0f;
            valueAnimator = this.f281z;
            j6 = 1332;
        }
        valueAnimator.setDuration(j6);
        this.f281z.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f281z.cancel();
        this.f279x = 0.0f;
        d dVar = this.f278w;
        if (dVar.f265n) {
            dVar.f265n = false;
        }
        dVar.a(0);
        dVar.f262k = 0.0f;
        dVar.f263l = 0.0f;
        dVar.f264m = 0.0f;
        dVar.f256e = 0.0f;
        dVar.f257f = 0.0f;
        dVar.f258g = 0.0f;
        invalidateSelf();
    }
}
