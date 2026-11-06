package L1;

import M1.l;
import M1.m;
import android.content.Context;
import java.util.concurrent.Executor;
import q4.InterfaceC1266a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements J1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1266a f1721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1266a f1722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1266a f1723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1266a f1724e;

    public /* synthetic */ e(InterfaceC1266a interfaceC1266a, InterfaceC1266a interfaceC1266a2, J1.b bVar, InterfaceC1266a interfaceC1266a3, int i6) {
        this.f1720a = i6;
        this.f1721b = interfaceC1266a;
        this.f1722c = interfaceC1266a2;
        this.f1723d = bVar;
        this.f1724e = interfaceC1266a3;
    }

    @Override // q4.InterfaceC1266a
    public final Object get() {
        int i6 = this.f1720a;
        InterfaceC1266a interfaceC1266a = this.f1724e;
        InterfaceC1266a interfaceC1266a2 = this.f1723d;
        InterfaceC1266a interfaceC1266a3 = this.f1722c;
        InterfaceC1266a interfaceC1266a4 = this.f1721b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Context context = (Context) interfaceC1266a4.get();
                N1.d dVar = (N1.d) interfaceC1266a3.get();
                M1.b bVar = (M1.b) interfaceC1266a2.get();
                return new M1.d(context, dVar, bVar);
            default:
                return new l((Executor) interfaceC1266a4.get(), (N1.d) interfaceC1266a3.get(), (m) interfaceC1266a2.get(), (O1.c) interfaceC1266a.get());
        }
    }
}
