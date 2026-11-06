package I1;

import android.content.Context;
import q4.InterfaceC1266a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements J1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1266a f1135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1266a f1136b;

    public g(J1.c cVar, e eVar) {
        this.f1135a = cVar;
        this.f1136b = eVar;
    }

    @Override // q4.InterfaceC1266a
    public final Object get() {
        return new f((Context) this.f1135a.get(), (d) this.f1136b.get());
    }
}
