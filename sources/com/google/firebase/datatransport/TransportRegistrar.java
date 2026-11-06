package com.google.firebase.datatransport;

import E1.f;
import F1.a;
import H1.u;
import N.C0095h;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0653a;
import d3.C0654b;
import d3.InterfaceC0655c;
import d3.k;
import d3.r;
import f2.h;
import java.util.Arrays;
import java.util.List;
import u3.InterfaceC1369a;
import u3.b;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(InterfaceC0655c interfaceC0655c) {
        u.b((Context) interfaceC0655c.a(Context.class));
        return u.a().c(a.f603f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(InterfaceC0655c interfaceC0655c) {
        u.b((Context) interfaceC0655c.a(Context.class));
        return u.a().c(a.f603f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(InterfaceC0655c interfaceC0655c) {
        u.b((Context) interfaceC0655c.a(Context.class));
        return u.a().c(a.f602e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0654b> getComponents() {
        C0653a c0653aB = C0654b.b(f.class);
        c0653aB.f8174a = LIBRARY_NAME;
        c0653aB.a(k.b(Context.class));
        c0653aB.f8179f = new C0095h(4);
        C0654b c0654bB = c0653aB.b();
        C0653a c0653aA = C0654b.a(new r(InterfaceC1369a.class, f.class));
        c0653aA.a(k.b(Context.class));
        c0653aA.f8179f = new C0095h(5);
        C0654b c0654bB2 = c0653aA.b();
        C0653a c0653aA2 = C0654b.a(new r(b.class, f.class));
        c0653aA2.a(k.b(Context.class));
        c0653aA2.f8179f = new C0095h(6);
        return Arrays.asList(c0654bB, c0654bB2, c0653aA2.b(), h.j(LIBRARY_NAME, "19.0.0"));
    }
}
