package y2;

import android.app.Dialog;
import android.content.Context;
import android.util.TypedValue;
import com.xo.anilab.R;
import i.K;

/* JADX INFO: renamed from: y2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1507i extends K {

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final /* synthetic */ int f13814J0 = 0;

    @Override // i.K, h0.DialogInterfaceOnCancelListenerC0756v
    public final Dialog V() {
        Context contextM = m();
        int i6 = this.f8920y0;
        if (i6 == 0) {
            TypedValue typedValue = new TypedValue();
            i6 = contextM.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        DialogC1506h dialogC1506h = new DialogC1506h(contextM, i6);
        dialogC1506h.f13807F = true;
        dialogC1506h.f13808G = true;
        dialogC1506h.f13813L = new C1504f(0, dialogC1506h);
        dialogC1506h.e().f(1);
        dialogC1506h.f13811J = dialogC1506h.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return dialogC1506h;
    }

    public final void Y() {
        Dialog dialog = this.E0;
        if (dialog instanceof DialogC1506h) {
            DialogC1506h dialogC1506h = (DialogC1506h) dialog;
            if (dialogC1506h.f13803B == null) {
                dialogC1506h.i();
            }
            boolean z5 = dialogC1506h.f13803B.f7060I;
        }
        U(false, false);
    }
}
