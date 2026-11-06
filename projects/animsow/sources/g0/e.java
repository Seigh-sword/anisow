package G0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f678a;

    public e(Drawable.ConstantState constantState) {
        this.f678a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f678a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f678a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable drawableNewDrawable = this.f678a.newDrawable();
        fVar.f684w = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f680B);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable drawableNewDrawable = this.f678a.newDrawable(resources);
        fVar.f684w = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f680B);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable drawableNewDrawable = this.f678a.newDrawable(resources, theme);
        fVar.f684w = drawableNewDrawable;
        drawableNewDrawable.setCallback(fVar.f680B);
        return fVar;
    }
}
