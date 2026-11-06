package b5;

import d.AbstractC0628i;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m2.C1018C;
import v0.C1409s;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Closeable {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final ThreadPoolExecutor f6020T;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6021A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f6022B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f6023C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6024D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ThreadPoolExecutor f6025E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C1018C f6026F;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f6033M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C1409s f6034N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C1409s f6035O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Socket f6036P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final A f6037Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final q f6038R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final LinkedHashSet f6039S;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f6040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o f6041x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f6043z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f6042y = new LinkedHashMap();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f6027G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f6028H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f6029I = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f6030J = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f6031K = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f6032L = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = W4.b.f4484a;
        f6020T = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new W4.a("OkHttp Http2Connection", true));
    }

    public s(m mVar) {
        C1409s c1409s = new C1409s();
        this.f6034N = c1409s;
        C1409s c1409s2 = new C1409s();
        this.f6035O = c1409s2;
        this.f6039S = new LinkedHashSet();
        this.f6026F = C.f5946m;
        boolean z5 = mVar.f6007f;
        this.f6040w = z5;
        this.f6041x = mVar.f6006e;
        int i6 = z5 ? 1 : 2;
        this.f6022B = i6;
        if (z5) {
            this.f6022B = i6 + 2;
        }
        if (z5) {
            c1409s.b(7, 16777216);
        }
        String str = mVar.f6003b;
        this.f6043z = str;
        byte[] bArr = W4.b.f4484a;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new W4.a(AbstractC0628i.j("OkHttp ", str, " Writer"), false));
        this.f6024D = scheduledThreadPoolExecutor;
        if (mVar.f6008g != 0) {
            j jVar = new j(this);
            long j6 = mVar.f6008g;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(jVar, j6, j6, TimeUnit.MILLISECONDS);
        }
        this.f6025E = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W4.a(AbstractC0628i.j("OkHttp ", str, " Push Observer"), true));
        c1409s2.b(7, 65535);
        c1409s2.b(5, 16384);
        this.f6033M = c1409s2.a();
        this.f6036P = mVar.f6002a;
        this.f6037Q = new A(mVar.f6005d, z5);
        this.f6038R = new q(this, new v(mVar.f6004c, z5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f6037Q.f5941z);
        r6 = r2;
        r8.f6033M -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(int r9, boolean r10, f5.C0710g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            b5.A r12 = r8.f6037Q
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.f6033M     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.LinkedHashMap r2 = r8.f6042y     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            goto L12
        L28:
            r9 = move-exception
            goto L63
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            b5.A r4 = r8.f6037Q     // Catch: java.lang.Throwable -> L28
            int r4 = r4.f5941z     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f6033M     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f6033M = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            b5.A r4 = r8.f6037Q
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.s.J(int, boolean, f5.g, long):void");
    }

    public final void K(int i6, EnumC0346b enumC0346b) {
        try {
            this.f6024D.execute(new h(this, "OkHttp %s stream %d", new Object[]{this.f6043z, Integer.valueOf(i6)}, i6, enumC0346b, 0));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void L(int i6, long j6) {
        try {
            this.f6024D.execute(new i(this, new Object[]{this.f6043z, Integer.valueOf(i6)}, i6, j6));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void b(EnumC0346b enumC0346b, EnumC0346b enumC0346b2, IOException iOException) {
        z[] zVarArr;
        try {
            n(enumC0346b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f6042y.isEmpty()) {
                    zVarArr = null;
                } else {
                    zVarArr = (z[]) this.f6042y.values().toArray(new z[this.f6042y.size()]);
                    this.f6042y.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                try {
                    zVar.c(enumC0346b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f6037Q.close();
        } catch (IOException unused3) {
        }
        try {
            this.f6036P.close();
        } catch (IOException unused4) {
        }
        this.f6024D.shutdown();
        this.f6025E.shutdown();
    }

    public final void c(IOException iOException) {
        EnumC0346b enumC0346b = EnumC0346b.PROTOCOL_ERROR;
        b(enumC0346b, enumC0346b, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(EnumC0346b.NO_ERROR, EnumC0346b.CANCEL, null);
    }

    public final void flush() {
        this.f6037Q.flush();
    }

    public final synchronized z g(int i6) {
        return (z) this.f6042y.get(Integer.valueOf(i6));
    }

    public final synchronized int h() {
        C1409s c1409s;
        c1409s = this.f6035O;
        return (c1409s.f13228a & 16) != 0 ? c1409s.f13229b[4] : Integer.MAX_VALUE;
    }

    public final synchronized void k(S0.c cVar) {
        if (!this.f6023C) {
            this.f6025E.execute(cVar);
        }
    }

    public final synchronized z l(int i6) {
        z zVar;
        zVar = (z) this.f6042y.remove(Integer.valueOf(i6));
        notifyAll();
        return zVar;
    }

    public final void n(EnumC0346b enumC0346b) {
        synchronized (this.f6037Q) {
            synchronized (this) {
                if (this.f6023C) {
                    return;
                }
                this.f6023C = true;
                this.f6037Q.h(this.f6021A, enumC0346b, W4.b.f4484a);
            }
        }
    }

    public final synchronized void u(long j6) {
        long j7 = this.f6032L + j6;
        this.f6032L = j7;
        if (j7 >= this.f6034N.a() / 2) {
            L(0, this.f6032L);
            this.f6032L = 0L;
        }
    }
}
