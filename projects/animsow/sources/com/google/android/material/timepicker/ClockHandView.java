package com.google.android.material.timepicker;

import N.V;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.xo.anilab.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import r2.AbstractC1274a;
import s2.AbstractC1301a;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f7395A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Paint f7396B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RectF f7397C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f7398D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f7399E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f7400F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public double f7401G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f7402H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f7403I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ValueAnimator f7404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f7406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f7407z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f7404w = new ValueAnimator();
        this.f7406y = new ArrayList();
        Paint paint = new Paint();
        this.f7396B = paint;
        this.f7397C = new RectF();
        this.f7403I = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1274a.f12455i, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Y2.b.z(context, R.attr.motionDurationLong2, 200);
        Y2.b.A(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1301a.f12618b);
        this.f7402H = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f7407z = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f7398D = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f7395A = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = V.f1964a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i6) {
        return i6 == 2 ? Math.round(this.f7402H * 0.66f) : this.f7402H;
    }

    public final void b(float f6) {
        ValueAnimator valueAnimator = this.f7404w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f6);
    }

    public final void c(float f6) {
        float f7 = f6 % 360.0f;
        this.f7399E = f7;
        this.f7401G = Math.toRadians(f7 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f7403I);
        float fCos = (((float) Math.cos(this.f7401G)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f7401G))) + height;
        float f8 = this.f7407z;
        this.f7397C.set(fCos - f8, fSin - f8, fCos + f8, fSin + f8);
        Iterator it = this.f7406y.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f7393h0 - f7) > 0.001f) {
                clockFaceView.f7393h0 = f7;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f6 = width;
        float fA = a(this.f7403I);
        float fCos = (((float) Math.cos(this.f7401G)) * fA) + f6;
        float f7 = height;
        float fSin = (fA * ((float) Math.sin(this.f7401G))) + f7;
        Paint paint = this.f7396B;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f7407z, paint);
        double dSin = Math.sin(this.f7401G);
        paint.setStrokeWidth(this.f7398D);
        canvas.drawLine(f6, f7, width + ((int) (Math.cos(this.f7401G) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f6, f7, this.f7395A, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        if (this.f7404w.isRunning()) {
            return;
        }
        b(this.f7399E);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        boolean z7 = false;
        if (actionMasked == 0) {
            this.f7400F = false;
            z5 = true;
            z6 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z6 = this.f7400F;
            if (this.f7405x) {
                this.f7403I = ((float) Math.hypot((double) (x5 - ((float) (getWidth() / 2))), (double) (y5 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z5 = false;
        } else {
            z6 = false;
            z5 = false;
        }
        boolean z8 = this.f7400F;
        int degrees = (int) Math.toDegrees(Math.atan2(y5 - (getHeight() / 2), x5 - (getWidth() / 2)));
        int i6 = degrees + 90;
        if (i6 < 0) {
            i6 = degrees + 450;
        }
        float f6 = i6;
        boolean z9 = this.f7399E != f6;
        if (z5 && z9) {
            z7 = true;
        } else if (z9 || z6) {
            b(f6);
            z7 = true;
        }
        this.f7400F = z8 | z7;
        return true;
    }
}
