package F0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class P extends O {
    @Override // F0.K
    public final void A(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // F0.K
    public final void B(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // F0.M
    public final void C(View view, int i6, int i7, int i8, int i9) {
        view.setLeftTopRightBottom(i6, i7, i8, i9);
    }

    @Override // com.bumptech.glide.d
    public final float p(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.bumptech.glide.d
    public final void x(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // F0.O, com.bumptech.glide.d
    public final void y(View view, int i6) {
        view.setTransitionVisibility(i6);
    }
}
