package V0;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.o;

/* JADX INFO: loaded from: classes.dex */
public final class k extends o {
    @Override // com.bumptech.glide.o
    public final com.bumptech.glide.m l(Class cls) {
        return new j(this.f6411w, this, cls, this.f6412x);
    }

    @Override // com.bumptech.glide.o
    public final com.bumptech.glide.m m() {
        return (j) super.m();
    }

    @Override // com.bumptech.glide.o
    public final void p(y1.f fVar) {
        if (fVar instanceof i) {
            super.p(fVar);
        } else {
            super.p(new i().A(fVar));
        }
    }

    public final com.bumptech.glide.m r() {
        return (j) l(Drawable.class);
    }

    public final j s(String str) {
        return (j) ((j) r()).I(str);
    }
}
