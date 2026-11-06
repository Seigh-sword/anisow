package W1;

import android.os.Bundle;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements V1.i, V1.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1.d f4280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z f4282e;

    public Y(V1.d dVar, boolean z5) {
        this.f4280c = dVar;
        this.f4281d = z5;
    }

    @Override // W1.InterfaceC0210d
    public final void D(Bundle bundle) {
        AbstractC1332d.n(this.f4282e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f4282e.D(bundle);
    }

    @Override // W1.InterfaceC0210d
    public final void b(int i6) {
        AbstractC1332d.n(this.f4282e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f4282e.b(i6);
    }

    @Override // W1.InterfaceC0216j
    public final void e(U1.b bVar) {
        AbstractC1332d.n(this.f4282e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f4282e.s(bVar, this.f4280c, this.f4281d);
    }
}
