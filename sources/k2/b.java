package K2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f1536x;

    public /* synthetic */ b(d dVar, int i6) {
        this.f1535w = i6;
        this.f1536x = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f1535w;
        d dVar = this.f1536x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (dVar.f1539A > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                break;
            default:
                ((i) dVar.getCurrentDrawable()).c(false, false, true);
                if (dVar.getProgressDrawable() == null || !dVar.getProgressDrawable().isVisible()) {
                    if (dVar.getIndeterminateDrawable() == null || !dVar.getIndeterminateDrawable().isVisible()) {
                        dVar.setVisibility(4);
                    }
                }
                break;
        }
    }
}
