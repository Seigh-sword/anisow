package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import i.DialogInterfaceC0809i;

/* JADX INFO: loaded from: classes.dex */
public final class p implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f9778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DialogInterfaceC0809i f9779x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0918k f9780y;

    @Override // l.z
    public final void c(o oVar, boolean z5) {
        DialogInterfaceC0809i dialogInterfaceC0809i;
        if ((z5 || oVar == this.f9778w) && (dialogInterfaceC0809i = this.f9779x) != null) {
            dialogInterfaceC0809i.dismiss();
        }
    }

    @Override // l.z
    public final boolean f(o oVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        C0918k c0918k = this.f9780y;
        if (c0918k.f9742B == null) {
            c0918k.f9742B = new C0917j(c0918k);
        }
        this.f9778w.q(c0918k.f9742B.getItem(i6), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f9780y.c(this.f9778w, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        o oVar = this.f9778w;
        if (i6 == 82 || i6 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f9779x.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f9779x.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oVar.performShortcut(i6, keyEvent, 0);
    }
}
