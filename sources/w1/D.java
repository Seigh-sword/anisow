package W1;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0208b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0211e f4227a;

    public D(C0211e c0211e) {
        this.f4227a = c0211e;
    }

    @Override // W1.InterfaceC0208b
    public final void a(boolean z5) {
        com.google.android.gms.internal.measurement.X x5 = this.f4227a.f4312I;
        x5.sendMessage(x5.obtainMessage(1, Boolean.valueOf(z5)));
    }
}
