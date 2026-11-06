package R4;

import M4.AbstractC0056a;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public class t extends AbstractC0056a implements x4.d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC1427e f3039z;

    public t(InterfaceC1427e interfaceC1427e, InterfaceC1432j interfaceC1432j) {
        super(interfaceC1432j, true);
        this.f3039z = interfaceC1427e;
    }

    @Override // M4.k0
    public final boolean Q() {
        return true;
    }

    @Override // x4.d
    public final x4.d e() {
        InterfaceC1427e interfaceC1427e = this.f3039z;
        if (interfaceC1427e instanceof x4.d) {
            return (x4.d) interfaceC1427e;
        }
        return null;
    }

    @Override // M4.k0
    public void v(Object obj) {
        a.c(AbstractC1305a.H(this.f3039z), AbstractC1305a.R(obj), null);
    }

    @Override // M4.k0
    public void w(Object obj) {
        this.f3039z.o(AbstractC1305a.R(obj));
    }
}
