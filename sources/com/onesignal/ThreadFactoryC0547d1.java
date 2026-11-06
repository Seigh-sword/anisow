package com.onesignal;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.onesignal.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0547d1 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
        return thread;
    }
}
