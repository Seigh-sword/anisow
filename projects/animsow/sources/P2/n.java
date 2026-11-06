package P2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class n extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f2489c;

    public n(p pVar) {
        this.f2489c = pVar;
    }

    @Override // P2.s
    public final void a(Matrix matrix, O2.a aVar, int i6, Canvas canvas) {
        p pVar = this.f2489c;
        float f6 = pVar.f2498f;
        float f7 = pVar.f2499g;
        RectF rectF = new RectF(pVar.f2494b, pVar.f2495c, pVar.f2496d, pVar.f2497e);
        aVar.getClass();
        boolean z5 = f7 < 0.0f;
        Path path = aVar.f2323g;
        int[] iArr = O2.a.f2315k;
        if (z5) {
            iArr[0] = 0;
            iArr[1] = aVar.f2322f;
            iArr[2] = aVar.f2321e;
            iArr[3] = aVar.f2320d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f7);
            path.close();
            float f8 = -i6;
            rectF.inset(f8, f8);
            iArr[0] = 0;
            iArr[1] = aVar.f2320d;
            iArr[2] = aVar.f2321e;
            iArr[3] = aVar.f2322f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f9 = 1.0f - (i6 / fWidth);
        float[] fArr = O2.a.f2316l;
        fArr[1] = f9;
        fArr[2] = ((1.0f - f9) / 2.0f) + f9;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f2318b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z5) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f2324h);
        }
        canvas.drawArc(rectF, f6, f7, true, paint);
        canvas.restore();
    }
}
