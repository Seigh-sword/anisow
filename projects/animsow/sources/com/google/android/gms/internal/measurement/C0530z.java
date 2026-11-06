package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0530z implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0435j f7014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0.h f7015b;

    public C0530z(AbstractC0435j abstractC0435j, P0.h hVar) {
        this.f7014a = abstractC0435j;
        this.f7015b = hVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC0459n interfaceC0459n = (InterfaceC0459n) obj;
        InterfaceC0459n interfaceC0459n2 = (InterfaceC0459n) obj2;
        if (interfaceC0459n instanceof C0494t) {
            return !(interfaceC0459n2 instanceof C0494t) ? 1 : 0;
        }
        if (interfaceC0459n2 instanceof C0494t) {
            return -1;
        }
        AbstractC0435j abstractC0435j = this.f7014a;
        return abstractC0435j == null ? interfaceC0459n.g().compareTo(interfaceC0459n2.g()) : (int) F2.a(abstractC0435j.a(this.f7015b, Arrays.asList(interfaceC0459n, interfaceC0459n2)).p().doubleValue());
    }
}
