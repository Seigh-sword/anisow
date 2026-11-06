package N4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import s4.AbstractC1305a;
import s4.C1312h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object objM;
        try {
            objM = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objM = S3.a.m(th);
        }
        if (objM instanceof C1312h) {
            objM = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            objNewInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC1305a.m(objNewInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                objNewInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) objNewInstance;
    }
}
