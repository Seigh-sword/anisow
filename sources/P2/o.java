package P2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f2490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2492e;

    public o(q qVar, float f6, float f7) {
        this.f2490c = qVar;
        this.f2491d = f6;
        this.f2492e = f7;
    }

    @Override // P2.s
    public final void a(Matrix matrix, O2.a aVar, int i6, Canvas canvas) {
        q qVar = this.f2490c;
        float f6 = qVar.f2501c;
        float f7 = this.f2492e;
        float f8 = qVar.f2500b;
        float f9 = this.f2491d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f6 - f7, f8 - f9), 0.0f);
        Matrix matrix2 = this.f2504a;
        matrix2.set(matrix);
        matrix2.preTranslate(f9, f7);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i6;
        rectF.offset(0.0f, -i6);
        int[] iArr = O2.a.f2313i;
        iArr[0] = aVar.f2322f;
        iArr[1] = aVar.f2321e;
        iArr[2] = aVar.f2320d;
        Paint paint = aVar.f2319c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, O2.a.f2314j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f2490c;
        return (float) Math.toDegrees(Math.atan((qVar.f2501c - this.f2492e) / (qVar.f2500b - this.f2491d)));
    }
}
