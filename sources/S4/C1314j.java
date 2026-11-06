package s4;

import java.io.Serializable;

/* JADX INFO: renamed from: s4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1314j implements InterfaceC1309e, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C4.a f12636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile Object f12637x = C1315k.f12639a;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f12638y = this;

    public C1314j(C4.a aVar) {
        this.f12636w = aVar;
    }

    public final boolean a() {
        return this.f12637x != C1315k.f12639a;
    }

    @Override // s4.InterfaceC1309e
    public final Object getValue() {
        Object objB;
        Object obj = this.f12637x;
        C1315k c1315k = C1315k.f12639a;
        if (obj != c1315k) {
            return obj;
        }
        synchronized (this.f12638y) {
            objB = this.f12637x;
            if (objB == c1315k) {
                C4.a aVar = this.f12636w;
                AbstractC1305a.l(aVar);
                objB = aVar.b();
                this.f12637x = objB;
                this.f12636w = null;
            }
        }
        return objB;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
