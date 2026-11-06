package Y2;

import M4.T;
import Z.j;
import c3.InterfaceC0375a;
import d3.r;
import java.util.concurrent.Executor;
import p3.C1251c;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d3.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f4830w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f4827x = new h(0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f4828y = new h(1);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h f4829z = new h(2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final h f4826A = new h(3);

    public /* synthetic */ h(int i6) {
        this.f4830w = i6;
    }

    public final T a(C1251c c1251c) {
        switch (this.f4830w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Object objF = c1251c.f(new r(InterfaceC0375a.class, Executor.class));
                AbstractC1305a.n(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) objF);
            case 1:
                Object objF2 = c1251c.f(new r(c3.c.class, Executor.class));
                AbstractC1305a.n(objF2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) objF2);
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                Object objF3 = c1251c.f(new r(c3.b.class, Executor.class));
                AbstractC1305a.n(objF3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) objF3);
            default:
                Object objF4 = c1251c.f(new r(c3.d.class, Executor.class));
                AbstractC1305a.n(objF4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) objF4);
        }
    }

    @Override // d3.e
    public final /* bridge */ /* synthetic */ Object f(C1251c c1251c) {
        switch (this.f4830w) {
        }
        return a(c1251c);
    }
}
