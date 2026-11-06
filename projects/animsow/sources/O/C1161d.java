package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1161d extends AbstractC1163f implements Iterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1160c f11710w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11711x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C1164g f11712y;

    public C1161d(C1164g c1164g) {
        this.f11712y = c1164g;
    }

    @Override // o.AbstractC1163f
    public final void a(C1160c c1160c) {
        C1160c c1160c2 = this.f11710w;
        if (c1160c == c1160c2) {
            C1160c c1160c3 = c1160c2.f11709z;
            this.f11710w = c1160c3;
            this.f11711x = c1160c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11711x) {
            return this.f11712y.f11715w != null;
        }
        C1160c c1160c = this.f11710w;
        return (c1160c == null || c1160c.f11708y == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1160c c1160c;
        if (this.f11711x) {
            this.f11711x = false;
            c1160c = this.f11712y.f11715w;
        } else {
            C1160c c1160c2 = this.f11710w;
            c1160c = c1160c2 != null ? c1160c2.f11708y : null;
        }
        this.f11710w = c1160c;
        return this.f11710w;
    }
}
