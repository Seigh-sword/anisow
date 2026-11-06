package androidx.lifecycle;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0322w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0314n f5641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0319t f5642b;

    public final void a(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        EnumC0314n enumC0314nA = enumC0313m.a();
        EnumC0314n enumC0314n = this.f5641a;
        AbstractC1305a.o(enumC0314n, "state1");
        if (enumC0314nA.compareTo(enumC0314n) < 0) {
            enumC0314n = enumC0314nA;
        }
        this.f5641a = enumC0314n;
        this.f5642b.b(interfaceC0321v, enumC0313m);
        this.f5641a = enumC0314nA;
    }
}
