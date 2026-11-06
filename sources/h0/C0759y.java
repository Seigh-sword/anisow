package h0;

import android.view.View;
import d.AbstractC0628i;

/* JADX INFO: renamed from: h0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0759y extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0734B f8925x;

    public C0759y(AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B) {
        this.f8925x = abstractComponentCallbacksC0734B;
    }

    @Override // com.bumptech.glide.c
    public final View A(int i6) {
        AbstractComponentCallbacksC0734B abstractComponentCallbacksC0734B = this.f8925x;
        View view = abstractComponentCallbacksC0734B.f8618c0;
        if (view != null) {
            return view.findViewById(i6);
        }
        throw new IllegalStateException(AbstractC0628i.h("Fragment ", abstractComponentCallbacksC0734B, " does not have a view"));
    }

    @Override // com.bumptech.glide.c
    public final boolean D() {
        return this.f8925x.f8618c0 != null;
    }
}
