package P2;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2501c;

    @Override // P2.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2502a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f2500b, this.f2501c);
        path.transform(matrix);
    }
}
