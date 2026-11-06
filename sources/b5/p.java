package b5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends S0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f6010A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ s f6011B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f6012y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f6013z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, int i6, int i7) {
        super("OkHttp %s ping %08x%08x", new Object[]{sVar.f6043z, Integer.valueOf(i6), Integer.valueOf(i7)});
        this.f6011B = sVar;
        this.f6012y = true;
        this.f6013z = i6;
        this.f6010A = i7;
    }

    @Override // S0.c
    public final void b() {
        int i6 = this.f6013z;
        int i7 = this.f6010A;
        boolean z5 = this.f6012y;
        s sVar = this.f6011B;
        sVar.getClass();
        try {
            sVar.f6037Q.k(i6, i7, z5);
        } catch (IOException e6) {
            sVar.c(e6);
        }
    }
}
