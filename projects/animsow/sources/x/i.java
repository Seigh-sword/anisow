package x;

import w.C1437d;
import w.C1441h;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {
    @Override // x.d
    public final void a(d dVar) {
        f fVar = this.f13660h;
        if (fVar.f13622c && !fVar.f13629j) {
            fVar.d((int) ((((f) fVar.f13631l.get(0)).f13626g * ((C1441h) this.f13654b).f13480q0) + 0.5f));
        }
    }

    @Override // x.p
    public final void d() {
        p pVar;
        C1437d c1437d = this.f13654b;
        C1441h c1441h = (C1441h) c1437d;
        int i6 = c1441h.f13481r0;
        int i7 = c1441h.f13482s0;
        int i8 = c1441h.f13484u0;
        f fVar = this.f13660h;
        if (i8 == 1) {
            if (i6 != -1) {
                fVar.f13631l.add(c1437d.f13359T.f13372d.f13660h);
                this.f13654b.f13359T.f13372d.f13660h.f13630k.add(fVar);
                fVar.f13625f = i6;
            } else if (i7 != -1) {
                fVar.f13631l.add(c1437d.f13359T.f13372d.f13661i);
                this.f13654b.f13359T.f13372d.f13661i.f13630k.add(fVar);
                fVar.f13625f = -i7;
            } else {
                fVar.f13621b = true;
                fVar.f13631l.add(c1437d.f13359T.f13372d.f13661i);
                this.f13654b.f13359T.f13372d.f13661i.f13630k.add(fVar);
            }
            m(this.f13654b.f13372d.f13660h);
            pVar = this.f13654b.f13372d;
        } else {
            if (i6 != -1) {
                fVar.f13631l.add(c1437d.f13359T.f13374e.f13660h);
                this.f13654b.f13359T.f13374e.f13660h.f13630k.add(fVar);
                fVar.f13625f = i6;
            } else if (i7 != -1) {
                fVar.f13631l.add(c1437d.f13359T.f13374e.f13661i);
                this.f13654b.f13359T.f13374e.f13661i.f13630k.add(fVar);
                fVar.f13625f = -i7;
            } else {
                fVar.f13621b = true;
                fVar.f13631l.add(c1437d.f13359T.f13374e.f13661i);
                this.f13654b.f13359T.f13374e.f13661i.f13630k.add(fVar);
            }
            m(this.f13654b.f13374e.f13660h);
            pVar = this.f13654b.f13374e;
        }
        m(pVar.f13661i);
    }

    @Override // x.p
    public final void e() {
        C1437d c1437d = this.f13654b;
        int i6 = ((C1441h) c1437d).f13484u0;
        f fVar = this.f13660h;
        if (i6 == 1) {
            c1437d.f13364Y = fVar.f13626g;
        } else {
            c1437d.f13365Z = fVar.f13626g;
        }
    }

    @Override // x.p
    public final void f() {
        this.f13660h.c();
    }

    @Override // x.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f13660h;
        fVar2.f13630k.add(fVar);
        fVar.f13631l.add(fVar2);
    }
}
