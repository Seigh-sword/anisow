package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T1 f6680a;

    static {
        T1 t12;
        synchronized (U1.class) {
            try {
                if (U1.f6703a == null) {
                    V1 v12 = new V1();
                    synchronized (U1.class) {
                        if (U1.f6703a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        U1.f6703a = v12;
                    }
                }
                t12 = U1.f6703a;
            } catch (Throwable th) {
                throw th;
            }
        }
        f6680a = t12;
    }
}
