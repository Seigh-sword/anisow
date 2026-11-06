package l4;

import C4.l;
import J3.w;
import V0.h;
import W2.m;
import W2.v;
import android.content.Context;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import java.io.Closeable;
import k4.InterfaceC0900a;
import l0.C0921c;
import m0.C1001b;
import m4.C1131d;
import m4.C1136i;
import m4.InterfaceC1130c;
import q4.InterfaceC1266a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10066c;

    public /* synthetic */ d(Object obj, int i6, Object obj2) {
        this.f10064a = i6;
        this.f10066c = obj;
        this.f10065b = obj2;
    }

    @Override // androidx.lifecycle.e0
    public final b0 c(Class cls, C0921c c0921c) {
        Object objJ;
        switch (this.f10064a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                final g gVar = new g();
                InterfaceC0900a interfaceC0900a = (InterfaceC0900a) this.f10065b;
                Q qB = U.b(c0921c);
                w wVar = (w) interfaceC0900a;
                wVar.getClass();
                wVar.f1443c = qB;
                wVar.f1444d = gVar;
                h hVar = new h((V0.f) wVar.f1441a, (V0.c) wVar.f1442b);
                h hVar2 = (h) ((e) S3.a.r(e.class, hVar));
                hVar2.getClass();
                Y2.b.g(8, "expectedSize");
                m mVar = new m(8);
                mVar.b("g1.c", hVar2.f3693a);
                mVar.b("g1.e", hVar2.f3694b);
                mVar.b("Z0.p", hVar2.f3695c);
                mVar.b("g1.g", hVar2.f3696d);
                mVar.b("g1.i", hVar2.f3697e);
                mVar.b("g1.j", hVar2.f3698f);
                mVar.b("g1.l", hVar2.f3699g);
                mVar.b("g1.m", hVar2.f3700h);
                InterfaceC1266a interfaceC1266a = (InterfaceC1266a) mVar.a().get(cls.getName());
                l lVar = (l) c0921c.f9835a.get(f.f10067d);
                ((e) S3.a.r(e.class, hVar)).getClass();
                Object obj = v.f4453C.get(cls);
                if (obj == null) {
                    if (lVar != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (interfaceC1266a == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    objJ = interfaceC1266a.get();
                } else {
                    if (interfaceC1266a != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (lVar == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    objJ = lVar.j(obj);
                }
                b0 b0Var = (b0) objJ;
                Closeable closeable = new Closeable() { // from class: l4.c
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        gVar.a();
                    }
                };
                b0Var.getClass();
                C1001b c1001b = b0Var.f5607a;
                if (c1001b != null) {
                    if (c1001b.f10436d) {
                        C1001b.a(closeable);
                    } else {
                        synchronized (c1001b.f10433a) {
                            c1001b.f10435c.add(closeable);
                        }
                    }
                }
                return b0Var;
            default:
                C1136i c1136i = new C1136i();
                c1136i.f11670a = c0921c;
                return new C1131d(new V0.c(((V0.f) ((InterfaceC1130c) com.bumptech.glide.c.s((Context) this.f10065b, InterfaceC1130c.class))).f3689b), c1136i);
        }
    }
}
