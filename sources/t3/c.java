package T3;

import Q3.A;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3455a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3457c;

    public c(Q3.n nVar, Type type, A a6, S3.q qVar) {
        this.f3456b = new s(nVar, a6, type);
        this.f3457c = qVar;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) {
        int i6 = this.f3455a;
        Object obj = this.f3456b;
        Object obj2 = this.f3457c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (aVar.W() == 9) {
                    aVar.S();
                    return null;
                }
                Collection collection = (Collection) ((S3.q) obj2).h();
                aVar.b();
                while (aVar.J()) {
                    collection.add(((A) obj).b(aVar));
                }
                aVar.k();
                return collection;
            default:
                Object objB = ((t) obj2).f3510y.b(aVar);
                if (objB != null) {
                    Class cls = (Class) obj;
                    if (!cls.isInstance(objB)) {
                        throw new Q3.q("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.u(true));
                    }
                }
                return objB;
        }
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        switch (this.f3455a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.c();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((A) this.f3456b).c(bVar, it.next());
                    }
                    bVar.k();
                } else {
                    bVar.J();
                }
                break;
            default:
                ((t) this.f3457c).f3510y.c(bVar, obj);
                break;
        }
    }

    public c(t tVar, Class cls) {
        this.f3457c = tVar;
        this.f3456b = cls;
    }
}
