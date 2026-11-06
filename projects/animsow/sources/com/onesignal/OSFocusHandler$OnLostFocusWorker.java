package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class OSFocusHandler$OnLostFocusWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSFocusHandler$OnLostFocusWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC1305a.o(context, "context");
        AbstractC1305a.o(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public final I0.n g() {
        C0548e c0548e = C0554g.f7812x;
        if (c0548e == null || c0548e.f7789b == null) {
            AbstractC0603w1.f8049o = false;
        }
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        AbstractC0603w1.b(enumC0600v1, "OSFocusHandler running onAppLostFocus", null);
        C0546d0.f7781c = true;
        AbstractC0603w1.b(enumC0600v1, "Application lost focus initDone: " + AbstractC0603w1.f8048n, null);
        AbstractC0603w1.f8049o = false;
        AbstractC0603w1.f8043i0 = 3;
        AbstractC0603w1.f8056v.getClass();
        AbstractC0603w1.R(System.currentTimeMillis());
        M.g();
        if (AbstractC0603w1.f8048n) {
            AbstractC0603w1.f();
        } else {
            C0553f1 c0553f1 = AbstractC0603w1.f8059y;
            if (c0553f1.d("onAppLostFocus()")) {
                AbstractC0603w1.f8053s.getClass();
                C0594t1.e("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
                c0553f1.a(new RunnableC0604x(3));
            }
        }
        C0546d0.f7782d = true;
        return new I0.m(I0.g.f1099c);
    }
}
