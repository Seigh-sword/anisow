package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0302b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5605a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5606b;

    public C0302b(HashMap map) {
        this.f5606b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0313m enumC0313m = (EnumC0313m) entry.getValue();
            List arrayList = (List) this.f5605a.get(enumC0313m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f5605a.put(enumC0313m, arrayList);
            }
            arrayList.add((C0303c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0303c c0303c = (C0303c) list.get(size);
                c0303c.getClass();
                try {
                    int i6 = c0303c.f5608a;
                    Method method = c0303c.f5609b;
                    if (i6 == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i6 == 1) {
                        method.invoke(obj, interfaceC0321v);
                    } else if (i6 == 2) {
                        method.invoke(obj, interfaceC0321v, enumC0313m);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to call observer method", e7.getCause());
                }
            }
        }
    }
}
