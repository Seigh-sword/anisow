package W1;

import X1.AbstractC0238f;
import X1.AbstractC0242j;
import X1.C0244l;
import X1.C0245m;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import q2.InterfaceC1261d;

/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC1261d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f4250A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0211e f4251w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f4252x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0207a f4253y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f4254z;

    public M(C0211e c0211e, int i6, C0207a c0207a, long j6, long j7) {
        this.f4251w = c0211e;
        this.f4252x = i6;
        this.f4253y = c0207a;
        this.f4254z = j6;
        this.f4250A = j7;
    }

    @Override // q2.InterfaceC1261d
    public final void c(q2.i iVar) {
        int i6;
        int i7;
        long j6;
        long j7;
        int iElapsedRealtime;
        if (this.f4251w.a()) {
            C0245m.b().getClass();
            E e6 = (E) this.f4251w.f4309F.get(this.f4253y);
            if (e6 != null) {
                AbstractC0242j abstractC0242j = e6.f4229d;
                if (abstractC0242j instanceof AbstractC0238f) {
                    boolean z5 = this.f4254z > 0;
                    int i8 = abstractC0242j.f4584v;
                    C0211e c0211e = this.f4251w;
                    if (iVar.f()) {
                        i6 = 0;
                        i7 = 0;
                    } else if (((q2.s) iVar).f12377d) {
                        i7 = -1;
                        i6 = 100;
                    } else {
                        Exception excC = iVar.c();
                        if (excC instanceof V1.e) {
                            Status status = ((V1.e) excC).f3707w;
                            int i9 = status.f6435w;
                            U1.b bVar = status.f6438z;
                            i7 = bVar == null ? -1 : bVar.f3576x;
                            i6 = i9;
                        } else {
                            i6 = 101;
                            i7 = -1;
                        }
                    }
                    if (z5) {
                        long j8 = this.f4254z;
                        long j9 = this.f4250A;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j9);
                        j6 = j8;
                        j7 = jCurrentTimeMillis;
                    } else {
                        j6 = 0;
                        j7 = 0;
                        iElapsedRealtime = -1;
                    }
                    c0211e.getClass();
                    N n5 = new N(new C0244l(this.f4252x, i6, i7, j6, j7, null, null, i8, iElapsedRealtime), 0, 5000, 100);
                    com.google.android.gms.internal.measurement.X x5 = c0211e.f4312I;
                    x5.sendMessage(x5.obtainMessage(18, n5));
                }
            }
        }
    }
}
