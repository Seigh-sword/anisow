package s4;

import java.io.Serializable;

/* JADX INFO: renamed from: s4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1317m implements InterfaceC1309e, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C4.a f12641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f12642x;

    public final boolean a() {
        return this.f12642x != C1315k.f12639a;
    }

    @Override // s4.InterfaceC1309e
    public final Object getValue() {
        if (this.f12642x == C1315k.f12639a) {
            C4.a aVar = this.f12641w;
            AbstractC1305a.l(aVar);
            this.f12642x = aVar.b();
            this.f12641w = null;
        }
        return this.f12642x;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
