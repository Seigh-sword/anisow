package h5;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: h5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0787n extends CompletableFuture {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC0782i f9114w;

    public C0787n(D d6) {
        this.f9114w = d6;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        if (z5) {
            this.f9114w.cancel();
        }
        return super.cancel(z5);
    }
}
