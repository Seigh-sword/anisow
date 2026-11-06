package J4;

import C4.l;
import W.Q;
import f.C0678d;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f1463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1464c;

    public c(K4.c cVar, Q q5) {
        this.f1462a = 1;
        this.f1464c = cVar;
        this.f1463b = q5;
    }

    @Override // J4.d
    public final Iterator iterator() {
        switch (this.f1462a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new b(this);
            default:
                return new h(this);
        }
    }

    public c(Q q5) {
        C0678d c0678d = C0678d.f8304x;
        this.f1462a = 0;
        this.f1464c = c0678d;
        this.f1463b = q5;
    }
}
