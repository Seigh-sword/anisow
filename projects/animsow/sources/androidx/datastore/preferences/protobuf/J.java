package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0268c implements K, RandomAccess {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f5385x;

    static {
        new J(10).f5436w = false;
    }

    public J(int i6) {
        this(new ArrayList(i6));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        b();
        this.f5385x.add(i6, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0268c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        b();
        if (collection instanceof K) {
            collection = ((K) collection).o();
        }
        boolean zAddAll = this.f5385x.addAll(i6, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0268c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f5385x.clear();
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[PHI: r2
      0x0049: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v7 java.lang.String) binds: [B:16:0x005f, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(int r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f5385x
            java.lang.Object r1 = r0.get(r8)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Ld
            java.lang.String r1 = (java.lang.String) r1
            goto L62
        Ld:
            boolean r2 = r1 instanceof androidx.datastore.preferences.protobuf.AbstractC0280i
            if (r2 == 0) goto L4e
            androidx.datastore.preferences.protobuf.i r1 = (androidx.datastore.preferences.protobuf.AbstractC0280i) r1
            r1.getClass()
            java.nio.charset.Charset r2 = androidx.datastore.preferences.protobuf.F.f5369a
            int r3 = r1.size()
            if (r3 != 0) goto L21
            java.lang.String r2 = ""
            goto L34
        L21:
            r3 = r1
            androidx.datastore.preferences.protobuf.j r3 = (androidx.datastore.preferences.protobuf.C0282j) r3
            java.lang.String r4 = new java.lang.String
            int r5 = r3.l()
            int r6 = r3.size()
            byte[] r3 = r3.f5459z
            r4.<init>(r3, r5, r6, r2)
            r2 = r4
        L34:
            androidx.datastore.preferences.protobuf.j r1 = (androidx.datastore.preferences.protobuf.C0282j) r1
            int r3 = r1.l()
            int r4 = r1.size()
            int r4 = r4 + r3
            androidx.datastore.preferences.protobuf.D0 r5 = androidx.datastore.preferences.protobuf.F0.f5371a
            byte[] r1 = r1.f5459z
            int r1 = r5.f(r3, r4, r1)
            if (r1 != 0) goto L4c
        L49:
            r0.set(r8, r2)
        L4c:
            r1 = r2
            goto L62
        L4e:
            byte[] r1 = (byte[]) r1
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.F.f5369a
            r2.<init>(r1, r3)
            androidx.datastore.preferences.protobuf.D0 r3 = androidx.datastore.preferences.protobuf.F0.f5371a
            int r4 = r1.length
            r5 = 0
            int r1 = r3.f(r5, r4, r1)
            if (r1 != 0) goto L4c
            goto L49
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.J.get(int):java.lang.Object");
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final K i() {
        return this.f5436w ? new x0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final void k(AbstractC0280i abstractC0280i) {
        b();
        this.f5385x.add(abstractC0280i);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final Object m(int i6) {
        return this.f5385x.get(i6);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final E n(int i6) {
        ArrayList arrayList = this.f5385x;
        if (i6 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i6);
        arrayList2.addAll(arrayList);
        return new J(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final List o() {
        return Collections.unmodifiableList(this.f5385x);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0268c, java.util.AbstractList, java.util.List
    public final Object remove(int i6) {
        b();
        Object objRemove = this.f5385x.remove(i6);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC0280i)) {
            return new String((byte[]) objRemove, F.f5369a);
        }
        AbstractC0280i abstractC0280i = (AbstractC0280i) objRemove;
        abstractC0280i.getClass();
        Charset charset = F.f5369a;
        if (abstractC0280i.size() == 0) {
            return "";
        }
        C0282j c0282j = (C0282j) abstractC0280i;
        return new String(c0282j.f5459z, c0282j.l(), c0282j.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        b();
        Object obj2 = this.f5385x.set(i6, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC0280i)) {
            return new String((byte[]) obj2, F.f5369a);
        }
        AbstractC0280i abstractC0280i = (AbstractC0280i) obj2;
        abstractC0280i.getClass();
        Charset charset = F.f5369a;
        if (abstractC0280i.size() == 0) {
            return "";
        }
        C0282j c0282j = (C0282j) abstractC0280i;
        return new String(c0282j.f5459z, c0282j.l(), c0282j.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5385x.size();
    }

    public J(ArrayList arrayList) {
        this.f5385x = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0268c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f5385x.size(), collection);
    }
}
