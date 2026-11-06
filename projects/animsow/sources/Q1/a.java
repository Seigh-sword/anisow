package Q1;

import E1.d;
import android.util.SparseArray;
import d.AbstractC0628i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f2792a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f2793b;

    static {
        HashMap map = new HashMap();
        f2793b = map;
        map.put(d.f385w, 0);
        map.put(d.f386x, 1);
        map.put(d.f387y, 2);
        for (d dVar : map.keySet()) {
            f2792a.append(((Integer) f2793b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f2793b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i6) {
        d dVar = (d) f2792a.get(i6);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(AbstractC0628i.f("Unknown Priority for value ", i6));
    }
}
