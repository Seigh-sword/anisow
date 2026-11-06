package N3;

import P4.C0159u;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0136w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0139z f2130e = new C0139z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Z.c f2131f = M4.B.i(AbstractC0135v.f2275a, new X.a(C0138y.f2279x), 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1432j f2133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f2134c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P4.A f2135d;

    public F(Context context, InterfaceC1432j interfaceC1432j) {
        this.f2132a = context;
        this.f2133b = interfaceC1432j;
        f2130e.getClass();
        this.f2135d = new P4.A(new C0159u(f2131f.a(context, C0139z.f2280a[0]).f4987a.b(), new B(3, null)), this, 3);
        S3.a.B(S3.a.c(interfaceC1432j), null, null, new C0137x(this, null), 3);
    }
}
