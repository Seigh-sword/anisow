package j;

import G0.f;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: j.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0836b implements Drawable.Callback {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f9414w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f9415x;

    public C0836b(f fVar) {
        this.f9415x = fVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f9414w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                ((f) this.f9415x).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        switch (this.f9414w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Drawable.Callback callback = (Drawable.Callback) this.f9415x;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j6);
                }
                break;
            default:
                ((f) this.f9415x).scheduleSelf(runnable, j6);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f9414w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Drawable.Callback callback = (Drawable.Callback) this.f9415x;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                ((f) this.f9415x).unscheduleSelf(runnable);
                break;
        }
    }
}
