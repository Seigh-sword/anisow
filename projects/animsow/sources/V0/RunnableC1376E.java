package v0;

import android.os.Trace;
import androidx.datastore.preferences.protobuf.C0289n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: v0.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1376E implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final ThreadLocal f12995A = new ThreadLocal();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final B.h f12996B = new B.h(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f12997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f12998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f12999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f13000z;

    public static u0 c(RecyclerView recyclerView, int i6, long j6) {
        int iH = recyclerView.f5689A.h();
        for (int i7 = 0; i7 < iH; i7++) {
            u0 u0VarI = RecyclerView.I(recyclerView.f5689A.g(i7));
            if (u0VarI.f13250c == i6 && !u0VarI.h()) {
                return null;
            }
        }
        m0 m0Var = recyclerView.f5755x;
        try {
            recyclerView.P();
            u0 u0VarI2 = m0Var.i(i6, j6);
            if (u0VarI2 != null) {
                if (!u0VarI2.g() || u0VarI2.h()) {
                    m0Var.a(u0VarI2, false);
                } else {
                    m0Var.f(u0VarI2.f13248a);
                }
            }
            recyclerView.Q(false);
            return u0VarI2;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i6, int i7) {
        if (recyclerView.f5714N && this.f12998x == 0) {
            this.f12998x = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0289n c0289n = recyclerView.f5690A0;
        c0289n.f5490a = i6;
        c0289n.f5491b = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.RunnableC1376E.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i6 = J.l.f1168a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f12997w;
            if (arrayList.isEmpty()) {
                this.f12998x = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i7 = 0; i7 < size; i7++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i7);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f12998x = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f12999y);
                this.f12998x = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f12998x = 0L;
            int i8 = J.l.f1168a;
            Trace.endSection();
            throw th;
        }
    }
}
