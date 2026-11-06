package K2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import i.E;
import java.util.List;
import m2.C0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends i {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public k f1582H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public E f1583I;

    @Override // K2.i
    public final boolean d(boolean z5, boolean z6, boolean z7) {
        boolean zD = super.d(z5, z6, z7);
        if (this.f1575y != null) {
            Settings.Global.getFloat(this.f1573w.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        if (!isRunning()) {
            this.f1583I.a();
        }
        if (z5 && z7) {
            this.f1583I.k();
        }
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f6;
        float f7;
        int i6;
        k kVar;
        Canvas canvas2;
        Paint paint;
        int i7;
        int i8;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (this.f1575y != null) {
                Settings.Global.getFloat(this.f1573w.getContentResolver(), "animator_duration_scale", 1.0f);
            }
            canvas.save();
            k kVar2 = this.f1582H;
            Rect bounds = getBounds();
            float fB = b();
            ValueAnimator valueAnimator = this.f1576z;
            boolean z5 = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.f1567A;
            kVar2.b(canvas, bounds, fB, z5, valueAnimator2 != null && valueAnimator2.isRunning());
            e eVar = this.f1574x;
            int i9 = eVar.f1557g;
            int i10 = this.f1572F;
            Paint paint2 = this.f1571E;
            if (i9 == 0) {
                kVar = this.f1582H;
                i6 = eVar.f1554d;
                f6 = 0.0f;
                f7 = 1.0f;
                i8 = 0;
                canvas2 = canvas;
                paint = paint2;
                i7 = i10;
            } else {
                j jVar = (j) ((List) this.f1583I.f9146x).get(0);
                List list = (List) this.f1583I.f9146x;
                j jVar2 = (j) list.get(list.size() - 1);
                k kVar3 = this.f1582H;
                if (kVar3 instanceof m) {
                    canvas2 = canvas;
                    paint = paint2;
                    i7 = i10;
                    i8 = i9;
                    kVar3.a(canvas2, paint, 0.0f, jVar.f1577a, eVar.f1554d, i7, i8);
                    kVar = this.f1582H;
                    f6 = jVar2.f1578b;
                    f7 = 1.0f;
                    i6 = eVar.f1554d;
                } else {
                    f6 = jVar2.f1578b;
                    f7 = jVar.f1577a + 1.0f;
                    i6 = eVar.f1554d;
                    i10 = 0;
                    kVar = kVar3;
                    canvas2 = canvas;
                    paint = paint2;
                    i7 = 0;
                    i8 = i9;
                }
            }
            kVar.a(canvas2, paint, f6, f7, i6, i7, i8);
            for (int i11 = 0; i11 < ((List) this.f1583I.f9146x).size(); i11++) {
                j jVar3 = (j) ((List) this.f1583I.f9146x).get(i11);
                k kVar4 = this.f1582H;
                int i12 = this.f1572F;
                m mVar = (m) kVar4;
                mVar.getClass();
                int iA = C0.a(jVar3.f1579c, i12);
                float f8 = jVar3.f1577a;
                float f9 = jVar3.f1578b;
                int i13 = jVar3.f1580d;
                mVar.c(canvas, paint2, f8, f9, iA, i13, i13);
                if (i11 > 0 && i9 > 0) {
                    this.f1582H.a(canvas, paint2, ((j) ((List) this.f1583I.f9146x).get(i11 - 1)).f1578b, jVar3.f1577a, eVar.f1554d, i10, i9);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((q) ((m) this.f1582H).f1581a).f1551a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.f1582H.getClass();
        return -1;
    }
}
