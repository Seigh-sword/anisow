package C1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f126a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f128c;

    public j(long j6) {
        this.f127b = j6;
    }

    public final synchronized Object a(Object obj) {
        i iVar;
        iVar = (i) this.f126a.get(obj);
        return iVar != null ? iVar.f124a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j6 = iB;
        if (j6 >= this.f127b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f128c += j6;
        }
        i iVar = (i) this.f126a.put(obj, obj2 == null ? null : new i(iB, obj2));
        if (iVar != null) {
            this.f128c -= (long) iVar.f125b;
            if (!iVar.f124a.equals(obj2)) {
                c(obj, iVar.f124a);
            }
        }
        e(this.f127b);
        return iVar != null ? iVar.f124a : null;
    }

    public final synchronized void e(long j6) {
        while (this.f128c > j6) {
            Iterator it = this.f126a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            i iVar = (i) entry.getValue();
            this.f128c -= (long) iVar.f125b;
            Object key = entry.getKey();
            it.remove();
            c(key, iVar.f124a);
        }
    }

    public void c(Object obj, Object obj2) {
    }
}
