package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0500u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6963a = new ArrayList();

    public final void a(String str) {
        if (!this.f6963a.contains(F2.g(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException(AbstractC0628i.q("Command not implemented: ", str));
    }
}
