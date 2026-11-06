package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V {
    public static int a(Object obj, int i6, Object obj2) {
        U u5 = (U) obj;
        T t5 = (T) obj2;
        int i7 = 0;
        if (!u5.isEmpty()) {
            for (Map.Entry entry : u5.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                t5.getClass();
                int iV = AbstractC0292q.v(i6);
                int iA = T.a(t5.f5409a, key, value);
                i7 = H1.a.i(iA, iA, iV, i7);
            }
        }
        return i7;
    }

    public static U b(Object obj, Object obj2) {
        U uD = (U) obj;
        U u5 = (U) obj2;
        if (!u5.isEmpty()) {
            if (!uD.f5413w) {
                uD = uD.d();
            }
            uD.a();
            if (!u5.isEmpty()) {
                uD.putAll(u5);
            }
        }
        return uD;
    }

    public static void c(Object obj) {
        ((U) obj).f5413w = false;
    }
}
