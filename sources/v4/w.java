package V4;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import m2.C1018C;
import n3.C1154a;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f3934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1018C f3935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SocketFactory f3936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e5.c f3937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0175f f3938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1154a f3939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1154a f3940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public K1.b f3941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1154a f3942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f3949v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3931d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f3932e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0180k f3928a = new C0180k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f3929b = x.f3950V;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3930c = x.f3951W;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J3.G f3933f = new J3.G(26, m.f3884a);

    public w() {
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f3934g = proxySelector;
        if (proxySelector == null) {
            this.f3934g = new d5.a();
        }
        this.f3935h = InterfaceC0179j.f3878k;
        this.f3936i = SocketFactory.getDefault();
        this.f3937j = e5.c.f8299a;
        this.f3938k = C0175f.f3837c;
        C1154a c1154a = InterfaceC0171b.f3820j;
        this.f3939l = c1154a;
        this.f3940m = c1154a;
        this.f3941n = new K1.b(24);
        this.f3942o = InterfaceC0181l.f3883l;
        this.f3943p = true;
        this.f3944q = true;
        this.f3945r = true;
        this.f3946s = 0;
        this.f3947t = 10000;
        this.f3948u = 10000;
        this.f3949v = 10000;
    }
}
