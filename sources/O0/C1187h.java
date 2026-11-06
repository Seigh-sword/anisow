package o0;

import P4.InterfaceC0147h;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1187h extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11945A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1189i f11946B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Object f11947C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Object f11948D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC0147h f11949E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f11950z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187h(C1189i c1189i, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f11946B = c1189i;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f11950z = obj;
        this.f11945A |= Integer.MIN_VALUE;
        return this.f11946B.k(null, this);
    }
}
