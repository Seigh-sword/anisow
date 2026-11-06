package c0;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class o extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.c f6139x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f6140y;

    public o(com.bumptech.glide.c cVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f6139x = cVar;
        this.f6140y = threadPoolExecutor;
    }

    @Override // com.bumptech.glide.c
    public final void E(P0.h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f6140y;
        try {
            this.f6139x.E(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.bumptech.glide.c
    public final void z(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f6140y;
        try {
            this.f6139x.z(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
