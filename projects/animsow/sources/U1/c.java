package U1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends DialogFragment {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Dialog f3579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DialogInterface.OnCancelListener f3580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AlertDialog f3581y;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3580x;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f3579w;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f3581y == null) {
            Activity activity = getActivity();
            AbstractC1332d.m(activity);
            this.f3581y = new AlertDialog.Builder(activity).create();
        }
        return this.f3581y;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
