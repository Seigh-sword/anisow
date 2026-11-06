package com.google.firebase.messaging;

import A3.c;
import C3.a;
import E1.f;
import E3.d;
import L3.b;
import Y2.g;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d.AbstractC0628i;
import d3.C0653a;
import d3.C0654b;
import d3.InterfaceC0655c;
import d3.k;
import d3.r;
import f2.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, InterfaceC0655c interfaceC0655c) {
        g gVar = (g) interfaceC0655c.a(g.class);
        AbstractC0628i.p(interfaceC0655c.a(a.class));
        return new FirebaseMessaging(gVar, interfaceC0655c.b(b.class), interfaceC0655c.b(B3.g.class), (d) interfaceC0655c.a(d.class), interfaceC0655c.c(rVar), (c) interfaceC0655c.a(c.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0654b> getComponents() {
        r rVar = new r(u3.b.class, f.class);
        C0653a c0653aB = C0654b.b(FirebaseMessaging.class);
        c0653aB.f8174a = LIBRARY_NAME;
        c0653aB.a(k.b(g.class));
        c0653aB.a(new k(0, 0, a.class));
        c0653aB.a(new k(0, 1, b.class));
        c0653aB.a(new k(0, 1, B3.g.class));
        c0653aB.a(k.b(d.class));
        c0653aB.a(new k(rVar, 0, 1));
        c0653aB.a(k.b(c.class));
        c0653aB.f8179f = new B3.b(rVar, 1);
        c0653aB.c(1);
        return Arrays.asList(c0653aB.b(), h.j(LIBRARY_NAME, "24.0.2"));
    }
}
