package N3;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import v4.InterfaceC1432j;

/* JADX INFO: renamed from: N3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0129o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y2.g f2258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P3.m f2259b;

    public C0129o(Y2.g gVar, P3.m mVar, InterfaceC1432j interfaceC1432j, V v5) {
        this.f2258a = gVar;
        this.f2259b = mVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        gVar.a();
        Context applicationContext = gVar.f4816a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(X.f2191w);
            S3.a.B(S3.a.c(interfaceC1432j), null, null, new C0128n(this, interfaceC1432j, v5, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
