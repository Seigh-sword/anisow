package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6707a;

    static {
        f6707a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
