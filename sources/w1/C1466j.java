package w1;

import androidx.lifecycle.AbstractC0315o;
import androidx.lifecycle.C0323x;
import java.util.Map;
import u1.C1358b;

/* JADX INFO: renamed from: w1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1466j implements InterfaceC1465i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC0315o f13570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1358b f13571x;

    public C1466j(C1358b c1358b, C0323x c0323x) {
        this.f13571x = c1358b;
        this.f13570w = c0323x;
    }

    @Override // w1.InterfaceC1465i
    public final void j() {
        ((Map) this.f13571x.f12822x).remove(this.f13570w);
    }

    @Override // w1.InterfaceC1465i
    public final void e() {
    }

    @Override // w1.InterfaceC1465i
    public final void i() {
    }
}
