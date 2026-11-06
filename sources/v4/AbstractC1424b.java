package v4;

import C4.l;
import M4.C0075u;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: v4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1424b implements InterfaceC1431i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f13301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1431i f13302x;

    public AbstractC1424b(InterfaceC1431i interfaceC1431i, C0075u c0075u) {
        AbstractC1305a.o(interfaceC1431i, "baseKey");
        this.f13301w = c0075u;
        this.f13302x = interfaceC1431i instanceof AbstractC1424b ? ((AbstractC1424b) interfaceC1431i).f13302x : interfaceC1431i;
    }
}
