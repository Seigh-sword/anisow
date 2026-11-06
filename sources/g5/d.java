package g5;

import f5.C0710g;
import f5.E;
import f5.n;
import java.io.IOException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f8540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f8541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f8542z;

    public d(E e6, long j6, boolean z5) {
        super(e6);
        this.f8540x = j6;
        this.f8541y = z5;
    }

    @Override // f5.n, f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        AbstractC1305a.o(c0710g, "sink");
        long j7 = this.f8542z;
        long j8 = this.f8540x;
        if (j7 > j8) {
            j6 = 0;
        } else if (this.f8541y) {
            long j9 = j8 - j7;
            if (j9 == 0) {
                return -1L;
            }
            j6 = Math.min(j6, j9);
        }
        long jG = super.G(c0710g, j6);
        if (jG != -1) {
            this.f8542z += jG;
        }
        long j10 = this.f8542z;
        if ((j10 >= j8 || jG != -1) && j10 <= j8) {
            return jG;
        }
        if (jG > 0 && j10 > j8) {
            long j11 = c0710g.f8461x - (j10 - j8);
            C0710g c0710g2 = new C0710g();
            c0710g2.W(c0710g);
            c0710g.q(c0710g2, j11);
            c0710g2.k();
        }
        throw new IOException("expected " + j8 + " bytes but got " + this.f8542z);
    }
}
