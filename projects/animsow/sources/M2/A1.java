package m2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A1 implements T {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f10484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f10485y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ x1 f10486z;

    public /* synthetic */ A1(x1 x1Var, String str, ArrayList arrayList, int i6) {
        this.f10483w = i6;
        this.f10484x = str;
        this.f10485y = arrayList;
        this.f10486z = x1Var;
    }

    @Override // m2.T
    public final void g(String str, int i6, Throwable th, byte[] bArr, Map map) {
        switch (this.f10483w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                this.f10486z.z(true, i6, th, bArr, this.f10484x, this.f10485y);
                break;
            default:
                this.f10486z.z(true, i6, th, bArr, this.f10484x, this.f10485y);
                break;
        }
    }
}
