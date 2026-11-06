package R4;

import java.util.Collection;
import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f3012a;

    static {
        Iterator itM = H1.a.m();
        AbstractC1305a.o(itM, "<this>");
        J4.d fVar = new J4.f(itM);
        if (!(fVar instanceof J4.a)) {
            fVar = new J4.a(fVar);
        }
        f3012a = J4.e.e0(fVar);
    }
}
