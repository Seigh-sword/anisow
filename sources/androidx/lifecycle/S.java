package androidx.lifecycle;

import java.io.Closeable;
import s4.AbstractC1305a;
import z0.C1523d;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC0319t, Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f5580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q f5581x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5582y;

    public S(String str, Q q5) {
        this.f5580w = str;
        this.f5581x = q5;
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        if (enumC0313m == EnumC0313m.ON_DESTROY) {
            this.f5582y = false;
            interfaceC0321v.g().b(this);
        }
    }

    public final void c(AbstractC0315o abstractC0315o, C1523d c1523d) {
        AbstractC1305a.o(c1523d, "registry");
        AbstractC1305a.o(abstractC0315o, "lifecycle");
        if (!(!this.f5582y)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f5582y = true;
        abstractC0315o.a(this);
        c1523d.c(this.f5580w, this.f5581x.f5579e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
