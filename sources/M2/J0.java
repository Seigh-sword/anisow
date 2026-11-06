package m2;

import android.os.Bundle;
import android.text.TextUtils;
import com.onesignal.AbstractC0603w1;
import com.onesignal.C0550e1;
import com.onesignal.EnumC0600v1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10666w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f10667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f10668y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f10669z;

    public J0(C0550e1 c0550e1, Runnable runnable) {
        this.f10668y = c0550e1;
        this.f10669z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = 0;
        Object obj = null;
        switch (this.f10666w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                G0 g02 = (G0) this.f10668y;
                Bundle bundle = (Bundle) this.f10669z;
                long j6 = this.f10667x;
                if (!TextUtils.isEmpty(g02.s().C())) {
                    g02.f().f10720G.d("Using developer consent only; google app id found");
                } else {
                    g02.C(bundle, 0, j6);
                }
                break;
            case 1:
                ((U0) this.f10669z).G((V0) this.f10668y, false, this.f10667x);
                U0 u02 = (U0) this.f10669z;
                u02.f10771A = null;
                Y0 y0W = u02.w();
                y0W.r();
                y0W.y();
                y0W.B(new RunnableC1028c1(y0W, i6, obj));
                break;
            default:
                ((Runnable) this.f10669z).run();
                C0550e1 c0550e1 = (C0550e1) this.f10668y;
                if (c0550e1.f7799b.get() == this.f10667x) {
                    AbstractC0603w1.b(EnumC0600v1.f7991A, "Last Pending Task has ran, shutting down", null);
                    c0550e1.f7800c.shutdown();
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f10666w) {
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return "PendingTaskRunnable{innerTask=" + ((Runnable) this.f10669z) + ", taskId=" + this.f10667x + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ J0(G0 g02, Bundle bundle, long j6) {
        this.f10668y = g02;
        this.f10669z = bundle;
        this.f10667x = j6;
    }

    public J0(U0 u02, V0 v02, long j6) {
        this.f10668y = v02;
        this.f10667x = j6;
        this.f10669z = u02;
    }
}
