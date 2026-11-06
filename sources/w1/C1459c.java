package w1;

import android.content.Context;
import java.util.Set;

/* JADX INFO: renamed from: w1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1459c implements InterfaceC1458b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f13562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1457a f13563x;

    public C1459c(Context context, com.bumptech.glide.n nVar) {
        this.f13562w = context.getApplicationContext();
        this.f13563x = nVar;
    }

    @Override // w1.InterfaceC1465i
    public final void e() {
        C1474r c1474rE = C1474r.e(this.f13562w);
        InterfaceC1457a interfaceC1457a = this.f13563x;
        synchronized (c1474rE) {
            ((Set) c1474rE.f13584x).remove(interfaceC1457a);
            c1474rE.g();
        }
    }

    @Override // w1.InterfaceC1465i
    public final void i() {
        C1474r c1474rE = C1474r.e(this.f13562w);
        InterfaceC1457a interfaceC1457a = this.f13563x;
        synchronized (c1474rE) {
            ((Set) c1474rE.f13584x).add(interfaceC1457a);
            c1474rE.f();
        }
    }

    @Override // w1.InterfaceC1465i
    public final void j() {
    }
}
