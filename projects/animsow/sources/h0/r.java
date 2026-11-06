package h0;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class r implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0756v f8883w;

    public r(DialogInterfaceOnCancelListenerC0756v dialogInterfaceOnCancelListenerC0756v) {
        this.f8883w = dialogInterfaceOnCancelListenerC0756v;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0756v dialogInterfaceOnCancelListenerC0756v = this.f8883w;
        Dialog dialog = dialogInterfaceOnCancelListenerC0756v.E0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0756v.onCancel(dialog);
        }
    }
}
