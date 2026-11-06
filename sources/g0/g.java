package G0;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Drawable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f684w;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            H.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i6) {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.setLevel(i6) : super.onLevelChange(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i6) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setChangingConfigurations(i6);
        } else {
            super.setChangingConfigurations(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i6, PorterDuff.Mode mode) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setColorFilter(i6, mode);
        } else {
            super.setColorFilter(i6, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z5) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            drawable.setFilterBitmap(z5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f6, float f7) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            H.a.e(drawable, f6, f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i6, int i7, int i8, int i9) {
        Drawable drawable = this.f684w;
        if (drawable != null) {
            H.a.f(drawable, i6, i7, i8, i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f684w;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
