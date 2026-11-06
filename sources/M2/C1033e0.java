package m2;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0389b1;
import com.google.android.gms.internal.measurement.C0512w;
import com.google.android.gms.internal.measurement.Q2;
import h1.CallableC0761a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s.C1280b;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1033e0 extends t1 implements InterfaceC1035f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1280b f10888A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1280b f10889B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1280b f10890C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1280b f10891D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1280b f10892E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C1036f0 f10893F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final K1.b f10894G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1280b f10895H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C1280b f10896I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C1280b f10897J;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1280b f10898z;

    public C1033e0(x1 x1Var) {
        super(x1Var);
        this.f10898z = new C1280b();
        this.f10888A = new C1280b();
        this.f10889B = new C1280b();
        this.f10890C = new C1280b();
        this.f10891D = new C1280b();
        this.f10895H = new C1280b();
        this.f10896I = new C1280b();
        this.f10897J = new C1280b();
        this.f10892E = new C1280b();
        this.f10893F = new C1036f0(this);
        this.f10894G = new K1.b(6, this);
    }

    public static EnumC1083y0 A(int i6) {
        int i7 = AbstractC1039g0.f10912b[u.h.b(i6)];
        if (i7 == 1) {
            return EnumC1083y0.f11277x;
        }
        if (i7 == 2) {
            return EnumC1083y0.f11278y;
        }
        if (i7 == 3) {
            return EnumC1083y0.f11279z;
        }
        if (i7 != 4) {
            return null;
        }
        return EnumC1083y0.f11275A;
    }

    public static C1280b C(com.google.android.gms.internal.measurement.X0 x02) {
        C1280b c1280b = new C1280b();
        for (C0389b1 c0389b1 : x02.E()) {
            c1280b.put(c0389b1.q(), c0389b1.r());
        }
        return c1280b;
    }

    public final B0 B(String str, EnumC1083y0 enumC1083y0) {
        r();
        P(str);
        com.google.android.gms.internal.measurement.S0 s0H = H(str);
        B0 b02 = B0.f10493x;
        if (s0H == null) {
            return b02;
        }
        for (com.google.android.gms.internal.measurement.P0 p02 : s0H.u()) {
            if (A(p02.r()) == enumC1083y0) {
                int i6 = AbstractC1039g0.f10913c[u.h.b(p02.q())];
                return i6 != 1 ? i6 != 2 ? b02 : B0.f10491A : B0.f10495z;
            }
        }
        return b02;
    }

    public final void D(String str, com.google.android.gms.internal.measurement.W0 w02) {
        HashSet hashSet = new HashSet();
        C1280b c1280b = new C1280b();
        C1280b c1280b2 = new C1280b();
        C1280b c1280b3 = new C1280b();
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.X0) w02.f6602x).C()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.T0) it.next()).q());
        }
        for (int i6 = 0; i6 < ((com.google.android.gms.internal.measurement.X0) w02.f6602x).t(); i6++) {
            com.google.android.gms.internal.measurement.U0 u02 = (com.google.android.gms.internal.measurement.U0) ((com.google.android.gms.internal.measurement.X0) w02.f6602x).q(i6).l();
            if (u02.k().isEmpty()) {
                f().f10718E.d("EventConfig contained null event name");
            } else {
                String strK = u02.k();
                String strS = C0.s(u02.k(), C0.f10530a, C0.f10532c);
                if (!TextUtils.isEmpty(strS)) {
                    u02.i();
                    com.google.android.gms.internal.measurement.V0.q((com.google.android.gms.internal.measurement.V0) u02.f6602x, strS);
                    w02.i();
                    com.google.android.gms.internal.measurement.X0.s((com.google.android.gms.internal.measurement.X0) w02.f6602x, i6, (com.google.android.gms.internal.measurement.V0) u02.e());
                }
                if (((com.google.android.gms.internal.measurement.V0) u02.f6602x).u() && ((com.google.android.gms.internal.measurement.V0) u02.f6602x).s()) {
                    c1280b.put(strK, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.V0) u02.f6602x).v() && ((com.google.android.gms.internal.measurement.V0) u02.f6602x).t()) {
                    c1280b2.put(u02.k(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.V0) u02.f6602x).w()) {
                    if (((com.google.android.gms.internal.measurement.V0) u02.f6602x).p() < 2 || ((com.google.android.gms.internal.measurement.V0) u02.f6602x).p() > 65535) {
                        N nF = f();
                        nF.f10718E.b(u02.k(), Integer.valueOf(((com.google.android.gms.internal.measurement.V0) u02.f6602x).p()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c1280b3.put(u02.k(), Integer.valueOf(((com.google.android.gms.internal.measurement.V0) u02.f6602x).p()));
                    }
                }
            }
        }
        this.f10888A.put(str, hashSet);
        this.f10889B.put(str, c1280b);
        this.f10890C.put(str, c1280b2);
        this.f10892E.put(str, c1280b3);
    }

    public final void E(String str, com.google.android.gms.internal.measurement.X0 x02) {
        int i6 = 1;
        if (x02.p() == 0) {
            C1036f0 c1036f0 = this.f10893F;
            if (str == null) {
                c1036f0.getClass();
                throw new NullPointerException("key == null");
            }
            synchronized (c1036f0) {
                try {
                    if (c1036f0.f12511a.remove(str) != null) {
                        c1036f0.f12512b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        f().f10723J.c(Integer.valueOf(x02.p()), "EES programs found");
        com.google.android.gms.internal.measurement.N1 n12 = (com.google.android.gms.internal.measurement.N1) x02.D().get(0);
        try {
            C0512w c0512w = new C0512w();
            ((I0.f) c0512w.f6981a.f1444d).f1097a.put("internal.remoteConfig", new CallableC1030d0(this, str, 2));
            ((I0.f) c0512w.f6981a.f1444d).f1097a.put("internal.appMetadata", new CallableC1030d0(this, str, i6));
            ((I0.f) c0512w.f6981a.f1444d).f1097a.put("internal.logger", new CallableC0761a(i6, this));
            c0512w.a(n12);
            this.f10893F.c(str, c0512w);
            f().f10723J.b(str, Integer.valueOf(n12.p().p()), "EES program loaded for appId, activities");
            Iterator it = n12.p().s().iterator();
            while (it.hasNext()) {
                f().f10723J.c(((com.google.android.gms.internal.measurement.M1) it.next()).q(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.K unused) {
            f().f10715B.c(str, "Failed to load EES program. appId");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0258, code lost:
    
        r4.b(r8, r5, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c3 A[Catch: all -> 0x0227, EDGE_INSN: B:70:0x02c0->B:72:0x02c3 BREAK  A[LOOP:8: B:66:0x02ae->B:142:?], TryCatch #3 {all -> 0x0227, blocks: (B:36:0x01da, B:37:0x01f9, B:39:0x01ff, B:41:0x0217, B:44:0x022a, B:45:0x0236, B:47:0x023c, B:49:0x0248, B:50:0x0258, B:51:0x025c, B:52:0x0264, B:54:0x026a, B:56:0x0276, B:57:0x0287, B:58:0x028f, B:60:0x0295, B:65:0x02a6, B:66:0x02ae, B:68:0x02b4, B:72:0x02c3, B:75:0x02f8, B:76:0x0301, B:78:0x0307, B:80:0x0313, B:82:0x031d, B:83:0x0321), top: B:111:0x01da }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(java.lang.String r21, byte[] r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1033e0.F(java.lang.String, byte[], java.lang.String, java.lang.String):void");
    }

    public final int G(String str, String str2) {
        Integer num;
        r();
        P(str);
        Map map = (Map) this.f10892E.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.S0 H(String str) {
        r();
        P(str);
        com.google.android.gms.internal.measurement.X0 x0I = I(str);
        if (x0I == null || !x0I.F()) {
            return null;
        }
        return x0I.v();
    }

    public final com.google.android.gms.internal.measurement.X0 I(String str) {
        v();
        r();
        AbstractC1332d.g(str);
        P(str);
        return (com.google.android.gms.internal.measurement.X0) this.f10891D.getOrDefault(str, null);
    }

    public final boolean J(String str, String str2) {
        Boolean bool;
        r();
        P(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f10890C.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean K(String str, EnumC1083y0 enumC1083y0) {
        r();
        P(str);
        com.google.android.gms.internal.measurement.S0 s0H = H(str);
        if (s0H == null) {
            return false;
        }
        Iterator it = s0H.s().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.P0 p02 = (com.google.android.gms.internal.measurement.P0) it.next();
            if (enumC1083y0 == A(p02.r())) {
                if (p02.q() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean L(String str, String str2) {
        Boolean bool;
        r();
        P(str);
        if ("1".equals(b(str, "measurement.upload.blacklist_internal")) && K1.w0(str2)) {
            return true;
        }
        if ("1".equals(b(str, "measurement.upload.blacklist_public")) && K1.x0(str2)) {
            return true;
        }
        Map map = (Map) this.f10889B.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String M(String str) {
        r();
        P(str);
        return (String) this.f10895H.getOrDefault(str, null);
    }

    public final boolean N(String str) {
        r();
        P(str);
        C1280b c1280b = this.f10888A;
        return c1280b.getOrDefault(str, null) != null && ((Set) c1280b.getOrDefault(str, null)).contains("app_instance_id");
    }

    public final boolean O(String str) {
        r();
        P(str);
        C1280b c1280b = this.f10888A;
        if (c1280b.getOrDefault(str, null) != null) {
            return ((Set) c1280b.getOrDefault(str, null)).contains("os_version") || ((Set) c1280b.getOrDefault(str, null)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0072: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:115), block:B:14:0x0072 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1033e0.P(java.lang.String):void");
    }

    @Override // m2.InterfaceC1035f
    public final String b(String str, String str2) {
        r();
        P(str);
        Map map = (Map) this.f10898z.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // m2.t1
    public final boolean x() {
        return false;
    }

    public final long y(String str) {
        String strB = b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strB)) {
            return 0L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException e6) {
            N nF = f();
            nF.f10718E.b(N.x(str), e6, "Unable to parse timezone offset. appId");
            return 0L;
        }
    }

    public final com.google.android.gms.internal.measurement.X0 z(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.X0.x();
        }
        try {
            com.google.android.gms.internal.measurement.X0 x02 = (com.google.android.gms.internal.measurement.X0) ((com.google.android.gms.internal.measurement.W0) H1.F(com.google.android.gms.internal.measurement.X0.w(), bArr)).e();
            f().f10723J.b(x02.I() ? Long.valueOf(x02.u()) : null, x02.G() ? x02.z() : null, "Parsed config. version, gmp_app_id");
            return x02;
        } catch (Q2 e6) {
            e = e6;
            f().f10718E.b(N.x(str), e, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.X0.x();
        } catch (RuntimeException e7) {
            e = e7;
            f().f10718E.b(N.x(str), e, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.X0.x();
        }
    }
}
