package r;

import B3.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.C0396c2;
import q.AbstractC1255a;

/* JADX INFO: renamed from: r.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1267a extends FrameLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f12400B = {R.attr.colorBackground};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final e f12401C = new e();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0396c2 f12402A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12403w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f12405y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f12406z;

    public C1267a(Context context, AttributeSet attributeSet, int i6) {
        Resources resources;
        int i7;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i6);
        Rect rect = new Rect();
        this.f12405y = rect;
        this.f12406z = new Rect();
        C0396c2 c0396c2 = new C0396c2(this);
        this.f12402A = c0396c2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1255a.f12329a, i6, com.xo.anilab.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f12400B);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i7 = com.xo.anilab.R.color.cardview_light_background;
            } else {
                resources = getResources();
                i7 = com.xo.anilab.R.color.cardview_dark_background;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(i7));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f12403w = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f12404x = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        e eVar = f12401C;
        b bVar = new b(dimension, colorStateListValueOf);
        c0396c2.f6775x = bVar;
        ((C1267a) c0396c2.f6776y).setBackgroundDrawable(bVar);
        C1267a c1267a = (C1267a) c0396c2.f6776y;
        c1267a.setClipToOutline(true);
        c1267a.setElevation(dimension2);
        eVar.C(c0396c2, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return e.q(this.f12402A).f12414h;
    }

    public float getCardElevation() {
        return ((C1267a) this.f12402A.f6776y).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f12405y.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f12405y.left;
    }

    public int getContentPaddingRight() {
        return this.f12405y.right;
    }

    public int getContentPaddingTop() {
        return this.f12405y.top;
    }

    public float getMaxCardElevation() {
        return e.q(this.f12402A).f12411e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f12404x;
    }

    public float getRadius() {
        return e.q(this.f12402A).f12407a;
    }

    public boolean getUseCompatPadding() {
        return this.f12403w;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
    }

    public void setCardBackgroundColor(int i6) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i6);
        b bVarQ = e.q(this.f12402A);
        if (colorStateListValueOf == null) {
            bVarQ.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        bVarQ.f12414h = colorStateListValueOf;
        bVarQ.f12408b.setColor(colorStateListValueOf.getColorForState(bVarQ.getState(), bVarQ.f12414h.getDefaultColor()));
        bVarQ.invalidateSelf();
    }

    public void setCardElevation(float f6) {
        ((C1267a) this.f12402A.f6776y).setElevation(f6);
    }

    public void setMaxCardElevation(float f6) {
        f12401C.C(this.f12402A, f6);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i6) {
        super.setMinimumHeight(i6);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i6) {
        super.setMinimumWidth(i6);
    }

    public void setPreventCornerOverlap(boolean z5) {
        if (z5 != this.f12404x) {
            this.f12404x = z5;
            e eVar = f12401C;
            C0396c2 c0396c2 = this.f12402A;
            eVar.C(c0396c2, e.q(c0396c2).f12411e);
        }
    }

    public void setRadius(float f6) {
        b bVarQ = e.q(this.f12402A);
        if (f6 == bVarQ.f12407a) {
            return;
        }
        bVarQ.f12407a = f6;
        bVarQ.b(null);
        bVarQ.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z5) {
        if (this.f12403w != z5) {
            this.f12403w = z5;
            e eVar = f12401C;
            C0396c2 c0396c2 = this.f12402A;
            eVar.C(c0396c2, e.q(c0396c2).f12411e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVarQ = e.q(this.f12402A);
        if (colorStateList == null) {
            bVarQ.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVarQ.f12414h = colorStateList;
        bVarQ.f12408b.setColor(colorStateList.getColorForState(bVarQ.getState(), bVarQ.f12414h.getDefaultColor()));
        bVarQ.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i6, int i7, int i8, int i9) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i6, int i7, int i8, int i9) {
    }
}
