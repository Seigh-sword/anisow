package m2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: m2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1045i0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f10951w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f10952x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f10953y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C1042h0 f10954z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1045i0(C1042h0 c1042h0, Runnable runnable, boolean z5, String str) {
        super(runnable, null);
        this.f10954z = c1042h0;
        long andIncrement = C1042h0.f10928G.getAndIncrement();
        this.f10951w = andIncrement;
        this.f10953y = str;
        this.f10952x = z5;
        if (andIncrement == Long.MAX_VALUE) {
            c1042h0.f().f10715B.d("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1045i0 c1045i0 = (C1045i0) obj;
        boolean z5 = c1045i0.f10952x;
        boolean z6 = this.f10952x;
        if (z6 != z5) {
            return z6 ? -1 : 1;
        }
        long j6 = this.f10951w;
        long j7 = c1045i0.f10951w;
        if (j6 < j7) {
            return -1;
        }
        if (j6 > j7) {
            return 1;
        }
        this.f10954z.f().f10716C.c(Long.valueOf(j6), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        N nF = this.f10954z.f();
        nF.f10715B.c(th, this.f10953y);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1045i0(C1042h0 c1042h0, Callable callable, boolean z5) {
        super(callable);
        this.f10954z = c1042h0;
        long andIncrement = C1042h0.f10928G.getAndIncrement();
        this.f10951w = andIncrement;
        this.f10953y = "Task exception on worker thread";
        this.f10952x = z5;
        if (andIncrement == Long.MAX_VALUE) {
            c1042h0.f().f10715B.d("Tasks index overflow");
        }
    }
}
