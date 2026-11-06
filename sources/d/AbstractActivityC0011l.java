package D;

import N.InterfaceC0101l;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.InterfaceC0321v;
import androidx.lifecycle.O;
import d2.AbstractC0651b;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: D.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0011l extends Activity implements InterfaceC0321v, InterfaceC0101l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0323x f205w = new C0323x(this);

    @Override // N.InterfaceC0101l
    public final boolean d(KeyEvent keyEvent) {
        AbstractC1305a.o(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1305a.o(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1305a.n(decorView, "window.decorView");
        if (AbstractC0651b.l(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0651b.m(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1305a.o(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1305a.n(decorView, "window.decorView");
        if (AbstractC0651b.l(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i6 = O.f5570x;
        B3.e.u(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1305a.o(bundle, "outState");
        this.f205w.g();
        super.onSaveInstanceState(bundle);
    }
}
