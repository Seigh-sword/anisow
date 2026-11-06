package x;

import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13623d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13626g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f13620a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13621b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13622c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13624e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13627h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f13628i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13629j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f13630k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f13631l = new ArrayList();

    public f(p pVar) {
        this.f13623d = pVar;
    }

    @Override // x.d
    public final void a(d dVar) {
        ArrayList<f> arrayList = this.f13631l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f13629j) {
                return;
            }
        }
        this.f13622c = true;
        p pVar = this.f13620a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f13621b) {
            this.f13623d.a(this);
            return;
        }
        f fVar = null;
        int i6 = 0;
        for (f fVar2 : arrayList) {
            if (!(fVar2 instanceof g)) {
                i6++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i6 == 1 && fVar.f13629j) {
            g gVar = this.f13628i;
            if (gVar != null) {
                if (!gVar.f13629j) {
                    return;
                } else {
                    this.f13625f = this.f13627h * gVar.f13626g;
                }
            }
            d(fVar.f13626g + this.f13625f);
        }
        p pVar2 = this.f13620a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f13630k.add(dVar);
        if (this.f13629j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f13631l.clear();
        this.f13630k.clear();
        this.f13629j = false;
        this.f13626g = 0;
        this.f13622c = false;
        this.f13621b = false;
    }

    public void d(int i6) {
        if (this.f13629j) {
            return;
        }
        this.f13629j = true;
        this.f13626g = i6;
        for (d dVar : this.f13630k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13623d.f13654b.f13381h0);
        sb.append(":");
        sb.append(AbstractC0628i.y(this.f13624e));
        sb.append("(");
        sb.append(this.f13629j ? Integer.valueOf(this.f13626g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f13631l.size());
        sb.append(":d=");
        sb.append(this.f13630k.size());
        sb.append(">");
        return sb.toString();
    }
}
