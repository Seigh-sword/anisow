package b5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends S0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ s f5991A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f5992y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f5993z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s sVar, Object[] objArr, int i6, long j6) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f5991A = sVar;
        this.f5992y = i6;
        this.f5993z = j6;
    }

    @Override // S0.c
    public final void b() {
        s sVar = this.f5991A;
        try {
            sVar.f6037Q.n(this.f5992y, this.f5993z);
        } catch (IOException e6) {
            sVar.c(e6);
        }
    }
}
