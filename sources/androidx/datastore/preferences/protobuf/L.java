package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L extends N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f5392c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List d(int i6, long j6, Object obj) {
        List listN;
        List list;
        List list2 = (List) C0.f5363c.i(j6, obj);
        if (!list2.isEmpty()) {
            if (f5392c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + i6);
                arrayList.addAll(list2);
                list = arrayList;
            } else if (list2 instanceof x0) {
                J j7 = new J(list2.size() + i6);
                j7.addAll((x0) list2);
                list = j7;
            } else {
                if (!(list2 instanceof InterfaceC0275f0) || !(list2 instanceof E)) {
                    return list2;
                }
                E e6 = (E) list2;
                if (((AbstractC0268c) e6).f5436w) {
                    return list2;
                }
                listN = e6.n(list2.size() + i6);
            }
            C0.s(j6, obj, list);
            return list;
        }
        listN = list2 instanceof K ? new J(i6) : ((list2 instanceof InterfaceC0275f0) && (list2 instanceof E)) ? ((E) list2).n(i6) : new ArrayList(i6);
        C0.s(j6, obj, listN);
        return listN;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final void a(long j6, Object obj) {
        Object objUnmodifiableList;
        List list = (List) C0.f5363c.i(j6, obj);
        if (list instanceof K) {
            objUnmodifiableList = ((K) list).i();
        } else {
            if (f5392c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0275f0) && (list instanceof E)) {
                AbstractC0268c abstractC0268c = (AbstractC0268c) ((E) list);
                if (abstractC0268c.f5436w) {
                    abstractC0268c.f5436w = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        C0.s(j6, obj, objUnmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final void b(long j6, Object obj, Object obj2) {
        List list = (List) C0.f5363c.i(j6, obj2);
        List listD = d(list.size(), j6, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        C0.s(j6, obj, list);
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final List c(long j6, Object obj) {
        return d(10, j6, obj);
    }
}
