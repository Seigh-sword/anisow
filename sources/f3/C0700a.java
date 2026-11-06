package f3;

import a3.C0261b;
import a3.C0262c;
import a3.InterfaceC0260a;
import android.os.Bundle;
import android.util.Log;
import g3.C0731c;
import h3.InterfaceC0773a;
import i3.InterfaceC0833a;
import j3.C0866p;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p1.C1243i;

/* JADX INFO: renamed from: f3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0700a implements InterfaceC0833a, InterfaceC0773a, D3.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0701b f8422w;

    public /* synthetic */ C0700a(C0701b c0701b) {
        this.f8422w = c0701b;
    }

    @Override // i3.InterfaceC0833a
    public final void c(C0866p c0866p) {
        C0701b c0701b = this.f8422w;
        synchronized (c0701b) {
            try {
                if (c0701b.f8424b instanceof i3.b) {
                    c0701b.f8425c.add(c0866p);
                }
                c0701b.f8424b.c(c0866p);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D3.a
    public final void e(D3.c cVar) {
        C0701b c0701b = this.f8422w;
        c0701b.getClass();
        C0731c c0731c = C0731c.f8531a;
        c0731c.c("AnalyticsConnector now available.");
        InterfaceC0260a interfaceC0260a = (InterfaceC0260a) cVar.get();
        K1.b bVar = new K1.b(16, interfaceC0260a);
        C0261b c0261b = new C0261b(1);
        C0262c c0262c = (C0262c) interfaceC0260a;
        C0261b c0261bB = c0262c.b(c0261b, "clx");
        if (c0261bB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            C0261b c0261bB2 = c0262c.b(c0261b, "crash");
            if (c0261bB2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            c0261bB = c0261bB2;
        }
        if (c0261bB == null) {
            c0731c.h("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        c0731c.c("Registered Firebase Analytics listener.");
        C1243i c1243i = new C1243i(20);
        h3.c cVar2 = new h3.c(bVar, TimeUnit.MILLISECONDS);
        synchronized (c0701b) {
            try {
                Iterator it = c0701b.f8425c.iterator();
                while (it.hasNext()) {
                    c1243i.c((C0866p) it.next());
                }
                c0261b.f5012y = c1243i;
                c0261b.f5011x = cVar2;
                c0701b.f8424b = c1243i;
                c0701b.f8423a = cVar2;
            } finally {
            }
        }
    }

    @Override // h3.InterfaceC0773a
    public final void f(Bundle bundle) {
        this.f8422w.f8423a.f(bundle);
    }
}
