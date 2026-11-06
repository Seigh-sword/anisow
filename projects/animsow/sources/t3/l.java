package T3;

import Q3.A;
import Q3.y;
import Q3.z;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f3477c = new j(1, y.f2821w);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q3.n f3478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f3479b;

    public l(Q3.n nVar, z zVar) {
        this.f3478a = nVar;
        this.f3479b = zVar;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iW = aVar.W();
        int iB = u.h.b(iW);
        if (iB == 0) {
            aVar.b();
            arrayList = new ArrayList();
        } else if (iB != 2) {
            arrayList = null;
        } else {
            aVar.c();
            arrayList = new S3.p(true);
        }
        if (arrayList == null) {
            return d(aVar, iW);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.J()) {
                String strQ = arrayList instanceof Map ? aVar.Q() : null;
                int iW2 = aVar.W();
                int iB2 = u.h.b(iW2);
                if (iB2 == 0) {
                    aVar.b();
                    arrayList2 = new ArrayList();
                } else if (iB2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.c();
                    arrayList2 = new S3.p(true);
                }
                boolean z5 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, iW2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strQ, arrayList2);
                }
                if (z5) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.k();
                } else {
                    aVar.l();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.J();
            return;
        }
        Class<?> cls = obj.getClass();
        Q3.n nVar = this.f3478a;
        nVar.getClass();
        A aC = nVar.c(new TypeToken(cls));
        if (!(aC instanceof l)) {
            aC.c(bVar, obj);
        } else {
            bVar.g();
            bVar.l();
        }
    }

    public final Serializable d(X3.a aVar, int i6) {
        int iB = u.h.b(i6);
        if (iB == 5) {
            return aVar.U();
        }
        if (iB == 6) {
            return this.f3479b.a(aVar);
        }
        if (iB == 7) {
            return Boolean.valueOf(aVar.M());
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(H1.a.D(i6)));
        }
        aVar.S();
        return null;
    }
}
