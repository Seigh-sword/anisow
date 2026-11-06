package W2;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s extends o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final transient Object[] f4444A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final transient int f4445B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final transient int f4446C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final transient n f4447z;

    public s(n nVar, Object[] objArr, int i6) {
        this.f4447z = nVar;
        this.f4444A = objArr;
        this.f4446C = i6;
    }

    @Override // W2.h
    public final int b(Object[] objArr) {
        k kVarJ = this.f4437x;
        if (kVarJ == null) {
            kVarJ = j();
            this.f4437x = kVarJ;
        }
        return kVarJ.b(objArr);
    }

    @Override // W2.h, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f4447z.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k kVarJ = this.f4437x;
        if (kVarJ == null) {
            kVarJ = j();
            this.f4437x = kVarJ;
        }
        return kVarJ.listIterator(0);
    }

    public final k j() {
        return new r(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4446C;
    }
}
