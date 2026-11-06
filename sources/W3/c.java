package W3;

import Q3.A;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class c extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T3.a f4476b = new T3.a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f4477a;

    public c(A a6) {
        this.f4477a = a6;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) {
        Date date = (Date) this.f4477a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) {
        this.f4477a.c(bVar, (Timestamp) obj);
    }
}
