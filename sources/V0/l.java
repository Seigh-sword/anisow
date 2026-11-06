package V0;

import android.app.Application;
import m4.C1134g;
import o4.InterfaceC1229b;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends Application implements InterfaceC1229b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3701w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1134g f3702x = new C1134g(new L3.c(23, this));

    @Override // o4.InterfaceC1229b
    public final Object c() {
        return this.f3702x.c();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f3701w) {
            this.f3701w = true;
            ((n) this.f3702x.c()).getClass();
        }
        super.onCreate();
    }
}
