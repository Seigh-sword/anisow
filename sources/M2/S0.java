package m2;

import com.google.android.gms.internal.measurement.InterfaceC0394c0;
import java.io.Serializable;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f10758A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ L.i f10759B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Serializable f10762y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f10763z;

    public S0(G0 g02, AtomicReference atomicReference, String str, String str2) {
        this.f10760w = 1;
        this.f10762y = atomicReference;
        this.f10761x = null;
        this.f10763z = str;
        this.f10758A = str2;
        this.f10759B = g02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Type inference failed for: r0v28, types: [m2.K1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.google.android.gms.internal.measurement.c0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.S0.run():void");
    }

    public S0(R0 r02, String str, URL url, C1060n0 c1060n0) {
        this.f10760w = 0;
        this.f10759B = r02;
        AbstractC1332d.g(str);
        this.f10762y = url;
        this.f10763z = c1060n0;
        this.f10761x = str;
        this.f10758A = null;
    }

    public S0(Y0 y02, String str, String str2, B1 b1, InterfaceC0394c0 interfaceC0394c0) {
        this.f10760w = 2;
        this.f10761x = str;
        this.f10762y = str2;
        this.f10763z = b1;
        this.f10758A = interfaceC0394c0;
        this.f10759B = y02;
    }
}
