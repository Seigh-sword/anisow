package t4;

import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: t4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1352i implements Iterable, E4.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object[] f12754w;

    public C1352i(Object[] objArr) {
        this.f12754w = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Object[] objArr = this.f12754w;
        AbstractC1305a.o(objArr, "array");
        return new C1345b(objArr);
    }
}
