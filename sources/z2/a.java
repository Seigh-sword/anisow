package Z2;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0466o0;
import com.google.android.gms.internal.measurement.C0472p0;
import com.google.android.gms.internal.measurement.C0483r0;
import com.google.android.gms.internal.measurement.C0489s0;
import com.google.android.gms.internal.measurement.C0501u0;
import com.google.android.gms.internal.measurement.C0507v0;
import com.google.android.gms.internal.measurement.C0519x0;
import com.google.android.gms.internal.measurement.C0525y0;
import com.google.android.gms.internal.measurement.Z;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import m2.Q0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0466o0 f4957a;

    public a(C0466o0 c0466o0) {
        this.f4957a = c0466o0;
    }

    @Override // m2.Q0
    public final void a(String str, String str2, Bundle bundle) {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        c0466o0.b(new C0489s0(c0466o0, str, str2, bundle, 1));
    }

    @Override // m2.Q0
    public final int b(String str) {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        Z z5 = new Z();
        c0466o0.b(new C0519x0(c0466o0, str, z5));
        Integer num = (Integer) Z.s(z5.e(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // m2.Q0
    public final void c(String str, String str2, Bundle bundle) {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        c0466o0.b(new C0525y0(c0466o0, str, str2, bundle));
    }

    @Override // m2.Q0
    public final void d(Bundle bundle) {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        c0466o0.b(new C0472p0(c0466o0, bundle, 0));
    }

    @Override // m2.Q0
    public final void e(String str) {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        c0466o0.b(new C0501u0(c0466o0, str, 0));
    }

    @Override // m2.Q0
    public final String f() {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        Z z5 = new Z();
        c0466o0.b(new C0507v0(c0466o0, z5, 1));
        return (String) Z.s(z5.e(500L), String.class);
    }

    @Override // m2.Q0
    public final long g() {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        Z z5 = new Z();
        c0466o0.b(new C0507v0(c0466o0, z5, 3));
        Long l5 = (Long) Z.s(z5.e(500L), Long.class);
        if (l5 != null) {
            return l5.longValue();
        }
        long jNanoTime = System.nanoTime();
        c0466o0.f6909b.getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i6 = c0466o0.f6913f + 1;
        c0466o0.f6913f = i6;
        return jNextLong + ((long) i6);
    }

    @Override // m2.Q0
    public final String h() {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        Z z5 = new Z();
        c0466o0.b(new C0507v0(c0466o0, z5, 4));
        return (String) Z.s(z5.e(500L), String.class);
    }

    @Override // m2.Q0
    public final List i(String str, String str2) {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        Z z5 = new Z();
        c0466o0.b(new C0489s0(c0466o0, str, str2, z5, 0));
        List list = (List) Z.s(z5.e(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    @Override // m2.Q0
    public final void j(String str) {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        c0466o0.b(new C0501u0(c0466o0, str, 1));
    }

    @Override // m2.Q0
    public final Map k(String str, String str2, boolean z5) {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        Z z6 = new Z();
        c0466o0.b(new C0483r0(c0466o0, str, str2, z5, z6));
        Bundle bundleE = z6.e(5000L);
        if (bundleE == null || bundleE.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleE.size());
        for (String str3 : bundleE.keySet()) {
            Object obj = bundleE.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // m2.Q0
    public final String l() {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        Z z5 = new Z();
        c0466o0.b(new C0507v0(c0466o0, z5, 0));
        return (String) Z.s(z5.e(50L), String.class);
    }

    @Override // m2.Q0
    public final String m() {
        C0466o0 c0466o0 = this.f4957a;
        c0466o0.getClass();
        Z z5 = new Z();
        c0466o0.b(new C0507v0(c0466o0, z5, 2));
        return (String) Z.s(z5.e(500L), String.class);
    }
}
