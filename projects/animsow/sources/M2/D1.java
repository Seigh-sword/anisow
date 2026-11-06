package m2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class D1 implements T {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f10542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ E1 f10543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ x1 f10544z;

    public /* synthetic */ D1(x1 x1Var, String str, E1 e12, int i6) {
        this.f10541w = i6;
        this.f10542x = str;
        this.f10543y = e12;
        this.f10544z = x1Var;
    }

    @Override // m2.T
    public final void g(String str, int i6, Throwable th, byte[] bArr, Map map) {
        switch (this.f10541w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                this.f10544z.q(this.f10542x, i6, th, bArr, this.f10543y);
                break;
            default:
                this.f10544z.q(this.f10542x, i6, th, bArr, this.f10543y);
                break;
        }
    }
}
