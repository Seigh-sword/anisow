package com.google.firebase.installations;

import B3.e;
import B3.f;
import E3.c;
import E3.d;
import J3.G;
import N.C0095h;
import Y2.g;
import androidx.annotation.Keep;
import c3.InterfaceC0375a;
import c3.b;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0653a;
import d3.C0654b;
import d3.InterfaceC0655c;
import d3.k;
import d3.r;
import e3.ExecutorC0673j;
import f2.h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(InterfaceC0655c interfaceC0655c) {
        return new c((g) interfaceC0655c.a(g.class), interfaceC0655c.b(f.class), (ExecutorService) interfaceC0655c.f(new r(InterfaceC0375a.class, ExecutorService.class)), new ExecutorC0673j((Executor) interfaceC0655c.f(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0654b> getComponents() {
        C0653a c0653aB = C0654b.b(d.class);
        c0653aB.f8174a = LIBRARY_NAME;
        c0653aB.a(k.b(g.class));
        c0653aB.a(new k(0, 1, f.class));
        c0653aB.a(new k(new r(InterfaceC0375a.class, ExecutorService.class), 1, 0));
        c0653aB.a(new k(new r(b.class, Executor.class), 1, 0));
        c0653aB.f8179f = new C0095h(7);
        C0654b c0654bB = c0653aB.b();
        e eVar = new e();
        C0653a c0653aB2 = C0654b.b(e.class);
        c0653aB2.f8178e = 1;
        c0653aB2.f8179f = new G(0, eVar);
        return Arrays.asList(c0654bB, c0653aB2.b(), h.j(LIBRARY_NAME, "18.0.0"));
    }
}
