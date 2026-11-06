package T3;

import Q3.A;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final t f3516A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f3517B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f3518a = a(Class.class, new Q3.k(11).a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f3519b = a(BitSet.class, new Q3.k(21).a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q3.k f3520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f3521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f3522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f3523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f3524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f3525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f3526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t f3527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Q3.k f3528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f3529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Q3.k f3530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Q3.k f3531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Q3.k f3532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f3533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t f3534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t f3535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t f3536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t f3537t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final t f3538u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t f3539v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final t f3540w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u f3541x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t f3542y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Q3.k f3543z;

    static {
        Q3.k kVar = new Q3.k(22);
        f3520c = new Q3.k(23);
        f3521d = b(Boolean.TYPE, Boolean.class, kVar);
        f3522e = b(Byte.TYPE, Byte.class, new Q3.k(24));
        f3523f = b(Short.TYPE, Short.class, new Q3.k(25));
        f3524g = b(Integer.TYPE, Integer.class, new Q3.k(26));
        f3525h = a(AtomicInteger.class, new Q3.k(27).a());
        f3526i = a(AtomicBoolean.class, new Q3.k(28).a());
        int i6 = 1;
        f3527j = a(AtomicIntegerArray.class, new Q3.k(1).a());
        f3528k = new Q3.k(2);
        f3529l = b(Character.TYPE, Character.class, new Q3.k(5));
        Q3.k kVar2 = new Q3.k(6);
        f3530m = new Q3.k(7);
        f3531n = new Q3.k(8);
        f3532o = new Q3.k(9);
        f3533p = a(String.class, kVar2);
        f3534q = a(StringBuilder.class, new Q3.k(10));
        f3535r = a(StringBuffer.class, new Q3.k(12));
        f3536s = a(URL.class, new Q3.k(13));
        f3537t = a(URI.class, new Q3.k(14));
        f3538u = new t(InetAddress.class, new Q3.k(15), i6);
        f3539v = a(UUID.class, new Q3.k(16));
        f3540w = a(Currency.class, new Q3.k(17).a());
        f3541x = new u(Calendar.class, GregorianCalendar.class, new Q3.k(18), i6);
        f3542y = a(Locale.class, new Q3.k(19));
        Q3.k kVar3 = new Q3.k(20);
        f3543z = kVar3;
        f3516A = new t(Q3.p.class, kVar3, i6);
        f3517B = new a(2);
    }

    public static t a(Class cls, A a6) {
        return new t(cls, a6, 0);
    }

    public static u b(Class cls, Class cls2, A a6) {
        return new u(cls, cls2, a6, 0);
    }
}
