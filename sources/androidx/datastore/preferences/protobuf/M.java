package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M extends N {
    @Override // androidx.datastore.preferences.protobuf.N
    public final void a(long j6, Object obj) {
        ((AbstractC0268c) ((E) C0.f5363c.i(j6, obj))).f5436w = false;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final void b(long j6, Object obj, Object obj2) {
        B0 b02 = C0.f5363c;
        E eN = (E) b02.i(j6, obj);
        E e6 = (E) b02.i(j6, obj2);
        int size = eN.size();
        int size2 = e6.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0268c) eN).f5436w) {
                eN = eN.n(size2 + size);
            }
            eN.addAll(e6);
        }
        if (size > 0) {
            e6 = eN;
        }
        C0.s(j6, obj, e6);
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final List c(long j6, Object obj) {
        E e6 = (E) C0.f5363c.i(j6, obj);
        if (((AbstractC0268c) e6).f5436w) {
            return e6;
        }
        int size = e6.size();
        E eN = e6.n(size == 0 ? 10 : size * 2);
        C0.s(j6, obj, eN);
        return eN;
    }
}
