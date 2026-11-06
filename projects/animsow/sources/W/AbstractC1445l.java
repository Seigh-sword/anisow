package w;

import java.util.ArrayList;

/* JADX INFO: renamed from: w.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1445l extends C1437d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f13489q0;

    @Override // w.C1437d
    public void D() {
        this.f13489q0.clear();
        super.D();
    }

    @Override // w.C1437d
    public final void G(P0.h hVar) {
        super.G(hVar);
        int size = this.f13489q0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((C1437d) this.f13489q0.get(i6)).G(hVar);
        }
    }

    public abstract void S();
}
