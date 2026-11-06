package m2;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y0 f10799x;

    public /* synthetic */ X0(Y0 y02, int i6) {
        this.f10798w = i6;
        this.f10799x = y02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y0 y02 = this.f10799x;
        switch (this.f10798w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                G g4 = y02.f10831z;
                if (g4 == null) {
                    y02.f().f10715B.d("Failed to send storage consent settings to service");
                } else {
                    try {
                        g4.A(y02.N(false));
                        y02.M();
                    } catch (RemoteException e6) {
                        y02.f().f10715B.c(e6, "Failed to send storage consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                G g6 = y02.f10831z;
                if (g6 == null) {
                    y02.f().f10715B.d("Failed to send Dma consent settings to service");
                } else {
                    try {
                        g6.C(y02.N(false));
                        y02.M();
                    } catch (RemoteException e7) {
                        y02.f().f10715B.c(e7, "Failed to send Dma consent settings to the service");
                    }
                }
                break;
        }
    }
}
