package S2;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(m mVar, int i6) {
        super(mVar);
        this.f3125e = i6;
    }

    @Override // S2.n
    public final void r() {
        switch (this.f3125e) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                m mVar = this.f3170b;
                mVar.f3157K = null;
                CheckableImageButton checkableImageButton = mVar.f3149C;
                checkableImageButton.setOnLongClickListener(null);
                f2.h.F(checkableImageButton, null);
                break;
        }
    }
}
