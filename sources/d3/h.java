package d3;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import d.AbstractC0628i;
import d.RunnableC0637r;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m2.C0;
import v3.InterfaceC1422a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0655c, InterfaceC1422a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f8191h = new g(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f8196e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f8198g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8192a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8193b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8194c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f8195d = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f8197f = new AtomicReference();

    public h(Executor executor, List list, List list2, f fVar) {
        l lVar = new l(executor);
        this.f8196e = lVar;
        this.f8198g = fVar;
        ArrayList<C0654b> arrayList = new ArrayList();
        arrayList.add(C0654b.c(lVar, l.class, A3.c.class, A3.b.class));
        arrayList.add(C0654b.c(this, InterfaceC1422a.class, new Class[0]));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C0654b c0654b = (C0654b) it.next();
            if (c0654b != null) {
                arrayList.add(c0654b);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((D3.c) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f8198g.d(componentRegistrar));
                        it3.remove();
                    }
                } catch (m e6) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e6);
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((C0654b) it4.next()).f8182b.toArray();
                int length = array.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length) {
                        Object obj = array[i6];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f8195d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f8195d.add(obj.toString());
                        }
                        i6++;
                    }
                }
            }
            if (this.f8192a.isEmpty()) {
                C0.c(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f8192a.keySet());
                arrayList4.addAll(arrayList);
                C0.c(arrayList4);
            }
            for (C0654b c0654b2 : arrayList) {
                this.f8192a.put(c0654b2, new n(new Y2.c(this, 1, c0654b2)));
            }
            arrayList3.addAll(j(arrayList));
            arrayList3.addAll(k());
            i();
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f8197f.get();
        if (bool != null) {
            h(this.f8192a, bool.booleanValue());
        }
    }

    @Override // d3.InterfaceC0655c
    public final synchronized D3.c c(r rVar) {
        f2.h.g(rVar, "Null interface requested.");
        return (D3.c) this.f8193b.get(rVar);
    }

    @Override // d3.InterfaceC0655c
    public final D3.b d(r rVar) {
        D3.c cVarC = c(rVar);
        return cVarC == null ? new p(p.f8215c, p.f8216d) : cVarC instanceof p ? (p) cVarC : new p(null, cVarC);
    }

    @Override // d3.InterfaceC0655c
    public final synchronized D3.c e(r rVar) {
        o oVar = (o) this.f8194c.get(rVar);
        if (oVar != null) {
            return oVar;
        }
        return f8191h;
    }

    public final void h(Map map, boolean z5) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C0654b c0654b = (C0654b) entry.getKey();
            D3.c cVar = (D3.c) entry.getValue();
            int i6 = c0654b.f8184d;
            if (i6 == 1 || (i6 == 2 && z5)) {
                cVar.get();
            }
        }
        l lVar = this.f8196e;
        synchronized (lVar) {
            arrayDeque = lVar.f8208b;
            if (arrayDeque != null) {
                lVar.f8208b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                AbstractC0628i.p(it.next());
                throw null;
            }
        }
    }

    public final void i() {
        for (C0654b c0654b : this.f8192a.keySet()) {
            for (k kVar : c0654b.f8183c) {
                boolean z5 = kVar.f8205b == 2;
                r rVar = kVar.f8204a;
                if (z5) {
                    HashMap map = this.f8194c;
                    if (!map.containsKey(rVar)) {
                        Set setEmptySet = Collections.emptySet();
                        o oVar = new o();
                        oVar.f8214b = null;
                        oVar.f8213a = Collections.newSetFromMap(new ConcurrentHashMap());
                        oVar.f8213a.addAll(setEmptySet);
                        map.put(rVar, oVar);
                    }
                }
                HashMap map2 = this.f8193b;
                if (map2.containsKey(rVar)) {
                    continue;
                } else {
                    int i6 = kVar.f8205b;
                    if (i6 == 1) {
                        throw new Q3.q("Unsatisfied dependency for component " + c0654b + ": " + rVar);
                    }
                    if (i6 != 2) {
                        map2.put(rVar, new p(p.f8215c, p.f8216d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0654b c0654b = (C0654b) it.next();
            if (c0654b.f8185e == 0) {
                D3.c cVar = (D3.c) this.f8192a.get(c0654b);
                for (r rVar : c0654b.f8182b) {
                    HashMap map = this.f8193b;
                    if (map.containsKey(rVar)) {
                        arrayList2.add(new RunnableC0637r((p) ((D3.c) map.get(rVar)), 9, cVar));
                    } else {
                        map.put(rVar, cVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f8192a.entrySet()) {
            C0654b c0654b = (C0654b) entry.getKey();
            if (c0654b.f8185e != 0) {
                D3.c cVar = (D3.c) entry.getValue();
                for (r rVar : c0654b.f8182b) {
                    if (!map.containsKey(rVar)) {
                        map.put(rVar, new HashSet());
                    }
                    ((Set) map.get(rVar)).add(cVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f8194c;
            if (map2.containsKey(key)) {
                o oVar = (o) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC0637r(oVar, 10, (D3.c) it.next()));
                }
            } else {
                r rVar2 = (r) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f8214b = null;
                oVar2.f8213a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f8213a.addAll(set);
                map2.put(rVar2, oVar2);
            }
        }
        return arrayList;
    }
}
