package R4;

import M4.m0;
import java.util.Iterator;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f3037a;

    static {
        String property;
        Object next;
        int i6 = w.f3043a;
        m0 m0VarC = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        Iterator itR = H1.a.r();
        AbstractC1305a.o(itR, "<this>");
        J4.d fVar = new J4.f(itR);
        if (!(fVar instanceof J4.a)) {
            fVar = new J4.a(fVar);
        }
        List listE0 = J4.e.e0(fVar);
        Iterator it = listE0.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iA = ((o) next).a();
                do {
                    Object next2 = it.next();
                    int iA2 = ((o) next2).a();
                    if (iA < iA2) {
                        next = next2;
                        iA = iA2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        o oVar = (o) next;
        if (oVar != null) {
            try {
                m0VarC = oVar.c(listE0);
            } catch (Throwable unused2) {
                oVar.b();
            }
            if (m0VarC != null) {
                f3037a = m0VarC;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
