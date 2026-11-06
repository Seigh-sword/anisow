package androidx.datastore.preferences.protobuf;

import d.AbstractC0628i;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0267b0 implements InterfaceC0283j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0266b f5433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f5434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0295u f5435c;

    public C0267b0(u0 u0Var, C0295u c0295u, AbstractC0266b abstractC0266b) {
        this.f5434b = u0Var;
        c0295u.getClass();
        this.f5435c = c0295u;
        this.f5433a = abstractC0266b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final boolean a(Object obj) {
        this.f5435c.getClass();
        AbstractC0628i.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final void b(Object obj, C0289n c0289n, C0294t c0294t) {
        this.f5434b.getClass();
        u0.a(obj);
        this.f5435c.getClass();
        AbstractC0628i.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final void c(Object obj, L3.c cVar) {
        this.f5435c.getClass();
        AbstractC0628i.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final void d(Object obj, Object obj2) {
        AbstractC0285k0.B(this.f5434b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final boolean e(Object obj, Object obj2) {
        u0 u0Var = this.f5434b;
        u0Var.getClass();
        t0 t0Var = ((C) obj).unknownFields;
        u0Var.getClass();
        return t0Var.equals(((C) obj2).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final int f(Object obj) {
        this.f5434b.getClass();
        t0 t0Var = ((C) obj).unknownFields;
        int i6 = t0Var.f5520d;
        if (i6 != -1) {
            return i6;
        }
        int iE = 0;
        for (int i7 = 0; i7 < t0Var.f5517a; i7++) {
            int i8 = t0Var.f5518b[i7] >>> 3;
            iE += AbstractC0292q.e(3, (AbstractC0280i) t0Var.f5519c[i7]) + AbstractC0292q.w(2, i8) + (AbstractC0292q.v(1) * 2);
        }
        t0Var.f5520d = iE;
        return iE;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final C g() {
        AbstractC0266b abstractC0266b = this.f5433a;
        return abstractC0266b instanceof C ? ((C) abstractC0266b).l() : ((A) ((C) abstractC0266b).f(5)).d();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final void h(Object obj) {
        this.f5434b.getClass();
        u0.b(obj);
        this.f5435c.getClass();
        AbstractC0628i.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final int i(Object obj) {
        this.f5434b.getClass();
        return ((C) obj).unknownFields.hashCode();
    }
}
