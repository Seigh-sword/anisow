package m2;

import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1037f1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ G f10908x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1040g1 f10909y;

    public /* synthetic */ RunnableC1037f1(ServiceConnectionC1040g1 serviceConnectionC1040g1, G g4, int i6) {
        this.f10907w = i6;
        this.f10908x = g4;
        this.f10909y = serviceConnectionC1040g1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10907w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                synchronized (this.f10909y) {
                    try {
                        this.f10909y.f10914w = false;
                        if (!this.f10909y.f10916y.I()) {
                            this.f10909y.f10916y.f().f10723J.d("Connected to service");
                            Y0 y02 = this.f10909y.f10916y;
                            G g4 = this.f10908x;
                            y02.r();
                            AbstractC1332d.m(g4);
                            y02.f10831z = g4;
                            y02.M();
                            y02.L();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f10909y) {
                    try {
                        this.f10909y.f10914w = false;
                        if (!this.f10909y.f10916y.I()) {
                            this.f10909y.f10916y.f().f10722I.d("Connected to remote service");
                            Y0 y03 = this.f10909y.f10916y;
                            G g6 = this.f10908x;
                            y03.r();
                            AbstractC1332d.m(g6);
                            y03.f10831z = g6;
                            y03.M();
                            y03.L();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }
}
