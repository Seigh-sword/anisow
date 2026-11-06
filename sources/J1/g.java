package j1;

import java.io.FileInputStream;
import m1.C1010h;
import s1.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.data.n f9433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1010h f9434x;

    public /* synthetic */ g(com.bumptech.glide.load.data.n nVar, C1010h c1010h) {
        this.f9433w = nVar;
        this.f9434x = c1010h;
    }

    @Override // j1.h
    public final int j(f fVar) throws Throwable {
        C1010h c1010h = this.f9434x;
        com.bumptech.glide.load.data.n nVar = this.f9433w;
        y yVar = null;
        try {
            y yVar2 = new y(new FileInputStream(nVar.b().getFileDescriptor()), c1010h);
            try {
                int iD = fVar.d(yVar2, c1010h);
                yVar2.c();
                nVar.b();
                return iD;
            } catch (Throwable th) {
                th = th;
                yVar = yVar2;
                if (yVar != null) {
                    yVar.c();
                }
                nVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
