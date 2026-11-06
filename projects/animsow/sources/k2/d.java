package K2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.Arrays;
import m2.C0;
import r2.AbstractC1274a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends ProgressBar {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f1539A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public a f1540B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f1541C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f1542D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final b f1543E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final b f1544F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final c f1545G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final c f1546H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f1547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f1550z;

    public d(Context context, AttributeSet attributeSet) {
        int iA;
        super(U2.a.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.linearProgressIndicatorStyle);
        this.f1541C = false;
        this.f1542D = 4;
        this.f1543E = new b(this, 0);
        this.f1544F = new b(this, 1);
        this.f1545G = new c(this, 0);
        this.f1546H = new c(this, 1);
        Context context2 = getContext();
        q qVar = new q();
        qVar.f1553c = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = AbstractC1274a.f12448b;
        H2.m.a(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        H2.m.b(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        qVar.f1551a = f2.h.r(context2, typedArrayObtainStyledAttributes, 9, dimensionPixelSize);
        qVar.f1552b = Math.min(f2.h.r(context2, typedArrayObtainStyledAttributes, 8, 0), qVar.f1551a / 2);
        qVar.f1555e = typedArrayObtainStyledAttributes.getInt(5, 0);
        qVar.f1556f = typedArrayObtainStyledAttributes.getInt(1, 0);
        qVar.f1557g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            qVar.f1553c = new int[]{C0.e(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            qVar.f1553c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            qVar.f1553c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            iA = typedArrayObtainStyledAttributes.getColor(7, -1);
        } else {
            qVar.f1554d = qVar.f1553c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f6 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            iA = C0.a(qVar.f1554d, (int) (f6 * 255.0f));
        }
        qVar.f1554d = iA;
        typedArrayObtainStyledAttributes.recycle();
        int[] iArr2 = AbstractC1274a.f12459m;
        H2.m.a(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        H2.m.b(context2, attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        qVar.f1609h = typedArrayObtainStyledAttributes3.getInt(0, 1);
        qVar.f1610i = typedArrayObtainStyledAttributes3.getInt(1, 0);
        qVar.f1612k = Math.min(typedArrayObtainStyledAttributes3.getDimensionPixelSize(2, 0), qVar.f1551a);
        typedArrayObtainStyledAttributes3.recycle();
        qVar.a();
        qVar.f1611j = qVar.f1610i == 1;
        this.f1547w = qVar;
        H2.m.a(context2, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        H2.m.b(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(6, -1);
        this.f1539A = Math.min(typedArrayObtainStyledAttributes4.getInt(4, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.f1540B = new a();
        this.f1550z = true;
    }

    private k getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f1582H;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f1559H;
    }

    public void a(int i6, boolean z5) {
        if (!isIndeterminate()) {
            super.setProgress(i6);
            if (getProgressDrawable() == null || z5) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f1548x = i6;
            this.f1549y = z5;
            this.f1541C = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.f1540B;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f1583I.i();
                    return;
                }
            }
            this.f1545G.a(getIndeterminateDrawable());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r2 = this;
            java.util.WeakHashMap r0 = N.V.f1964a
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L2c
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            r0 = r2
        Lf:
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L16
            goto L2c
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L23
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            goto L27
        L23:
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L29
        L27:
            r0 = 1
            goto L2d
        L29:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L2c:
            r0 = 0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.d.b():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f1547w.f1556f;
    }

    @Override // android.widget.ProgressBar
    public l getIndeterminateDrawable() {
        return (l) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f1547w.f1553c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f1547w.f1557g;
    }

    @Override // android.widget.ProgressBar
    public g getProgressDrawable() {
        return (g) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f1547w.f1555e;
    }

    public int getTrackColor() {
        return this.f1547w.f1554d;
    }

    public int getTrackCornerRadius() {
        return this.f1547w.f1552b;
    }

    public int getTrackThickness() {
        return this.f1547w.f1551a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f1583I.h(this.f1545G);
        }
        g progressDrawable = getProgressDrawable();
        c cVar = this.f1546H;
        if (progressDrawable != null) {
            g progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f1568B == null) {
                progressDrawable2.f1568B = new ArrayList();
            }
            if (!progressDrawable2.f1568B.contains(cVar)) {
                progressDrawable2.f1568B.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            l indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f1568B == null) {
                indeterminateDrawable.f1568B = new ArrayList();
            }
            if (!indeterminateDrawable.f1568B.contains(cVar)) {
                indeterminateDrawable.f1568B.add(cVar);
            }
        }
        if (b()) {
            if (this.f1539A > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1544F);
        removeCallbacks(this.f1543E);
        ((i) getCurrentDrawable()).c(false, false, false);
        l indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f1546H;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(cVar);
            getIndeterminateDrawable().f1583I.l();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i6, int i7) {
        try {
            k currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i6), ((q) ((m) currentDrawingDelegate).f1581a).f1551a < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i7) : ((q) ((m) currentDrawingDelegate).f1581a).f1551a + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i6) {
        super.onVisibilityChanged(view, i6);
        boolean z5 = i6 == 0;
        if (this.f1550z) {
            ((i) getCurrentDrawable()).c(b(), false, z5);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        if (this.f1550z) {
            ((i) getCurrentDrawable()).c(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.f1540B = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f1575y = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f1575y = aVar;
        }
    }

    public void setHideAnimationBehavior(int i6) {
        this.f1547w.f1556f = i6;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z5) {
        try {
            if (z5 == isIndeterminate()) {
                return;
            }
            i iVar = (i) getCurrentDrawable();
            if (iVar != null) {
                iVar.c(false, false, false);
            }
            super.setIndeterminate(z5);
            i iVar2 = (i) getCurrentDrawable();
            if (iVar2 != null) {
                iVar2.c(b(), false, false);
            }
            if ((iVar2 instanceof l) && b()) {
                ((l) iVar2).f1583I.k();
            }
            this.f1541C = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof l)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((i) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C0.e(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f1547w.f1553c = iArr;
        getIndeterminateDrawable().f1583I.f();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i6) {
        q qVar = this.f1547w;
        if (qVar.f1557g != i6) {
            qVar.f1557g = i6;
            qVar.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i6) {
        if (isIndeterminate()) {
            return;
        }
        a(i6, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof g)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            g gVar = (g) drawable;
            gVar.c(false, false, false);
            super.setProgressDrawable(gVar);
            gVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i6) {
        this.f1547w.f1555e = i6;
        invalidate();
    }

    public void setTrackColor(int i6) {
        q qVar = this.f1547w;
        if (qVar.f1554d != i6) {
            qVar.f1554d = i6;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i6) {
        q qVar = this.f1547w;
        if (qVar.f1552b != i6) {
            qVar.f1552b = Math.min(i6, qVar.f1551a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i6) {
        q qVar = this.f1547w;
        if (qVar.f1551a != i6) {
            qVar.f1551a = i6;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i6) {
        if (i6 != 0 && i6 != 4 && i6 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f1542D = i6;
    }
}
