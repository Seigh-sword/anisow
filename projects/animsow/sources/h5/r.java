package h5;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0782i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f9115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC0782i f9116x;

    public r(Executor executor, InterfaceC0782i interfaceC0782i) {
        this.f9115w = executor;
        this.f9116x = interfaceC0782i;
    }

    @Override // h5.InterfaceC0782i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0782i clone() {
        return new r(this.f9115w, this.f9116x.clone());
    }

    @Override // h5.InterfaceC0782i
    public final void c(InterfaceC0785l interfaceC0785l) {
        this.f9116x.c(new C0786m(this, 2, interfaceC0785l));
    }

    @Override // h5.InterfaceC0782i
    public final void cancel() {
        this.f9116x.cancel();
    }

    @Override // h5.InterfaceC0782i
    public final V4.B g() {
        return this.f9116x.g();
    }

    @Override // h5.InterfaceC0782i
    public final boolean h() {
        return this.f9116x.h();
    }
}
