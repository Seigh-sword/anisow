package W;

import M4.InterfaceC0069n;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: W.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0204x extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public W f4181A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC0069n f4182B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f4183C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ W f4184D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f4185E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f4186z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204x(W w5, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4184D = w5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4183C = obj;
        this.f4185E |= Integer.MIN_VALUE;
        return W.c(this.f4184D, null, this);
    }
}
