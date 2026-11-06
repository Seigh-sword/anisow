package J3;

import b3.C0343c;
import java.util.HashMap;
import y3.C1508a;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0343c f1427a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C1508a c1508a = z3.g.f14122a;
        map.put(q.class, C0047c.f1395a);
        map2.remove(q.class);
        map.put(K3.e.class, C0046b.f1393a);
        map2.remove(K3.e.class);
        map.put(K3.d.class, C0045a.f1377a);
        map2.remove(K3.d.class);
        HashMap map3 = new HashMap(map);
        HashMap map4 = new HashMap(map2);
        C0343c c0343c = new C0343c();
        c0343c.f5930w = map3;
        c0343c.f5931x = map4;
        c0343c.f5932y = c1508a;
        f1427a = c0343c;
    }
}
