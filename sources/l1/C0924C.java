package l1;

import com.google.android.gms.common.api.Status;
import d.AbstractC0628i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0924C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9843b;

    public C0924C(int i6) {
        if (i6 != 1) {
            this.f9842a = new HashMap();
            this.f9843b = new HashMap();
        } else {
            this.f9842a = Collections.synchronizedMap(new WeakHashMap());
            this.f9843b = Collections.synchronizedMap(new WeakHashMap());
        }
    }

    public final void a(boolean z5, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f9842a) {
            map = new HashMap(this.f9842a);
        }
        synchronized (this.f9843b) {
            map2 = new HashMap(this.f9843b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                AbstractC0628i.p(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((q2.j) entry2.getKey()).b(new V1.e(status));
            }
        }
    }
}
