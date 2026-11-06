package W1;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: W1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228w extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final WeakReference f4373x;

    public C0228w(C0229x c0229x) {
        this.f4373x = new WeakReference(c0229x);
    }

    @Override // com.bumptech.glide.c
    public final void R() {
        C0229x c0229x = (C0229x) this.f4373x.get();
        if (c0229x == null) {
            return;
        }
        C0229x.g(c0229x);
    }
}
