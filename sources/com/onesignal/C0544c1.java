package com.onesignal;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.measurement.C0396c2;
import h0.AbstractComponentCallbacksC0734B;
import h0.DialogInterfaceOnCancelListenerC0756v;
import i.AbstractActivityC0812l;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.onesignal.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0544c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0541b1 f7776a;

    public C0544c1(C0579o0 c0579o0) {
        this.f7776a = c0579o0;
    }

    public final boolean a(Activity activity) {
        if (!(activity instanceof AbstractActivityC0812l)) {
            return false;
        }
        h0.W wC = ((AbstractActivityC0812l) activity).f8646P.C();
        X1 x12 = new X1(this, wC);
        C0396c2 c0396c2 = wC.f8709o;
        c0396c2.getClass();
        ((CopyOnWriteArrayList) c0396c2.f6776y).add(new h0.I(x12));
        List listJ = wC.f8697c.j();
        int size = listJ.size();
        if (size <= 0) {
            return false;
        }
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = (AbstractComponentCallbacksC0734B) listJ.get(size - 1);
        return abstractComponentCallbacksC0734B.v() && (abstractComponentCallbacksC0734B instanceof DialogInterfaceOnCancelListenerC0756v);
    }

    public final boolean b() {
        Activity activityJ = AbstractC0603w1.j();
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7998z;
        if (activityJ == null) {
            AbstractC0603w1.b(enumC0600v1, "OSSystemConditionObserver curActivity null", null);
            return false;
        }
        try {
            if (a(AbstractC0603w1.j())) {
                AbstractC0603w1.b(enumC0600v1, "OSSystemConditionObserver dialog fragment detected", null);
                return false;
            }
        } catch (NoClassDefFoundError e6) {
            AbstractC0603w1.b(EnumC0600v1.f7991A, "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e6, null);
        }
        C0548e c0548e = C0554g.f7812x;
        boolean zF = AbstractC0565j1.f(new WeakReference(AbstractC0603w1.j()));
        if (zF && c0548e != null) {
            Activity activity = c0548e.f7789b;
            InterfaceC0541b1 interfaceC0541b1 = this.f7776a;
            if (activity != null) {
                ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
                ViewTreeObserverOnGlobalLayoutListenerC0545d viewTreeObserverOnGlobalLayoutListenerC0545d = new ViewTreeObserverOnGlobalLayoutListenerC0545d(c0548e, interfaceC0541b1, "com.onesignal.c1");
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0545d);
                C0548e.f7787f.put("com.onesignal.c1", viewTreeObserverOnGlobalLayoutListenerC0545d);
            }
            C0548e.f7786e.put("com.onesignal.c1", interfaceC0541b1);
            AbstractC0603w1.b(enumC0600v1, "OSSystemConditionObserver keyboard up detected", null);
        }
        return !zF;
    }
}
