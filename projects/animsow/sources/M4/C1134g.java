package m4;

import V0.l;
import h0.AbstractComponentCallbacksC0734B;
import h0.D;
import n4.C1157a;
import o4.InterfaceC1228a;
import o4.InterfaceC1229b;

/* JADX INFO: renamed from: m4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1134g implements InterfaceC1229b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile InterfaceC1228a f11667x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f11669z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11666w = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f11668y = new Object();

    public C1134g(L3.c cVar) {
        this.f11669z = cVar;
    }

    public final V0.d a() {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = (AbstractComponentCallbacksC0734B) this.f11669z;
        D d6 = abstractComponentCallbacksC0734B.f8606Q;
        if ((d6 == null ? null : d6.f8641B) == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        boolean z5 = (d6 == null ? null : d6.f8641B) instanceof InterfaceC1229b;
        Class<?> cls = (d6 == null ? null : d6.f8641B).getClass();
        if (!z5) {
            throw new IllegalStateException("Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: " + cls);
        }
        D d7 = abstractComponentCallbacksC0734B.f8606Q;
        V0.a aVar = (V0.a) ((InterfaceC1135h) S3.a.r(InterfaceC1135h.class, d7 != null ? d7.f8641B : null));
        V0.f fVar = aVar.f3680a;
        abstractComponentCallbacksC0734B.getClass();
        return new V0.d(aVar.f3682c);
    }

    @Override // o4.InterfaceC1229b
    public final Object c() {
        switch (this.f11666w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (this.f11667x == null) {
                    synchronized (this.f11668y) {
                        if (this.f11667x == null) {
                            L3.c cVar = (L3.c) this.f11669z;
                            cVar.getClass();
                            S0.f fVar = new S0.f();
                            C1157a c1157a = new C1157a((l) cVar.f1734x);
                            fVar.f3073x = c1157a;
                            this.f11667x = new V0.f(c1157a);
                        }
                        break;
                    }
                }
                return this.f11667x;
            default:
                if (this.f11667x == null) {
                    synchronized (this.f11668y) {
                        try {
                            if (this.f11667x == null) {
                                this.f11667x = a();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return this.f11667x;
        }
    }

    public C1134g(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        this.f11669z = abstractComponentCallbacksC0734B;
    }
}
