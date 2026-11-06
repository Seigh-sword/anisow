package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0441k implements Iterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Iterator f6852w;

    public C0441k(Iterator it) {
        this.f6852w = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6852w.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C0471p((String) this.f6852w.next());
    }
}
