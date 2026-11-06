package W0;

import C4.l;
import W.Q;
import androidx.lifecycle.F;
import s4.AbstractC1305a;
import s4.InterfaceC1306b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements F, D4.f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f4206x;

    public h(int i6, Q q5) {
        this.f4205w = i6;
        if (i6 == 1) {
            this.f4206x = q5;
            return;
        }
        if (i6 == 2) {
            this.f4206x = q5;
        } else if (i6 != 3) {
            this.f4206x = q5;
        } else {
            this.f4206x = q5;
        }
    }

    @Override // androidx.lifecycle.F
    public final /* synthetic */ void a(Object obj) {
        int i6 = this.f4205w;
        l lVar = this.f4206x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                lVar.j(obj);
                break;
            case 1:
                lVar.j(obj);
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                lVar.j(obj);
                break;
            default:
                lVar.j(obj);
                break;
        }
    }

    @Override // D4.f
    public final InterfaceC1306b b() {
        return this.f4206x;
    }

    public final boolean equals(Object obj) {
        l lVar = this.f4206x;
        switch (this.f4205w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if ((obj instanceof F) && (obj instanceof D4.f)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof F) && (obj instanceof D4.f)) {
                    break;
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                if ((obj instanceof F) && (obj instanceof D4.f)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof F) && (obj instanceof D4.f)) {
                    break;
                }
                break;
        }
        return AbstractC1305a.c(lVar, ((D4.f) obj).b());
    }

    public final int hashCode() {
        int i6 = this.f4205w;
        l lVar = this.f4206x;
        switch (i6) {
        }
        return lVar.hashCode();
    }
}
