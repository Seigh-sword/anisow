package M4;

import v4.InterfaceC1430h;

/* JADX INFO: renamed from: M4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0075u extends D4.i implements C4.l {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0075u f1922y = new C0075u(0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0075u f1923z = new C0075u(1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1924x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0075u(int i6) {
        super(1);
        this.f1924x = i6;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        switch (this.f1924x) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                InterfaceC1430h interfaceC1430h = (InterfaceC1430h) obj;
                if (interfaceC1430h instanceof AbstractC0077w) {
                    return (AbstractC0077w) interfaceC1430h;
                }
                return null;
            default:
                InterfaceC1430h interfaceC1430h2 = (InterfaceC1430h) obj;
                if (interfaceC1430h2 instanceof S) {
                    return (S) interfaceC1430h2;
                }
                return null;
        }
    }
}
