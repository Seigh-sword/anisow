package T3;

import Q3.A;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import m2.C0;
import m2.C1017B;

/* JADX INFO: loaded from: classes.dex */
public final class h extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f3468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3.q f3469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f3470d;

    public h(i iVar, Q3.n nVar, Type type, A a6, Type type2, A a7, S3.q qVar) {
        this.f3470d = iVar;
        this.f3467a = new s(nVar, a6, type);
        this.f3468b = new s(nVar, a7, type2);
        this.f3469c = qVar;
    }

    @Override // Q3.A
    public final Object b(X3.a aVar) throws IOException {
        int i6;
        int iW = aVar.W();
        if (iW == 9) {
            aVar.S();
            return null;
        }
        Map map = (Map) this.f3469c.h();
        s sVar = this.f3468b;
        s sVar2 = this.f3467a;
        if (iW == 1) {
            aVar.b();
            while (aVar.J()) {
                aVar.b();
                Object objB = sVar2.b(aVar);
                if (map.put(objB, sVar.b(aVar)) != null) {
                    throw new Q3.q("duplicate key: " + objB);
                }
                aVar.k();
            }
            aVar.k();
        } else {
            aVar.c();
            while (aVar.J()) {
                C1017B.f10488y.getClass();
                int iH = aVar.f4676D;
                if (iH == 0) {
                    iH = aVar.h();
                }
                if (iH == 13) {
                    aVar.f4676D = 9;
                } else {
                    if (iH == 12) {
                        i6 = 8;
                    } else {
                        if (iH != 14) {
                            throw new IllegalStateException("Expected a name but was " + H1.a.D(aVar.W()) + aVar.L());
                        }
                        i6 = 10;
                    }
                    aVar.f4676D = i6;
                }
                Object objB2 = sVar2.b(aVar);
                if (map.put(objB2, sVar.b(aVar)) != null) {
                    throw new Q3.q("duplicate key: " + objB2);
                }
            }
            aVar.l();
        }
        return map;
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) throws IOException {
        String strC;
        Map map = (Map) obj;
        if (map == null) {
            bVar.J();
            return;
        }
        boolean z5 = this.f3470d.f3472x;
        s sVar = this.f3468b;
        if (!z5) {
            bVar.g();
            for (Map.Entry entry : map.entrySet()) {
                bVar.n(String.valueOf(entry.getKey()));
                sVar.c(bVar, entry.getValue());
            }
            bVar.l();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i6 = 0;
        boolean z6 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            s sVar2 = this.f3467a;
            sVar2.getClass();
            try {
                g gVar = new g();
                sVar2.c(gVar, key);
                ArrayList arrayList3 = gVar.f3464H;
                if (!arrayList3.isEmpty()) {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                }
                Q3.p pVar = gVar.f3466J;
                arrayList.add(pVar);
                arrayList2.add(entry2.getValue());
                pVar.getClass();
                z6 |= (pVar instanceof Q3.o) || (pVar instanceof Q3.s);
            } catch (IOException e6) {
                throw new Q3.q(e6);
            }
        }
        if (z6) {
            bVar.c();
            int size = arrayList.size();
            while (i6 < size) {
                bVar.c();
                C0.r((Q3.p) arrayList.get(i6), bVar);
                sVar.c(bVar, arrayList2.get(i6));
                bVar.k();
                i6++;
            }
            bVar.k();
            return;
        }
        bVar.g();
        int size2 = arrayList.size();
        while (i6 < size2) {
            Q3.p pVar2 = (Q3.p) arrayList.get(i6);
            pVar2.getClass();
            boolean z7 = pVar2 instanceof Q3.t;
            if (z7) {
                if (!z7) {
                    throw new IllegalStateException("Not a JSON Primitive: " + pVar2);
                }
                Q3.t tVar = (Q3.t) pVar2;
                Serializable serializable = tVar.f2820w;
                if (serializable instanceof Number) {
                    strC = String.valueOf(tVar.b());
                } else if (serializable instanceof Boolean) {
                    strC = Boolean.toString(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(tVar.c()));
                } else {
                    if (!(serializable instanceof String)) {
                        throw new AssertionError();
                    }
                    strC = tVar.c();
                }
            } else {
                if (!(pVar2 instanceof Q3.r)) {
                    throw new AssertionError();
                }
                strC = "null";
            }
            bVar.n(strC);
            sVar.c(bVar, arrayList2.get(i6));
            i6++;
        }
        bVar.l();
    }
}
