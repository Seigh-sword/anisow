package h5;

import f5.C0710g;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class A extends f5.n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B f8985x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b6, f5.i iVar) {
        super(iVar);
        this.f8985x = b6;
    }

    @Override // f5.n, f5.E
    public final long G(C0710g c0710g, long j6) throws IOException {
        try {
            return super.G(c0710g, j6);
        } catch (IOException e6) {
            this.f8985x.f8988z = e6;
            throw e6;
        }
    }
}
