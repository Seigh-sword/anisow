package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: s.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1280b extends k implements Map {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C1279a f12493D;

    public C1280b(int i6) {
        if (i6 == 0) {
            this.f12532w = AbstractC1282d.f12504a;
            this.f12533x = AbstractC1282d.f12505b;
        } else {
            a(i6);
        }
        this.f12534y = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i6 = 0;
        if (this.f12493D == null) {
            this.f12493D = new C1279a(0, this);
        }
        C1279a c1279a = this.f12493D;
        if (((h) c1279a.f9698a) == null) {
            c1279a.f9698a = new h(c1279a, i6);
        }
        return (h) c1279a.f9698a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f12493D == null) {
            this.f12493D = new C1279a(0, this);
        }
        C1279a c1279a = this.f12493D;
        if (((h) c1279a.f9699b) == null) {
            c1279a.f9699b = new h(c1279a, 1);
        }
        return (h) c1279a.f9699b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f12534y);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f12493D == null) {
            this.f12493D = new C1279a(0, this);
        }
        C1279a c1279a = this.f12493D;
        if (c1279a.f9700c == null) {
            c1279a.f9700c = new j(c1279a);
        }
        return c1279a.f9700c;
    }

    public C1280b(C1280b c1280b) {
        if (c1280b != null) {
            i(c1280b);
        }
    }
}
