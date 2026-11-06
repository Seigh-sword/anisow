package t1;

import android.graphics.drawable.Drawable;
import l1.F;
import l1.InterfaceC0923B;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1339b implements F, InterfaceC0923B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Drawable f12721w;

    public AbstractC1339b(Drawable drawable) {
        AbstractC1332d.l(drawable, "Argument must not be null");
        this.f12721w = drawable;
    }

    @Override // l1.F
    public final Object a() {
        Drawable drawable = this.f12721w;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
