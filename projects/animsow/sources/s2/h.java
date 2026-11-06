package S2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends P2.g {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ int f3127U = 0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public f f3128T;

    public h(f fVar) {
        super(fVar);
        this.f3128T = fVar;
    }

    @Override // P2.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f3128T = new f(this.f3128T);
        return this;
    }

    public final void t(float f6, float f7, float f8, float f9) {
        RectF rectF = this.f3128T.f3126v;
        if (f6 == rectF.left && f7 == rectF.top && f8 == rectF.right && f9 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f7, f8, f9);
        invalidateSelf();
    }
}
