package androidx.work;

import I0.f;
import I0.g;
import I0.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // I0.j
    public final g a(ArrayList arrayList) throws Throwable {
        f fVar = new f(0);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((g) it.next()).f1100a));
        }
        fVar.a(map);
        g gVar = new g(fVar.f1097a);
        g.b(gVar);
        return gVar;
    }
}
