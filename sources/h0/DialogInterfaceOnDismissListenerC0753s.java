package h0;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: h0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0753s implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0756v f8885w;

    public DialogInterfaceOnDismissListenerC0753s(DialogInterfaceOnCancelListenerC0756v dialogInterfaceOnCancelListenerC0756v) {
        this.f8885w = dialogInterfaceOnCancelListenerC0756v;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0756v dialogInterfaceOnCancelListenerC0756v = this.f8885w;
        Dialog dialog = dialogInterfaceOnCancelListenerC0756v.E0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0756v.onDismiss(dialog);
        }
    }
}
