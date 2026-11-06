package w1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h0.AbstractComponentCallbacksC0734B;
import h0.E;
import h0.W;
import java.util.Iterator;
import java.util.List;
import s.C1280b;
import s1.x;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: renamed from: w1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1469m implements Handler.Callback {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final I0.o f13572B = new I0.o(22);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1358b f13573A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile com.bumptech.glide.o f13574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1468l f13575x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1280b f13576y = new C1280b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC1462f f13577z;

    public C1469m(InterfaceC1468l interfaceC1468l) {
        interfaceC1468l = interfaceC1468l == null ? f13572B : interfaceC1468l;
        this.f13575x = interfaceC1468l;
        this.f13573A = new C1358b(interfaceC1468l);
        this.f13577z = (x.f12602f && x.f12601e) ? new C1461e() : new I0.o(21);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, C1280b c1280b) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = (AbstractComponentCallbacksC0734B) it.next();
            if (abstractComponentCallbacksC0734B != null && (obj = abstractComponentCallbacksC0734B.f8618c0) != null) {
                c1280b.put(obj, abstractComponentCallbacksC0734B);
                b(abstractComponentCallbacksC0734B.l().f8697c.j(), c1280b);
            }
        }
    }

    public final com.bumptech.glide.o c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = C1.n.f134a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof E) {
                return e((E) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f13574w == null) {
            synchronized (this) {
                try {
                    if (this.f13574w == null) {
                        this.f13574w = this.f13575x.l(com.bumptech.glide.b.a(context.getApplicationContext()), new I0.o(20), new V0.m(21), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f13574w;
    }

    public final com.bumptech.glide.o d(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        AbstractC1332d.l(abstractComponentCallbacksC0734B.m(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = C1.n.f134a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(abstractComponentCallbacksC0734B.m().getApplicationContext());
        }
        if (abstractComponentCallbacksC0734B.d() != null) {
            this.f13577z.f(abstractComponentCallbacksC0734B.d());
        }
        W wL = abstractComponentCallbacksC0734B.l();
        Context contextM = abstractComponentCallbacksC0734B.m();
        return this.f13573A.f(contextM, com.bumptech.glide.b.a(contextM.getApplicationContext()), abstractComponentCallbacksC0734B.f8627l0, wL, abstractComponentCallbacksC0734B.v());
    }

    public final com.bumptech.glide.o e(E e6) {
        char[] cArr = C1.n.f134a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(e6.getApplicationContext());
        }
        if (e6.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f13577z.f(e6);
        Activity activityA = a(e6);
        return this.f13573A.f(e6, com.bumptech.glide.b.a(e6.getApplicationContext()), e6.f205w, e6.f8646P.C(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
