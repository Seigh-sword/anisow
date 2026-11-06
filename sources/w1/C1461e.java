package w1;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: w1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1461e implements InterfaceC1462f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f13566w = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f13567x;

    @Override // w1.InterfaceC1462f
    public final void f(Activity activity) {
        if (!this.f13567x && this.f13566w.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC1460d(this, decorView));
        }
    }
}
