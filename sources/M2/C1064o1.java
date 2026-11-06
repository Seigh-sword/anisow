package m2;

import android.os.Bundle;
import android.os.SystemClock;
import b2.C0337b;

/* JADX INFO: renamed from: m2.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1064o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f11051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1052k1 f11052d;

    public C1064o1(C1052k1 c1052k1) {
        this.f11052d = c1052k1;
        this.f11051c = new p1(this, (C1051k0) c1052k1.f1668w, 0);
        ((C0337b) c1052k1.h()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f11049a = jElapsedRealtime;
        this.f11050b = jElapsedRealtime;
    }

    public final boolean a(boolean z5, boolean z6, long j6) {
        C1052k1 c1052k1 = this.f11052d;
        c1052k1.r();
        c1052k1.y();
        if (((C1051k0) c1052k1.f1668w).j()) {
            Y yP = c1052k1.p();
            ((C0337b) c1052k1.h()).getClass();
            yP.f10813M.b(System.currentTimeMillis());
        }
        long j7 = j6 - this.f11049a;
        if (!z5 && j7 < 1000) {
            c1052k1.f().f10723J.c(Long.valueOf(j7), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z6) {
            j7 = j6 - this.f11050b;
            this.f11050b = j6;
        }
        c1052k1.f().f10723J.c(Long.valueOf(j7), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j7);
        K1.U(c1052k1.v().C(!c1052k1.n().F()), bundle, true);
        if (!z6) {
            c1052k1.u().Y("auto", "_e", bundle);
        }
        this.f11049a = j6;
        p1 p1Var = this.f11051c;
        p1Var.a();
        p1Var.b(((Long) AbstractC1078w.f11178c0.a(null)).longValue());
        return true;
    }
}
