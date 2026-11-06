package H1;

import java.util.concurrent.Executor;
import q4.InterfaceC1266a;

/* JADX INFO: loaded from: classes.dex */
public final class v implements J1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1266a f964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1266a f965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1266a f966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1266a f967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1266a f968f;

    public /* synthetic */ v(InterfaceC1266a interfaceC1266a, InterfaceC1266a interfaceC1266a2, J1.b bVar, InterfaceC1266a interfaceC1266a3, InterfaceC1266a interfaceC1266a4, int i6) {
        this.f963a = i6;
        this.f964b = interfaceC1266a;
        this.f965c = interfaceC1266a2;
        this.f966d = bVar;
        this.f967e = interfaceC1266a3;
        this.f968f = interfaceC1266a4;
    }

    @Override // q4.InterfaceC1266a
    public final Object get() {
        int i6 = this.f963a;
        InterfaceC1266a interfaceC1266a = this.f968f;
        InterfaceC1266a interfaceC1266a2 = this.f967e;
        InterfaceC1266a interfaceC1266a3 = this.f966d;
        InterfaceC1266a interfaceC1266a4 = this.f965c;
        InterfaceC1266a interfaceC1266a5 = this.f964b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new u((P1.a) interfaceC1266a5.get(), (P1.a) interfaceC1266a4.get(), (L1.c) interfaceC1266a3.get(), (M1.j) interfaceC1266a2.get(), (M1.l) interfaceC1266a.get());
            case 1:
                return new L1.b((Executor) interfaceC1266a5.get(), (I1.f) interfaceC1266a4.get(), (M1.m) interfaceC1266a3.get(), (N1.d) interfaceC1266a2.get(), (O1.c) interfaceC1266a.get());
            default:
                return new N1.l((P1.a) interfaceC1266a5.get(), (P1.a) interfaceC1266a4.get(), (N1.a) interfaceC1266a3.get(), (N1.o) interfaceC1266a2.get(), this.f968f);
        }
    }
}
