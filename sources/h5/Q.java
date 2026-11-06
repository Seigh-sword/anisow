package h5;

import b3.C0343c;
import d.AbstractC0628i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f9033l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f9034m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V4.r f9036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V4.q f9038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p.b f9039e = new p.b(7);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1486b f9040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V4.t f9041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0343c f9043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0343c f9044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public V4.E f9045k;

    public Q(String str, V4.r rVar, String str2, V4.p pVar, V4.t tVar, boolean z5, boolean z6, boolean z7) {
        this.f9035a = str;
        this.f9036b = rVar;
        this.f9037c = str2;
        this.f9041g = tVar;
        this.f9042h = z5;
        this.f9040f = pVar != null ? pVar.e() : new C1486b(2);
        if (z6) {
            this.f9044j = new C0343c(11);
            return;
        }
        if (z7) {
            C0343c c0343c = new C0343c(12);
            this.f9043i = c0343c;
            V4.t tVar2 = V4.v.f3920f;
            if (tVar2 == null) {
                throw new NullPointerException("type == null");
            }
            if (tVar2.f3915b.equals("multipart")) {
                c0343c.f5931x = tVar2;
            } else {
                throw new IllegalArgumentException("multipart != " + tVar2);
            }
        }
    }

    public final void a(String str, String str2, boolean z5) {
        C0343c c0343c = this.f9044j;
        if (z5) {
            c0343c.getClass();
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            ((List) c0343c.f5930w).add(V4.r.a(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, (Charset) c0343c.f5932y));
            ((List) c0343c.f5931x).add(V4.r.a(str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, (Charset) c0343c.f5932y));
            return;
        }
        c0343c.getClass();
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        ((List) c0343c.f5930w).add(V4.r.a(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, (Charset) c0343c.f5932y));
        ((List) c0343c.f5931x).add(V4.r.a(str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, (Charset) c0343c.f5932y));
    }

    public final void b(String str, String str2, boolean z5) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f9041g = V4.t.a(str2);
                return;
            } catch (IllegalArgumentException e6) {
                throw new IllegalArgumentException(AbstractC0628i.q("Malformed content type: ", str2), e6);
            }
        }
        C1486b c1486b = this.f9040f;
        if (!z5) {
            c1486b.a(str, str2);
            return;
        }
        c1486b.getClass();
        V4.p.a(str);
        c1486b.b(str, str2);
    }

    public final void c(V4.p pVar, V4.E e6) {
        C0343c c0343c = this.f9043i;
        c0343c.getClass();
        if (e6 == null) {
            throw new NullPointerException("body == null");
        }
        if (pVar != null && pVar.c("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (pVar != null && pVar.c("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((List) c0343c.f5932y).add(new V4.u(pVar, e6));
    }

    public final void d(String str, String str2, boolean z5) {
        V4.q qVar;
        String str3 = this.f9037c;
        if (str3 != null) {
            V4.r rVar = this.f9036b;
            rVar.getClass();
            try {
                qVar = new V4.q();
                qVar.b(rVar, str3);
            } catch (IllegalArgumentException unused) {
                qVar = null;
            }
            this.f9038d = qVar;
            if (qVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + rVar + ", Relative: " + this.f9037c);
            }
            this.f9037c = null;
        }
        if (z5) {
            V4.q qVar2 = this.f9038d;
            if (str == null) {
                qVar2.getClass();
                throw new NullPointerException("encodedName == null");
            }
            if (qVar2.f3896d == null) {
                qVar2.f3896d = new ArrayList();
            }
            qVar2.f3896d.add(V4.r.a(str, 0, str.length(), " \"'<>#&=", true, false, true, true, null));
            qVar2.f3896d.add(str2 != null ? V4.r.a(str2, 0, str2.length(), " \"'<>#&=", true, false, true, true, null) : null);
            return;
        }
        V4.q qVar3 = this.f9038d;
        if (str == null) {
            qVar3.getClass();
            throw new NullPointerException("name == null");
        }
        if (qVar3.f3896d == null) {
            qVar3.f3896d = new ArrayList();
        }
        qVar3.f3896d.add(V4.r.a(str, 0, str.length(), " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true, null));
        qVar3.f3896d.add(str2 != null ? V4.r.a(str2, 0, str2.length(), " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true, null) : null);
    }
}
