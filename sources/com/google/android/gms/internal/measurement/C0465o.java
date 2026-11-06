package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0465o extends AbstractC0435j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final P0.h f6904A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f6905y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f6906z;

    public C0465o(C0465o c0465o) {
        super(c0465o.f6838w);
        ArrayList arrayList = new ArrayList(c0465o.f6905y.size());
        this.f6905y = arrayList;
        arrayList.addAll(c0465o.f6905y);
        ArrayList arrayList2 = new ArrayList(c0465o.f6906z.size());
        this.f6906z = arrayList2;
        arrayList2.addAll(c0465o.f6906z);
        this.f6904A = c0465o.f6904A;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0435j
    public final InterfaceC0459n a(P0.h hVar, List list) {
        C0494t c0494t;
        P0.h hVarH = this.f6904A.h();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f6905y;
            int size = arrayList.size();
            c0494t = InterfaceC0459n.f6885n;
            if (i6 >= size) {
                break;
            }
            int size2 = list.size();
            String str = (String) arrayList.get(i6);
            if (i6 < size2) {
                hVarH.l(str, hVar.j((InterfaceC0459n) list.get(i6)));
            } else {
                hVarH.l(str, c0494t);
            }
            i6++;
        }
        for (InterfaceC0459n interfaceC0459n : this.f6906z) {
            InterfaceC0459n interfaceC0459nJ = hVarH.j(interfaceC0459n);
            if (interfaceC0459nJ instanceof C0477q) {
                interfaceC0459nJ = hVarH.j(interfaceC0459n);
            }
            if (interfaceC0459nJ instanceof C0423h) {
                return ((C0423h) interfaceC0459nJ).f6832w;
            }
        }
        return c0494t;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0435j, com.google.android.gms.internal.measurement.InterfaceC0459n
    public final InterfaceC0459n f() {
        return new C0465o(this);
    }

    public C0465o(String str, ArrayList arrayList, List list, P0.h hVar) {
        super(str);
        this.f6905y = new ArrayList();
        this.f6904A = hVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f6905y.add(((InterfaceC0459n) it.next()).g());
            }
        }
        this.f6906z = new ArrayList(list);
    }
}
