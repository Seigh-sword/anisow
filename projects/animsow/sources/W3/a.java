package W3;

import Q3.A;
import Q3.q;
import d.AbstractC0628i;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class a extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T3.a f4472b = new T3.a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4473a = new SimpleDateFormat("MMM d, yyyy");

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        Date date;
        if (aVar.W() == 9) {
            aVar.S();
            return null;
        }
        String strU = aVar.U();
        try {
            synchronized (this) {
                date = this.f4473a.parse(strU);
            }
            return new java.sql.Date(date.getTime());
        } catch (ParseException e6) {
            StringBuilder sbN = AbstractC0628i.n("Failed parsing '", strU, "' as SQL Date; at path ");
            sbN.append(aVar.u(true));
            throw new q(sbN.toString(), e6);
        }
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        String str;
        java.sql.Date date = (java.sql.Date) obj;
        if (date == null) {
            bVar.J();
            return;
        }
        synchronized (this) {
            str = this.f4473a.format((Date) date);
        }
        bVar.Q(str);
    }
}
