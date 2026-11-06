package m2;

import android.os.RemoteException;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1025b1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B1 f10853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Y0 f10854y;

    public /* synthetic */ RunnableC1025b1(Y0 y02, B1 b1, int i6) {
        this.f10852w = i6;
        this.f10853x = b1;
        this.f10854y = y02;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i6 = this.f10852w;
        Y0 y02 = this.f10854y;
        B1 b1 = this.f10853x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                G g4 = y02.f10831z;
                if (g4 != null) {
                    try {
                        AbstractC1332d.m(b1);
                        g4.h(b1);
                    } catch (RemoteException e6) {
                        y02.f().f10715B.c(e6, "Failed to reset data on the service: remote exception");
                    }
                    y02.M();
                } else {
                    y02.f().f10715B.d("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                G g6 = y02.f10831z;
                if (g6 == null) {
                    y02.f().f10715B.d("Discarding data. Failed to send app launch");
                } else {
                    try {
                        AbstractC1332d.m(b1);
                        g6.t(b1);
                        y02.t().E();
                        y02.E(g6, null, b1);
                        y02.M();
                    } catch (RemoteException e7) {
                        y02.f().f10715B.c(e7, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                G g7 = y02.f10831z;
                if (g7 == null) {
                    y02.f().f10718E.d("Failed to send app backgrounded");
                } else {
                    try {
                        AbstractC1332d.m(b1);
                        g7.j(b1);
                        y02.M();
                    } catch (RemoteException e8) {
                        y02.f().f10715B.c(e8, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                G g8 = y02.f10831z;
                if (g8 == null) {
                    y02.f().f10715B.d("Failed to send measurementEnabled to service");
                } else {
                    try {
                        AbstractC1332d.m(b1);
                        g8.p(b1);
                        y02.M();
                    } catch (RemoteException e9) {
                        y02.f().f10715B.c(e9, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                G g9 = y02.f10831z;
                if (g9 == null) {
                    y02.f().f10715B.d("Failed to send consent settings to service");
                } else {
                    try {
                        AbstractC1332d.m(b1);
                        g9.r(b1);
                        y02.M();
                    } catch (RemoteException e10) {
                        y02.f().f10715B.c(e10, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
