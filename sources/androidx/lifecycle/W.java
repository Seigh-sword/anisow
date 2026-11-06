package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import s4.AbstractC1305a;
import s4.C1314j;
import z0.C1523d;
import z0.InterfaceC1522c;

/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC1522c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1523d f5589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f5591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1314j f5592d;

    public W(C1523d c1523d, j0 j0Var) {
        AbstractC1305a.o(c1523d, "savedStateRegistry");
        AbstractC1305a.o(j0Var, "viewModelStoreOwner");
        this.f5589a = c1523d;
        this.f5592d = new C1314j(new V(0, j0Var));
    }

    @Override // z0.InterfaceC1522c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5591c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : b().f5593b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((Q) entry.getValue()).f5579e.a();
            if (!AbstractC1305a.c(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f5590b = false;
        return bundle;
    }

    public final X b() {
        return (X) this.f5592d.getValue();
    }

    public final void c() {
        if (this.f5590b) {
            return;
        }
        Bundle bundleA = this.f5589a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5591c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f5591c = bundle;
        this.f5590b = true;
        b();
    }
}
