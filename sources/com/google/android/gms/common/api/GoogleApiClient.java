package com.google.android.gms.common.api;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class GoogleApiClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f6432a = Collections.newSetFromMap(new WeakHashMap());

    public abstract void connect();

    public abstract boolean d();

    public abstract void disconnect();
}
