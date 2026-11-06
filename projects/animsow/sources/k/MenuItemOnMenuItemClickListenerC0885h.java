package k;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0885h implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class[] f9582c = {MenuItem.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f9584b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f9584b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f9583a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
