package h5;

import M4.C0063h;
import V4.InterfaceC0174e;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: h5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0792t extends AbstractC0794v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0784k f9119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0792t(T t5, InterfaceC0174e interfaceC0174e, InterfaceC0790q interfaceC0790q, InterfaceC0784k interfaceC0784k, int i6) {
        super(t5, interfaceC0174e, interfaceC0790q);
        this.f9118d = i6;
        this.f9119e = interfaceC0784k;
    }

    @Override // h5.AbstractC0794v
    public final Object b(D d6, Object[] objArr) throws Throwable {
        int i6 = this.f9118d;
        InterfaceC0784k interfaceC0784k = this.f9119e;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return interfaceC0784k.b(d6);
            default:
                InterfaceC0782i interfaceC0782i = (InterfaceC0782i) interfaceC0784k.b(d6);
                InterfaceC1427e interfaceC1427e = (InterfaceC1427e) objArr[objArr.length - 1];
                try {
                    C0063h c0063h = new C0063h(1, AbstractC1305a.H(interfaceC1427e));
                    c0063h.v();
                    c0063h.x(new C0796x(interfaceC0782i, 2));
                    interfaceC0782i.c(new C0797y(c0063h, 2));
                    return c0063h.u();
                } catch (Exception e6) {
                    AbstractC1305a.V(e6, interfaceC1427e);
                    return EnumC1481a.f13592w;
                }
        }
    }
}
