package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends AbstractC0435j {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final I0.f f6793y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashMap f6794z;

    public e5(I0.f fVar) {
        super("require");
        this.f6794z = new HashMap();
        this.f6793y = fVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0435j
    public final InterfaceC0459n a(P0.h hVar, List list) {
        InterfaceC0459n interfaceC0459n;
        F2.n("require", 1, list);
        String strG = hVar.j((InterfaceC0459n) list.get(0)).g();
        HashMap map = this.f6794z;
        if (map.containsKey(strG)) {
            return (InterfaceC0459n) map.get(strG);
        }
        I0.f fVar = this.f6793y;
        if (fVar.f1097a.containsKey(strG)) {
            try {
                interfaceC0459n = (InterfaceC0459n) ((Callable) fVar.f1097a.get(strG)).call();
            } catch (Exception unused) {
                throw new IllegalStateException(AbstractC0628i.q("Failed to create API implementation: ", strG));
            }
        } else {
            interfaceC0459n = InterfaceC0459n.f6885n;
        }
        if (interfaceC0459n instanceof AbstractC0435j) {
            map.put(strG, (AbstractC0435j) interfaceC0459n);
        }
        return interfaceC0459n;
    }
}
