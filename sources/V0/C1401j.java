package v0;

import android.os.SystemClock;
import b2.C0337b;
import b2.InterfaceC0336a;
import q2.InterfaceC1262e;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: v0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1401j implements InterfaceC1262e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f13143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f13144y;

    public C1401j(int i6) {
        this.f13142w = i6;
        if (i6 != 1) {
            this.f13143x = 0L;
        } else {
            this.f13143x = 0L;
            this.f13144y = K1.d.REASON_UNKNOWN;
        }
    }

    public final void a(int i6) {
        if (i6 < 64) {
            this.f13143x &= ~(1 << i6);
            return;
        }
        Object obj = this.f13144y;
        if (((C1401j) obj) != null) {
            ((C1401j) obj).a(i6 - 64);
        }
    }

    public final int b(int i6) {
        long j6;
        Object obj = this.f13144y;
        if (((C1401j) obj) == null) {
            j6 = this.f13143x;
            if (i6 >= 64) {
                return Long.bitCount(j6);
            }
        } else {
            if (i6 >= 64) {
                return Long.bitCount(this.f13143x) + ((C1401j) obj).b(i6 - 64);
            }
            j6 = this.f13143x;
        }
        return Long.bitCount(j6 & ((1 << i6) - 1));
    }

    public final void c() {
        if (((C1401j) this.f13144y) == null) {
            this.f13144y = new C1401j(0);
        }
    }

    public final boolean d(int i6) {
        if (i6 < 64) {
            return (this.f13143x & (1 << i6)) != 0;
        }
        c();
        return ((C1401j) this.f13144y).d(i6 - 64);
    }

    public final void e(int i6, boolean z5) {
        if (i6 >= 64) {
            c();
            ((C1401j) this.f13144y).e(i6 - 64, z5);
            return;
        }
        long j6 = this.f13143x;
        boolean z6 = (Long.MIN_VALUE & j6) != 0;
        long j7 = (1 << i6) - 1;
        this.f13143x = ((j6 & (~j7)) << 1) | (j6 & j7);
        if (z5) {
            i(i6);
        } else {
            a(i6);
        }
        if (z6 || ((C1401j) this.f13144y) != null) {
            c();
            ((C1401j) this.f13144y).e(0, z6);
        }
    }

    public final boolean f(int i6) {
        if (i6 >= 64) {
            c();
            return ((C1401j) this.f13144y).f(i6 - 64);
        }
        long j6 = 1 << i6;
        long j7 = this.f13143x;
        boolean z5 = (j7 & j6) != 0;
        long j8 = j7 & (~j6);
        this.f13143x = j8;
        long j9 = j6 - 1;
        this.f13143x = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
        Object obj = this.f13144y;
        if (((C1401j) obj) != null) {
            if (((C1401j) obj).d(0)) {
                i(63);
            }
            ((C1401j) this.f13144y).f(0);
        }
        return z5;
    }

    @Override // q2.InterfaceC1262e
    public final void g(Exception exc) {
        m2.M m5 = (m2.M) this.f13144y;
        m5.f10696c.set(this.f13143x);
    }

    public final void h() {
        this.f13143x = 0L;
        Object obj = this.f13144y;
        if (((C1401j) obj) != null) {
            ((C1401j) obj).h();
        }
    }

    public final void i(int i6) {
        if (i6 < 64) {
            this.f13143x |= 1 << i6;
        } else {
            c();
            ((C1401j) this.f13144y).i(i6 - 64);
        }
    }

    public final void j() {
        ((C0337b) ((InterfaceC0336a) this.f13144y)).getClass();
        this.f13143x = SystemClock.elapsedRealtime();
    }

    public final String toString() {
        switch (this.f13142w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (((C1401j) this.f13144y) == null) {
                    return Long.toBinaryString(this.f13143x);
                }
                return ((C1401j) this.f13144y).toString() + "xx" + Long.toBinaryString(this.f13143x);
            default:
                return super.toString();
        }
    }

    public C1401j(InterfaceC0336a interfaceC0336a) {
        this.f13142w = 3;
        AbstractC1332d.m(interfaceC0336a);
        this.f13144y = interfaceC0336a;
    }

    public /* synthetic */ C1401j(m2.M m5, long j6) {
        this.f13142w = 2;
        this.f13144y = m5;
        this.f13143x = j6;
    }
}
