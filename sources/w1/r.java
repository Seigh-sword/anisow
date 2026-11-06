package W1;

import X1.C0239g;
import X1.InterfaceC0236d;
import android.content.Context;
import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import u1.C1358b;

/* JADX INFO: loaded from: classes.dex */
public final class r extends S0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f4345A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f4346y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0226u f4347z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C0226u c0226u, Object obj, int i6) {
        super(c0226u);
        this.f4346y = i6;
        this.f4347z = c0226u;
        this.f4345A = obj;
    }

    @Override // S0.c
    public final void d() {
        n2.c cVar;
        Set setEmptySet;
        int i6 = this.f4346y;
        int i7 = 0;
        Object obj = this.f4345A;
        C0226u c0226u = this.f4347z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                C1358b c1358b = new C1358b(c0226u.f4353d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Map map = (Map) obj;
                for (V1.b bVar : map.keySet()) {
                    bVar.getClass();
                    if (((C0222p) map.get(bVar)).f4341c) {
                        arrayList2.add(bVar);
                    } else {
                        arrayList.add(bVar);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                Context context = c0226u.f4352c;
                int iJ = -1;
                if (zIsEmpty) {
                    int size = arrayList2.size();
                    while (i7 < size) {
                        iJ = c1358b.j(context, (V1.b) arrayList2.get(i7));
                        i7++;
                        if (iJ == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i7 < size2) {
                        iJ = c1358b.j(context, (V1.b) arrayList.get(i7));
                        i7++;
                        if (iJ != 0) {
                        }
                    }
                }
                A a6 = c0226u.f4350a;
                if (iJ != 0) {
                    C0223q c0223q = new C0223q(this, c0226u, new U1.b(iJ, null));
                    HandlerC0227v handlerC0227v = a6.f4215g;
                    handlerC0227v.sendMessage(handlerC0227v.obtainMessage(1, c0223q));
                    return;
                }
                if (c0226u.f4362m && (cVar = c0226u.f4360k) != null) {
                    cVar.k();
                }
                for (V1.b bVar2 : map.keySet()) {
                    InterfaceC0236d interfaceC0236d = (InterfaceC0236d) map.get(bVar2);
                    bVar2.getClass();
                    if (c1358b.j(context, bVar2) != 0) {
                        C0220n c0220n = new C0220n(c0226u, interfaceC0236d);
                        HandlerC0227v handlerC0227v2 = a6.f4215g;
                        handlerC0227v2.sendMessage(handlerC0227v2.obtainMessage(1, c0220n));
                    } else {
                        bVar2.g(interfaceC0236d);
                    }
                }
                return;
            default:
                A a7 = c0226u.f4350a;
                C0229x c0229x = a7.f4223o;
                C0239g c0239g = c0226u.f4367r;
                if (c0239g == null) {
                    setEmptySet = Collections.emptySet();
                } else {
                    HashSet hashSet = new HashSet(c0239g.f4590b);
                    Map map2 = c0239g.f4592d;
                    for (V1.d dVar : map2.keySet()) {
                        if (!a7.f4217i.containsKey(dVar.f3705b)) {
                            AbstractC0628i.p(map2.get(dVar));
                            throw null;
                        }
                    }
                    setEmptySet = hashSet;
                }
                c0229x.f4388p = setEmptySet;
                ArrayList arrayList3 = (ArrayList) obj;
                int size3 = arrayList3.size();
                while (i7 < size3) {
                    ((V1.b) arrayList3.get(i7)).c(c0226u.f4364o, a7.f4223o.f4388p);
                    i7++;
                }
                return;
        }
    }
}
