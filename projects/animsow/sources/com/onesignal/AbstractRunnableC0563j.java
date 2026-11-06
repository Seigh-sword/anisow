package com.onesignal;

import java.util.concurrent.ArrayBlockingQueue;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: com.onesignal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0563j implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7854w;

    public abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        switch (this.f7854w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Thread threadCurrentThread = Thread.currentThread();
                AbstractC1305a.n(threadCurrentThread, "Thread.currentThread()");
                threadCurrentThread.setPriority(10);
                return;
            default:
                synchronized (Y.f7737c) {
                    Z0.c().f7746d = 0L;
                    break;
                }
                if (AbstractC0603w1.v() != null) {
                    AbstractC0603w1.f8032d = AbstractC0603w1.t(AbstractC0603w1.f8028b);
                    M1.b().p();
                    M1.a().p();
                    M1.c().p();
                    try {
                        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                        M.d(AbstractC0603w1.f8028b, false, false, new Y0(arrayBlockingQueue));
                        Object objTake = arrayBlockingQueue.take();
                        if (objTake instanceof K) {
                            M1.f((K) objTake);
                        }
                    } catch (InterruptedException e6) {
                        e6.printStackTrace();
                    }
                    M1.b().y(true);
                    M1.a().y(true);
                    M1.c().y(true);
                    C0584q c0584qP = AbstractC0603w1.p();
                    c0584qP.getClass();
                    if (!AbstractC0603w1.f8049o) {
                        AbstractC0581p abstractC0581pA = ((C) c0584qP.f7949x).a();
                        if (abstractC0581pA.d() >= abstractC0581pA.f7928a) {
                            abstractC0581pA.k();
                        }
                    }
                    break;
                }
                a();
                return;
        }
    }
}
