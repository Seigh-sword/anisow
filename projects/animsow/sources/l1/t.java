package l1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Iterable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f9976w;

    public t(ArrayList arrayList) {
        this.f9976w = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9976w.iterator();
    }
}
