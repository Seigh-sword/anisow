package W1;

import android.app.AlertDialog;
import android.app.Dialog;
import m.RunnableC0969k;

/* JADX INFO: loaded from: classes.dex */
public final class W extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Dialog f4278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RunnableC0969k f4279y;

    public W(RunnableC0969k runnableC0969k, AlertDialog alertDialog) {
        this.f4279y = runnableC0969k;
        this.f4278x = alertDialog;
    }

    @Override // com.bumptech.glide.c
    public final void R() {
        ((X) this.f4279y.f10301y).j();
        Dialog dialog = this.f4278x;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
