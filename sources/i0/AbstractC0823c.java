package i0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import d.RunnableC0637r;
import h0.AbstractComponentCallbacksC0734B;
import java.util.Set;
import s4.AbstractC1305a;
import t4.n;

/* JADX INFO: renamed from: i0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0823c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0822b f9359a = C0822b.f9356c;

    public static C0822b a(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        while (abstractComponentCallbacksC0734B != null) {
            if (abstractComponentCallbacksC0734B.s()) {
                abstractComponentCallbacksC0734B.o();
            }
            abstractComponentCallbacksC0734B = abstractComponentCallbacksC0734B.f8608S;
        }
        return f9359a;
    }

    public static void b(C0822b c0822b, AbstractC0825e abstractC0825e) {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = abstractC0825e.f9360w;
        String name = abstractComponentCallbacksC0734B.getClass().getName();
        EnumC0821a enumC0821a = EnumC0821a.f9352w;
        Set set = c0822b.f9357a;
        if (set.contains(enumC0821a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), abstractC0825e);
        }
        if (set.contains(EnumC0821a.f9353x)) {
            RunnableC0637r runnableC0637r = new RunnableC0637r(name, 6, abstractC0825e);
            if (abstractComponentCallbacksC0734B.s()) {
                Handler handler = abstractComponentCallbacksC0734B.o().f8717w.f8644z;
                if (!AbstractC1305a.c(handler.getLooper(), Looper.myLooper())) {
                    handler.post(runnableC0637r);
                    return;
                }
            }
            runnableC0637r.run();
        }
    }

    public static void c(AbstractC0825e abstractC0825e) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(abstractC0825e.f9360w.getClass().getName()), abstractC0825e);
        }
    }

    public static final void d(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B, String str) {
        AbstractC1305a.o(abstractComponentCallbacksC0734B, "fragment");
        AbstractC1305a.o(str, "previousFragmentId");
        C0824d c0824d = new C0824d(abstractComponentCallbacksC0734B, "Attempting to reuse fragment " + abstractComponentCallbacksC0734B + " with previous ID " + str);
        c(c0824d);
        C0822b c0822bA = a(abstractComponentCallbacksC0734B);
        if (c0822bA.f9357a.contains(EnumC0821a.f9354y) && e(c0822bA, abstractComponentCallbacksC0734B.getClass(), C0824d.class)) {
            b(c0822bA, c0824d);
        }
    }

    public static boolean e(C0822b c0822b, Class cls, Class cls2) {
        Set set = (Set) c0822b.f9358b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC1305a.c(cls2.getSuperclass(), AbstractC0825e.class) || !n.Z(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
