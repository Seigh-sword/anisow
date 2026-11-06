package H2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import m.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends C0 {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Drawable f1030L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Rect f1031M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Rect f1032N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f1033O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f1034P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f1035Q;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1031M = new Rect();
        this.f1032N = new Rect();
        this.f1033O = 119;
        this.f1034P = true;
        this.f1035Q = false;
        int[] iArr = AbstractC1274a.f12458l;
        m.a(context, attributeSet, 0, 0);
        m.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f1033O = typedArrayObtainStyledAttributes.getInt(1, this.f1033O);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1034P = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1030L;
        if (drawable != null) {
            if (this.f1035Q) {
                this.f1035Q = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z5 = this.f1034P;
                Rect rect = this.f1031M;
                if (z5) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i6 = this.f1033O;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f1032N;
                Gravity.apply(i6, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f6, float f7) {
        super.drawableHotspotChanged(f6, f7);
        Drawable drawable = this.f1030L;
        if (drawable != null) {
            drawable.setHotspot(f6, f7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1030L;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1030L.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1030L;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1033O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1030L;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // m.C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        this.f1035Q = z5 | this.f1035Q;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        this.f1035Q = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1030L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1030L);
            }
            this.f1030L = drawable;
            this.f1035Q = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1033O == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i6) {
        if (this.f1033O != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            this.f1033O = i6;
            if (i6 == 119 && this.f1030L != null) {
                this.f1030L.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1030L;
    }
}
