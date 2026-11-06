package h0;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: h0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0755u extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f8899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0756v f8900y;

    public C0755u(DialogInterfaceOnCancelListenerC0756v dialogInterfaceOnCancelListenerC0756v, C0759y c0759y) {
        this.f8900y = dialogInterfaceOnCancelListenerC0756v;
        this.f8899x = c0759y;
    }

    @Override // com.bumptech.glide.c
    public final View A(int i6) {
        com.bumptech.glide.c cVar = this.f8899x;
        if (cVar.D()) {
            return cVar.A(i6);
        }
        Dialog dialog = this.f8900y.E0;
        if (dialog != null) {
            return dialog.findViewById(i6);
        }
        return null;
    }

    @Override // com.bumptech.glide.c
    public final boolean D() {
        return this.f8899x.D() || this.f8900y.f8914I0;
    }
}
