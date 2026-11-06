package U1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import h0.DialogInterfaceOnCancelListenerC0756v;
import h0.W;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0756v {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public Dialog f3597J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f3598K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public AlertDialog f3599L0;

    @Override // h0.DialogInterfaceOnCancelListenerC0756v
    public final Dialog V() {
        Dialog dialog = this.f3597J0;
        if (dialog != null) {
            return dialog;
        }
        this.f8907A0 = false;
        if (this.f3599L0 == null) {
            Context contextM = m();
            AbstractC1332d.m(contextM);
            this.f3599L0 = new AlertDialog.Builder(contextM).create();
        }
        return this.f3599L0;
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v
    public final void X(W w5, String str) {
        super.X(w5, str);
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3598K0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
