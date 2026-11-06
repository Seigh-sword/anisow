package z0;

import android.os.Bundle;
import androidx.lifecycle.C0323x;
import androidx.lifecycle.EnumC0314n;
import d.C0624e;
import java.util.Map;
import o.C1161d;
import o.C1164g;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: z0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1524e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1525f f14071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1523d f14072b = new C1523d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14073c;

    public C1524e(InterfaceC1525f interfaceC1525f) {
        this.f14071a = interfaceC1525f;
    }

    public final void a() {
        InterfaceC1525f interfaceC1525f = this.f14071a;
        C0323x c0323xG = interfaceC1525f.g();
        if (c0323xG.f5645d != EnumC0314n.f5632x) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        c0323xG.a(new C1520a(interfaceC1525f));
        C1523d c1523d = this.f14072b;
        c1523d.getClass();
        if (!(!c1523d.f14066b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        c0323xG.a(new C0624e(2, c1523d));
        c1523d.f14066b = true;
        this.f14073c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f14073c) {
            a();
        }
        C0323x c0323xG = this.f14071a.g();
        if (!(!(c0323xG.f5645d.compareTo(EnumC0314n.f5634z) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c0323xG.f5645d).toString());
        }
        C1523d c1523d = this.f14072b;
        if (!c1523d.f14066b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!c1523d.f14068d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        c1523d.f14067c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c1523d.f14068d = true;
    }

    public final void c(Bundle bundle) {
        AbstractC1305a.o(bundle, "outBundle");
        C1523d c1523d = this.f14072b;
        c1523d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c1523d.f14067c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1164g c1164g = c1523d.f14065a;
        c1164g.getClass();
        C1161d c1161d = new C1161d(c1164g);
        c1164g.f11717y.put(c1161d, Boolean.FALSE);
        while (c1161d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1161d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC1522c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
