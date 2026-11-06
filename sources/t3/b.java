package T3;

import Q3.A;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3452c = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f3454b;

    public b(Q3.n nVar, A a6, Class cls) {
        this.f3454b = new s(nVar, a6, cls);
        this.f3453a = cls;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) {
        if (aVar.W() == 9) {
            aVar.S();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.J()) {
            arrayList.add(this.f3454b.b(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Class cls = this.f3453a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i6 = 0; i6 < size; i6++) {
            Array.set(objNewInstance, i6, arrayList.get(i6));
        }
        return objNewInstance;
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.J();
            return;
        }
        bVar.c();
        int length = Array.getLength(obj);
        for (int i6 = 0; i6 < length; i6++) {
            this.f3454b.c(bVar, Array.get(obj, i6));
        }
        bVar.k();
    }
}
