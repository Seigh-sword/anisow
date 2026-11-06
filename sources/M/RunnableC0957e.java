package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: m.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0957e implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f10267x;

    public /* synthetic */ RunnableC0957e(ActionBarOverlayLayout actionBarOverlayLayout, int i6) {
        this.f10266w = i6;
        this.f10267x = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10266w;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10267x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f5179S = actionBarOverlayLayout.f5188z.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f5180T);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f5179S = actionBarOverlayLayout.f5188z.animate().translationY(-actionBarOverlayLayout.f5188z.getHeight()).setListener(actionBarOverlayLayout.f5180T);
                break;
        }
    }
}
