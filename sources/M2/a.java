package M2;

import android.graphics.Typeface;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Typeface f1808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1243i f1809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1810z;

    public a(C1243i c1243i, Typeface typeface) {
        this.f1808x = typeface;
        this.f1809y = c1243i;
    }

    @Override // com.bumptech.glide.c
    public final void B(int i6) {
        if (this.f1810z) {
            return;
        }
        H2.b bVar = (H2.b) this.f1809y.f12254x;
        if (bVar.j(this.f1808x)) {
            bVar.h(false);
        }
    }

    @Override // com.bumptech.glide.c
    public final void C(Typeface typeface, boolean z5) {
        if (this.f1810z) {
            return;
        }
        H2.b bVar = (H2.b) this.f1809y.f12254x;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
