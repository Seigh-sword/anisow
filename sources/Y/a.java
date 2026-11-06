package Y;

import f5.y;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends x4.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public y f4701A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4702B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ b f4703C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4704D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f4705z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        this.f4703C = bVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) {
        this.f4702B = obj;
        this.f4704D |= Integer.MIN_VALUE;
        return b.a(this.f4703C, this);
    }
}
