package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0277g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0277g0 f5444c = new C0277g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5446b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f5445a = new S();

    public final InterfaceC0283j0 a(Class cls) {
        C0269c0 c0269c0;
        N n5;
        u0 u0Var;
        V v5;
        C0295u c0295u;
        InterfaceC0283j0 interfaceC0283j0Z;
        C0267b0 c0267b0;
        Class cls2;
        F.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f5446b;
        InterfaceC0283j0 interfaceC0283j0 = (InterfaceC0283j0) concurrentHashMap.get(cls);
        if (interfaceC0283j0 != null) {
            return interfaceC0283j0;
        }
        S s5 = this.f5445a;
        s5.getClass();
        Class cls3 = AbstractC0285k0.f5467a;
        if (!C.class.isAssignableFrom(cls) && (cls2 = AbstractC0285k0.f5467a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        X xB = s5.f5408a.b(cls);
        C0281i0 c0281i0 = (C0281i0) xB;
        if ((c0281i0.f5458d & 2) == 2) {
            boolean zIsAssignableFrom = C.class.isAssignableFrom(cls);
            AbstractC0266b abstractC0266b = c0281i0.f5455a;
            if (zIsAssignableFrom) {
                c0267b0 = new C0267b0(AbstractC0285k0.f5470d, AbstractC0296v.f5522a, abstractC0266b);
            } else {
                u0 u0Var2 = AbstractC0285k0.f5468b;
                C0295u c0295u2 = AbstractC0296v.f5523b;
                if (c0295u2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c0267b0 = new C0267b0(u0Var2, c0295u2, abstractC0266b);
            }
            interfaceC0283j0Z = c0267b0;
        } else if (C.class.isAssignableFrom(cls)) {
            if (c0281i0.d() == 1) {
                c0269c0 = AbstractC0271d0.f5440b;
                n5 = N.f5405b;
                u0Var = AbstractC0285k0.f5470d;
                c0295u = AbstractC0296v.f5522a;
                v5 = W.f5415b;
                interfaceC0283j0Z = C0265a0.z(xB, c0269c0, n5, u0Var, c0295u, v5);
            } else {
                c0269c0 = AbstractC0271d0.f5440b;
                n5 = N.f5405b;
                u0Var = AbstractC0285k0.f5470d;
                v5 = W.f5415b;
                c0295u = null;
                interfaceC0283j0Z = C0265a0.z(xB, c0269c0, n5, u0Var, c0295u, v5);
            }
        } else if (c0281i0.d() == 1) {
            c0269c0 = AbstractC0271d0.f5439a;
            n5 = N.f5404a;
            u0 u0Var3 = AbstractC0285k0.f5468b;
            c0295u = AbstractC0296v.f5523b;
            if (c0295u == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            v5 = W.f5414a;
            u0Var = u0Var3;
            interfaceC0283j0Z = C0265a0.z(xB, c0269c0, n5, u0Var, c0295u, v5);
        } else {
            c0269c0 = AbstractC0271d0.f5439a;
            n5 = N.f5404a;
            u0Var = AbstractC0285k0.f5469c;
            v5 = W.f5414a;
            c0295u = null;
            interfaceC0283j0Z = C0265a0.z(xB, c0269c0, n5, u0Var, c0295u, v5);
        }
        InterfaceC0283j0 interfaceC0283j02 = (InterfaceC0283j0) concurrentHashMap.putIfAbsent(cls, interfaceC0283j0Z);
        return interfaceC0283j02 != null ? interfaceC0283j02 : interfaceC0283j0Z;
    }
}
