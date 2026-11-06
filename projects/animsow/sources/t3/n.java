package T3;

import Q3.A;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m3.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3493a;

    public n(LinkedHashMap linkedHashMap) {
        this.f3493a = linkedHashMap;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        if (aVar.W() == 9) {
            aVar.S();
            return null;
        }
        Object objD = d();
        try {
            aVar.c();
            while (aVar.J()) {
                m mVar = (m) this.f3493a.get(aVar.Q());
                if (mVar == null || !mVar.f3484e) {
                    aVar.c0();
                } else {
                    f(objD, aVar, mVar);
                }
            }
            aVar.l();
            return e(objD);
        } catch (IllegalAccessException e6) {
            v0 v0Var = V3.c.f3745a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalStateException e7) {
            throw new Q3.q(e7);
        }
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.J();
            return;
        }
        bVar.g();
        try {
            Iterator it = this.f3493a.values().iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(bVar, obj);
            }
            bVar.l();
        } catch (IllegalAccessException e6) {
            v0 v0Var = V3.c.f3745a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, X3.a aVar, m mVar);
}
