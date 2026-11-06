package b5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends S0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f6014A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f6015y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f6016z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(q qVar, Object[] objArr, z zVar) {
        super("OkHttp %s stream %d", objArr);
        this.f6014A = qVar;
        this.f6016z = zVar;
    }

    @Override // S0.c
    public final void b() throws Throwable {
        EnumC0346b enumC0346b;
        EnumC0346b enumC0346b2 = EnumC0346b.PROTOCOL_ERROR;
        int i6 = this.f6015y;
        Object obj = this.f6016z;
        Object obj2 = this.f6014A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    ((s) ((q) obj2).f6014A).f6041x.b((z) obj);
                    return;
                } catch (IOException e6) {
                    c5.i.f6262a.m(4, "Http2Connection.Listener failure for " + ((s) ((q) obj2).f6014A).f6043z, e6);
                    try {
                        ((z) obj).c(enumC0346b2, e6);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            default:
                EnumC0346b enumC0346b3 = EnumC0346b.INTERNAL_ERROR;
                try {
                    try {
                        ((v) obj).g(this);
                        while (((v) obj).c(false, this)) {
                        }
                        enumC0346b = EnumC0346b.NO_ERROR;
                    } catch (Throwable th) {
                        th = th;
                        enumC0346b = enumC0346b3;
                    }
                } catch (IOException e7) {
                    ((s) obj2).b(enumC0346b2, enumC0346b2, e7);
                }
                try {
                    ((s) obj2).b(enumC0346b, EnumC0346b.CANCEL, null);
                    W4.b.c((v) obj);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    ((s) obj2).b(enumC0346b, enumC0346b3, null);
                    W4.b.c((v) obj);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, v vVar) {
        super("OkHttp %s", new Object[]{sVar.f6043z});
        this.f6014A = sVar;
        this.f6016z = vVar;
    }
}
