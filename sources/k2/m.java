package K2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1588f;

    @Override // K2.k
    public final void a(Canvas canvas, Paint paint, float f6, float f7, int i6, int i7, int i8) {
        c(canvas, paint, f6, f7, C0.a(i6, i7), i8, i8);
    }

    public final void c(Canvas canvas, Paint paint, float f6, float f7, int i6, int i7, int i8) {
        float fN = com.bumptech.glide.c.n(f6, 0.0f, 1.0f);
        float fN2 = com.bumptech.glide.c.n(f7, 0.0f, 1.0f);
        float fY = f2.h.y(1.0f - this.f1588f, 1.0f, fN);
        float fY2 = f2.h.y(1.0f - this.f1588f, 1.0f, fN2);
        int iN = (int) ((com.bumptech.glide.c.n(fY, 0.0f, 0.01f) * i7) / 0.01f);
        float fN3 = 1.0f - com.bumptech.glide.c.n(fY2, 0.99f, 1.0f);
        float f8 = this.f1584b;
        int i9 = (int) ((fY * f8) + iN);
        int i10 = (int) ((fY2 * f8) - ((int) ((fN3 * i8) / 0.01f)));
        float f9 = (-f8) / 2.0f;
        if (i9 <= i10) {
            float f10 = this.f1586d;
            float f11 = i9 + f10;
            float f12 = i10 - f10;
            float f13 = f10 * 2.0f;
            paint.setColor(i6);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f1585c);
            if (f11 >= f12) {
                d(canvas, paint, new PointF(f11 + f9, 0.0f), new PointF(f12 + f9, 0.0f), f13, this.f1585c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f1587e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f14 = f11 + f9;
            float f15 = f12 + f9;
            canvas.drawLine(f14, 0.0f, f15, 0.0f, paint);
            if (this.f1587e || this.f1586d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f11 > 0.0f) {
                d(canvas, paint, new PointF(f14, 0.0f), null, f13, this.f1585c);
            }
            if (f12 < this.f1584b) {
                d(canvas, paint, new PointF(f15, 0.0f), null, f13, this.f1585c);
            }
        }
    }

    public final void d(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f6, float f7) {
        float fMin = Math.min(f7, this.f1585c);
        float f8 = f6 / 2.0f;
        float fMin2 = Math.min(f8, (this.f1586d * fMin) / this.f1585c);
        RectF rectF = new RectF((-f6) / 2.0f, (-fMin) / 2.0f, f8, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }
}
