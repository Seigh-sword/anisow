package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0463n3;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends AbstractSet {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f5512x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(C0287l0 c0287l0) {
        this(c0287l0, 0);
        this.f5511w = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i6 = this.f5511w;
        AbstractMap abstractMap = this.f5512x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((C0287l0) abstractMap).put((Comparable) entry.getKey(), entry.getValue());
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((AbstractC0463n3) abstractMap).e((Comparable) entry2.getKey(), entry2.getValue());
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i6 = this.f5511w;
        AbstractMap abstractMap = this.f5512x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0287l0) abstractMap).clear();
                break;
            default:
                ((AbstractC0463n3) abstractMap).a();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i6 = this.f5511w;
        AbstractMap abstractMap = this.f5512x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C0287l0) abstractMap).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    if (obj2 == null || !obj2.equals(value)) {
                    }
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object objB = ((AbstractC0463n3) abstractMap).b(entry2.getKey());
                Object value2 = entry2.getValue();
                if (objB != value2) {
                    if (objB == null || !objB.equals(value2)) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i6 = this.f5511w;
        AbstractMap abstractMap = this.f5512x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new q0((C0287l0) abstractMap);
            default:
                return new q0((AbstractC0463n3) abstractMap);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i6 = this.f5511w;
        AbstractMap abstractMap = this.f5512x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((C0287l0) abstractMap).remove(entry.getKey());
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((AbstractC0463n3) abstractMap).c(entry2.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i6 = this.f5511w;
        AbstractMap abstractMap = this.f5512x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return ((C0287l0) abstractMap).size();
            default:
                return ((AbstractC0463n3) abstractMap).d();
        }
    }

    public /* synthetic */ r0(AbstractMap abstractMap, int i6) {
        this.f5511w = i6;
        this.f5512x = abstractMap;
    }
}
