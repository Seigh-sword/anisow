package b5;

import java.io.IOException;
import java.util.Arrays;
import v0.C1409s;

/* JADX INFO: loaded from: classes.dex */
public final class r extends S0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ q f6017A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f6018y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C1409s f6019z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, Object[] objArr, C1409s c1409s) {
        super("OkHttp %s ACK Settings", objArr);
        this.f6017A = qVar;
        this.f6019z = c1409s;
    }

    @Override // S0.c
    public final void b() {
        int i6;
        z[] zVarArr;
        long j6;
        q qVar = this.f6017A;
        boolean z5 = this.f6018y;
        C1409s c1409s = this.f6019z;
        synchronized (((s) qVar.f6014A).f6037Q) {
            synchronized (((s) qVar.f6014A)) {
                try {
                    int iA = ((s) qVar.f6014A).f6035O.a();
                    if (z5) {
                        C1409s c1409s2 = ((s) qVar.f6014A).f6035O;
                        c1409s2.f13228a = 0;
                        Arrays.fill(c1409s2.f13229b, 0);
                    }
                    C1409s c1409s3 = ((s) qVar.f6014A).f6035O;
                    c1409s3.getClass();
                    for (int i7 = 0; i7 < 10; i7++) {
                        if (((1 << i7) & c1409s.f13228a) != 0) {
                            c1409s3.b(i7, c1409s.f13229b[i7]);
                        }
                    }
                    int iA2 = ((s) qVar.f6014A).f6035O.a();
                    zVarArr = null;
                    if (iA2 == -1 || iA2 == iA) {
                        j6 = 0;
                    } else {
                        j6 = iA2 - iA;
                        if (!((s) qVar.f6014A).f6042y.isEmpty()) {
                            zVarArr = (z[]) ((s) qVar.f6014A).f6042y.values().toArray(new z[((s) qVar.f6014A).f6042y.size()]);
                        }
                    }
                } finally {
                }
            }
            try {
                Object obj = qVar.f6014A;
                ((s) obj).f6037Q.b(((s) obj).f6035O);
            } catch (IOException e6) {
                ((s) qVar.f6014A).c(e6);
            }
        }
        if (zVarArr != null) {
            for (z zVar : zVarArr) {
                synchronized (zVar) {
                    zVar.f6075b += j6;
                    if (j6 > 0) {
                        zVar.notifyAll();
                    }
                }
            }
        }
        s.f6020T.execute(new j(qVar, "OkHttp %s settings", new Object[]{((s) qVar.f6014A).f6043z}, 2));
    }
}
