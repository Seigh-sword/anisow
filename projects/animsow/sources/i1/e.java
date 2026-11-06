package I1;

import H1.o;
import android.content.Context;
import q4.InterfaceC1266a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements J1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1266a f1129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1266a f1130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1266a f1131d;

    public /* synthetic */ e(InterfaceC1266a interfaceC1266a, o oVar, o oVar2, int i6) {
        this.f1128a = i6;
        this.f1129b = interfaceC1266a;
        this.f1130c = oVar;
        this.f1131d = oVar2;
    }

    @Override // q4.InterfaceC1266a
    public final Object get() {
        int i6 = this.f1128a;
        InterfaceC1266a interfaceC1266a = this.f1131d;
        InterfaceC1266a interfaceC1266a2 = this.f1130c;
        InterfaceC1266a interfaceC1266a3 = this.f1129b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new d((Context) interfaceC1266a3.get(), (P1.a) interfaceC1266a2.get(), (P1.a) interfaceC1266a.get());
            default:
                return new N1.o(((Integer) interfaceC1266a.get()).intValue(), (Context) interfaceC1266a3.get(), (String) interfaceC1266a2.get());
        }
    }
}
