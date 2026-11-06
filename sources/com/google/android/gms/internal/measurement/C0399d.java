package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0399d implements Iterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Iterator f6781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Iterator f6782x;

    public C0399d(Iterator it, Iterator it2) {
        this.f6781w = it;
        this.f6782x = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6781w.hasNext()) {
            return true;
        }
        return this.f6782x.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.f6781w;
        if (it.hasNext()) {
            return new C0471p(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f6782x;
        if (it2.hasNext()) {
            return new C0471p((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
