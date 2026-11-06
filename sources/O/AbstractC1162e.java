package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1162e extends AbstractC1163f implements Iterator {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1160c f11713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1160c f11714x;

    @Override // o.AbstractC1163f
    public final void a(C1160c c1160c) {
        C1160c c1160c2;
        C1160c c1160c3;
        C1160c c1160c4 = null;
        if (this.f11713w == c1160c && c1160c == this.f11714x) {
            this.f11714x = null;
            this.f11713w = null;
        }
        C1160c c1160c5 = this.f11713w;
        if (c1160c5 == c1160c) {
            switch (((C1159b) this).f11705y) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    c1160c3 = c1160c5.f11709z;
                    break;
                default:
                    c1160c3 = c1160c5.f11708y;
                    break;
            }
            this.f11713w = c1160c3;
        }
        C1160c c1160c6 = this.f11714x;
        if (c1160c6 == c1160c) {
            C1160c c1160c7 = this.f11713w;
            if (c1160c6 != c1160c7 && c1160c7 != null) {
                switch (((C1159b) this).f11705y) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        c1160c2 = c1160c6.f11708y;
                        break;
                    default:
                        c1160c2 = c1160c6.f11709z;
                        break;
                }
                c1160c4 = c1160c2;
            }
            this.f11714x = c1160c4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11714x != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1160c c1160c;
        C1160c c1160c2 = this.f11714x;
        C1160c c1160c3 = this.f11713w;
        if (c1160c2 != c1160c3 && c1160c3 != null) {
            switch (((C1159b) this).f11705y) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    c1160c = c1160c2.f11708y;
                    break;
                default:
                    c1160c = c1160c2.f11709z;
                    break;
            }
        } else {
            c1160c = null;
        }
        this.f11714x = c1160c;
        return c1160c2;
    }
}
