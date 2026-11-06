package H1;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r implements E1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f952c;

    public r(Set set, j jVar, t tVar) {
        this.f950a = set;
        this.f951b = jVar;
        this.f952c = tVar;
    }

    public final s a(String str, E1.c cVar, E1.e eVar) {
        Set set = this.f950a;
        if (set.contains(cVar)) {
            return new s(this.f951b, str, cVar, eVar, this.f952c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
