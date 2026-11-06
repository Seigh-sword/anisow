package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0633n implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f8111w = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f8112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0638s f8114z;

    public ViewTreeObserverOnDrawListenerC0633n(h0.E e6) {
        this.f8114z = e6;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1305a.o(runnable, "runnable");
        this.f8112x = runnable;
        View decorView = this.f8114z.getWindow().getDecorView();
        AbstractC1305a.n(decorView, "window.decorView");
        if (!this.f8113y) {
            decorView.postOnAnimation(new RunnableC0632m(0, this));
        } else if (AbstractC1305a.c(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f8112x;
        if (runnable != null) {
            runnable.run();
            this.f8112x = null;
            C0640u c0640u = (C0640u) this.f8114z.f8128C.getValue();
            synchronized (c0640u.f8146a) {
                z5 = c0640u.f8147b;
            }
            if (!z5) {
                return;
            }
        } else if (SystemClock.uptimeMillis() <= this.f8111w) {
            return;
        }
        this.f8113y = false;
        this.f8114z.getWindow().getDecorView().post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8114z.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
