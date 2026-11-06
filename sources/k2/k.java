package K2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1581a;

    public abstract void a(Canvas canvas, Paint paint, float f6, float f7, int i6, int i7, int i8);

    public final void b(Canvas canvas, Rect rect, float f6, boolean z5, boolean z6) {
        this.f1581a.a();
        m mVar = (m) this;
        mVar.f1584b = rect.width();
        q qVar = (q) mVar.f1581a;
        float f7 = qVar.f1551a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f7) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (qVar.f1611j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f8 = mVar.f1584b / 2.0f;
        float f9 = f7 / 2.0f;
        canvas.clipRect(-f8, -f9, f8, f9);
        int i6 = qVar.f1551a;
        mVar.f1587e = i6 / 2 == qVar.f1552b;
        mVar.f1585c = i6 * f6;
        mVar.f1586d = Math.min(r2, r7) * f6;
        if (z5 || z6) {
            if ((z5 && qVar.f1555e == 2) || (z6 && qVar.f1556f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z5 || (z6 && qVar.f1556f != 3)) {
                canvas.translate(0.0f, ((1.0f - f6) * qVar.f1551a) / 2.0f);
            }
        }
        if (z6 && qVar.f1556f == 3) {
            mVar.f1588f = f6;
        } else {
            mVar.f1588f = 1.0f;
        }
    }
}
