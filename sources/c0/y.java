package c0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import d.AbstractC0628i;
import d2.AbstractC0651b;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.C0986t;

/* JADX INFO: loaded from: classes.dex */
public final class y implements k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Handler f6162A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Executor f6163B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ThreadPoolExecutor f6164C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public com.bumptech.glide.c f6165D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public x f6166E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f6167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0986t f6168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final B3.e f6169y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f6170z;

    public y(Context context, C0986t c0986t) {
        B3.e eVar = z.f6171d;
        this.f6170z = new Object();
        AbstractC0651b.f(context, "Context cannot be null");
        this.f6167w = context.getApplicationContext();
        this.f6168x = c0986t;
        this.f6169y = eVar;
    }

    @Override // c0.k
    public final void a(com.bumptech.glide.c cVar) {
        synchronized (this.f6170z) {
            this.f6165D = cVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f6170z) {
            try {
                this.f6165D = null;
                x xVar = this.f6166E;
                if (xVar != null) {
                    B3.e eVar = this.f6169y;
                    Context context = this.f6167w;
                    eVar.getClass();
                    context.getContentResolver().unregisterContentObserver(xVar);
                    this.f6166E = null;
                }
                Handler handler = this.f6162A;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f6162A = null;
                ThreadPoolExecutor threadPoolExecutor = this.f6164C;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f6163B = null;
                this.f6164C = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f6170z) {
            try {
                if (this.f6165D == null) {
                    return;
                }
                if (this.f6163B == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0352a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f6164C = threadPoolExecutor;
                    this.f6163B = threadPoolExecutor;
                }
                final int i6 = 0;
                this.f6163B.execute(new Runnable(this) { // from class: c0.w

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public final /* synthetic */ y f6159x;

                    {
                        this.f6159x = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case com.bumptech.glide.d.f6312l /* 0 */:
                                y yVar = this.f6159x;
                                synchronized (yVar.f6170z) {
                                    try {
                                        if (yVar.f6165D == null) {
                                            return;
                                        }
                                        try {
                                            K.h hVarD = yVar.d();
                                            int i7 = hVarD.f1491e;
                                            if (i7 == 2) {
                                                synchronized (yVar.f6170z) {
                                                }
                                            }
                                            if (i7 != 0) {
                                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                                            }
                                            try {
                                                int i8 = J.l.f1168a;
                                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                                B3.e eVar = yVar.f6169y;
                                                Context context = yVar.f6167w;
                                                eVar.getClass();
                                                Typeface typefaceV = G.g.f648a.v(context, new K.h[]{hVarD}, 0);
                                                MappedByteBuffer mappedByteBufferW = AbstractC0651b.w(yVar.f6167w, hVarD.f1487a);
                                                if (mappedByteBufferW == null || typefaceV == null) {
                                                    throw new RuntimeException("Unable to open file.");
                                                }
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    P0.h hVar = new P0.h(typefaceV, com.bumptech.glide.d.u(mappedByteBufferW));
                                                    Trace.endSection();
                                                    Trace.endSection();
                                                    synchronized (yVar.f6170z) {
                                                        try {
                                                            com.bumptech.glide.c cVar = yVar.f6165D;
                                                            if (cVar != null) {
                                                                cVar.E(hVar);
                                                            }
                                                        } finally {
                                                        }
                                                        break;
                                                    }
                                                    yVar.b();
                                                    return;
                                                } finally {
                                                    int i9 = J.l.f1168a;
                                                    Trace.endSection();
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        } catch (Throwable th2) {
                                            synchronized (yVar.f6170z) {
                                                try {
                                                    com.bumptech.glide.c cVar2 = yVar.f6165D;
                                                    if (cVar2 != null) {
                                                        cVar2.z(th2);
                                                    }
                                                    yVar.b();
                                                    return;
                                                } finally {
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            default:
                                this.f6159x.c();
                                return;
                        }
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final K.h d() {
        try {
            B3.e eVar = this.f6169y;
            Context context = this.f6167w;
            C0986t c0986t = this.f6168x;
            eVar.getClass();
            T1.j jVarA = K.c.a(context, c0986t);
            if (jVarA.f3424w != 0) {
                throw new RuntimeException(AbstractC0628i.l(new StringBuilder("fetchFonts failed ("), jVarA.f3424w, ")"));
            }
            K.h[] hVarArr = (K.h[]) jVarA.f3425x;
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("provider not found", e6);
        }
    }
}
