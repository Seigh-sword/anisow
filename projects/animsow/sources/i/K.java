package i;

import android.app.Dialog;
import h0.DialogInterfaceOnCancelListenerC0756v;

/* JADX INFO: loaded from: classes.dex */
public class K extends DialogInterfaceOnCancelListenerC0756v {
    @Override // h0.DialogInterfaceOnCancelListenerC0756v
    public Dialog V() {
        return new J(m(), this.f8920y0);
    }

    @Override // h0.DialogInterfaceOnCancelListenerC0756v
    public final void W(Dialog dialog, int i6) {
        if (!(dialog instanceof J)) {
            super.W(dialog, i6);
            return;
        }
        J j6 = (J) dialog;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        j6.e().f(1);
    }
}
