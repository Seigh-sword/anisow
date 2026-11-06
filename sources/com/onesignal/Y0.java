package com.onesignal;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BlockingQueue f7740a;

    public Y0(ArrayBlockingQueue arrayBlockingQueue) {
        this.f7740a = arrayBlockingQueue;
    }

    @Override // com.onesignal.I
    public final L a() {
        return L.f7616y;
    }

    @Override // com.onesignal.I
    public final void b(K k5) {
        Object obj = k5;
        if (k5 == null) {
            obj = new Object();
        }
        this.f7740a.offer(obj);
    }
}
