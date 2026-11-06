package t4;

import W.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {
    public static void X(Iterable iterable, ArrayList arrayList) {
        AbstractC1305a.o(iterable, "elements");
        if (iterable instanceof Collection) {
            arrayList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    public static final boolean Y(Collection collection, Q q5, boolean z5) {
        Iterator it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (((Boolean) q5.j(it.next())).booleanValue() == z5) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }
}
