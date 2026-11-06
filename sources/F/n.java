package F;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f454y;

    public /* synthetic */ n(int i6, int i7, Object obj) {
        this.f452w = i7;
        this.f454y = obj;
        this.f453x = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f452w;
        int i7 = this.f453x;
        Object obj = this.f454y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((com.bumptech.glide.d) obj).s(i7);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f7286p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, i7, false);
                }
                break;
        }
    }
}
