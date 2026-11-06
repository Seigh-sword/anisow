package p1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f12275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f12276c;

    public s(Map map) {
        this.f12275b = Collections.unmodifiableMap(map);
    }

    @Override // p1.p
    public final Map a() {
        if (this.f12276c == null) {
            synchronized (this) {
                try {
                    if (this.f12276c == null) {
                        this.f12276c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f12276c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f12275b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                String str = ((r) list.get(i6)).f12274a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i6 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f12275b.equals(((s) obj).f12275b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12275b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f12275b + '}';
    }
}
