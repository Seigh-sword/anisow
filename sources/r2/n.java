package R2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import u1.C1364h;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static n f2996e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2997a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f2998b = new Handler(Looper.getMainLooper(), new C1364h(3, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f2999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f3000d;

    public static n b() {
        if (f2996e == null) {
            f2996e = new n();
        }
        return f2996e;
    }

    public final boolean a(m mVar, int i6) {
        g gVar = (g) mVar.f2993a.get();
        if (gVar == null) {
            return false;
        }
        this.f2998b.removeCallbacksAndMessages(mVar);
        Handler handler = j.f2968x;
        handler.sendMessage(handler.obtainMessage(1, i6, 0, gVar.f2952a));
        return true;
    }

    public final boolean c(g gVar) {
        m mVar = this.f2999c;
        return (mVar == null || gVar == null || mVar.f2993a.get() != gVar) ? false : true;
    }

    public final void d(g gVar) {
        synchronized (this.f2997a) {
            try {
                if (c(gVar)) {
                    m mVar = this.f2999c;
                    if (!mVar.f2995c) {
                        mVar.f2995c = true;
                        this.f2998b.removeCallbacksAndMessages(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(g gVar) {
        synchronized (this.f2997a) {
            try {
                if (c(gVar)) {
                    m mVar = this.f2999c;
                    if (mVar.f2995c) {
                        mVar.f2995c = false;
                        f(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(m mVar) {
        int i6 = mVar.f2994b;
        if (i6 == -2) {
            return;
        }
        if (i6 <= 0) {
            i6 = i6 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f2998b;
        handler.removeCallbacksAndMessages(mVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, mVar), i6);
    }

    public final void g() {
        m mVar = this.f3000d;
        if (mVar != null) {
            this.f2999c = mVar;
            this.f3000d = null;
            g gVar = (g) mVar.f2993a.get();
            if (gVar == null) {
                this.f2999c = null;
            } else {
                Handler handler = j.f2968x;
                handler.sendMessage(handler.obtainMessage(0, gVar.f2952a));
            }
        }
    }
}
