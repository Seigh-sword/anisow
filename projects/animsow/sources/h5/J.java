package h5;

import d.AbstractC0628i;
import d2.AbstractC0651b;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0651b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9016h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f9017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0790q f9019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f9020l;

    public J(Method method, int i6, V4.p pVar, InterfaceC0790q interfaceC0790q) {
        this.f9017i = method;
        this.f9018j = i6;
        this.f9020l = pVar;
        this.f9019k = interfaceC0790q;
    }

    @Override // d2.AbstractC0651b
    public final void a(Q q5, Object obj) {
        int i6 = this.f9016h;
        InterfaceC0790q interfaceC0790q = this.f9019k;
        Object obj2 = this.f9020l;
        Method method = this.f9017i;
        int i7 = this.f9018j;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (obj == null) {
                    return;
                }
                try {
                    q5.c((V4.p) obj2, (V4.E) interfaceC0790q.k(obj));
                    return;
                } catch (IOException e6) {
                    throw d0.k(method, i7, "Unable to convert " + obj + " to RequestBody", e6);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw d0.k(method, i7, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw d0.k(method, i7, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw d0.k(method, i7, AbstractC0628i.j("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    q5.c(V4.p.f("Content-Disposition", AbstractC0628i.j("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (V4.E) interfaceC0790q.k(value));
                }
                return;
        }
    }

    public J(Method method, int i6, InterfaceC0790q interfaceC0790q, String str) {
        this.f9017i = method;
        this.f9018j = i6;
        this.f9019k = interfaceC0790q;
        this.f9020l = str;
    }
}
