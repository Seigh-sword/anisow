package o0;

import M4.C0078x;
import P4.C0150k;
import P4.InterfaceC0146g;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m.RunnableC0969k;
import s4.AbstractC1305a;
import s4.C1314j;
import v0.AbstractC1414x;
import v0.C1390c;
import v4.C1433k;
import v4.InterfaceC1432j;

/* JADX INFO: renamed from: o0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1193k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1414x f11973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0.O f11974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1432j f11975c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11977e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1185g f11979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f11980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f11981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f11982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final W.Q f11983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1314j f11984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RunnableC0969k f11985m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P4.q0 f11976d = P4.d0.b(Boolean.FALSE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f11978f = new AtomicReference(null);

    public C1193k(X0.a aVar, C1390c c1390c, InterfaceC1432j interfaceC1432j, InterfaceC1432j interfaceC1432j2) {
        this.f11973a = aVar;
        this.f11974b = c1390c;
        this.f11975c = interfaceC1432j2;
        C1185g c1185g = new C1185g(this, interfaceC1432j);
        this.f11979g = c1185g;
        this.f11980h = new AtomicInteger(0);
        InterfaceC0146g c0150k = new C0150k(new C1191j(AbstractC1305a.h(new W.C(c1185g.f11869j, 2), -1), null, this));
        S4.e eVar = M4.J.f1851a;
        M4.m0 m0Var = R4.p.f3037a;
        if (m0Var.n(C0078x.f1930x) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + m0Var).toString());
        }
        if (!AbstractC1305a.c(m0Var, C1433k.f13309w) && (c0150k instanceof Q4.s)) {
            S3.a.q((Q4.s) c0150k, m0Var, 0, null, 6);
        }
        this.f11981i = new AtomicReference(null);
        this.f11982j = new CopyOnWriteArrayList();
        this.f11983k = new W.Q(3, this);
        this.f11984l = new C1314j(C1176c.f11901y);
        this.f11985m = new RunnableC0969k(this);
    }
}
