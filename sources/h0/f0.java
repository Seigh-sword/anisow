package h0;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f8809b;

    public /* synthetic */ f0(Rect rect, int i6) {
        this.f8808a = i6;
        this.f8809b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i6 = this.f8808a;
        Rect rect = this.f8809b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                break;
            default:
                if (rect == null || rect.isEmpty()) {
                }
                break;
        }
        return rect;
    }
}
