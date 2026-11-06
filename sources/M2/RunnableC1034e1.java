package m2;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1034e1 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ B1 f10899A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ boolean f10900B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Y0 f10901C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f10903x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f10904y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f10905z;

    public RunnableC1034e1(Y0 y02, AtomicReference atomicReference, String str, String str2, B1 b1, boolean z5) {
        this.f10902w = atomicReference;
        this.f10904y = str;
        this.f10905z = str2;
        this.f10899A = b1;
        this.f10900B = z5;
        this.f10901C = y02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        Y0 y02;
        G g4;
        AtomicReference atomicReference2;
        List listW;
        synchronized (this.f10902w) {
            try {
                try {
                    y02 = this.f10901C;
                    g4 = y02.f10831z;
                } catch (RemoteException e6) {
                    this.f10901C.f().f10715B.e("(legacy) Failed to get user properties; remote exception", N.x(this.f10903x), this.f10904y, e6);
                    this.f10902w.set(Collections.emptyList());
                    atomicReference = this.f10902w;
                }
                if (g4 == null) {
                    y02.f().f10715B.e("(legacy) Failed to get user properties; not connected to service", N.x(this.f10903x), this.f10904y, this.f10905z);
                    this.f10902w.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f10903x)) {
                    AbstractC1332d.m(this.f10899A);
                    atomicReference2 = this.f10902w;
                    listW = g4.o(this.f10904y, this.f10905z, this.f10900B, this.f10899A);
                } else {
                    atomicReference2 = this.f10902w;
                    listW = g4.w(this.f10903x, this.f10904y, this.f10905z, this.f10900B);
                }
                atomicReference2.set(listW);
                this.f10901C.M();
                atomicReference = this.f10902w;
                atomicReference.notify();
            } finally {
                this.f10902w.notify();
            }
        }
    }
}
