package S2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends P2.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f3126v;

    public f(P2.j jVar, RectF rectF) {
        super(jVar);
        this.f3126v = rectF;
    }

    @Override // P2.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f3126v = fVar.f3126v;
    }
}
