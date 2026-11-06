package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import i.C0803c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import m2.C1033e0;
import m2.CallableC1030d0;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class O2 extends AbstractC0435j {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f6651y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f6652z;

    public O2(K1.b bVar) {
        super("internal.logger");
        this.f6652z = bVar;
        HashMap map = this.f6839x;
        map.put("log", new d5(this, false, true));
        map.put("silent", new C0387b("silent", 2));
        ((AbstractC0435j) map.get("silent")).l("log", new d5(this, true, true));
        map.put("unmonitored", new C0387b("unmonitored", 3));
        ((AbstractC0435j) map.get("unmonitored")).l("log", new d5(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0435j
    public final InterfaceC0459n a(P0.h hVar, List list) {
        Object obj;
        C0494t c0494t = InterfaceC0459n.f6885n;
        String str = null;
        int i6 = this.f6651y;
        String str2 = this.f6838w;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                F2.n(str2, 3, list);
                String strG = hVar.j((InterfaceC0459n) list.get(0)).g();
                long jA = (long) F2.a(hVar.j((InterfaceC0459n) list.get(1)).p().doubleValue());
                InterfaceC0459n interfaceC0459nJ = hVar.j((InterfaceC0459n) list.get(2));
                HashMap mapK = interfaceC0459nJ instanceof C0453m ? F2.k((C0453m) interfaceC0459nJ) : new HashMap();
                C0803c c0803c = (C0803c) this.f6652z;
                c0803c.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapK.keySet()) {
                    HashMap map2 = ((C0393c) c0803c.f9277x).f6772c;
                    map.put(str3, C0393c.a(map2.containsKey(str3) ? map2.get(str3) : null, mapK.get(str3), str3));
                }
                ((List) c0803c.f9279z).add(new C0393c(strG, jA, map));
                return c0494t;
            case 1:
                F2.n("getValue", 2, list);
                InterfaceC0459n interfaceC0459nJ2 = hVar.j((InterfaceC0459n) list.get(0));
                InterfaceC0459n interfaceC0459nJ3 = hVar.j((InterfaceC0459n) list.get(1));
                String strG2 = interfaceC0459nJ2.g();
                C1358b c1358b = (C1358b) this.f6652z;
                Map map3 = (Map) ((C1033e0) c1358b.f12823y).f10898z.getOrDefault((String) c1358b.f12822x, null);
                if (map3 != null && map3.containsKey(strG2)) {
                    str = (String) map3.get(strG2);
                }
                return str != null ? new C0471p(str) : interfaceC0459nJ3;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return c0494t;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                F2.n(str2, 3, list);
                hVar.j((InterfaceC0459n) list.get(0)).g();
                InterfaceC0459n interfaceC0459nJ4 = hVar.j((InterfaceC0459n) list.get(1));
                if (!(interfaceC0459nJ4 instanceof C0465o)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC0459n interfaceC0459nJ5 = hVar.j((InterfaceC0459n) list.get(2));
                if (!(interfaceC0459nJ5 instanceof C0453m)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C0453m c0453m = (C0453m) interfaceC0459nJ5;
                if (!c0453m.f6879w.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strG3 = c0453m.b("type").g();
                int iQ = c0453m.f6879w.containsKey("priority") ? F2.q(c0453m.b("priority").p().doubleValue()) : 1000;
                C1358b c1358b2 = (C1358b) this.f6652z;
                C0465o c0465o = (C0465o) interfaceC0459nJ4;
                c1358b2.getClass();
                if ("create".equals(strG3)) {
                    obj = c1358b2.f12823y;
                } else {
                    if (!"edit".equals(strG3)) {
                        throw new IllegalStateException(AbstractC0628i.q("Unknown callback type: ", strG3));
                    }
                    obj = c1358b2.f12822x;
                }
                TreeMap treeMap = (TreeMap) obj;
                if (treeMap.containsKey(Integer.valueOf(iQ))) {
                    iQ = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iQ), c0465o);
                return c0494t;
            default:
                try {
                    return F2.f(((Callable) this.f6652z).call());
                } catch (Exception unused) {
                    return c0494t;
                }
        }
    }

    public O2(C0803c c0803c) {
        super("internal.eventLogger");
        this.f6652z = c0803c;
    }

    public O2(CallableC1030d0 callableC1030d0) {
        super("internal.appMetadata");
        this.f6652z = callableC1030d0;
    }

    public O2(C1358b c1358b) {
        super("internal.registerCallback");
        this.f6652z = c1358b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2(C1358b c1358b, int i6) {
        super("getValue");
        this.f6652z = c1358b;
    }
}
