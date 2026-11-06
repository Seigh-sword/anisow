package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0287l0 extends AbstractMap {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f5479C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile r0 f5480A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5482w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5485z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f5483x = Collections.emptyList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f5484y = Collections.emptyMap();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Map f5481B = Collections.emptyMap();

    public C0287l0(int i6) {
        this.f5482w = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f5483x
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f5483x
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.p0 r2 = (androidx.datastore.preferences.protobuf.p0) r2
            java.lang.Comparable r2 = r2.f5500w
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r1 = -r0
            goto L47
        L1e:
            if (r2 != 0) goto L21
            goto L47
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L44
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f5483x
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.p0 r3 = (androidx.datastore.preferences.protobuf.p0) r3
            java.lang.Comparable r3 = r3.f5500w
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            r1 = r2
            goto L47
        L44:
            int r0 = r0 + 1
            goto L1c
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0287l0.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f5485z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        b();
        if (!this.f5483x.isEmpty()) {
            this.f5483x.clear();
        }
        if (this.f5484y.isEmpty()) {
            return;
        }
        this.f5484y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f5484y.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.f5480A == null) {
            this.f5480A = new r0(this);
        }
        return this.f5480A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0287l0)) {
            return super.equals(obj);
        }
        C0287l0 c0287l0 = (C0287l0) obj;
        int size = size();
        if (size != c0287l0.size()) {
            return false;
        }
        int size2 = this.f5483x.size();
        if (size2 != c0287l0.f5483x.size()) {
            return entrySet().equals(c0287l0.entrySet());
        }
        for (int i6 = 0; i6 < size2; i6++) {
            if (!h(i6).equals(c0287l0.h(i6))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f5484y.equals(c0287l0.f5484y);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((p0) this.f5483x.get(iA)).f5501x : this.f5484y.get(comparable);
    }

    public final Map.Entry h(int i6) {
        return (Map.Entry) this.f5483x.get(i6);
    }

    public final Iterable i() {
        return this.f5484y.isEmpty() ? o0.f5495b : this.f5484y.entrySet();
    }

    public final SortedMap j() {
        b();
        if (this.f5484y.isEmpty() && !(this.f5484y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5484y = treeMap;
            this.f5481B = treeMap.descendingMap();
        }
        return (SortedMap) this.f5484y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int size = this.f5483x.size();
        int iHashCode = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iHashCode += ((p0) this.f5483x.get(i6)).hashCode();
        }
        return this.f5484y.size() > 0 ? iHashCode + this.f5484y.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((p0) this.f5483x.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f5483x.isEmpty();
        int i6 = this.f5482w;
        if (zIsEmpty && !(this.f5483x instanceof ArrayList)) {
            this.f5483x = new ArrayList(i6);
        }
        int i7 = -(iA + 1);
        if (i7 >= i6) {
            return j().put(comparable, obj);
        }
        if (this.f5483x.size() == i6) {
            p0 p0Var = (p0) this.f5483x.remove(i6 - 1);
            j().put(p0Var.f5500w, p0Var.f5501x);
        }
        this.f5483x.add(i7, new p0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return n(iA);
        }
        if (this.f5484y.isEmpty()) {
            return null;
        }
        return this.f5484y.remove(comparable);
    }

    public final Object n(int i6) {
        b();
        Object obj = ((p0) this.f5483x.remove(i6)).f5501x;
        if (!this.f5484y.isEmpty()) {
            Iterator it = j().entrySet().iterator();
            List list = this.f5483x;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new p0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f5484y.size() + this.f5483x.size();
    }
}
