package W1;

import X1.C0239g;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.RunnableC0969k;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends o2.c implements V1.i, V1.j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Z1.b f4264j = n2.b.f11699a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f4266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z1.b f4267e = f4264j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f4268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0239g f4269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n2.c f4270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G f4271i;

    public Q(Context context, com.google.android.gms.internal.measurement.X x5, C0239g c0239g) {
        this.f4265c = context;
        this.f4266d = x5;
        this.f4269g = c0239g;
        this.f4268f = c0239g.f4590b;
    }

    @Override // W1.InterfaceC0210d
    public final void D(Bundle bundle) {
        this.f4270h.d(this);
    }

    @Override // W1.InterfaceC0210d
    public final void b(int i6) {
        G g4 = this.f4271i;
        E e6 = (E) g4.f4247f.f4309F.get(g4.f4243b);
        if (e6 != null) {
            if (e6.f4236k) {
                e6.o(new U1.b(17));
            } else {
                e6.b(i6);
            }
        }
    }

    @Override // W1.InterfaceC0216j
    public final void e(U1.b bVar) {
        this.f4271i.b(bVar);
    }

    @Override // o2.e
    public final void n(o2.i iVar) {
        this.f4266d.post(new RunnableC0969k(this, 19, iVar));
    }
}
