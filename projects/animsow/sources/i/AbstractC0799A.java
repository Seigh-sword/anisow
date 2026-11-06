package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d.C0644y;
import java.util.Objects;

/* JADX INFO: renamed from: i.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0799A {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, H h4) {
        Objects.requireNonNull(h4);
        C0644y c0644y = new C0644y(1, h4);
        I2.c.g(obj).registerOnBackInvokedCallback(1000000, c0644y);
        return c0644y;
    }

    public static void c(Object obj, Object obj2) {
        I2.c.g(obj).unregisterOnBackInvokedCallback(I2.c.b(obj2));
    }
}
