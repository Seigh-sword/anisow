package W1;

import X1.AbstractC0242j;
import X1.InterfaceC0236d;
import X1.InterfaceC0243k;
import java.util.Set;
import m.RunnableC0969k;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0236d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V1.b f4242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0207a f4243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0243k f4244c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f4245d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4246e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0211e f4247f;

    public G(C0211e c0211e, AbstractC0242j abstractC0242j, C0207a c0207a) {
        this.f4247f = c0211e;
        this.f4242a = abstractC0242j;
        this.f4243b = c0207a;
    }

    @Override // X1.InterfaceC0236d
    public final void a(U1.b bVar) {
        this.f4247f.f4312I.post(new RunnableC0969k(this, 18, bVar));
    }

    public final void b(U1.b bVar) {
        E e6 = (E) this.f4247f.f4309F.get(this.f4243b);
        if (e6 != null) {
            e6.o(bVar);
        }
    }
}
