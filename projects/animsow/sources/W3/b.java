package W3;

import Q3.A;
import Q3.q;
import d.AbstractC0628i;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class b extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T3.a f4474b = new T3.a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4475a = new SimpleDateFormat("hh:mm:ss a");

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        Time time;
        if (aVar.W() == 9) {
            aVar.S();
            return null;
        }
        String strU = aVar.U();
        try {
            synchronized (this) {
                time = new Time(this.f4475a.parse(strU).getTime());
            }
            return time;
        } catch (ParseException e6) {
            StringBuilder sbN = AbstractC0628i.n("Failed parsing '", strU, "' as SQL Time; at path ");
            sbN.append(aVar.u(true));
            throw new q(sbN.toString(), e6);
        }
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.J();
            return;
        }
        synchronized (this) {
            str = this.f4475a.format((Date) time);
        }
        bVar.Q(str);
    }
}
