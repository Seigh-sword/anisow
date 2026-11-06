package t4;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: t4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1349f extends AbstractList implements List, E4.a {
    public abstract int b();

    public abstract Object c(int i6);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i6) {
        return c(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
