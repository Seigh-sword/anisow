package e2;

import android.os.IBinder;
import android.os.IInterface;
import d.AbstractC0628i;
import j2.AbstractBinderC0846a;
import java.lang.reflect.Field;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractBinderC0846a implements InterfaceC0663a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8256c;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f8256c = obj;
    }

    public static InterfaceC0663a e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0663a ? (InterfaceC0663a) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object s(InterfaceC0663a interfaceC0663a) {
        if (interfaceC0663a instanceof b) {
            return ((b) interfaceC0663a).f8256c;
        }
        IBinder iBinderAsBinder = interfaceC0663a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i6 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i6++;
                field = field2;
            }
        }
        if (i6 != 1) {
            throw new IllegalArgumentException(AbstractC0628i.f("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        AbstractC1332d.m(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e6) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e6);
        } catch (NullPointerException e7) {
            throw new IllegalArgumentException("Binder object is null.", e7);
        }
    }
}
