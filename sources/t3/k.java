package T3;

import Q3.A;
import Q3.y;
import Q3.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f3475b = new j(0, new k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f3476a = y.f2822x;

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        int iW = aVar.W();
        int iB = u.h.b(iW);
        if (iB == 5 || iB == 6) {
            return this.f3476a.a(aVar);
        }
        if (iB == 8) {
            aVar.S();
            return null;
        }
        throw new Q3.q("Expecting number, got: " + H1.a.D(iW) + "; at path " + aVar.u(false));
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        bVar.P((Number) obj);
    }
}
