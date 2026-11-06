package M2;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f1811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f1812o;

    public b(d dVar, com.bumptech.glide.c cVar) {
        this.f1812o = dVar;
        this.f1811n = cVar;
    }

    @Override // com.bumptech.glide.d
    public final void s(int i6) {
        this.f1812o.f1829m = true;
        this.f1811n.B(i6);
    }

    @Override // com.bumptech.glide.d
    public final void t(Typeface typeface) {
        d dVar = this.f1812o;
        dVar.f1830n = Typeface.create(typeface, dVar.f1819c);
        dVar.f1829m = true;
        this.f1811n.C(dVar.f1830n, false);
    }
}
