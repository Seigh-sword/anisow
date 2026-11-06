package K2;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.provider.Settings;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final f f1558M = new f("indicatorLevel");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final k f1559H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final b0.k f1560I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final b0.j f1561J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final j f1562K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f1563L;

    public g(Context context, q qVar, m mVar) {
        super(context, qVar);
        this.f1563L = false;
        this.f1559H = mVar;
        this.f1562K = new j();
        b0.k kVar = new b0.k();
        this.f1560I = kVar;
        kVar.f5906b = 1.0f;
        kVar.f5907c = false;
        kVar.a(50.0f);
        b0.j jVar = new b0.j(this);
        this.f1561J = jVar;
        jVar.f5902m = kVar;
        if (this.f1570D != 1.0f) {
            this.f1570D = 1.0f;
            invalidateSelf();
        }
    }

    @Override // K2.i
    public final boolean d(boolean z5, boolean z6, boolean z7) {
        boolean zD = super.d(z5, z6, z7);
        a aVar = this.f1575y;
        ContentResolver contentResolver = this.f1573w.getContentResolver();
        aVar.getClass();
        float f6 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f6 == 0.0f) {
            this.f1563L = true;
        } else {
            this.f1563L = false;
            this.f1560I.a(50.0f / f6);
        }
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        k kVar;
        int i6;
        int i7;
        float f6;
        float f7;
        int i8;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            k kVar2 = this.f1559H;
            Rect bounds = getBounds();
            float fB = b();
            ValueAnimator valueAnimator = this.f1576z;
            boolean z5 = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.f1567A;
            kVar2.b(canvas, bounds, fB, z5, valueAnimator2 != null && valueAnimator2.isRunning());
            Paint paint = this.f1571E;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            e eVar = this.f1574x;
            int i9 = eVar.f1553c[0];
            j jVar = this.f1562K;
            jVar.f1579c = i9;
            int iN = eVar.f1557g;
            if (iN > 0) {
                if (!(this.f1559H instanceof m)) {
                    iN = (int) ((com.bumptech.glide.c.n(jVar.f1578b, 0.0f, 0.01f) * iN) / 0.01f);
                }
                i8 = iN;
                kVar = this.f1559H;
                f6 = jVar.f1578b;
                i6 = eVar.f1554d;
                i7 = this.f1572F;
                f7 = 1.0f;
            } else {
                kVar = this.f1559H;
                i6 = eVar.f1554d;
                i7 = this.f1572F;
                f6 = 0.0f;
                f7 = 1.0f;
                i8 = 0;
            }
            kVar.a(canvas, paint, f6, f7, i6, i7, i8);
            k kVar3 = this.f1559H;
            int i10 = this.f1572F;
            m mVar = (m) kVar3;
            mVar.getClass();
            int iA = C0.a(jVar.f1579c, i10);
            float f8 = jVar.f1577a;
            float f9 = jVar.f1578b;
            int i11 = jVar.f1580d;
            mVar.c(canvas, paint, f8, f9, iA, i11, i11);
            k kVar4 = this.f1559H;
            int i12 = eVar.f1553c[0];
            int i13 = this.f1572F;
            m mVar2 = (m) kVar4;
            mVar2.getClass();
            int iA2 = C0.a(i12, i13);
            q qVar = (q) mVar2.f1581a;
            if (qVar.f1612k > 0 && iA2 != 0) {
                paint.setStyle(style);
                paint.setColor(iA2);
                PointF pointF = new PointF((mVar2.f1584b / 2.0f) - (mVar2.f1585c / 2.0f), 0.0f);
                float f10 = qVar.f1612k;
                mVar2.d(canvas, paint, pointF, null, f10, f10);
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((q) ((m) this.f1559H).f1581a).f1551a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.f1559H.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f1561J.c();
        this.f1562K.f1578b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        boolean z5 = this.f1563L;
        j jVar = this.f1562K;
        b0.j jVar2 = this.f1561J;
        if (z5) {
            jVar2.c();
            jVar.f1578b = i6 / 10000.0f;
            invalidateSelf();
        } else {
            jVar2.f5891b = jVar.f1578b * 10000.0f;
            jVar2.f5892c = true;
            jVar2.a(i6);
        }
        return true;
    }
}
