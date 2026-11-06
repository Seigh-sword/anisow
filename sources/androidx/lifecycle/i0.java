package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5627a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f5627a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
