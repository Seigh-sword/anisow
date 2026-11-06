package androidx.lifecycle;

import android.os.Handler;
import d.RunnableC0632m;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC0321v {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final L f5561E = new L();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Handler f5562A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5568y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5569z = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0323x f5563B = new C0323x(this);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RunnableC0632m f5564C = new RunnableC0632m(10, this);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final K f5565D = new K(this);

    public final void a() {
        int i6 = this.f5567x + 1;
        this.f5567x = i6;
        if (i6 == 1) {
            if (this.f5568y) {
                this.f5563B.e(EnumC0313m.ON_RESUME);
                this.f5568y = false;
            } else {
                Handler handler = this.f5562A;
                AbstractC1305a.l(handler);
                handler.removeCallbacks(this.f5564C);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0321v
    public final C0323x g() {
        return this.f5563B;
    }
}
