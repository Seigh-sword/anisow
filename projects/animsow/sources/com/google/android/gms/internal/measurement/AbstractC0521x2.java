package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0521x2 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C0509v2 c0509v2 = (C0509v2) this;
        int i6 = c0509v2.f6978w;
        if (i6 >= c0509v2.f6979x) {
            throw new NoSuchElementException();
        }
        c0509v2.f6978w = i6 + 1;
        return Byte.valueOf(c0509v2.f6980y.h(i6));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
