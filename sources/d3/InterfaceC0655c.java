package d3;

import java.util.Set;

/* JADX INFO: renamed from: d3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0655c {
    default Object a(Class cls) {
        return f(r.a(cls));
    }

    default D3.c b(Class cls) {
        return c(r.a(cls));
    }

    D3.c c(r rVar);

    D3.b d(r rVar);

    D3.c e(r rVar);

    default Object f(r rVar) {
        D3.c cVarC = c(rVar);
        if (cVarC == null) {
            return null;
        }
        return cVarC.get();
    }

    default Set g(r rVar) {
        return (Set) e(rVar).get();
    }
}
