package d;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0630k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0630k f8107a = new C0630k();

    public final OnBackInvokedDispatcher a(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        AbstractC1305a.n(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
