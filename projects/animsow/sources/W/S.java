package W;

import M4.C0070o;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class S extends D4.i implements C4.p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final S f4056x = new S(2);

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Y y5 = (Y) obj;
        Throwable cancellationException = (Throwable) obj2;
        AbstractC1305a.o(y5, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        C0070o c0070o = (C0070o) y5.f4084b;
        c0070o.getClass();
        c0070o.S(new M4.r(cancellationException, false));
        return C1316l.f12640a;
    }
}
