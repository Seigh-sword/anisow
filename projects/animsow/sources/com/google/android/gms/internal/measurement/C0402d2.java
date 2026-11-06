package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0402d2 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        AbstractC0420g2.f6820j.incrementAndGet();
    }
}
