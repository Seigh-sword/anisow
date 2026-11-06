package J4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t4.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends g {
    public static List e0(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return p.f12756w;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return S3.a.D(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
