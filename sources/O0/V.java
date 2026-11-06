package o0;

import P4.InterfaceC0147h;
import s4.AbstractC1305a;
import s4.C1316l;
import s4.InterfaceC1306b;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements InterfaceC0147h, D4.f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p1 f11859w;

    public V(p1 p1Var) {
        this.f11859w = p1Var;
    }

    @Override // D4.f
    public final InterfaceC1306b b() {
        return new D4.h(2, this.f11859w, p1.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0147h) && (obj instanceof D4.f)) {
            return AbstractC1305a.c(b(), ((D4.f) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    @Override // P4.InterfaceC0147h
    public final Object k(Object obj, InterfaceC1427e interfaceC1427e) {
        Object objA = this.f11859w.a((K0) obj, interfaceC1427e);
        return objA == EnumC1481a.f13592w ? objA : C1316l.f12640a;
    }
}
