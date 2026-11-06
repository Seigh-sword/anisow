package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import m2.C1074u;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Iterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5528w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Iterator f5529x;

    public w0(x0 x0Var) {
        this.f5529x = x0Var.f5535w.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5528w) {
        }
        return this.f5529x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5528w) {
        }
        return (String) this.f5529x.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5528w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public w0(C1074u c1074u) {
        this.f5529x = c1074u.f11108w.keySet().iterator();
    }
}
