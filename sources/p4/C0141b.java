package P4;

import M4.InterfaceC0080z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s4.C1316l;
import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: renamed from: P4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0141b extends Q4.g {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2650B = AtomicIntegerFieldUpdater.newUpdater(C0141b.class, "consumed$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f2651A;
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final O4.q f2652z;

    public /* synthetic */ C0141b(O4.q qVar, boolean z5) {
        this(qVar, z5, C1433k.f13309w, -3, O4.a.f2342w);
    }

    @Override // Q4.g, P4.InterfaceC0146g
    public final Object d(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) throws Throwable {
        C1316l c1316l = C1316l.f12640a;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        if (this.f2844x != -3) {
            Object objD = super.d(interfaceC0147h, interfaceC1427e);
            return objD == enumC1481a ? objD : c1316l;
        }
        boolean z5 = this.f2651A;
        if (z5 && f2650B.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object objN = S3.a.n(interfaceC0147h, this.f2652z, z5, interfaceC1427e);
        return objN == enumC1481a ? objN : c1316l;
    }

    @Override // Q4.g
    public final String e() {
        return "channel=" + this.f2652z;
    }

    @Override // Q4.g
    public final Object f(O4.p pVar, InterfaceC1427e interfaceC1427e) throws Throwable {
        Object objN = S3.a.n(new Q4.z(pVar), this.f2652z, this.f2651A, interfaceC1427e);
        return objN == EnumC1481a.f13592w ? objN : C1316l.f12640a;
    }

    @Override // Q4.g
    public final Q4.g g(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        return new C0141b(this.f2652z, this.f2651A, interfaceC1432j, i6, aVar);
    }

    @Override // Q4.g
    public final InterfaceC0146g h() {
        return new C0141b(this.f2652z, this.f2651A);
    }

    @Override // Q4.g
    public final O4.q i(InterfaceC0080z interfaceC0080z) {
        if (!this.f2651A || f2650B.getAndSet(this, 1) == 0) {
            return this.f2844x == -3 ? this.f2652z : super.i(interfaceC0080z);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }

    public C0141b(O4.q qVar, boolean z5, InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        super(interfaceC1432j, i6, aVar);
        this.f2652z = qVar;
        this.f2651A = z5;
        this.consumed$volatile = 0;
    }
}
