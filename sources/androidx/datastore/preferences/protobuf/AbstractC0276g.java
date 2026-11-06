package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0276g implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C0274f c0274f = (C0274f) this;
        int i6 = c0274f.f5441w;
        if (i6 >= c0274f.f5442x) {
            throw new NoSuchElementException();
        }
        c0274f.f5441w = i6 + 1;
        return Byte.valueOf(c0274f.f5443y.h(i6));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
