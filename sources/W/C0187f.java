package W;

import java.io.Serializable;
import java.util.Iterator;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: W.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0187f extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Iterator f4107A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4108B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ m0 f4109C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4110D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Serializable f4111z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187f(m0 m0Var, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4109C = m0Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4108B = obj;
        this.f4110D |= Integer.MIN_VALUE;
        return m0.a(this.f4109C, null, null, this);
    }
}
