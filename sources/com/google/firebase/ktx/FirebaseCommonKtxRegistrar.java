package com.google.firebase.ktx;

import I3.a;
import M4.AbstractC0077w;
import androidx.annotation.Keep;
import c3.InterfaceC0375a;
import c3.b;
import c3.c;
import c3.d;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0653a;
import d3.C0654b;
import d3.k;
import d3.r;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0654b> getComponents() {
        C0653a c0653aA = C0654b.a(new r(InterfaceC0375a.class, AbstractC0077w.class));
        c0653aA.a(new k(new r(InterfaceC0375a.class, Executor.class), 1, 0));
        c0653aA.f8179f = a.f1158x;
        C0654b c0654bB = c0653aA.b();
        C0653a c0653aA2 = C0654b.a(new r(c.class, AbstractC0077w.class));
        c0653aA2.a(new k(new r(c.class, Executor.class), 1, 0));
        c0653aA2.f8179f = a.f1159y;
        C0654b c0654bB2 = c0653aA2.b();
        C0653a c0653aA3 = C0654b.a(new r(b.class, AbstractC0077w.class));
        c0653aA3.a(new k(new r(b.class, Executor.class), 1, 0));
        c0653aA3.f8179f = a.f1160z;
        C0654b c0654bB3 = c0653aA3.b();
        C0653a c0653aA4 = C0654b.a(new r(d.class, AbstractC0077w.class));
        c0653aA4.a(new k(new r(d.class, Executor.class), 1, 0));
        c0653aA4.f8179f = a.f1157A;
        return S3.a.E(c0654bB, c0654bB2, c0654bB3, c0653aA4.b());
    }
}
