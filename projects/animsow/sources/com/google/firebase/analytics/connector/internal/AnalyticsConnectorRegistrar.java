package com.google.firebase.analytics.connector.internal;

import A3.c;
import X1.C0245m;
import Y2.g;
import a3.C0262c;
import a3.InterfaceC0260a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C0466o0;
import com.google.firebase.components.ComponentRegistrar;
import d3.C0653a;
import d3.C0654b;
import d3.InterfaceC0655c;
import d3.k;
import d3.l;
import f2.h;
import i.r;
import java.util.Arrays;
import java.util.List;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC0260a lambda$getComponents$0(InterfaceC0655c interfaceC0655c) {
        g gVar = (g) interfaceC0655c.a(g.class);
        Context context = (Context) interfaceC0655c.a(Context.class);
        c cVar = (c) interfaceC0655c.a(c.class);
        AbstractC1332d.m(gVar);
        AbstractC1332d.m(context);
        AbstractC1332d.m(cVar);
        AbstractC1332d.m(context.getApplicationContext());
        if (C0262c.f5013c == null) {
            synchronized (C0262c.class) {
                try {
                    if (C0262c.f5013c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f4817b)) {
                            ((l) cVar).a(new r(4), new C0245m());
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        C0262c.f5013c = new C0262c(C0466o0.a(context, bundle).f6911d);
                    }
                } finally {
                }
            }
        }
        return C0262c.f5013c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C0654b> getComponents() {
        C0653a c0653aB = C0654b.b(InterfaceC0260a.class);
        c0653aB.a(k.b(g.class));
        c0653aB.a(k.b(Context.class));
        c0653aB.a(k.b(c.class));
        c0653aB.f8179f = new C0245m();
        c0653aB.c(2);
        return Arrays.asList(c0653aB.b(), h.j("fire-analytics", "22.1.2"));
    }
}
