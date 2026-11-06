package m;

import android.graphics.Canvas;
import j.AbstractC0838d;

/* JADX INFO: renamed from: m.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0991v0 extends AbstractC0838d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10396x;

    @Override // j.AbstractC0838d, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f10396x) {
            super.draw(canvas);
        }
    }

    @Override // j.AbstractC0838d, android.graphics.drawable.Drawable
    public final void setHotspot(float f6, float f7) {
        if (this.f10396x) {
            super.setHotspot(f6, f7);
        }
    }

    @Override // j.AbstractC0838d, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i6, int i7, int i8, int i9) {
        if (this.f10396x) {
            super.setHotspotBounds(i6, i7, i8, i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f10396x) {
            return this.f9416w.setState(iArr);
        }
        return false;
    }

    @Override // j.AbstractC0838d, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        if (this.f10396x) {
            return super.setVisible(z5, z6);
        }
        return false;
    }
}
