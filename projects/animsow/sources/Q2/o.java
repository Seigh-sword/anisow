package q2;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f12368w;

    public o(p pVar) {
        this.f12368w = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f12368w.f12371y) {
            try {
                Object obj = this.f12368w.f12372z;
                if (((InterfaceC1260c) obj) != null) {
                    ((InterfaceC1260c) obj).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
