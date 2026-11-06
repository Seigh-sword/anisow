package V4;

import java.io.Serializable;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f3896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f3900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Serializable f3901i;

    public q() {
        this.f3893a = 0;
        this.f3898f = "";
        this.f3899g = "";
        this.f3895c = -1;
        ArrayList arrayList = new ArrayList();
        this.f3894b = arrayList;
        arrayList.add("");
    }

    public final r a() {
        if (((String) this.f3897e) == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (((String) this.f3900h) != null) {
            return new r(this);
        }
        throw new IllegalStateException("host == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(V4.r r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.q.b(V4.r, java.lang.String):void");
    }

    public final String toString() {
        String str;
        switch (this.f3893a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                StringBuilder sb = new StringBuilder();
                String str2 = (String) this.f3897e;
                if (str2 != null) {
                    sb.append(str2);
                    str = "://";
                } else {
                    str = "//";
                }
                sb.append(str);
                if (!((String) this.f3898f).isEmpty() || !((String) this.f3899g).isEmpty()) {
                    sb.append((String) this.f3898f);
                    if (!((String) this.f3899g).isEmpty()) {
                        sb.append(':');
                        sb.append((String) this.f3899g);
                    }
                    sb.append('@');
                }
                String str3 = (String) this.f3900h;
                if (str3 != null) {
                    if (str3.indexOf(58) != -1) {
                        sb.append('[');
                        sb.append((String) this.f3900h);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f3900h);
                    }
                }
                int iB = this.f3895c;
                if (iB != -1 || ((String) this.f3897e) != null) {
                    if (iB == -1) {
                        iB = r.b((String) this.f3897e);
                    }
                    String str4 = (String) this.f3897e;
                    if (str4 == null || iB != r.b(str4)) {
                        sb.append(':');
                        sb.append(iB);
                    }
                }
                List list = this.f3894b;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    sb.append('/');
                    sb.append((String) list.get(i6));
                }
                if (this.f3896d != null) {
                    sb.append('?');
                    List list2 = this.f3896d;
                    int size2 = list2.size();
                    for (int i7 = 0; i7 < size2; i7 += 2) {
                        String str5 = (String) list2.get(i7);
                        String str6 = (String) list2.get(i7 + 1);
                        if (i7 > 0) {
                            sb.append('&');
                        }
                        sb.append(str5);
                        if (str6 != null) {
                            sb.append('=');
                            sb.append(str6);
                        }
                    }
                }
                if (((String) this.f3901i) != null) {
                    sb.append('#');
                    sb.append((String) this.f3901i);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public q(C0170a c0170a, K1.b bVar, A a6, m mVar) {
        List listK;
        this.f3893a = 1;
        this.f3894b = Collections.emptyList();
        this.f3896d = Collections.emptyList();
        this.f3901i = new ArrayList();
        this.f3897e = c0170a;
        this.f3898f = bVar;
        this.f3899g = a6;
        this.f3900h = mVar;
        Proxy proxy = c0170a.f3816h;
        if (proxy != null) {
            listK = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = c0170a.f3815g.select(c0170a.f3809a.l());
            listK = (listSelect == null || listSelect.isEmpty()) ? W4.b.k(Proxy.NO_PROXY) : W4.b.j(listSelect);
        }
        this.f3894b = listK;
        this.f3895c = 0;
    }
}
