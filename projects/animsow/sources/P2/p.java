package P2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f2493h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f2497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2499g;

    public p(float f6, float f7, float f8, float f9) {
        this.f2494b = f6;
        this.f2495c = f7;
        this.f2496d = f8;
        this.f2497e = f9;
    }

    @Override // P2.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2502a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f2493h;
        rectF.set(this.f2494b, this.f2495c, this.f2496d, this.f2497e);
        path.arcTo(rectF, this.f2498f, this.f2499g, false);
        path.transform(matrix);
    }
}
