package J4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import s4.AbstractC1305a;
import s4.C1311g;
import t4.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends AbstractC1305a {
    public static final void b0(LinkedHashMap linkedHashMap, C1311g[] c1311gArr) {
        for (C1311g c1311g : c1311gArr) {
            linkedHashMap.put(c1311g.f12632w, c1311g.f12633x);
        }
    }

    public static Map c0(ArrayList arrayList) {
        q qVar = q.f12757w;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1305a.M(arrayList.size()));
            d0(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        C1311g c1311g = (C1311g) arrayList.get(0);
        AbstractC1305a.o(c1311g, "pair");
        Map mapSingletonMap = Collections.singletonMap(c1311g.f12632w, c1311g.f12633x);
        AbstractC1305a.n(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final void d0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1311g c1311g = (C1311g) it.next();
            linkedHashMap.put(c1311g.f12632w, c1311g.f12633x);
        }
    }
}
