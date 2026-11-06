package com.onesignal;

import android.app.Service;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends AbstractRunnableC0563j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WeakReference f7718x;

    @Override // com.onesignal.AbstractRunnableC0563j
    public final void a() {
        AbstractC0603w1.b(EnumC0600v1.f7992B, "LegacySyncRunnable:Stopped", null);
        WeakReference weakReference = this.f7718x;
        if (weakReference.get() != null) {
            ((Service) weakReference.get()).stopSelf();
        }
    }
}
