package g3;

import J3.G;
import M1.h;
import android.util.Log;
import d.AbstractC0628i;
import d3.p;
import java.util.concurrent.atomic.AtomicReference;
import m2.C1018C;
import m3.C1112m0;

/* JADX INFO: renamed from: g3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0730b implements InterfaceC0729a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1018C f8528c = new C1018C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D3.b f8529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8530b = new AtomicReference(null);

    public C0730b(D3.b bVar) {
        this.f8529a = bVar;
        ((p) bVar).a(new G(18, this));
    }

    public final C1018C a(String str) {
        InterfaceC0729a interfaceC0729a = (InterfaceC0729a) this.f8530b.get();
        return interfaceC0729a == null ? f8528c : ((C0730b) interfaceC0729a).a(str);
    }

    public final boolean b() {
        InterfaceC0729a interfaceC0729a = (InterfaceC0729a) this.f8530b.get();
        return interfaceC0729a != null && ((C0730b) interfaceC0729a).b();
    }

    public final boolean c(String str) {
        InterfaceC0729a interfaceC0729a = (InterfaceC0729a) this.f8530b.get();
        return interfaceC0729a != null && ((C0730b) interfaceC0729a).c(str);
    }

    public final void d(String str, String str2, long j6, C1112m0 c1112m0) {
        String strQ = AbstractC0628i.q("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strQ, null);
        }
        ((p) this.f8529a).a(new h(str, str2, j6, c1112m0, 3));
    }
}
