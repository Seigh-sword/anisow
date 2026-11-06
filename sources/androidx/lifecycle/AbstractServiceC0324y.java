package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import i.C0803c;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0324y extends Service implements InterfaceC0321v {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0803c f5652w = new C0803c(this);

    @Override // androidx.lifecycle.InterfaceC0321v
    public final C0323x g() {
        return (C0323x) this.f5652w.f9277x;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC1305a.o(intent, "intent");
        this.f5652w.L(EnumC0313m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5652w.L(EnumC0313m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0313m enumC0313m = EnumC0313m.ON_STOP;
        C0803c c0803c = this.f5652w;
        c0803c.L(enumC0313m);
        c0803c.L(EnumC0313m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i6) {
        this.f5652w.L(EnumC0313m.ON_START);
        super.onStart(intent, i6);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i6, int i7) {
        return super.onStartCommand(intent, i6, i7);
    }
}
