package P0;

import C1.n;
import I0.o;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import w1.RunnableC1473q;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2401b;

    public /* synthetic */ e(int i6, Object obj) {
        this.f2400a = i6;
        this.f2401b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f2400a) {
            case 1:
                n.f().post(new RunnableC1473q(0, this, true));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f2400a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                o.w().u(f.f2402i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                f fVar = (f) this.f2401b;
                fVar.c(fVar.f());
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i6 = 0;
        Object[] objArr = 0;
        switch (this.f2400a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                o.w().u(f.f2402i, "Network connection lost", new Throwable[0]);
                f fVar = (f) this.f2401b;
                fVar.c(fVar.f());
                break;
            default:
                n.f().post(new RunnableC1473q(i6, this, objArr == true ? 1 : 0));
                break;
        }
    }
}
