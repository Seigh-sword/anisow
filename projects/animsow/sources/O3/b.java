package O3;

import java.util.Iterator;
import java.util.Map;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Iterator f2327A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public d f2328B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public T4.a f2329C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Map f2330D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Object f2331E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public /* synthetic */ Object f2332F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ c f2333G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f2334H;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Map f2335z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f2333G = cVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f2332F = obj;
        this.f2334H |= Integer.MIN_VALUE;
        return this.f2333G.b(this);
    }
}
