package W;

import java.io.Serializable;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class I extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f4018A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Serializable f4019B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public D4.r f4020C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f4021D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f4022E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public /* synthetic */ Object f4023F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ W f4024G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f4025H;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f4026z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(W w5, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4024G = w5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4023F = obj;
        this.f4025H |= Integer.MIN_VALUE;
        return W.e(this.f4024G, false, this);
    }
}
