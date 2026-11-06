package i;

import android.view.Window;
import m.InterfaceC0997y0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements InterfaceC0997y0, l.z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ H f9344w;

    public /* synthetic */ v(H h4) {
        this.f9344w = h4;
    }

    @Override // l.z
    public final void c(l.o oVar, boolean z5) {
        this.f9344w.q(oVar);
    }

    @Override // l.z
    public final boolean f(l.o oVar) {
        Window.Callback callback = this.f9344w.f9172H.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, oVar);
        return true;
    }
}
