package l1;

import java.util.concurrent.ThreadFactory;
import m.RunnableC0969k;
import o1.C1224a;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0927a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9879a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreadFactoryC0927a() {
        this(1);
        this.f9879a = 1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f9879a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new Thread(new RunnableC0969k(this, 13, runnable), "glide-active-resources");
            default:
                return new C1224a(this, runnable);
        }
    }

    public /* synthetic */ ThreadFactoryC0927a(int i6) {
        this.f9879a = i6;
    }
}
