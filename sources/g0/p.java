package G0;

import M4.B;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C1280b;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final PorterDuff.Mode f741F = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f742A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f743B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float[] f744C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Matrix f745D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f746E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n f747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PorterDuffColorFilter f748y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorFilter f749z;

    public p() {
        this.f743B = true;
        this.f744C = new float[9];
        this.f745D = new Matrix();
        this.f746E = new Rect();
        n nVar = new n();
        nVar.f730c = null;
        nVar.f731d = f741F;
        nVar.f729b = new m();
        this.f747x = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f684w;
        if (drawable == null) {
            return false;
        }
        H.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f746E;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f749z;
        if (colorFilter == null) {
            colorFilter = this.f748y;
        }
        Matrix matrix = this.f745D;
        canvas.getMatrix(matrix);
        float[] fArr = this.f744C;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && H.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f747x;
        Bitmap bitmap = nVar.f733f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f733f.getHeight()) {
            nVar.f733f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.f738k = true;
        }
        if (this.f743B) {
            n nVar2 = this.f747x;
            if (nVar2.f738k || nVar2.f734g != nVar2.f730c || nVar2.f735h != nVar2.f731d || nVar2.f737j != nVar2.f732e || nVar2.f736i != nVar2.f729b.getRootAlpha()) {
                n nVar3 = this.f747x;
                nVar3.f733f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f733f);
                m mVar = nVar3.f729b;
                mVar.a(mVar.f719g, m.f712p, canvas2, iMin, iMin2);
                n nVar4 = this.f747x;
                nVar4.f734g = nVar4.f730c;
                nVar4.f735h = nVar4.f731d;
                nVar4.f736i = nVar4.f729b.getRootAlpha();
                nVar4.f737j = nVar4.f732e;
                nVar4.f738k = false;
            }
        } else {
            n nVar5 = this.f747x;
            nVar5.f733f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f733f);
            m mVar2 = nVar5.f729b;
            mVar2.a(mVar2.f719g, m.f712p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f747x;
        if (nVar6.f729b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f739l == null) {
                Paint paint2 = new Paint();
                nVar6.f739l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f739l.setAlpha(nVar6.f729b.getRootAlpha());
            nVar6.f739l.setColorFilter(colorFilter);
            paint = nVar6.f739l;
        }
        canvas.drawBitmap(nVar6.f733f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getAlpha() : this.f747x.f729b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f747x.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f684w;
        return drawable != null ? H.a.c(drawable) : this.f749z;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f684w != null) {
            return new o(this.f684w.getConstantState());
        }
        this.f747x.f728a = getChangingConfigurations();
        return this.f747x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f747x.f729b.f721i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f747x.f729b.f720h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.isAutoMirrored() : this.f747x.f732e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f684w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f747x;
            if (nVar != null) {
                m mVar = nVar.f729b;
                if (mVar.f726n == null) {
                    mVar.f726n = Boolean.valueOf(mVar.f719g.a());
                }
                if (mVar.f726n.booleanValue() || ((colorStateList = this.f747x.f730c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f742A && super.mutate() == this) {
            n nVar = this.f747x;
            n nVar2 = new n();
            nVar2.f730c = null;
            nVar2.f731d = f741F;
            if (nVar != null) {
                nVar2.f728a = nVar.f728a;
                m mVar = new m(nVar.f729b);
                nVar2.f729b = mVar;
                if (nVar.f729b.f717e != null) {
                    mVar.f717e = new Paint(nVar.f729b.f717e);
                }
                if (nVar.f729b.f716d != null) {
                    nVar2.f729b.f716d = new Paint(nVar.f729b.f716d);
                }
                nVar2.f730c = nVar.f730c;
                nVar2.f731d = nVar.f731d;
                nVar2.f732e = nVar.f732e;
            }
            this.f747x = nVar2;
            this.f742A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f684w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f747x;
        ColorStateList colorStateList = nVar.f730c;
        if (colorStateList == null || (mode = nVar.f731d) == null) {
            z5 = false;
        } else {
            this.f748y = a(colorStateList, mode);
            invalidateSelf();
            z5 = true;
        }
        m mVar = nVar.f729b;
        if (mVar.f726n == null) {
            mVar.f726n = Boolean.valueOf(mVar.f719g.a());
        }
        if (mVar.f726n.booleanValue()) {
            boolean zB = nVar.f729b.f719g.b(iArr);
            nVar.f738k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else if (this.f747x.f729b.getRootAlpha() != i6) {
            this.f747x.f729b.setRootAlpha(i6);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setAutoMirrored(z5);
        } else {
            this.f747x.f732e = z5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f749z = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            B.n(drawable, i6);
        } else {
            setTintList(ColorStateList.valueOf(i6));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f747x;
        if (nVar.f730c != colorStateList) {
            nVar.f730c = colorStateList;
            this.f748y = a(colorStateList, nVar.f731d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            H.a.i(drawable, mode);
            return;
        }
        n nVar = this.f747x;
        if (nVar.f731d != mode) {
            nVar.f731d = mode;
            this.f748y = a(nVar.f730c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.setVisible(z5, z6) : super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        m mVar;
        int i6;
        boolean z5;
        char c6;
        int i7;
        Drawable drawable = this.f684w;
        if (drawable != null) {
            H.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f747x;
        nVar.f729b = new m();
        TypedArray typedArrayX = com.bumptech.glide.c.x(resources, theme, attributeSet, a.f666a);
        n nVar2 = this.f747x;
        m mVar2 = nVar2.f729b;
        int i8 = !com.bumptech.glide.c.w(xmlPullParser, "tintMode") ? -1 : typedArrayX.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i9 = 3;
        if (i8 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i8 != 5) {
            if (i8 != 9) {
                switch (i8) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f731d = mode;
        int i10 = 1;
        ColorStateList colorStateListA = null;
        boolean z6 = false;
        if (com.bumptech.glide.c.w(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayX.getValue(1, typedValue);
            int i11 = typedValue.type;
            if (i11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i11 < 28 || i11 > 31) {
                Resources resources2 = typedArrayX.getResources();
                int resourceId = typedArrayX.getResourceId(1, 0);
                ThreadLocal threadLocal = F.c.f431a;
                try {
                    colorStateListA = F.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e6) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e6);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            nVar2.f730c = colorStateList;
        }
        boolean z7 = nVar2.f732e;
        if (com.bumptech.glide.c.w(xmlPullParser, "autoMirrored")) {
            z7 = typedArrayX.getBoolean(5, z7);
        }
        nVar2.f732e = z7;
        float f6 = mVar2.f722j;
        if (com.bumptech.glide.c.w(xmlPullParser, "viewportWidth")) {
            f6 = typedArrayX.getFloat(7, f6);
        }
        mVar2.f722j = f6;
        float f7 = mVar2.f723k;
        if (com.bumptech.glide.c.w(xmlPullParser, "viewportHeight")) {
            f7 = typedArrayX.getFloat(8, f7);
        }
        mVar2.f723k = f7;
        if (mVar2.f722j <= 0.0f) {
            throw new XmlPullParserException(typedArrayX.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f7 <= 0.0f) {
            throw new XmlPullParserException(typedArrayX.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        mVar2.f720h = typedArrayX.getDimension(3, mVar2.f720h);
        float dimension = typedArrayX.getDimension(2, mVar2.f721i);
        mVar2.f721i = dimension;
        if (mVar2.f720h <= 0.0f) {
            throw new XmlPullParserException(typedArrayX.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayX.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = mVar2.getAlpha();
        if (com.bumptech.glide.c.w(xmlPullParser, "alpha")) {
            alpha = typedArrayX.getFloat(4, alpha);
        }
        mVar2.setAlpha(alpha);
        String string = typedArrayX.getString(0);
        if (string != null) {
            mVar2.f725m = string;
            mVar2.f727o.put(string, mVar2);
        }
        typedArrayX.recycle();
        nVar.f728a = getChangingConfigurations();
        nVar.f738k = true;
        n nVar3 = this.f747x;
        m mVar3 = nVar3.f729b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(mVar3.f719g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z8 = true;
        while (eventType != i10 && (xmlPullParser.getDepth() >= depth || eventType != i9)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                j jVar = (j) arrayDeque.peek();
                boolean zEquals = "path".equals(name);
                C1280b c1280b = mVar3.f727o;
                mVar = mVar3;
                if (zEquals) {
                    i iVar = new i();
                    iVar.f686f = 0.0f;
                    iVar.f688h = 1.0f;
                    iVar.f689i = 1.0f;
                    iVar.f690j = 0.0f;
                    iVar.f691k = 1.0f;
                    iVar.f692l = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    iVar.f693m = cap;
                    Paint.Join join = Paint.Join.MITER;
                    iVar.f694n = join;
                    i6 = depth;
                    iVar.f695o = 4.0f;
                    TypedArray typedArrayX2 = com.bumptech.glide.c.x(resources, theme, attributeSet, a.f668c);
                    if (com.bumptech.glide.c.w(xmlPullParser, "pathData")) {
                        String string2 = typedArrayX2.getString(0);
                        if (string2 != null) {
                            iVar.f709b = string2;
                        }
                        String string3 = typedArrayX2.getString(2);
                        if (string3 != null) {
                            iVar.f708a = com.bumptech.glide.d.j(string3);
                        }
                        iVar.f687g = com.bumptech.glide.c.t(typedArrayX2, xmlPullParser, theme, "fillColor", 1);
                        float f8 = iVar.f689i;
                        if (com.bumptech.glide.c.w(xmlPullParser, "fillAlpha")) {
                            f8 = typedArrayX2.getFloat(12, f8);
                        }
                        iVar.f689i = f8;
                        int i12 = !com.bumptech.glide.c.w(xmlPullParser, "strokeLineCap") ? -1 : typedArrayX2.getInt(8, -1);
                        iVar.f693m = i12 != 0 ? i12 != 1 ? i12 != 2 ? iVar.f693m : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i13 = !com.bumptech.glide.c.w(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayX2.getInt(9, -1);
                        Paint.Join join2 = iVar.f694n;
                        if (i13 != 0) {
                            join = i13 != 1 ? i13 != 2 ? join2 : Paint.Join.BEVEL : Paint.Join.ROUND;
                        }
                        iVar.f694n = join;
                        float f9 = iVar.f695o;
                        if (com.bumptech.glide.c.w(xmlPullParser, "strokeMiterLimit")) {
                            f9 = typedArrayX2.getFloat(10, f9);
                        }
                        iVar.f695o = f9;
                        iVar.f685e = com.bumptech.glide.c.t(typedArrayX2, xmlPullParser, theme, "strokeColor", 3);
                        float f10 = iVar.f688h;
                        if (com.bumptech.glide.c.w(xmlPullParser, "strokeAlpha")) {
                            f10 = typedArrayX2.getFloat(11, f10);
                        }
                        iVar.f688h = f10;
                        float f11 = iVar.f686f;
                        if (com.bumptech.glide.c.w(xmlPullParser, "strokeWidth")) {
                            f11 = typedArrayX2.getFloat(4, f11);
                        }
                        iVar.f686f = f11;
                        float f12 = iVar.f691k;
                        if (com.bumptech.glide.c.w(xmlPullParser, "trimPathEnd")) {
                            f12 = typedArrayX2.getFloat(6, f12);
                        }
                        iVar.f691k = f12;
                        float f13 = iVar.f692l;
                        if (com.bumptech.glide.c.w(xmlPullParser, "trimPathOffset")) {
                            f13 = typedArrayX2.getFloat(7, f13);
                        }
                        iVar.f692l = f13;
                        float f14 = iVar.f690j;
                        if (com.bumptech.glide.c.w(xmlPullParser, "trimPathStart")) {
                            f14 = typedArrayX2.getFloat(5, f14);
                        }
                        iVar.f690j = f14;
                        int i14 = iVar.f710c;
                        if (com.bumptech.glide.c.w(xmlPullParser, "fillType")) {
                            i14 = typedArrayX2.getInt(13, i14);
                        }
                        iVar.f710c = i14;
                    }
                    typedArrayX2.recycle();
                    jVar.f697b.add(iVar);
                    if (iVar.getPathName() != null) {
                        c1280b.put(iVar.getPathName(), iVar);
                    }
                    nVar3.f728a |= iVar.f711d;
                    z5 = false;
                    c6 = '\b';
                    z8 = false;
                } else {
                    i6 = depth;
                    c6 = '\b';
                    if ("clip-path".equals(name)) {
                        h hVar = new h();
                        if (com.bumptech.glide.c.w(xmlPullParser, "pathData")) {
                            TypedArray typedArrayX3 = com.bumptech.glide.c.x(resources, theme, attributeSet, a.f669d);
                            String string4 = typedArrayX3.getString(0);
                            if (string4 != null) {
                                hVar.f709b = string4;
                            }
                            String string5 = typedArrayX3.getString(1);
                            if (string5 != null) {
                                hVar.f708a = com.bumptech.glide.d.j(string5);
                            }
                            hVar.f710c = !com.bumptech.glide.c.w(xmlPullParser, "fillType") ? 0 : typedArrayX3.getInt(2, 0);
                            typedArrayX3.recycle();
                        }
                        jVar.f697b.add(hVar);
                        if (hVar.getPathName() != null) {
                            c1280b.put(hVar.getPathName(), hVar);
                        }
                        nVar3.f728a |= hVar.f711d;
                    } else if ("group".equals(name)) {
                        j jVar2 = new j();
                        TypedArray typedArrayX4 = com.bumptech.glide.c.x(resources, theme, attributeSet, a.f667b);
                        float f15 = jVar2.f698c;
                        if (com.bumptech.glide.c.w(xmlPullParser, "rotation")) {
                            f15 = typedArrayX4.getFloat(5, f15);
                        }
                        jVar2.f698c = f15;
                        jVar2.f699d = typedArrayX4.getFloat(1, jVar2.f699d);
                        jVar2.f700e = typedArrayX4.getFloat(2, jVar2.f700e);
                        float f16 = jVar2.f701f;
                        if (com.bumptech.glide.c.w(xmlPullParser, "scaleX")) {
                            f16 = typedArrayX4.getFloat(3, f16);
                        }
                        jVar2.f701f = f16;
                        float f17 = jVar2.f702g;
                        if (com.bumptech.glide.c.w(xmlPullParser, "scaleY")) {
                            f17 = typedArrayX4.getFloat(4, f17);
                        }
                        jVar2.f702g = f17;
                        float f18 = jVar2.f703h;
                        if (com.bumptech.glide.c.w(xmlPullParser, "translateX")) {
                            f18 = typedArrayX4.getFloat(6, f18);
                        }
                        jVar2.f703h = f18;
                        float f19 = jVar2.f704i;
                        if (com.bumptech.glide.c.w(xmlPullParser, "translateY")) {
                            f19 = typedArrayX4.getFloat(7, f19);
                        }
                        jVar2.f704i = f19;
                        z5 = false;
                        String string6 = typedArrayX4.getString(0);
                        if (string6 != null) {
                            jVar2.f707l = string6;
                        }
                        jVar2.c();
                        typedArrayX4.recycle();
                        jVar.f697b.add(jVar2);
                        arrayDeque.push(jVar2);
                        if (jVar2.getGroupName() != null) {
                            c1280b.put(jVar2.getGroupName(), jVar2);
                        }
                        nVar3.f728a = jVar2.f706k | nVar3.f728a;
                    }
                    z5 = false;
                }
                i9 = 3;
                i7 = 1;
            } else {
                mVar = mVar3;
                i6 = depth;
                z5 = z6;
                c6 = '\b';
                i7 = i10;
                i9 = 3;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i10 = i7;
            mVar3 = mVar;
            z6 = z5;
            depth = i6;
        }
        if (z8) {
            throw new XmlPullParserException("no path defined");
        }
        this.f748y = a(nVar.f730c, nVar.f731d);
    }

    public p(n nVar) {
        this.f743B = true;
        this.f744C = new float[9];
        this.f745D = new Matrix();
        this.f746E = new Rect();
        this.f747x = nVar;
        this.f748y = a(nVar.f730c, nVar.f731d);
    }
}
