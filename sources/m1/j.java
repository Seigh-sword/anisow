package M1;

import G1.B;
import G1.C;
import G1.D;
import G1.I;
import G1.J;
import G1.K;
import G1.L;
import G1.n;
import G1.o;
import G1.q;
import G1.r;
import G1.s;
import G1.t;
import G1.u;
import G1.v;
import G1.x;
import G1.z;
import H1.p;
import J3.G;
import N.C0095h;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Log;
import b3.C0343c;
import d.AbstractC0628i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p1.C1243i;
import q0.C1256a;
import t0.AbstractC1332d;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.f f1787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N1.d f1788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f1789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f1790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O1.c f1791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P1.a f1792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final P1.a f1793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N1.c f1794i;

    public j(Context context, I1.f fVar, N1.d dVar, m mVar, Executor executor, O1.c cVar, P1.a aVar, P1.a aVar2, N1.c cVar2) {
        this.f1786a = context;
        this.f1787b = fVar;
        this.f1788c = dVar;
        this.f1789d = mVar;
        this.f1790e = executor;
        this.f1791f = cVar;
        this.f1792g = aVar;
        this.f1793h = aVar2;
        this.f1794i = cVar2;
    }

    public final void a(H1.j jVar, int i6) {
        I1.h hVar;
        N1.l lVar;
        I1.a aVar;
        String str;
        I1.a aVar2;
        int i7;
        Object objApply;
        String str2;
        Integer numValueOf;
        String str3;
        N1.l lVar2;
        J0.l lVar3;
        final j jVar2 = this;
        final H1.j jVar3 = jVar;
        I1.h hVarA = jVar2.f1787b.a(jVar3.f934a);
        long jMax = 0;
        while (true) {
            final int i8 = 0;
            O1.b bVar = new O1.b(jVar2) { // from class: M1.g

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ j f1776x;

                {
                    this.f1776x = jVar2;
                }

                @Override // O1.b
                public final Object d() {
                    int i9 = i8;
                    final H1.j jVar4 = jVar3;
                    j jVar5 = this.f1776x;
                    switch (i9) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            final N1.l lVar4 = (N1.l) jVar5.f1788c;
                            lVar4.getClass();
                            final int i10 = 1;
                            Boolean bool = (Boolean) lVar4.g(new N1.j() { // from class: N1.g
                                /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
                                @Override // N1.j
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object apply(java.lang.Object r12) {
                                    /*
                                        Method dump skipped, instruction units count: 284
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: N1.g.apply(java.lang.Object):java.lang.Object");
                                }
                            });
                            bool.getClass();
                            return bool;
                        default:
                            final N1.l lVar5 = (N1.l) jVar5.f1788c;
                            lVar5.getClass();
                            final int i11 = 0;
                            return (Iterable) lVar5.g(new N1.j() { // from class: N1.g
                                /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
                                @Override // N1.j
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object apply(java.lang.Object r12) {
                                    /*
                                        Method dump skipped, instruction units count: 284
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: N1.g.apply(java.lang.Object):java.lang.Object");
                                }
                            });
                    }
                }
            };
            N1.l lVar4 = (N1.l) jVar2.f1791f;
            boolean zBooleanValue = ((Boolean) lVar4.k(bVar)).booleanValue();
            P1.a aVar3 = jVar2.f1792g;
            if (!zBooleanValue) {
                j jVar4 = jVar2;
                H1.j jVar5 = jVar3;
                SQLiteDatabase sQLiteDatabaseB = lVar4.b();
                C0095h c0095h = new C0095h(9);
                P1.c cVar = (P1.c) lVar4.f2104y;
                long jA = cVar.a();
                while (true) {
                    try {
                        sQLiteDatabaseB.beginTransaction();
                    } catch (SQLiteDatabaseLockedException e6) {
                        N1.l lVar5 = lVar4;
                        if (cVar.a() >= ((long) lVar4.f2105z.f2079c) + jA) {
                            c0095h.apply(e6);
                            break;
                        } else {
                            SystemClock.sleep(50L);
                            lVar4 = lVar5;
                        }
                    }
                }
                try {
                    long jA2 = ((P1.c) aVar3).a() + jMax;
                    N1.l lVar6 = (N1.l) jVar4.f1788c;
                    lVar6.getClass();
                    lVar6.g(new N1.f(jA2, jVar5));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            }
            final int i9 = 1;
            Iterable iterable = (Iterable) lVar4.k(new O1.b(jVar2) { // from class: M1.g

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ j f1776x;

                {
                    this.f1776x = jVar2;
                }

                @Override // O1.b
                public final Object d() {
                    int i92 = i9;
                    final H1.j jVar42 = jVar3;
                    j jVar52 = this.f1776x;
                    switch (i92) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            final N1.l lVar42 = (N1.l) jVar52.f1788c;
                            lVar42.getClass();
                            final int i10 = 1;
                            Boolean bool = (Boolean) lVar42.g(new N1.j() { // from class: N1.g
                                /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
                                @Override // N1.j
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object apply(java.lang.Object r12) {
                                    /*
                                        Method dump skipped, instruction units count: 284
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: N1.g.apply(java.lang.Object):java.lang.Object");
                                }
                            });
                            bool.getClass();
                            return bool;
                        default:
                            final N1.l lVar52 = (N1.l) jVar52.f1788c;
                            lVar52.getClass();
                            final int i11 = 0;
                            return (Iterable) lVar52.g(new N1.j() { // from class: N1.g
                                /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
                                @Override // N1.j
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object apply(java.lang.Object r12) {
                                    /*
                                        Method dump skipped, instruction units count: 284
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: N1.g.apply(java.lang.Object):java.lang.Object");
                                }
                            });
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = jVar3.f935b;
            if (hVarA == null) {
                AbstractC1332d.z("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar3);
                aVar2 = new I1.a(3, -1L);
                hVar = hVarA;
                lVar = lVar4;
            } else {
                ArrayList<H1.i> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((N1.b) it.next()).f2084c);
                }
                String str4 = "proto";
                if (bArr != null) {
                    N1.c cVar2 = jVar2.f1794i;
                    Objects.requireNonNull(cVar2);
                    K1.a aVar4 = (K1.a) lVar4.k(new G(12, cVar2));
                    R0.k kVar = new R0.k();
                    kVar.f2924f = new HashMap();
                    kVar.f2922d = Long.valueOf(((P1.c) aVar3).a());
                    kVar.f2923e = Long.valueOf(((P1.c) jVar2.f1793h).a());
                    kVar.f2919a = "GDT_CLIENT_METRICS";
                    E1.c cVar3 = new E1.c("proto");
                    aVar4.getClass();
                    C0343c c0343c = p.f947a;
                    c0343c.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c0343c.k(aVar4, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    kVar.q(new H1.m(cVar3, byteArrayOutputStream.toByteArray()));
                    arrayList.add(((F1.d) hVarA).a(kVar.b()));
                }
                C1358b c1358b = new C1358b(10);
                c1358b.f12822x = arrayList;
                c1358b.f12823y = bArr;
                F1.d dVar = (F1.d) hVarA;
                HashMap map = new HashMap();
                for (H1.i iVar : arrayList) {
                    String str5 = iVar.f924a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(iVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    H1.i iVar2 = (H1.i) ((List) entry.getValue()).get(0);
                    L l5 = L.f756w;
                    long jA3 = ((P1.c) dVar.f617f).a();
                    long jA4 = ((P1.c) dVar.f616e).a();
                    I1.h hVar2 = hVarA;
                    C1358b c1358b2 = new C1358b(6);
                    c1358b2.f12822x = z.f860w;
                    n nVar = new n(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build"));
                    c1358b2.f12823y = nVar;
                    G1.p pVar = new G1.p((z) c1358b2.f12822x, nVar);
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = ((List) entry.getValue()).iterator();
                    while (it3.hasNext()) {
                        H1.i iVar3 = (H1.i) it3.next();
                        Iterator it4 = it2;
                        H1.m mVar = iVar3.f926c;
                        Iterator it5 = it3;
                        E1.c cVar4 = mVar.f943a;
                        boolean zEquals = cVar4.equals(new E1.c(str4));
                        byte[] bArr2 = mVar.f944b;
                        if (zEquals) {
                            lVar3 = new J0.l();
                            lVar3.f1220f = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar4.equals(new E1.c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                lVar3 = new J0.l();
                                lVar3.f1215a = str6;
                            } else {
                                lVar2 = lVar4;
                                String strJ = AbstractC1332d.J("CctTransportBackend");
                                if (Log.isLoggable(strJ, 5)) {
                                    Log.w(strJ, "Received event of unsupported encoding " + cVar4 + ". Skipping...");
                                }
                                it3 = it5;
                                it2 = it4;
                                str4 = str3;
                                lVar4 = lVar2;
                            }
                        }
                        lVar3.f1216b = Long.valueOf(iVar3.f927d);
                        lVar3.f1219e = Long.valueOf(iVar3.f928e);
                        String str7 = (String) iVar3.f929f.get("tz-offset");
                        lVar3.f1221g = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        C1358b c1358b3 = new C1358b(9);
                        c1358b3.f12822x = (J) J.f754w.get(iVar3.b("net-type"));
                        I i10 = (I) I.f752w.get(iVar3.b("mobile-subtype"));
                        c1358b3.f12823y = i10;
                        lVar3.f1222h = new x((J) c1358b3.f12822x, i10);
                        Integer num = iVar3.f925b;
                        if (num != null) {
                            lVar3.f1217c = num;
                        }
                        Integer num2 = iVar3.f930g;
                        if (num2 != null) {
                            C1358b c1358b4 = new C1358b(7);
                            S0.f fVar = new S0.f(29);
                            lVar2 = lVar4;
                            new C1243i(4).f12254x = num2;
                            s sVar = new s(num2);
                            fVar.f3073x = sVar;
                            t tVar = new t(sVar);
                            c1358b4.f12822x = tVar;
                            B b6 = B.f750w;
                            c1358b4.f12823y = b6;
                            lVar3.f1218d = new q(tVar, b6);
                        } else {
                            lVar2 = lVar4;
                        }
                        byte[] bArr3 = iVar3.f933j;
                        byte[] bArr4 = iVar3.f932i;
                        if (bArr4 != null || bArr3 != null) {
                            C1358b c1358b5 = new C1358b(8);
                            if (bArr4 != null) {
                                c1358b5.f12822x = bArr4;
                            }
                            if (bArr3 != null) {
                                c1358b5.f12823y = bArr3;
                            }
                            lVar3.f1223i = new r((byte[]) c1358b5.f12822x, (byte[]) c1358b5.f12823y);
                        }
                        String strI = ((Long) lVar3.f1216b) == null ? " eventTimeMs" : "";
                        if (((Long) lVar3.f1219e) == null) {
                            strI = strI.concat(" eventUptimeMs");
                        }
                        if (((Long) lVar3.f1221g) == null) {
                            strI = AbstractC0628i.i(strI, " timezoneOffsetSeconds");
                        }
                        if (!strI.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strI));
                        }
                        arrayList4.add(new u(((Long) lVar3.f1216b).longValue(), (Integer) lVar3.f1217c, (C) lVar3.f1218d, ((Long) lVar3.f1219e).longValue(), (byte[]) lVar3.f1220f, (String) lVar3.f1215a, ((Long) lVar3.f1221g).longValue(), (K) lVar3.f1222h, (D) lVar3.f1223i));
                        it3 = it5;
                        it2 = it4;
                        str4 = str3;
                        lVar4 = lVar2;
                    }
                    arrayList3.add(new v(jA3, jA4, pVar, numValueOf, str2, arrayList4, l5));
                    hVarA = hVar2;
                    it2 = it2;
                    str4 = str4;
                    lVar4 = lVar4;
                }
                hVar = hVarA;
                lVar = lVar4;
                o oVar = new o(arrayList3);
                URL urlB = dVar.f615d;
                if (bArr != null) {
                    try {
                        F1.a aVarA = F1.a.a(bArr);
                        str = aVarA.f605b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = aVarA.f604a;
                        if (str8 != null) {
                            urlB = F1.d.b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new I1.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    F1.b bVar2 = new F1.b(urlB, oVar, str);
                    G g4 = new G(9, dVar);
                    int i11 = 5;
                    do {
                        objApply = g4.apply(bVar2);
                        F1.c cVar5 = (F1.c) objApply;
                        URL url = cVar5.f610b;
                        if (url != null) {
                            AbstractC1332d.z("CctTransportBackend", "Following redirect to: %s", url);
                            bVar2 = new F1.b(cVar5.f610b, bVar2.f607b, bVar2.f608c);
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            break;
                        } else {
                            i11--;
                        }
                    } while (i11 >= 1);
                    F1.c cVar6 = (F1.c) objApply;
                    int i12 = cVar6.f609a;
                    if (i12 == 200) {
                        aVar2 = new I1.a(1, cVar6.f611c);
                    } else {
                        if (i12 >= 500 || i12 == 404) {
                            aVar = new I1.a(2, -1L);
                        } else if (i12 == 400) {
                            try {
                                aVar = new I1.a(4, -1L);
                            } catch (IOException e7) {
                                e = e7;
                                AbstractC1332d.B("CctTransportBackend", "Could not make request to the backend", e);
                                i7 = 2;
                                aVar2 = new I1.a(2, -1L);
                            }
                        } else {
                            aVar = new I1.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e8) {
                    e = e8;
                }
            }
            i7 = 2;
            int i13 = aVar2.f1119a;
            if (i13 == i7) {
                lVar.k(new h(this, iterable, jVar, jMax));
                ((d) this.f1789d).a(jVar, i6 + 1, true);
                return;
            }
            N1.l lVar7 = lVar;
            lVar7.k(new C1256a(this, 1, iterable));
            if (i13 == 1) {
                jMax = Math.max(jMax, aVar2.f1120b);
                if (bArr != null) {
                    lVar7.k(new G(11, this));
                }
            } else if (i13 == 4) {
                HashMap map2 = new HashMap();
                Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    String str9 = ((N1.b) it6.next()).f2084c.f924a;
                    map2.put(str9, !map2.containsKey(str9) ? 1 : Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                }
                lVar7.k(new C1256a(this, 2, map2));
            }
            jVar3 = jVar;
            hVarA = hVar;
            jVar2 = this;
        }
    }
}
