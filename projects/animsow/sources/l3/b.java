package L3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f1731b;

    public b(Set set, c cVar) {
        this.f1730a = b(set);
        this.f1731b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f1728a);
            sb.append('/');
            sb.append(aVar.f1729b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        c cVar = this.f1731b;
        synchronized (((Set) cVar.f1734x)) {
            setUnmodifiableSet = Collections.unmodifiableSet((Set) cVar.f1734x);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f1730a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((Set) cVar.f1734x)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((Set) cVar.f1734x);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
