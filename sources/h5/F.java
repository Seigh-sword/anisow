package h5;

import d2.AbstractC0651b;
import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0651b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f9002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC0790q f9004j;

    public F(Method method, int i6, InterfaceC0790q interfaceC0790q) {
        this.f9002h = method;
        this.f9003i = i6;
        this.f9004j = interfaceC0790q;
    }

    @Override // d2.AbstractC0651b
    public final void a(Q q5, Object obj) {
        int i6 = this.f9003i;
        Method method = this.f9002h;
        if (obj == null) {
            throw d0.k(method, i6, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            q5.f9045k = (V4.E) this.f9004j.k(obj);
        } catch (IOException e6) {
            throw d0.l(method, e6, i6, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
