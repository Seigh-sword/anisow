package W2;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r extends k {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f4443y;

    public r(s sVar) {
        this.f4443y = sVar;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        s sVar = this.f4443y;
        Y2.b.e(i6, sVar.f4446C);
        int i7 = i6 * 2;
        int i8 = sVar.f4445B;
        Object[] objArr = sVar.f4444A;
        Object obj = objArr[i7 + i8];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i7 + (i8 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4443y.f4446C;
    }
}
