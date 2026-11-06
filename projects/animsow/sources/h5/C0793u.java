package h5;

import M4.C0063h;
import V4.InterfaceC0174e;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: h5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0793u extends AbstractC0794v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0784k f9120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9121e;

    public C0793u(T t5, InterfaceC0174e interfaceC0174e, InterfaceC0790q interfaceC0790q, InterfaceC0784k interfaceC0784k, boolean z5) {
        super(t5, interfaceC0174e, interfaceC0790q);
        this.f9120d = interfaceC0784k;
        this.f9121e = z5;
    }

    @Override // h5.AbstractC0794v
    public final Object b(D d6, Object[] objArr) throws Throwable {
        InterfaceC0782i interfaceC0782i = (InterfaceC0782i) this.f9120d.b(d6);
        int i6 = 1;
        InterfaceC1427e interfaceC1427e = (InterfaceC1427e) objArr[objArr.length - 1];
        try {
            if (!this.f9121e) {
                return AbstractC1305a.d(interfaceC0782i, interfaceC1427e);
            }
            AbstractC1305a.m(interfaceC0782i, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            C0063h c0063h = new C0063h(1, AbstractC1305a.H(interfaceC1427e));
            c0063h.v();
            c0063h.x(new C0796x(interfaceC0782i, 1));
            interfaceC0782i.c(new C0797y(c0063h, i6));
            return c0063h.u();
        } catch (LinkageError e6) {
            throw e6;
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (VirtualMachineError e8) {
            throw e8;
        } catch (Throwable th) {
            AbstractC1305a.V(th, interfaceC1427e);
            return EnumC1481a.f13592w;
        }
    }
}
