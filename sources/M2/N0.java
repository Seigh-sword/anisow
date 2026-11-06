package m2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC0394c0;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f10726A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f10727B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ X f10728C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f10730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f10731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f10732z;

    public N0(G0 g02, AtomicReference atomicReference, String str, String str2, boolean z5) {
        this.f10729w = 0;
        this.f10726A = atomicReference;
        this.f10730x = null;
        this.f10731y = str;
        this.f10727B = str2;
        this.f10732z = z5;
        this.f10728C = g02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [m2.K1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.measurement.c0] */
    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10729w;
        L.i iVar = this.f10728C;
        ?? r22 = this.f10727B;
        Object obj = this.f10726A;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y0 y0Q = ((C1051k0) ((G0) iVar).f1668w).q();
                y0Q.r();
                y0Q.y();
                B1 b1N = y0Q.N(false);
                y0Q.B(new RunnableC1034e1(y0Q, (AtomicReference) obj, this.f10731y, (String) r22, b1N, this.f10732z));
                return;
            default:
                String str = this.f10730x;
                Bundle bundle = new Bundle();
                try {
                    try {
                        G g4 = ((Y0) iVar).f10831z;
                        String str2 = this.f10731y;
                        if (g4 == null) {
                            ((Y0) iVar).f().f10715B.b(str, str2, "Failed to get user properties; not connected to service");
                        } else {
                            AbstractC1332d.m((B1) obj);
                            bundle = K1.C(g4.o(str, str2, this.f10732z, (B1) obj));
                            ((Y0) iVar).M();
                        }
                        break;
                    } catch (RemoteException e6) {
                        ((Y0) iVar).f().f10715B.b(str, e6, "Failed to get user properties; remote exception");
                    }
                    return;
                } finally {
                    ((Y0) iVar).q().N((InterfaceC0394c0) r22, bundle);
                }
        }
    }

    public N0(Y0 y02, String str, String str2, B1 b1, boolean z5, InterfaceC0394c0 interfaceC0394c0) {
        this.f10729w = 1;
        this.f10730x = str;
        this.f10731y = str2;
        this.f10726A = b1;
        this.f10732z = z5;
        this.f10727B = interfaceC0394c0;
        this.f10728C = y02;
    }
}
