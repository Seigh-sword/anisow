package N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class H implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0 f1952a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0107s f1954c;

    public H(View view, InterfaceC0107s interfaceC0107s) {
        this.f1953b = view;
        this.f1954c = interfaceC0107s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0 c0G = C0.g(view, windowInsets);
        int i6 = Build.VERSION.SDK_INT;
        InterfaceC0107s interfaceC0107s = this.f1954c;
        if (i6 < 30) {
            I.a(windowInsets, this.f1953b);
            if (c0G.equals(this.f1952a)) {
                return interfaceC0107s.p(view, c0G).f();
            }
        }
        this.f1952a = c0G;
        C0 c0P = interfaceC0107s.p(view, c0G);
        if (i6 >= 30) {
            return c0P.f();
        }
        WeakHashMap weakHashMap = V.f1964a;
        G.c(view);
        return c0P.f();
    }
}
