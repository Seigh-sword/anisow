package W1;

import X1.InterfaceC0236d;

/* JADX INFO: renamed from: W1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0220n extends AbstractC0231z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4336b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0220n(C0226u c0226u, InterfaceC0236d interfaceC0236d) {
        super(c0226u);
        this.f4337c = interfaceC0236d;
    }

    @Override // W1.AbstractC0231z
    public final void a() {
        int i6 = this.f4336b;
        Object obj = this.f4337c;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0221o) obj).f(1);
                break;
            case 1:
                ((C0221o) obj).f4338a.f4224p.a(null);
                break;
            default:
                ((InterfaceC0236d) obj).a(new U1.b(16, null));
                break;
        }
    }
}
