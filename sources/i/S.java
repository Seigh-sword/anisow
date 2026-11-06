package i;

import N.V;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import k.InterfaceC0879b;

/* JADX INFO: loaded from: classes.dex */
public final class S extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ U f9240y;

    public /* synthetic */ S(U u5, int i6) {
        this.f9239x = i6;
        this.f9240y = u5;
    }

    @Override // N.InterfaceC0092f0
    public final void c() {
        View view;
        int i6 = this.f9239x;
        U u5 = this.f9240y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (u5.f9249B && (view = u5.f9265t) != null) {
                    view.setTranslationY(0.0f);
                    u5.f9262q.setTranslationY(0.0f);
                }
                u5.f9262q.setVisibility(8);
                u5.f9262q.setTransitioning(false);
                u5.f9253F = null;
                InterfaceC0879b interfaceC0879b = u5.f9269x;
                if (interfaceC0879b != null) {
                    interfaceC0879b.d(u5.f9268w);
                    u5.f9268w = null;
                    u5.f9269x = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = u5.f9261p;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = V.f1964a;
                    N.G.c(actionBarOverlayLayout);
                }
                break;
            default:
                u5.f9253F = null;
                u5.f9262q.requestLayout();
                break;
        }
    }
}
