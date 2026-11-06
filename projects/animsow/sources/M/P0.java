package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends K0 implements L0 {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Method f10178Z;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public L0 f10179Y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f10178Z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.L0
    public final void e(l.o oVar, l.q qVar) {
        L0 l02 = this.f10179Y;
        if (l02 != null) {
            l02.e(oVar, qVar);
        }
    }

    @Override // m.L0
    public final void h(l.o oVar, MenuItem menuItem) {
        L0 l02 = this.f10179Y;
        if (l02 != null) {
            l02.h(oVar, menuItem);
        }
    }

    @Override // m.K0
    public final C0995x0 q(Context context, boolean z5) {
        O0 o02 = new O0(context, z5);
        o02.setHoverListener(this);
        return o02;
    }
}
