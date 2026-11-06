package r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f12408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f12409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f12410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12411e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f12414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f12415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f12416j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12412f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12413g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f12417k = PorterDuff.Mode.SRC_IN;

    public b(float f6, ColorStateList colorStateList) {
        this.f12407a = f6;
        Paint paint = new Paint(5);
        this.f12408b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f12414h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f12414h.getDefaultColor()));
        this.f12409c = new RectF();
        this.f12410d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f12409c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f12410d;
        rect2.set(rect);
        if (this.f12412f) {
            rect2.inset((int) Math.ceil(c.a(this.f12411e, this.f12407a, this.f12413g)), (int) Math.ceil(c.b(this.f12411e, this.f12407a, this.f12413g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z5;
        Paint paint = this.f12408b;
        if (this.f12415i == null || paint.getColorFilter() != null) {
            z5 = false;
        } else {
            paint.setColorFilter(this.f12415i);
            z5 = true;
        }
        RectF rectF = this.f12409c;
        float f6 = this.f12407a;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (z5) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f12410d, this.f12407a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f12416j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f12414h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f12414h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f12408b;
        boolean z5 = colorForState != paint.getColor();
        if (z5) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f12416j;
        if (colorStateList2 == null || (mode = this.f12417k) == null) {
            return z5;
        }
        this.f12415i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f12408b.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f12408b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f12416j = colorStateList;
        this.f12415i = a(colorStateList, this.f12417k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f12417k = mode;
        this.f12415i = a(this.f12416j, mode);
        invalidateSelf();
    }
}
