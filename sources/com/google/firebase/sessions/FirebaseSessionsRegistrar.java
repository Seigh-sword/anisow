package com.google.firebase.sessions;

import D3.c;
import E1.f;
import E3.d;
import M4.AbstractC0077w;
import N.C0095h;
import N3.C0125k;
import N3.C0129o;
import N3.C0131q;
import N3.F;
import N3.InterfaceC0136w;
import N3.J;
import N3.M;
import N3.O;
import N3.V;
import N3.W;
import P3.m;
import S3.a;
import Y2.g;
import android.content.Context;
import androidx.annotation.Keep;
import c3.InterfaceC0375a;
import c3.b;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0653a;
import d3.C0654b;
import d3.InterfaceC0655c;
import d3.k;
import d3.r;
import f2.h;
import java.util.List;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C0131q Companion = new C0131q();
    private static final r firebaseApp = r.a(g.class);
    private static final r firebaseInstallationsApi = r.a(d.class);
    private static final r backgroundDispatcher = new r(InterfaceC0375a.class, AbstractC0077w.class);
    private static final r blockingDispatcher = new r(b.class, AbstractC0077w.class);
    private static final r transportFactory = r.a(f.class);
    private static final r sessionsSettings = r.a(m.class);
    private static final r sessionLifecycleServiceBinder = r.a(V.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0129o getComponents$lambda$0(InterfaceC0655c interfaceC0655c) {
        Object objF = interfaceC0655c.f(firebaseApp);
        AbstractC1305a.n(objF, "container[firebaseApp]");
        Object objF2 = interfaceC0655c.f(sessionsSettings);
        AbstractC1305a.n(objF2, "container[sessionsSettings]");
        Object objF3 = interfaceC0655c.f(backgroundDispatcher);
        AbstractC1305a.n(objF3, "container[backgroundDispatcher]");
        Object objF4 = interfaceC0655c.f(sessionLifecycleServiceBinder);
        AbstractC1305a.n(objF4, "container[sessionLifecycleServiceBinder]");
        return new C0129o((g) objF, (m) objF2, (InterfaceC1432j) objF3, (V) objF4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O getComponents$lambda$1(InterfaceC0655c interfaceC0655c) {
        return new O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J getComponents$lambda$2(InterfaceC0655c interfaceC0655c) {
        Object objF = interfaceC0655c.f(firebaseApp);
        AbstractC1305a.n(objF, "container[firebaseApp]");
        g gVar = (g) objF;
        Object objF2 = interfaceC0655c.f(firebaseInstallationsApi);
        AbstractC1305a.n(objF2, "container[firebaseInstallationsApi]");
        d dVar = (d) objF2;
        Object objF3 = interfaceC0655c.f(sessionsSettings);
        AbstractC1305a.n(objF3, "container[sessionsSettings]");
        m mVar = (m) objF3;
        c cVarC = interfaceC0655c.c(transportFactory);
        AbstractC1305a.n(cVarC, "container.getProvider(transportFactory)");
        C0125k c0125k = new C0125k(cVarC);
        Object objF4 = interfaceC0655c.f(backgroundDispatcher);
        AbstractC1305a.n(objF4, "container[backgroundDispatcher]");
        return new M(gVar, dVar, mVar, c0125k, (InterfaceC1432j) objF4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m getComponents$lambda$3(InterfaceC0655c interfaceC0655c) {
        Object objF = interfaceC0655c.f(firebaseApp);
        AbstractC1305a.n(objF, "container[firebaseApp]");
        Object objF2 = interfaceC0655c.f(blockingDispatcher);
        AbstractC1305a.n(objF2, "container[blockingDispatcher]");
        Object objF3 = interfaceC0655c.f(backgroundDispatcher);
        AbstractC1305a.n(objF3, "container[backgroundDispatcher]");
        Object objF4 = interfaceC0655c.f(firebaseInstallationsApi);
        AbstractC1305a.n(objF4, "container[firebaseInstallationsApi]");
        return new m((g) objF, (InterfaceC1432j) objF2, (InterfaceC1432j) objF3, (d) objF4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0136w getComponents$lambda$4(InterfaceC0655c interfaceC0655c) {
        g gVar = (g) interfaceC0655c.f(firebaseApp);
        gVar.a();
        Context context = gVar.f4816a;
        AbstractC1305a.n(context, "container[firebaseApp].applicationContext");
        Object objF = interfaceC0655c.f(backgroundDispatcher);
        AbstractC1305a.n(objF, "container[backgroundDispatcher]");
        return new F(context, (InterfaceC1432j) objF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V getComponents$lambda$5(InterfaceC0655c interfaceC0655c) {
        Object objF = interfaceC0655c.f(firebaseApp);
        AbstractC1305a.n(objF, "container[firebaseApp]");
        return new W((g) objF);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0654b> getComponents() {
        C0653a c0653aB = C0654b.b(C0129o.class);
        c0653aB.f8174a = LIBRARY_NAME;
        r rVar = firebaseApp;
        c0653aB.a(k.a(rVar));
        r rVar2 = sessionsSettings;
        c0653aB.a(k.a(rVar2));
        r rVar3 = backgroundDispatcher;
        c0653aB.a(k.a(rVar3));
        c0653aB.a(k.a(sessionLifecycleServiceBinder));
        c0653aB.f8179f = new C0095h(9);
        c0653aB.c(2);
        C0654b c0654bB = c0653aB.b();
        C0653a c0653aB2 = C0654b.b(O.class);
        c0653aB2.f8174a = "session-generator";
        c0653aB2.f8179f = new C0095h(10);
        C0654b c0654bB2 = c0653aB2.b();
        C0653a c0653aB3 = C0654b.b(J.class);
        c0653aB3.f8174a = "session-publisher";
        c0653aB3.a(new k(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        c0653aB3.a(k.a(rVar4));
        c0653aB3.a(new k(rVar2, 1, 0));
        c0653aB3.a(new k(transportFactory, 1, 1));
        c0653aB3.a(new k(rVar3, 1, 0));
        c0653aB3.f8179f = new C0095h(11);
        C0654b c0654bB3 = c0653aB3.b();
        C0653a c0653aB4 = C0654b.b(m.class);
        c0653aB4.f8174a = "sessions-settings";
        c0653aB4.a(new k(rVar, 1, 0));
        c0653aB4.a(k.a(blockingDispatcher));
        c0653aB4.a(new k(rVar3, 1, 0));
        c0653aB4.a(new k(rVar4, 1, 0));
        c0653aB4.f8179f = new C0095h(12);
        C0654b c0654bB4 = c0653aB4.b();
        C0653a c0653aB5 = C0654b.b(InterfaceC0136w.class);
        c0653aB5.f8174a = "sessions-datastore";
        c0653aB5.a(new k(rVar, 1, 0));
        c0653aB5.a(new k(rVar3, 1, 0));
        c0653aB5.f8179f = new C0095h(13);
        C0654b c0654bB5 = c0653aB5.b();
        C0653a c0653aB6 = C0654b.b(V.class);
        c0653aB6.f8174a = "sessions-service-binder";
        c0653aB6.a(new k(rVar, 1, 0));
        c0653aB6.f8179f = new C0095h(14);
        return a.E(c0654bB, c0654bB2, c0654bB3, c0654bB4, c0654bB5, c0653aB6.b(), h.j(LIBRARY_NAME, "2.0.5"));
    }
}
