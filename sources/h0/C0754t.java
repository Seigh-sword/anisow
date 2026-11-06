package h0;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0321v;

/* JADX INFO: renamed from: h0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754t implements androidx.lifecycle.F {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0756v f8897w;

    public C0754t(DialogInterfaceOnCancelListenerC0756v dialogInterfaceOnCancelListenerC0756v) {
        this.f8897w = dialogInterfaceOnCancelListenerC0756v;
    }

    @Override // androidx.lifecycle.F
    public final void a(Object obj) {
        if (((InterfaceC0321v) obj) != null) {
            DialogInterfaceOnCancelListenerC0756v dialogInterfaceOnCancelListenerC0756v = this.f8897w;
            if (dialogInterfaceOnCancelListenerC0756v.f8907A0) {
                View viewP = dialogInterfaceOnCancelListenerC0756v.P();
                if (viewP.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0756v.E0 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0756v.E0);
                    }
                    dialogInterfaceOnCancelListenerC0756v.E0.setContentView(viewP);
                }
            }
        }
    }
}
