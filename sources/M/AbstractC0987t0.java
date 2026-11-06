package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: m.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0987t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f10385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f10386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f10387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f10388d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f10385a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f10386b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f10387c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f10388d = true;
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
        }
    }
}
