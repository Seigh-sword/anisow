package m2;

import android.os.Bundle;
import java.util.Iterator;
import s.C1280b;

/* JADX INFO: renamed from: m2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1067q extends AbstractC1016A {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1280b f11060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1280b f11061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f11062z;

    public C1067q(C1051k0 c1051k0) {
        super(c1051k0);
        this.f11061y = new C1280b();
        this.f11060x = new C1280b();
    }

    public final void A(String str, long j6) {
        if (str == null || str.length() == 0) {
            f().f10715B.d("Ad unit id must be a non-empty string");
        } else {
            g().A(new RunnableC1023b(this, str, j6, 0));
        }
    }

    public final void B(String str, long j6, V0 v02) {
        if (v02 == null) {
            f().f10723J.d("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j6 < 1000) {
            N nF = f();
            nF.f10723J.c(Long.valueOf(j6), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j6);
            K1.U(v02, bundle, true);
            u().Y("am", "_xu", bundle);
        }
    }

    public final void C(String str, long j6) {
        if (str == null || str.length() == 0) {
            f().f10715B.d("Ad unit id must be a non-empty string");
        } else {
            g().A(new RunnableC1023b(this, str, j6, 1));
        }
    }

    public final void D(long j6) {
        C1280b c1280b = this.f11060x;
        Iterator it = ((s.h) c1280b.keySet()).iterator();
        while (it.hasNext()) {
            c1280b.put((String) it.next(), Long.valueOf(j6));
        }
        if (c1280b.isEmpty()) {
            return;
        }
        this.f11062z = j6;
    }

    public final void y(long j6) {
        V0 v0C = v().C(false);
        C1280b c1280b = this.f11060x;
        for (String str : (s.h) c1280b.keySet()) {
            B(str, j6 - ((Long) c1280b.getOrDefault(str, null)).longValue(), v0C);
        }
        if (!c1280b.isEmpty()) {
            z(j6 - this.f11062z, v0C);
        }
        D(j6);
    }

    public final void z(long j6, V0 v02) {
        if (v02 == null) {
            f().f10723J.d("Not logging ad exposure. No active activity");
            return;
        }
        if (j6 < 1000) {
            N nF = f();
            nF.f10723J.c(Long.valueOf(j6), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j6);
            K1.U(v02, bundle, true);
            u().Y("am", "_xa", bundle);
        }
    }
}
