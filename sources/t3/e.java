package T3;

import Q3.A;
import d.AbstractC0628i;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e extends A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3460b = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3461a;

    public e() {
        ArrayList arrayList = new ArrayList();
        this.f3461a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (S3.j.f3258a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        Date dateB;
        if (aVar.W() == 9) {
            aVar.S();
            return null;
        }
        String strU = aVar.U();
        synchronized (this.f3461a) {
            try {
                Iterator it = this.f3461a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = U3.a.b(strU, new ParsePosition(0));
                            break;
                        } catch (ParseException e6) {
                            StringBuilder sbN = AbstractC0628i.n("Failed parsing '", strU, "' as Date; at path ");
                            sbN.append(aVar.u(true));
                            throw new Q3.q(sbN.toString(), e6);
                        }
                    }
                    try {
                        dateB = ((DateFormat) it.next()).parse(strU);
                    } catch (ParseException unused) {
                    }
                }
            } finally {
            }
        }
        return dateB;
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.J();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f3461a.get(0);
        synchronized (this.f3461a) {
            str = dateFormat.format(date);
        }
        bVar.Q(str);
    }
}
