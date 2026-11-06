package d;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0645z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0645z f8158a = new C0645z();

    public final OnBackInvokedCallback a(C4.a aVar) {
        AbstractC1305a.o(aVar, "onBackInvoked");
        return new C0644y(0, aVar);
    }

    public final void b(Object obj, int i6, Object obj2) {
        AbstractC1305a.o(obj, "dispatcher");
        AbstractC1305a.o(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i6, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        AbstractC1305a.o(obj, "dispatcher");
        AbstractC1305a.o(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
