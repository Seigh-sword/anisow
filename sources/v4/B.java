package V4;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f3753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f3754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f3755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C0173d f3756f;

    public B(p.b bVar) {
        this.f3751a = (r) bVar.f12205a;
        this.f3752b = (String) bVar.f12206b;
        C1486b c1486b = (C1486b) bVar.f12207c;
        c1486b.getClass();
        this.f3753c = new p(c1486b);
        this.f3754d = (E) bVar.f12208d;
        Map map = (Map) bVar.f12209e;
        byte[] bArr = W4.b.f4484a;
        this.f3755e = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final p.b a() {
        p.b bVar = new p.b();
        bVar.f12209e = Collections.emptyMap();
        bVar.f12205a = this.f3751a;
        bVar.f12206b = this.f3752b;
        bVar.f12208d = this.f3754d;
        Map map = this.f3755e;
        bVar.f12209e = map.isEmpty() ? Collections.emptyMap() : new LinkedHashMap(map);
        bVar.f12207c = this.f3753c.e();
        return bVar;
    }

    public final String toString() {
        return "Request{method=" + this.f3752b + ", url=" + this.f3751a + ", tags=" + this.f3755e + '}';
    }
}
